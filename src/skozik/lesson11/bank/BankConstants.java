/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank;

import java.math.BigDecimal;

public interface BankConstants {
    String STATUS_ERROR = "error";
    String STATUS_OK = "ok";
    String WITHDRAW_REPORT_FORMAT = "Account %s withdraw %s";
    String DEPOSIT_REPORT_FORMAT = "Account %s deposit %s";
    String NOT_IMPLEMENTED_REPORT_FORMAT = "Operation %s is not implemented";
    int TREASURY_CHECK_JOB_PERIOD_SEC = 1;
    BigDecimal CURRENCY_TALENT_MAX_TREASURY_LIMIT = new BigDecimal(100);
    BigDecimal CURRENCY_TALENT_MIN_TREASURY_LIMIT = new BigDecimal(10);
    BigDecimal CURRENCY_TALENT_TRANCHE_TREASURY = new BigDecimal(50);
    String CLIENT_TRANSACTION_REPORT_FORMAT = "client %s %s %s\n";
    String TREASURY_ADD_JOB_REPORT = "Treasury job move from remote storage to Bank %s%s";
    String TREASURY_REMOVE_JOB_REPORT = "Treasury job move from Bank to remote storage %s%s";
    String TREASURY_JOB_START_REPORT = "Treasury job is running; treasury: %s";
    int CASHIER_TASK_PERIOD_CHECK_MS = 900;
    int CASHIER_POOL_STOP_WAIT_SEC = 1;
    int BANK_WORKING_TIME_SEC = 5;
    int MAX_COINS_NUMBER = 99;
    String NOT_ENOUGH_MONEY_ON_ACCOUNT_EXCEPTION_FORMAT =" account %s, amount %s";
}
