package com.cloudframe.app.repository.impl;

import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.CfSqlca;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.dao.SqlBase;
import com.cloudframe.app.dto.d5427tli.*;
import com.cloudframe.app.repository.D5427tliRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("d5427tliRepository")
public class D5427tliRepositoryImpl implements D5427tliRepository {
  Logger logger = LoggerFactory.getLogger(D5427tliRepositoryImpl.class);

  // declare:start
  int sqlFetchCounter = 0;
  static final short NOT_NULL = (short) 0;
  // declare:end

  @Autowired
  @Qualifier("db2Base")
  SqlBase<char[]> db2Base;

  // methodStart:openPolPlanCsrD5427tli

  /**
   * ***** DECLARE POL_PLAN_CSR CURSOR FOR ***** SELECT SLOT_TBL_ID ***** FROM SRVC_ASGN ***** WHERE
   * RUL_LVL_TYP_ID = 'P' AND ***** POL_NBR = :HDR-POL-NBR AND ***** ( PLN_NBR = :HDR-PLN-NBR OR
   * ***** PLN_NBR = ' ' ) AND ***** PROC_DT <= :HDR-PROC-DT AND ***** CANC_DT >= :HDR-CANC-DT AND
   * ***** ROW_STS_CD = 'A' ***** ORDER BY PLN_NBR DESC ***** FETCH FIRST 1 ROW ONLY
   */
  public ResultSet openPolPlanCsrD5427tli(Sqlca sqlca, DclsrvcAsgn dclsrvcAsgn) throws Exception {
    ResultSet polPlanCsrResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      polPlanCsrResultSet =
          db2Base
              .startQuery(1 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427TLI)
              .withSql(SQLS.SQL_1488563183)
              .withInputs(
                  dclsrvcAsgn.getHdrPolNbr(),
                  dclsrvcAsgn.getHdrPlnNbr(),
                  dclsrvcAsgn.getHdrProcDt(),
                  dclsrvcAsgn.getHdrCancDt())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return polPlanCsrResultSet;
  }
  // methodEnd:openPolPlanCsrD5427tli
  // methodStart:fetchPolPlanCsrD5427tli

