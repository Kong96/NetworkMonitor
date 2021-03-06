package com.ssm.services;

import com.ssm.dto.Network;
import com.ssm.entity.RelayStation;
import com.ssm.entity.Transaction;

import java.sql.Date;
import java.util.List;

/**
 * Created by Zeya Kong
 * On 2018/2/15 17:35.
 */
public interface NetworkServices {
    Network getNetwork();

    boolean isFull(String ip);

    String generateDOT(Network network);

    String getNextIp(String startIp,String destination);

    void changeConnectionStatusById(int id);

    void changeStationStatusByIp(String ip);

    void createTransaction(String transaction_type,
                           double transaction_amount,
                           String store_ip,
                           String card_id,
                           String current_position_ip,
                           String current_destination_ip,
                           String given_card_name,
                           String given_card_date,
                           String given_card_code);

    void updateTransaction(int transaction_id, String status, String current_position_ip, String current_destination_ip);

    List<Transaction> findAllTransactions();

    void setTransactionStartTime(int id);

    void createStore(String ip,String name,int region);

    void createRelayStation(String ip,String status,int type,int region,int limit);

    void createConnection(String start_ip, String end_ip, int is_active, int weight);

    void updateRelayStationLimit(String ip,int limit);
}
