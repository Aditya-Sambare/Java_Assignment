package com.aditya.VotingManagementSystem.service;

import com.aditya.VotingManagementSystem.dto.requestDto.AdminRegistrationDto;
import com.aditya.VotingManagementSystem.entities.Admin;
import com.aditya.VotingManagementSystem.entities.Registration;
import com.aditya.VotingManagementSystem.entities.VotingRecords;
import com.aditya.VotingManagementSystem.repository.AdminRepository;
import com.aditya.VotingManagementSystem.repository.RegistrationRepository;
import com.aditya.VotingManagementSystem.repository.VotingRecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
@Autowired
    AdminRepository adminRepository;
@Autowired
VotingRecordsRepository votingRecordsRepository;
@Autowired
RegistrationRepository registrationRepository;
    @Override
    public Admin registerAdmin(AdminRegistrationDto adminRegistrationDto) {
        Admin admin = new Admin();
        admin.setAdminName(adminRegistrationDto.getAdminName());
        admin.setAdminPassword(adminRegistrationDto.getAdminPassword());
        Admin admin1 = adminRepository.save(admin);
        Registration registration = new Registration();
        registration.setUserID(admin.getAdminId());
        registration.setUserPassword(admin.getAdminPassword());
        registration.setUserRole("Admin");
        registrationRepository.save(registration);
        return admin1;
    }

    @Override
    public List<VotingRecords> getVotingRecords() {
        List<VotingRecords> votingRecordsList = votingRecordsRepository.findAll();
        return votingRecordsList;
    }

}
