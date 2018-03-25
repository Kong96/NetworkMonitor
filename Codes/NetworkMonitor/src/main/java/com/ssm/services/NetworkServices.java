package com.ssm.services;

import com.ssm.dto.Network;
import com.ssm.entity.Transaction;

import java.sql.Date;
import java.util.List;

/**
 * Created by Zeya Kong
 * On 2018/2/15 17:35.
 */
public interface NetworkServices {
    Network getNetwork();

    String generateDOT(Network network);

    String getNextIp(String startIp);

    void changeConnectionStatusById(int id);

    void changeStationStatusByIp(String ip);

    void createTransaction(Date transaction_date_sent,
                           String transaction_type,
                           double transaction_amount,
                           String store_ip,
                           String card_id,
                           String current_position_ip,
                           String current_destination_ip);

    void updateTransaction(int transaction_id, String status, String current_position_ip, String current_destination_ip);

    List<Transaction> findAllTransactions();
}