  /** ***** FETCH POL_PLAN_CSR ***** INTO :HDR-SLOT-TBL-ID */
  public void fetchPolPlanCsrD5427tli(
      ResultSet polPlanCsrResultSet, Sqlca sqlca, DclsrvcAsgn dclsrvcAsgn) throws Exception {
    try {
      boolean hasResults = polPlanCsrResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = polPlanCsrResultSet.getObject(1);
        if (resultObj != null) {
          dclsrvcAsgn.setHdrSlotTblId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        sqlFetchCounter++;
      } else {
        sqlca.setSqlcode(100); // No More rows
      }
    } catch (SQLException e) {
      if (e.getMessage().contains("result set is closed")) {
        fill501SqlcaObject(sqlca); // cursor closed
      } else {
        logger.error("polPlanCsrResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchPolPlanCsrD5427tli
  // methodStart:closePolPlanCsrD5427tli

  /** ***** CLOSE POL_PLAN_CSR */
  public void closePolPlanCsrD5427tli(ResultSet polPlanCsrResultSet, Sqlca sqlca) throws Exception {

    closeCursor(polPlanCsrResultSet, sqlca);
  }
  // methodEnd:closePolPlanCsrD5427tli
  // methodStart:openSaOiCsrD5427tli

  /**
   * ***** DECLARE SA_OI_CSR CURSOR FOR ***** SELECT SLOT_TBL_ID ***** FROM SRVC_ASGN ***** WHERE
   * RUL_LVL_TYP_ID = 'O' AND ***** OBLIG_ID = :HDR-OBLIG-ID AND ***** (SHR_ARNG_CD =
   * :HDR-SHR-ARNG-CD OR ***** SHR_ARNG_CD = ' ') AND ***** PROC_DT <= :HDR-PROC-DT AND *****
   * CANC_DT >= :HDR-CANC-DT AND ***** ROW_STS_CD = 'A' ***** ORDER BY SHR_ARNG_CD DESC ***** FETCH
   * FIRST 1 ROW ONLY
   */
  public ResultSet openSaOiCsrD5427tli(Sqlca sqlca, DclsrvcAsgn dclsrvcAsgn) throws Exception {
    ResultSet saOiCsrResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      saOiCsrResultSet =
          db2Base
              .startQuery(2 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427TLI)
              .withSql(SQLS.SQL_187780742)
              .withInputs(
                  dclsrvcAsgn.getHdrObligId(),
                  dclsrvcAsgn.getHdrShrArngCd(),
                  dclsrvcAsgn.getHdrProcDt(),
                  dclsrvcAsgn.getHdrCancDt())
              .withDataTypes(Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return saOiCsrResultSet;
  }
  // methodEnd:openSaOiCsrD5427tli
  // methodStart:fetchSaOiCsrD5427tli

  /** ***** FETCH SA_OI_CSR ***** INTO :HDR-SLOT-TBL-ID */
  public void fetchSaOiCsrD5427tli(ResultSet saOiCsrResultSet, Sqlca sqlca, DclsrvcAsgn dclsrvcAsgn)
      throws Exception {
    try {
      boolean hasResults = saOiCsrResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = saOiCsrResultSet.getObject(1);
        if (resultObj != null) {
          dclsrvcAsgn.setHdrSlotTblId(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        sqlFetchCounter++;
      } else {
        sqlca.setSqlcode(100); // No More rows
      }
    } catch (SQLException e) {
      if (e.getMessage().contains("result set is closed")) {
        fill501SqlcaObject(sqlca); // cursor closed
      } else {
        logger.error("saOiCsrResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchSaOiCsrD5427tli
  // methodStart:closeSaOiCsrD5427tli

  /** ***** CLOSE SA_OI_CSR */
  public void closeSaOiCsrD5427tli(ResultSet saOiCsrResultSet, Sqlca sqlca) throws Exception {

    closeCursor(saOiCsrResultSet, sqlca);
  }
  // methodEnd:closeSaOiCsrD5427tli
  // methodStart:fillSqlcaObject
  public void fillSqlcaObject(Sqlca sqlca, SQLException e) {
    CfSqlca db2Sqlca = Db2Base.getCfSqlca(e);
    if (db2Sqlca != null) {
      sqlca.setSqlcaid("SQLCA  ".toCharArray());
      sqlca.setSqlcabc(136);
      sqlca.setSqlcode(db2Sqlca.getSqlCode());
      sqlca.setSqlerrp(db2Sqlca.getSqlErrp().toCharArray());
      if (db2Sqlca.getSqlErrmc() != null) {
        sqlca.getSqlerrm().setSqlerrml(db2Sqlca.getSqlErrmc().length());
        char ch = 65533;
        char[] errmc = db2Sqlca.getSqlErrmc().toCharArray();
        for (int i = 0; i < errmc.length; i++) {
          if (errmc[i] == ';') {
            errmc[i] = ch;
          }
        }
        sqlca.getSqlerrm().setSqlerrmc(errmc);
      }
      int[] sqlErrd = db2Sqlca.getSqlErrd();
      for (int i = 0; i < sqlErrd.length; i++) {
        sqlca.setSqlerrd(i, sqlErrd[i]);
      }
      char[] sqlWarn = db2Sqlca.getSqlWarn();
      for (int i = 0; i < sqlWarn.length; i++) {
        switch (i) {
          case 0:
            sqlca.getSqlwarn().setSqlwarn0(new char[] {sqlWarn[0]});
            break;
          case 1:
            sqlca.getSqlwarn().setSqlwarn1(new char[] {sqlWarn[1]});
            break;
          case 2:
            sqlca.getSqlwarn().setSqlwarn2(new char[] {sqlWarn[2]});
            break;
          case 3:
            sqlca.getSqlwarn().setSqlwarn3(new char[] {sqlWarn[3]});
            break;
          case 4:
            sqlca.getSqlwarn().setSqlwarn4(new char[] {sqlWarn[4]});
            break;
          case 5:
            sqlca.getSqlwarn().setSqlwarn5(new char[] {sqlWarn[5]});
            break;
          case 6:
            sqlca.getSqlwarn().setSqlwarn6(new char[] {sqlWarn[6]});
            break;
          case 7:
            sqlca.getSqlwarn().setSqlwarn7(new char[] {sqlWarn[7]});
            break;
          case 8:
            sqlca.getSqlext().setSqlwarn8(new char[] {sqlWarn[8]});
            break;
          case 9:
            sqlca.getSqlext().setSqlwarn9(new char[] {sqlWarn[9]});
            break;
          case 10:
            sqlca.getSqlext().setSqlwarna(new char[] {sqlWarn[10]});
            break;
        }
      }
      sqlca.getSqlext().setSqlstate(db2Sqlca.getSqlState().toCharArray());
    } else {
      sqlca.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
    }
  }
  // methodEnd:fillSqlcaObject

  public void fill501SqlcaObject(Sqlca sqlca) {
    sqlca.setSqlcode(-501);
    sqlca.setSqlerrp("DSNXERT".toCharArray());
    sqlca.setSqlerrd(0, -240);
    sqlca.setSqlerrd(1, 0);
    sqlca.setSqlerrd(2, 0);
    sqlca.setSqlerrd(3, -1);
    sqlca.setSqlerrd(4, 0);
    sqlca.setSqlerrd(5, 0);
    sqlca.getSqlext().setSqlstate("24501".toCharArray());
  }

  public void closeCursor(ResultSet result, Sqlca sqlca) throws Exception {
    sqlca.setSqlcode(0);
    try {
      db2Base.closeCursor(result);
    } catch (Exception e) {
      logger.info("{} close had exception", result);
    }

    db2Base.updateFetchCounter(sqlFetchCounter);
  }
}
