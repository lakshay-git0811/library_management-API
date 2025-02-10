package com.example.library_management.serviceImpl;

import com.example.library_management.dto.BorrowDTO;
import com.example.library_management.entity.Borrow;
import com.example.library_management.repository.BorrowRepository;
import com.example.library_management.service.BorrowService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    BorrowRepository borrowRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<BorrowDTO> getAllBorrows() {
        List<BorrowDTO> result = new ArrayList<BorrowDTO>();
        borrowRepository.findAll().forEach(borrow -> {
            result.add(modelMapper.map(borrow, BorrowDTO.class));
        });
        return result;
    }

    public BorrowDTO getBorrowById(String id) {
        Optional<Borrow> borrowFromDB = borrowRepository.findById(id);
        if (borrowFromDB.isPresent()) {
            var borrow = modelMapper.map(borrowFromDB, BorrowDTO.class);
            return borrow;
        }
        return null;
    }

    public BorrowDTO createBorrow(BorrowDTO borrowDTO) {
        Borrow borrow = modelMapper.map(borrowDTO, Borrow.class);
        Borrow newBorrow = borrowRepository.save(borrow);
        return modelMapper.map(newBorrow, BorrowDTO.class);
    }

    public BorrowDTO updateBorrow(String id, BorrowDTO borrowDTO) {
        Optional<Borrow> borrowFromDB = borrowRepository.findById(id);

        if (borrowFromDB.isPresent()) {
            Borrow borrow = borrowFromDB.get();

            if (borrowDTO.getBook_id() != null) {
                borrow.setBook_id(borrowDTO.getBook_id());
            }
            if (borrowDTO.getUser_id() != null) {
                borrow.setUser_id(borrowDTO.getUser_id());
            }
            if (borrowDTO.getBorrow_date() != null) {
                borrow.setBorrow_date(borrowDTO.getBorrow_date());
            }
            if (borrowDTO.getDue_date() != null) {
                borrow.setDue_date(borrowDTO.getDue_date());
            }
            if (borrowDTO.getReturn_date() != null) {
                borrow.setReturn_date(borrowDTO.getReturn_date());
            }
            if (borrowDTO.getStatus() != null) {
                borrow.setStatus(borrowDTO.getStatus());
            }

            Borrow updatedBorrow = borrowRepository.save(borrow);
            return modelMapper.map(updatedBorrow, BorrowDTO.class);
        }
        return null;
    }

    public void deleteBorrow(String id) {
        Optional<Borrow> borrow = borrowRepository.findById(id);
        if (borrow.isPresent()) {
            borrowRepository.deleteById(id);
        }
    }
}
