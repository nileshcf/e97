package com.cloudframe.app.repository.impl;

import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.CfSqlca;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.dao.SqlBase;
import com.cloudframe.app.dto.d5427hpc.*;
import com.cloudframe.app.repository.D5427hpcRepository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("d5427hpcRepository")
public class D5427hpcRepositoryImpl implements D5427hpcRepository {
  Logger logger = LoggerFactory.getLogger(D5427hpcRepositoryImpl.class);

  // declare:start
  int sqlFetchCounter = 0;
  static final short NOT_NULL = (short) 0;
  // declare:end

  @Autowired
  @Qualifier("db2Base")
  SqlBase<char[]> db2Base;

  // methodStart:openHipaaGenericCsrD5427hpc

  /**
   * ***** DECLARE HIPAA_GENERIC_CSR CURSOR FOR ***** SELECT HIPAA_CD, ***** GRNRC_RQST_CD *****
   * FROM HIPAA_PROC_CD ***** WHERE HIPAA_VER_NBR = :HIPAA-VER-NBR AND ***** GRNRC_RQST_CD IN
   * ('S','G') ***** ORDER BY HIPAA_CD ***** FOR FETCH ONLY
   */
  public ResultSet openHipaaGenericCsrD5427hpc(Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd)
      throws Exception {
    ResultSet hipaaGenericCsrResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      hipaaGenericCsrResultSet =
          db2Base
              .startQuery(1 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427HPC)
              .withSql(SQLS.SQL_2060887500)
              .withInputs(dclhipaaProcCd.getHipaaVerNbr())
              .withDataTypes(Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return hipaaGenericCsrResultSet;
  }
  // methodEnd:openHipaaGenericCsrD5427hpc
  // methodStart:fetchHipaaGenericCsrD5427hpc

  /** ***** FETCH HIPAA_GENERIC_CSR ***** INTO :HIPAA-CD, ***** :GRNRC-RQST-CD */
  public void fetchHipaaGenericCsrD5427hpc(
      ResultSet hipaaGenericCsrResultSet, Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd)
      throws Exception {
    try {
      boolean hasResults = hipaaGenericCsrResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = hipaaGenericCsrResultSet.getObject(1);
        if (resultObj != null) {
          dclhipaaProcCd.setHipaaCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaGenericCsrResultSet.getObject(2);
        if (resultObj != null) {
          dclhipaaProcCd.setGrnrcRqstCd(resultObj.toString().toCharArray());
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
        logger.error("hipaaGenericCsrResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchHipaaGenericCsrD5427hpc
  // methodStart:closeHipaaGenericCsrD5427hpc

  /** ***** CLOSE HIPAA_GENERIC_CSR */
  public void closeHipaaGenericCsrD5427hpc(ResultSet hipaaGenericCsrResultSet, Sqlca sqlca)
      throws Exception {

    closeCursor(hipaaGenericCsrResultSet, sqlca);
  }
  // methodEnd:closeHipaaGenericCsrD5427hpc
  // methodStart:openHipaaGroupCsrD5427hpc

  /**
   * ***** DECLARE HIPAA_GROUP_CSR CURSOR FOR ***** SELECT HIPAA_CD ***** FROM HIPAA_PROC_CD *****
   * WHERE HIPAA_GRP_CD = :HIPAA-GRP-CD AND ***** HIPAA_VER_NBR = :HIPAA-VER-NBR ***** ORDER BY
   * HIPAA_CD ***** FOR FETCH ONLY
   */
  public ResultSet openHipaaGroupCsrD5427hpc(Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd)
      throws Exception {
    ResultSet hipaaGroupCsrResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      hipaaGroupCsrResultSet =
          db2Base
              .startQuery(2 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427HPC)
              .withSql(SQLS.SQL_1168280373)
              .withInputs(dclhipaaProcCd.getHipaaGrpCd(), dclhipaaProcCd.getHipaaVerNbr())
              .withDataTypes(Types.CHAR, Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return hipaaGroupCsrResultSet;
  }
  // methodEnd:openHipaaGroupCsrD5427hpc
  // methodStart:fetchHipaaGroupCsrD5427hpc

  /** ***** FETCH HIPAA_GROUP_CSR ***** INTO :HIPAA-CD */
  public void fetchHipaaGroupCsrD5427hpc(
      ResultSet hipaaGroupCsrResultSet, Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd)
      throws Exception {
    try {
      boolean hasResults = hipaaGroupCsrResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = hipaaGroupCsrResultSet.getObject(1);
        if (resultObj != null) {
          dclhipaaProcCd.setHipaaCd(resultObj.toString().toCharArray());
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
        logger.error("hipaaGroupCsrResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchHipaaGroupCsrD5427hpc
  // methodStart:closeHipaaGroupCsrD5427hpc

  /** ***** CLOSE HIPAA_GROUP_CSR */
  public void closeHipaaGroupCsrD5427hpc(ResultSet hipaaGroupCsrResultSet, Sqlca sqlca)
      throws Exception {

    closeCursor(hipaaGroupCsrResultSet, sqlca);
  }
  // methodEnd:closeHipaaGroupCsrD5427hpc
  // methodStart:selectHipaaProcCd

  /**
   * ***** SELECT HIPAA_CD ***** INTO :HIPAA-CD ***** FROM HIPAA_PROC_CD ***** WHERE HIPAA_CD =
   * :HIPAA-CD AND ***** HIPAA_VER_NBR = :HIPAA-VER-NBR
   */
  public void selectHipaaProcCd(Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd) throws Exception {
    try {
      // SELECT
      // reset SQLCODE
      sqlca.setSqlcode(0);

      // execute SQLJ query
      ResultSet resultSet =
          db2Base
              .startQuery(11 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427HPC)
              .withSql(SQLS.SQL_497529176)
              .withInputs(dclhipaaProcCd.getHipaaCd(), dclhipaaProcCd.getHipaaVerNbr())
              .withDataTypes(Types.CHAR, Types.CHAR)
              .queryForList();
      // check sqlca.getSqlcode() or errors
      sqlca.setSqlcode(Db2Base.fillSQLCode(resultSet));
      if (sqlca.getSqlcode() != 100) {
        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = resultSet.getObject(1);
        if (resultObj != null) {
          dclhipaaProcCd.setHipaaCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        if (resultSet.next()) sqlca.setSqlcode(-811);
      } else {
        sqlca.setSqlerrp("DSNXRFF".toCharArray());
        int[] arr = {-110, 0, 0, -1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
          sqlca.setSqlerrd(i, arr[i]);
        }
        sqlca.getSqlext().setSqlstate("02000".toCharArray());
      }
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }
  }
  // methodEnd:selectHipaaProcCd
  // methodStart:openHipaaListCsrD5427hpc

  /**
   * ***** DECLARE HIPAA_LIST_CSR CURSOR FOR *****WITH HIPAA_CD_LIST ***** ( HIPAA_CD_ITEM ) *****AS
   * ( SELECT :HV-HIPAA-CODE-ITEM-1 FROM SYSIBM.SYSDUMMY1 ***** WHERE :HV-HIPAA-CODE-ITEM-1 > ' '
   * *****UNION SELECT :HV-HIPAA-CODE-ITEM-2 FROM SYSIBM.SYSDUMMY1 ***** WHERE :HV-HIPAA-CODE-ITEM-2
   * > ' ' *****UNION SELECT :HV-HIPAA-CODE-ITEM-3 FROM SYSIBM.SYSDUMMY1 ***** WHERE
   * :HV-HIPAA-CODE-ITEM-3 > ' ' *****UNION SELECT :HV-HIPAA-CODE-ITEM-4 FROM SYSIBM.SYSDUMMY1 *****
   * WHERE :HV-HIPAA-CODE-ITEM-4 > ' ' *****UNION SELECT :HV-HIPAA-CODE-ITEM-5 FROM SYSIBM.SYSDUMMY1
   * ***** WHERE :HV-HIPAA-CODE-ITEM-5 > ' ' *****UNION SELECT :HV-HIPAA-CODE-ITEM-6 FROM
   * SYSIBM.SYSDUMMY1 ***** WHERE :HV-HIPAA-CODE-ITEM-6 > ' ' *****UNION SELECT
   * :HV-HIPAA-CODE-ITEM-7 FROM SYSIBM.SYSDUMMY1 ***** WHERE :HV-HIPAA-CODE-ITEM-7 > ' ' *****UNION
   * SELECT :HV-HIPAA-CODE-ITEM-8 FROM SYSIBM.SYSDUMMY1 ***** WHERE :HV-HIPAA-CODE-ITEM-8 > ' '
   * *****UNION SELECT :HV-HIPAA-CODE-ITEM-9 FROM SYSIBM.SYSDUMMY1 ***** WHERE :HV-HIPAA-CODE-ITEM-9
   * > ' ' *****UNION SELECT :HV-HIPAA-CODE-ITEM-10 FROM SYSIBM.SYSDUMMY1 ***** WHERE
   * :HV-HIPAA-CODE-ITEM-10 > ' ' ***** ) ***** *****SELECT DISTINCT(HPC.HIPAA_CD) ***** ,
   * HPC.GRNRC_RQST_CD ***** FROM HIPAA_CD_LIST ***** , HIPAA_PROC_CD HPC ***** ***** WHERE
   * HPC.HIPAA_VER_NBR = :HIPAA-VER-NBR ***** ***** AND ( ( HIPAA_CD_ITEM = HPC.HIPAA_GRP_CD *****
   * OR ( (HIPAA_CD_ITEM = HPC.HIPAA_CD) ***** AND NOT EXISTS ***** (SELECT 1 FROM HIPAA_PROC_CD HP2
   * ***** WHERE HPC.HIPAA_CD = HP2.HIPAA_GRP_CD ***** FETCH FIRST 1 ROWS ONLY) ***** ) ***** )
   * ***** OR ( GRNRC_RQST_CD IN ('S' ,'G' ) ***** AND (SELECT 1 ***** FROM HIPAA_CD_LIST *****
   * WHERE HIPAA_CD_ITEM = '30' ***** FETCH FIRST 1 ROWS ONLY ) = 1 ***** ) ***** ) ***** ORDER BY
   * HIPAA_CD ***** FOR FETCH ONLY
   */
  public ResultSet openHipaaListCsrD5427hpc(
      Sqlca sqlca, HvHipaaCodeList hvHipaaCodeList, DclhipaaProcCd dclhipaaProcCd)
      throws Exception {
    ResultSet hipaaListCsrResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      hipaaListCsrResultSet =
          db2Base
              .startQuery(3 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427HPC)
              .withSql(SQLS.SQL_754600242)
              .withInputs(
                  hvHipaaCodeList.getHvHipaaCodeItem1(),
                  hvHipaaCodeList.getHvHipaaCodeItem1(),
                  hvHipaaCodeList.getHvHipaaCodeItem2(),
                  hvHipaaCodeList.getHvHipaaCodeItem2(),
                  hvHipaaCodeList.getHvHipaaCodeItem3(),
                  hvHipaaCodeList.getHvHipaaCodeItem3(),
                  hvHipaaCodeList.getHvHipaaCodeItem4(),
                  hvHipaaCodeList.getHvHipaaCodeItem4(),
                  hvHipaaCodeList.getHvHipaaCodeItem5(),
                  hvHipaaCodeList.getHvHipaaCodeItem5(),
                  hvHipaaCodeList.getHvHipaaCodeItem6(),
                  hvHipaaCodeList.getHvHipaaCodeItem6(),
                  hvHipaaCodeList.getHvHipaaCodeItem7(),
                  hvHipaaCodeList.getHvHipaaCodeItem7(),
                  hvHipaaCodeList.getHvHipaaCodeItem8(),
                  hvHipaaCodeList.getHvHipaaCodeItem8(),
                  hvHipaaCodeList.getHvHipaaCodeItem9(),
                  hvHipaaCodeList.getHvHipaaCodeItem9(),
                  hvHipaaCodeList.getHvHipaaCodeItem10(),
                  hvHipaaCodeList.getHvHipaaCodeItem10(),
                  dclhipaaProcCd.getHipaaVerNbr())
              .withDataTypes(
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR,
                  Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return hipaaListCsrResultSet;
  }
  // methodEnd:openHipaaListCsrD5427hpc
  // methodStart:fetchHipaaListCsrD5427hpc

  /** ***** FETCH HIPAA_LIST_CSR ***** INTO :HIPAA-CD ***** , :GRNRC-RQST-CD */
  public void fetchHipaaListCsrD5427hpc(
      ResultSet hipaaListCsrResultSet, Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd)
      throws Exception {
    try {
      boolean hasResults = hipaaListCsrResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = hipaaListCsrResultSet.getObject(1);
        if (resultObj != null) {
          dclhipaaProcCd.setHipaaCd(resultObj.toString().toCharArray());
        } else {
          sqlca.setSqlcode(-305);
        }
        resultObj = hipaaListCsrResultSet.getObject(2);
        if (resultObj != null) {
          dclhipaaProcCd.setGrnrcRqstCd(resultObj.toString().toCharArray());
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
        logger.error("hipaaListCsrResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchHipaaListCsrD5427hpc
  // methodStart:closeHipaaListCsrD5427hpc

  /** ***** CLOSE HIPAA_LIST_CSR */
  public void closeHipaaListCsrD5427hpc(ResultSet hipaaListCsrResultSet, Sqlca sqlca)
      throws Exception {

    closeCursor(hipaaListCsrResultSet, sqlca);
  }
  // methodEnd:closeHipaaListCsrD5427hpc
  // methodStart:openHipaaAllCsrD5427hpc

  /**
   * ***** DECLARE HIPAA_ALL_CSR CURSOR FOR ***** SELECT HIPAA_CD ***** FROM HIPAA_PROC_CD *****
   * WHERE HIPAA_VER_NBR = :HIPAA-VER-NBR ***** ORDER BY HIPAA_CD ***** FOR FETCH ONLY
   */
  public ResultSet openHipaaAllCsrD5427hpc(Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd)
      throws Exception {
    ResultSet hipaaAllCsrResultSet = null;
    try {
      // OPEN CURSOR
      sqlca.setSqlcode(0);
      hipaaAllCsrResultSet =
          db2Base
              .startQuery(4 /* SQL Sequence*/, CONSTANTS.LITERAL_D5427HPC)
              .withSql(SQLS.SQL_1727663143)
              .withInputs(dclhipaaProcCd.getHipaaVerNbr())
              .withDataTypes(Types.CHAR)
              .queryForList();
    } catch (SQLException e) {
      fillSqlcaObject(sqlca, e);
    } catch (Exception e) {
      throw e;
    }

    return hipaaAllCsrResultSet;
  }
  // methodEnd:openHipaaAllCsrD5427hpc
  // methodStart:fetchHipaaAllCsrD5427hpc

  /** ***** FETCH HIPAA_ALL_CSR ***** INTO :HIPAA-CD */
  public void fetchHipaaAllCsrD5427hpc(
      ResultSet hipaaAllCsrResultSet, Sqlca sqlca, DclhipaaProcCd dclhipaaProcCd) throws Exception {
    try {
      boolean hasResults = hipaaAllCsrResultSet.next();
      if (hasResults) {
        sqlca.setSqlcode(0);

        // Extract values from the result set
        Object resultObj;
        String resultObjString = null;
        char[] value;
        resultObj = hipaaAllCsrResultSet.getObject(1);
        if (resultObj != null) {
          dclhipaaProcCd.setHipaaCd(resultObj.toString().toCharArray());
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
        logger.error("hipaaAllCsrResultSet - Error during FETCH Cursor - {}", e.getMessage());
        sqlca.setSqlcode(-904); // //possibly a data issue
      }
      System.out.println(e.getMessage());
    }
  }
  // methodEnd:fetchHipaaAllCsrD5427hpc
  // methodStart:closeHipaaAllCsrD5427hpc

  /** ***** CLOSE HIPAA_ALL_CSR */
  public void closeHipaaAllCsrD5427hpc(ResultSet hipaaAllCsrResultSet, Sqlca sqlca)
      throws Exception {

    closeCursor(hipaaAllCsrResultSet, sqlca);
  }
  // methodEnd:closeHipaaAllCsrD5427hpc
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
