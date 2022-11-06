package com.aninfo.service;

import com.aninfo.model.Transaction;
import com.aninfo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Long _cbu, Double _mount, String _type) {
        Transaction t = new Transaction(transactionRepository.count()+1,_mount, _cbu, _type);
        return transactionRepository.save(t);
    }

    public Optional<Transaction> findByid(Long _id) {
        return transactionRepository.findById(_id);
    }

    public List<Transaction> getTransactionsByCbu(Long _cbu){
        return transactionRepository.findTransactionByCbu(_cbu);
    }

    public void deleteById(Long _id) {
        transactionRepository.deleteById(_id);
    }


}
