package org.optum.uhg.service.impl;

/* 
*
* security search service
*
*/
import org.optum.uhg.common.CommonProcess;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.cics.CICSSession;
import org.optum.uhg.dto.cics0012.Cics0012Ctx.*;
import org.optum.uhg.dto.cics0012.Cics0012Ctx;
import org.optum.uhg.service.Cics0012;
import com.cloudframe.app.process.BaseProcess;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.exception.Terminate;
import com.cloudframe.app.cics.TransactionManager;
import com.cloudframe.app.vsam.KeyInfo;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.data.Field;
import org.optum.uhg.dto.cics0012.*;
import org.optum.uhg.dto.cics0012.Dfhcommarea;
import org.optum.uhg.dto.cics0012.SecurityRecord;
import org.optum.uhg.dto.cics0012.Work;
import org.optum.uhg.common.CONSTANTS;
import com.cloudframe.app.utility.CFUtil;

@Component("cics0012")
public class Cics0012Impl extends CommonProcess implements Cics0012 {

    Logger logger = LoggerFactory.getLogger(Cics0012Impl.class);

    /**
     * process
     * Input  : None
     *
     * Output : None
     *
     * @throws CFException
     */
    public int process(Cics0012Ctx programCtx) throws Exception {
        try {
            setCodePage("1047");
            // Reset program ended flag
            programCtx.setProgramEnded(false);
            ProcessInCtx methodIn = programCtx.getProcessInCtx();
            // PERFORM 0000-MAINLINE
            mainline(programCtx.getMainlineInCtx());
            /*0000-MAINLINE SECTION*/
            if (programCtx.isProgramEnded()) {
                return programCtx.getRc();
            }
        } catch (Exception e) {
            handleErrorCode(e);
            throw e;
        }
        // Exit with return code
        return programCtx.getRc();
        // end of process method
    }

    /**
     * mainline
     *   This method is derived from
     *   COBOL Paragraph - 0000-MAINLINE SECTION COBOL Cyclomatic complexity - 7
     * Input  :
     *
     * - lsApiRequestType               COBOL Name: LS-API-REQUEST-TYPE
     *
     * Output :
     *
     * - lsOutputCount                  COBOL Name: LS-OUTPUT-COUNT
     *
     * @throws CFException
     */
    @Override
    public MainlineOutCtx mainline(MainlineInCtx methodIn) throws Exception {
        Cics0012Ctx programCtx = methodIn.getCics0012Ctx();
        MainlineOutCtx methodOut = methodIn.getMainlineOutCtx();
        // *
        // *
        // *
        // *
        // MOVE 0 TO LS-OUTPUT-COUNT
        methodOut.setLsOutputCount(0);
        // EVALUATE TRUE
        if (methodIn.isIsinBased()) {
            // PERFORM 0001-ISIN-REQUEST THRU 0001-EXIT
            isinRequest(programCtx.getIsinRequestInCtx());
            /*0001-ISIN-REQUEST*/
        } else if (methodIn.isCountryCodeBased()) {
            // PERFORM 0002-COUNTRY-REQUEST THRU 0002-EXIT
            countryRequest(programCtx.getCountryRequestInCtx());
            /*0002-COUNTRY-REQUEST*/
        } else if (methodIn.isCurrencyCodeBased()) {
            // PERFORM 0003-CURRENCY-REQUEST THRU 0003-EXIT
            currencyRequest(programCtx.getCurrencyRequestInCtx());
            /*0003-CURRENCY-REQUEST*/
        } else if (methodIn.isIndustryBased()) {
            // PERFORM 0004-INDUSTRY-REQUEST THRU 0004-EXIT
            industryRequest(programCtx.getIndustryRequestInCtx());
            /*0004-INDUSTRY-REQUEST*/
        } else if (methodIn.isSectorBased()) {
            // PERFORM 0005-SECTOR-REQUEST THRU 0005-EXIT
            sectorRequest(programCtx.getSectorRequestInCtx());
            /*0005-SECTOR-REQUEST*/
        }
        // *
        // *
        // *****EXEC CICS
        // *****    READ
        // *****       FILE      (VSSECU00)
        // *****       INTO      (WS-SECURITY-RECORD)
        // *****       LENGTH    (LENGTH OF WS-SECURITY-RECORD)
        // *****       RIDFLD    (LS-ISIN-KEY)
        // *****       KEYLENGTH (LENGTH OF LS-ISIN-KEY)
        // *****       EQUAL
        // *****       NOHANDLE
        // *****END-EXEC
        // GOBACK
        // no need to log, it is a normal termination
        setNotLogged(false);
        programCtx.setProgramEnded(true);
        return methodOut;
    }

    /**
     * isinRequest
     *   This method is derived from
     *   COBOL Paragraph - 0001-ISIN-REQUEST COBOL Cyclomatic complexity - 4
     * Input  :
     *
     * - isin                           COBOL Name: WS-ISIN
     * - sedol                          COBOL Name: WS-SEDOL
     * - ric                            COBOL Name: WS-RIC
     * - intlkey                        COBOL Name: WS-INTLKEY
     * - company                        COBOL Name: WS-COMPANY
     * - country                        COBOL Name: WS-COUNTRY
     * - currencycd                     COBOL Name: WS-CURRENCYCD
     * - industry                       COBOL Name: WS-INDUSTRY
     * - sector                         COBOL Name: WS-SECTOR
     * - ffmcapmilusd                   COBOL Name: WS-FFMCAPMILUSD
     * - sectorweight                   COBOL Name: WS-SECTORWEIGHT
     *
     * Output :
     *
     * - lsOutputCount                  COBOL Name: LS-OUTPUT-COUNT
     * - i                              COBOL Name: WS-I
     * - isin01                         COBOL Name: ISIN
     * - isin                           COBOL Name: WS-ISIN
     * - sedol01                        COBOL Name: SEDOL
     * - sedol                          COBOL Name: WS-SEDOL
     * - ric01                          COBOL Name: RIC
     * - ric                            COBOL Name: WS-RIC
     * - intlkey01                      COBOL Name: INTLKEY
     * - intlkey                        COBOL Name: WS-INTLKEY
     * - company01                      COBOL Name: COMPANY
     * - company                        COBOL Name: WS-COMPANY
     * - country01                      COBOL Name: COUNTRY
     * - country                        COBOL Name: WS-COUNTRY
     * - currencycd01                   COBOL Name: CURRENCYCD
     * - currencycd                     COBOL Name: WS-CURRENCYCD
     * - industry01                     COBOL Name: INDUSTRY
     * - industry                       COBOL Name: WS-INDUSTRY
     * - sector01                       COBOL Name: SECTOR
     * - sector                         COBOL Name: WS-SECTOR
     * - ffmcapmilusd01                 COBOL Name: FFMCAPMILUSD
     * - ffmcapmilusd                   COBOL Name: WS-FFMCAPMILUSD
     * - sectorweight01                 COBOL Name: SECTORWEIGHT
     * - sectorweight                   COBOL Name: WS-SECTORWEIGHT
     * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
     * - lsEibresp                      COBOL Name: LS-EIBRESP
     * - lsEibresp2                     COBOL Name: LS-EIBRESP2
     *
     * @throws CFException
     */
    @Override
    public IsinRequestOutCtx isinRequest(IsinRequestInCtx methodIn) throws Exception {
        // Declare local variables used in the method
        final int LS_ISIN_KEY_LENGTH = 12;
        // End of variable declaration
        Cics0012Ctx programCtx = methodIn.getCics0012Ctx();
        IsinRequestOutCtx methodOut = methodIn.getIsinRequestOutCtx();
        // READ FILE (VSSECU00) INTO (WS-SECURITY-RECORD) LENGTH (FUNCTION~LENGTH~WS-SECURITY-RECORD) RIDFLD (LS-ISIN-KEY) KEYLENGTH (FUNCTION~LENGTH~LS-ISIN-KEY) EQUAL NOHANDLE
        // READ FILE (VSSECU00) INTO (WS-SECURITY-RECORD) LENGTH (FUNCTION~LENGTH~WS-SECURITY-RECORD) RIDFLD (LS-ISIN-KEY) KEYLENGTH (FUNCTION~LENGTH~LS-ISIN-KEY) EQUAL NOHANDLE
        // read a record from the file
        methodIn.getSecurityRecord().setString(TransactionManager.readFile(programCtx.getCicsSession(), methodIn.getVssecu00(), methodIn.getLsIsinKey(), "".toCharArray(), /*token*/
        "".toCharArray(), /*sysId*/
        LS_ISIN_KEY_LENGTH, SecurityRecord.getSecurityRecordFieldLength(), false, /*debkey*/
        false, /*debrec*/
        false, /*rba*/
        false, /*rrn*/
        false, /*xrba*/
        false, /*gteq*/
        true, /*equal*/
        false, /*nosuspend*/
        false, /*uncommitted*/
        false, /*consistent*/
        false, /*repeatable*/
        false, /*update*/
        false, /*generic*/
        new KeyInfo(1, 12, 0, false)));
        // EVALUATE TRUE
        if ((programCtx.getCicsSession().getEibresp() == 0)) {
            // MOVE 1 TO LS-OUTPUT-COUNT
            methodOut.setLsOutputCount(1);
            // MOVE LS-OUTPUT-COUNT TO WS-I
            methodOut.setI((short) methodOut.getLsOutputCount());
            // MOVE WS-ISIN TO ISIN ( WS-I )
            methodOut.setIsin01(methodOut.getI() - 1, methodOut.getIsin());
            // MOVE WS-SEDOL TO SEDOL ( WS-I )
            methodOut.setSedol01(methodOut.getI() - 1, methodOut.getSedol());
            // MOVE WS-RIC TO RIC ( WS-I )
            methodOut.setRic01(methodOut.getI() - 1, methodOut.getRic());
            // MOVE WS-INTLKEY TO INTLKEY ( WS-I )
            methodOut.setIntlkey01(methodOut.getI() - 1, methodOut.getIntlkey());
            // MOVE WS-COMPANY TO COMPANY ( WS-I )
            methodOut.setCompany01(methodOut.getI() - 1, methodOut.getCompany());
            // MOVE WS-COUNTRY TO COUNTRY ( WS-I )
            methodOut.setCountry01(methodOut.getI() - 1, methodOut.getCountry());
            // MOVE WS-CURRENCYCD TO CURRENCYCD ( WS-I )
            methodOut.setCurrencycd01(methodOut.getI() - 1, methodOut.getCurrencycd());
            // MOVE WS-INDUSTRY TO INDUSTRY ( WS-I )
            methodOut.setIndustry01(methodOut.getI() - 1, methodOut.getIndustry());
            // MOVE WS-SECTOR TO SECTOR ( WS-I )
            methodOut.setSector01(methodOut.getI() - 1, methodOut.getSector());
            // MOVE WS-FFMCAPMILUSD TO FFMCAPMILUSD ( WS-I )
            methodOut.setFfmcapmilusd01(methodOut.getI() - 1, methodOut.getFfmcapmilusd());
            // MOVE WS-SECTORWEIGHT TO SECTORWEIGHT ( WS-I )
            methodOut.setSectorweight01(methodOut.getI() - 1, methodOut.getSectorweight());
        } else if ((programCtx.getCicsSession().getEibresp() == 13)) {
            ;
        } else {
            // MOVE 16 TO LS-RETURN-CODE
            methodOut.setLsReturnCode((short) 16);
            // MOVE EIBRESP TO LS-EIBRESP
            methodOut.setLsEibresp(programCtx.getCicsSession().getEibresp());
            // MOVE EIBRESP2 TO LS-EIBRESP2
            methodOut.setLsEibresp2(programCtx.getCicsSession().getEibresp2());
        }
        return methodOut;
    }

    /**
     * countryRequest
     *   This method is derived from
     *   COBOL Paragraph - 0002-COUNTRY-REQUEST COBOL Cyclomatic complexity - 11
     * Input  :
     *
     * - lsOutputCount                  COBOL Name: LS-OUTPUT-COUNT
     * - isin                           COBOL Name: WS-ISIN
     * - sedol                          COBOL Name: WS-SEDOL
     * - ric                            COBOL Name: WS-RIC
     * - intlkey                        COBOL Name: WS-INTLKEY
     * - company                        COBOL Name: WS-COMPANY
     * - currencycd                     COBOL Name: WS-CURRENCYCD
     * - industry                       COBOL Name: WS-INDUSTRY
     * - sector                         COBOL Name: WS-SECTOR
     * - ffmcapmilusd                   COBOL Name: WS-FFMCAPMILUSD
     * - sectorweight                   COBOL Name: WS-SECTORWEIGHT
     *
     * Output :
     *
     * - country                        COBOL Name: WS-COUNTRY
     * - eofSw                          COBOL Name: WS-EOF-SW
     * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
     * - lsEibresp                      COBOL Name: LS-EIBRESP
     * - lsEibresp2                     COBOL Name: LS-EIBRESP2
     * - lsOutputCount                  COBOL Name: LS-OUTPUT-COUNT
     * - i                              COBOL Name: WS-I
     * - isin01                         COBOL Name: ISIN
     * - isin                           COBOL Name: WS-ISIN
     * - sedol01                        COBOL Name: SEDOL
     * - sedol                          COBOL Name: WS-SEDOL
     * - ric01                          COBOL Name: RIC
     * - ric                            COBOL Name: WS-RIC
     * - intlkey01                      COBOL Name: INTLKEY
     * - intlkey                        COBOL Name: WS-INTLKEY
     * - company01                      COBOL Name: COMPANY
     * - company                        COBOL Name: WS-COMPANY
     * - country01                      COBOL Name: COUNTRY
     * - currencycd01                   COBOL Name: CURRENCYCD
     * - currencycd                     COBOL Name: WS-CURRENCYCD
     * - industry01                     COBOL Name: INDUSTRY
     * - industry                       COBOL Name: WS-INDUSTRY
     * - sector01                       COBOL Name: SECTOR
     * - sector                         COBOL Name: WS-SECTOR
     * - ffmcapmilusd01                 COBOL Name: FFMCAPMILUSD
     * - ffmcapmilusd                   COBOL Name: WS-FFMCAPMILUSD
     * - sectorweight01                 COBOL Name: SECTORWEIGHT
     * - sectorweight                   COBOL Name: WS-SECTORWEIGHT
     *
     * @throws CFException
     */
    @Override
    public CountryRequestOutCtx countryRequest(CountryRequestInCtx methodIn) throws Exception {
        // Declare local variables used in the method
        final int LS_COUNTRY_CODE_KEY_LENGTH = 2;
        // End of variable declaration
        Cics0012Ctx programCtx = methodIn.getCics0012Ctx();
        CountryRequestOutCtx methodOut = methodIn.getCountryRequestOutCtx();
        // *
        // MOVE SPACES TO WS-COUNTRY
        methodOut.setCountry(CONSTANTS.SPACE_2);
        // MOVE SPACES TO WS-EOF-SW
        methodOut.setEofSw(CONSTANTS.SPACE);
        // STARTBR FILE(VSSECU01) RIDFLD (LS-COUNTRY-CODE-KEY) KEYLENGTH (FUNCTION~LENGTH~LS-COUNTRY-CODE-KEY) EQUAL NOHANDLE
        // STARTBR FILE(VSSECU01) RIDFLD (LS-COUNTRY-CODE-KEY) KEYLENGTH (FUNCTION~LENGTH~LS-COUNTRY-CODE-KEY) EQUAL NOHANDLE
        // start Browsing a file
        TransactionManager.startBrowsing(programCtx.getCicsSession(), methodIn.getVssecu01(), methodIn.getLsCountryCodeKey(), "".toCharArray(), /*reqId*/
        "".toCharArray(), /*sysId*/
        LS_COUNTRY_CODE_KEY_LENGTH, false, /*debkey*/
        false, /*debrec*/
        false, /*rba*/
        false, /*rrn*/
        false, /*xrba*/
        false, /*gteq*/
        true, /*equal*/
        false, /*generic*/
        new KeyInfo(1, 2, 0, false));
        // EVALUATE TRUE
        if ((programCtx.getCicsSession().getEibresp() == 0)) {
            ;
        } else if ((programCtx.getCicsSession().getEibresp() == 13)) {
            // GOBACK
            throw Terminate.TERMINATE;
        } else {
            // MOVE 16 TO LS-RETURN-CODE
            methodOut.setLsReturnCode((short) 16);
            // MOVE EIBRESP TO LS-EIBRESP
            methodOut.setLsEibresp(programCtx.getCicsSession().getEibresp());
            // MOVE EIBRESP2 TO LS-EIBRESP2
            methodOut.setLsEibresp2(programCtx.getCicsSession().getEibresp2());
            // GOBACK
            throw Terminate.TERMINATE;
        }
        // PERFORM UNTIL END-OF-FILE OR LS-OUTPUT-COUNT >= 400
        while ((!(methodOut.isEndOfFile()) && (methodOut.getLsOutputCount() < 400))) {
            // READNEXT FILE (VSSECU01) INTO (WS-SECURITY-RECORD) LENGTH (FUNCTION~LENGTH~WS-SECURITY-RECORD) RIDFLD (LS-COUNTRY-CODE-KEY) NOHANDLE
            // READNEXT FILE (VSSECU01) INTO (WS-SECURITY-RECORD) LENGTH (FUNCTION~LENGTH~WS-SECURITY-RECORD) RIDFLD (LS-COUNTRY-CODE-KEY) NOHANDLE
            // read the next record from a file
            methodIn.getSecurityRecord().setString(TransactionManager.readNextRecord(programCtx.getCicsSession(), methodIn.getVssecu01(), methodIn.getLsCountryCodeKey(), "".toCharArray(), /*Token*/
            "".toCharArray(), /*SysId*/
            -1, SecurityRecord.getSecurityRecordFieldLength(), "".toCharArray(), /*ReqId*/
            false, /*rba*/
            false, /*rrn*/
            false, /*xrba*/
            false, /*nosuspend*/
            false, /*uncommitted*/
            false, /*consistent*/
            false, /*repeatable*/
            false).toCharArray());
            // EVALUATE TRUE
            if (((programCtx.getCicsSession().getEibresp() == 0)) || ((programCtx.getCicsSession().getEibresp() == 15))) {
                // ADD 1 TO LS-OUTPUT-COUNT
                methodOut.setLsOutputCount(methodOut.getLsOutputCount() + 1);
                // MOVE LS-OUTPUT-COUNT TO WS-I
                methodOut.setI((short) methodOut.getLsOutputCount());
                // MOVE WS-ISIN TO ISIN ( WS-I )
                methodOut.setIsin01(methodOut.getI() - 1, methodOut.getIsin());
                // MOVE WS-SEDOL TO SEDOL ( WS-I )
                methodOut.setSedol01(methodOut.getI() - 1, methodOut.getSedol());
                // MOVE WS-RIC TO RIC ( WS-I )
                methodOut.setRic01(methodOut.getI() - 1, methodOut.getRic());
                // MOVE WS-INTLKEY TO INTLKEY ( WS-I )
                methodOut.setIntlkey01(methodOut.getI() - 1, methodOut.getIntlkey());
                // MOVE WS-COMPANY TO COMPANY ( WS-I )
                methodOut.setCompany01(methodOut.getI() - 1, methodOut.getCompany());
                // MOVE WS-COUNTRY TO COUNTRY ( WS-I )
                methodOut.setCountry01(methodOut.getI() - 1, methodOut.getCountry());
                // MOVE WS-CURRENCYCD TO CURRENCYCD ( WS-I )
                methodOut.setCurrencycd01(methodOut.getI() - 1, methodOut.getCurrencycd());
                // MOVE WS-INDUSTRY TO INDUSTRY ( WS-I )
                methodOut.setIndustry01(methodOut.getI() - 1, methodOut.getIndustry());
                // MOVE WS-SECTOR TO SECTOR ( WS-I )
                methodOut.setSector01(methodOut.getI() - 1, methodOut.getSector());
                // MOVE WS-FFMCAPMILUSD TO FFMCAPMILUSD ( WS-I )
                methodOut.setFfmcapmilusd01(methodOut.getI() - 1, methodOut.getFfmcapmilusd());
                // MOVE WS-SECTORWEIGHT TO SECTORWEIGHT ( WS-I )
                methodOut.setSectorweight01(methodOut.getI() - 1, methodOut.getSectorweight());
                // *
                // *If eibresp gives dupkey then there are more records with same
                // *alternate key. if it gives normal then we are at end of that key
                // *
                // IF EIBRESP = DFHRESP (NORMAL)
                if ((programCtx.getCicsSession().getEibresp() == 0)) {
                    // SET END-OF-FILE TO TRUE
                    methodOut.setEndOfFileTrue();
                }
            } else if ((programCtx.getCicsSession().getEibresp() == 20)) {
                // SET END-OF-FILE TO TRUE
                methodOut.setEndOfFileTrue();
            } else {
                // MOVE 16 TO LS-RETURN-CODE
                methodOut.setLsReturnCode((short) 16);
                // MOVE EIBRESP TO LS-EIBRESP
                methodOut.setLsEibresp(programCtx.getCicsSession().getEibresp());
                // MOVE EIBRESP2 TO LS-EIBRESP2
                methodOut.setLsEibresp2(programCtx.getCicsSession().getEibresp2());
                // GOBACK
                throw Terminate.TERMINATE;
            }
        }
        // ENDBR FILE(VSSECU01) NOHANDLE
        // ENDBR FILE(VSSECU01) NOHANDLE
        // end browsing the file
        TransactionManager.endBrowsing(programCtx.getCicsSession(), methodIn.getVssecu01(), "".toCharArray(), /*sysId*/
        "".toCharArray());
        return methodOut;
    }

    /**
     * currencyRequest
     *   This method is derived from
     *   COBOL Paragraph - 0003-CURRENCY-REQUEST COBOL Cyclomatic complexity - 11
     * Input  :
     *
     * - lsOutputCount                  COBOL Name: LS-OUTPUT-COUNT
     * - isin                           COBOL Name: WS-ISIN
     * - sedol                          COBOL Name: WS-SEDOL
     * - ric                            COBOL Name: WS-RIC
     * - intlkey                        COBOL Name: WS-INTLKEY
     * - company                        COBOL Name: WS-COMPANY
     * - country                        COBOL Name: WS-COUNTRY
     * - industry                       COBOL Name: WS-INDUSTRY
     * - sector                         COBOL Name: WS-SECTOR
     * - ffmcapmilusd                   COBOL Name: WS-FFMCAPMILUSD
     * - sectorweight                   COBOL Name: WS-SECTORWEIGHT
     *
     * Output :
     *
     * - currencycd                     COBOL Name: WS-CURRENCYCD
     * - eofSw                          COBOL Name: WS-EOF-SW
     * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
     * - lsEibresp                      COBOL Name: LS-EIBRESP
     * - lsEibresp2                     COBOL Name: LS-EIBRESP2
     * - lsOutputCount                  COBOL Name: LS-OUTPUT-COUNT
     * - i                              COBOL Name: WS-I
     * - isin01                         COBOL Name: ISIN
     * - isin                           COBOL Name: WS-ISIN
     * - sedol01                        COBOL Name: SEDOL
     * - sedol                          COBOL Name: WS-SEDOL
     * - ric01                          COBOL Name: RIC
     * - ric                            COBOL Name: WS-RIC
     * - intlkey01                      COBOL Name: INTLKEY
     * - intlkey                        COBOL Name: WS-INTLKEY
     * - company01                      COBOL Name: COMPANY
     * - company                        COBOL Name: WS-COMPANY
     * - country01                      COBOL Name: COUNTRY
     * - country                        COBOL Name: WS-COUNTRY
     * - currencycd01                   COBOL Name: CURRENCYCD
     * - industry01                     COBOL Name: INDUSTRY
     * - industry                       COBOL Name: WS-INDUSTRY
     * - sector01                       COBOL Name: SECTOR
     * - sector                         COBOL Name: WS-SECTOR
     * - ffmcapmilusd01                 COBOL Name: FFMCAPMILUSD
     * - ffmcapmilusd                   COBOL Name: WS-FFMCAPMILUSD
     * - sectorweight01                 COBOL Name: SECTORWEIGHT
     * - sectorweight                   COBOL Name: WS-SECTORWEIGHT
     *
     * @throws CFException
     */
    @Override
    public CurrencyRequestOutCtx currencyRequest(CurrencyRequestInCtx methodIn) throws Exception {
        // Declare local variables used in the method
        final int LS_CURRENCY_CODE_KEY_LENGTH = 3;
        // End of variable declaration
        Cics0012Ctx programCtx = methodIn.getCics0012Ctx();
        CurrencyRequestOutCtx methodOut = methodIn.getCurrencyRequestOutCtx();
        // *
        // MOVE SPACES TO WS-CURRENCYCD
        methodOut.setCurrencycd(CONSTANTS.SPACE_3);
        // MOVE SPACES TO WS-EOF-SW
        methodOut.setEofSw(CONSTANTS.SPACE);
        // STARTBR FILE(VSSECU02) RIDFLD (LS-CURRENCY-CODE-KEY) KEYLENGTH (FUNCTION~LENGTH~LS-CURRENCY-CODE-KEY) EQUAL NOHANDLE
        // STARTBR FILE(VSSECU02) RIDFLD (LS-CURRENCY-CODE-KEY) KEYLENGTH (FUNCTION~LENGTH~LS-CURRENCY-CODE-KEY) EQUAL NOHANDLE
        // start Browsing a file
        TransactionManager.startBrowsing(programCtx.getCicsSession(), methodIn.getVssecu02(), methodIn.getLsCurrencyCodeKey(), "".toCharArray(), /*reqId*/
        "".toCharArray(), /*sysId*/
        LS_CURRENCY_CODE_KEY_LENGTH, false, /*debkey*/
        false, /*debrec*/
        false, /*rba*/
        false, /*rrn*/
        false, /*xrba*/
        false, /*gteq*/
        true, /*equal*/
        false, /*generic*/
        new KeyInfo(1, 3, 0, false));
        // EVALUATE TRUE
        if ((programCtx.getCicsSession().getEibresp() == 0)) {
            ;
        } else if ((programCtx.getCicsSession().getEibresp() == 13)) {
            // GOBACK
            throw Terminate.TERMINATE;
        } else {
            // MOVE 16 TO LS-RETURN-CODE
            methodOut.setLsReturnCode((short) 16);
            // MOVE EIBRESP TO LS-EIBRESP
            methodOut.setLsEibresp(programCtx.getCicsSession().getEibresp());
            // MOVE EIBRESP2 TO LS-EIBRESP2
            methodOut.setLsEibresp2(programCtx.getCicsSession().getEibresp2());
            // GOBACK
            throw Terminate.TERMINATE;
        }
        // PERFORM UNTIL END-OF-FILE OR LS-OUTPUT-COUNT >= 400
        while ((!(methodOut.isEndOfFile()) && (methodOut.getLsOutputCount() < 400))) {
            // READNEXT FILE (VSSECU02) INTO (WS-SECURITY-RECORD) LENGTH (FUNCTION~LENGTH~WS-SECURITY-RECORD) RIDFLD (LS-CURRENCY-CODE-KEY) NOHANDLE
            // READNEXT FILE (VSSECU02) INTO (WS-SECURITY-RECORD) LENGTH (FUNCTION~LENGTH~WS-SECURITY-RECORD) RIDFLD (LS-CURRENCY-CODE-KEY) NOHANDLE
            // read the next record from a file
            methodIn.getSecurityRecord().setString(TransactionManager.readNextRecord(programCtx.getCicsSession(), methodIn.getVssecu02(), methodIn.getLsCurrencyCodeKey(), "".toCharArray(), /*Token*/
            "".toCharArray(), /*SysId*/
            -1, SecurityRecord.getSecurityRecordFieldLength(), "".toCharArray(), /*ReqId*/
            false, /*rba*/
            false, /*rrn*/
            false, /*xrba*/
            false, /*nosuspend*/
            false, /*uncommitted*/
            false, /*consistent*/
            false, /*repeatable*/
            false).toCharArray());
            // EVALUATE TRUE
            if (((programCtx.getCicsSession().getEibresp() == 0)) || ((programCtx.getCicsSession().getEibresp() == 15))) {
                // ADD 1 TO LS-OUTPUT-COUNT
                methodOut.setLsOutputCount(methodOut.getLsOutputCount() + 1);
                // MOVE LS-OUTPUT-COUNT TO WS-I
                methodOut.setI((short) methodOut.getLsOutputCount());
                // MOVE WS-ISIN TO ISIN ( WS-I )
                methodOut.setIsin01(methodOut.getI() - 1, methodOut.getIsin());
                // MOVE WS-SEDOL TO SEDOL ( WS-I )
                methodOut.setSedol01(methodOut.getI() - 1, methodOut.getSedol());
                // MOVE WS-RIC TO RIC ( WS-I )
                methodOut.setRic01(methodOut.getI() - 1, methodOut.getRic());
                // MOVE WS-INTLKEY TO INTLKEY ( WS-I )
                methodOut.setIntlkey01(methodOut.getI() - 1, methodOut.getIntlkey());
                // MOVE WS-COMPANY TO COMPANY ( WS-I )
                methodOut.setCompany01(methodOut.getI() - 1, methodOut.getCompany());
                // MOVE WS-COUNTRY TO COUNTRY ( WS-I )
                methodOut.setCountry01(methodOut.getI() - 1, methodOut.getCountry());
                // MOVE WS-CURRENCYCD TO CURRENCYCD ( WS-I )
                methodOut.setCurrencycd01(methodOut.getI() - 1, methodOut.getCurrencycd());
                // MOVE WS-INDUSTRY TO INDUSTRY ( WS-I )
                methodOut.setIndustry01(methodOut.getI() - 1, methodOut.getIndustry());
                // MOVE WS-SECTOR TO SECTOR ( WS-I )
                methodOut.setSector01(methodOut.getI() - 1, methodOut.getSector());
                // MOVE WS-FFMCAPMILUSD TO FFMCAPMILUSD ( WS-I )
                methodOut.setFfmcapmilusd01(methodOut.getI() - 1, methodOut.getFfmcapmilusd());
                // MOVE WS-SECTORWEIGHT TO SECTORWEIGHT ( WS-I )
                methodOut.setSectorweight01(methodOut.getI() - 1, methodOut.getSectorweight());
                // *
                // *If eibresp gives dupkey then there are more records with same
                // *alternate key. if it gives normal then we are at end of that key
                // *
                // IF EIBRESP = DFHRESP (NORMAL)
                if ((programCtx.getCicsSession().getEibresp() == 0)) {
                    // SET END-OF-FILE TO TRUE
                    methodOut.setEndOfFileTrue();
                }
            } else if ((programCtx.getCicsSession().getEibresp() == 20)) {
                // SET END-OF-FILE TO TRUE
                methodOut.setEndOfFileTrue();
            } else {
                // MOVE 16 TO LS-RETURN-CODE
                methodOut.setLsReturnCode((short) 16);
                // MOVE EIBRESP TO LS-EIBRESP
                methodOut.setLsEibresp(programCtx.getCicsSession().getEibresp());
                // MOVE EIBRESP2 TO LS-EIBRESP2
                methodOut.setLsEibresp2(programCtx.getCicsSession().getEibresp2());
                // GOBACK
                throw Terminate.TERMINATE;
            }
        }
        // ENDBR FILE(VSSECU01) NOHANDLE
        // ENDBR FILE(VSSECU01) NOHANDLE
        // end browsing the file
        TransactionManager.endBrowsing(programCtx.getCicsSession(), methodIn.getVssecu01(), "".toCharArray(), /*sysId*/
        "".toCharArray());
        return methodOut;
    }

    /**
     * industryRequest
     *   This method is derived from
     *   COBOL Paragraph - 0004-INDUSTRY-REQUEST COBOL Cyclomatic complexity - 11
     * Input  :
     *
     * - lsOutputCount                  COBOL Name: LS-OUTPUT-COUNT
     * - isin                           COBOL Name: WS-ISIN
     * - sedol                          COBOL Name: WS-SEDOL
     * - ric                            COBOL Name: WS-RIC
     * - intlkey                        COBOL Name: WS-INTLKEY
     * - company                        COBOL Name: WS-COMPANY
     * - country                        COBOL Name: WS-COUNTRY
     * - currencycd                     COBOL Name: WS-CURRENCYCD
     * - sector                         COBOL Name: WS-SECTOR
     * - ffmcapmilusd                   COBOL Name: WS-FFMCAPMILUSD
     * - sectorweight                   COBOL Name: WS-SECTORWEIGHT
     *
     * Output :
     *
     * - industry                       COBOL Name: WS-INDUSTRY
     * - eofSw                          COBOL Name: WS-EOF-SW
     * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
     * - lsEibresp                      COBOL Name: LS-EIBRESP
     * - lsEibresp2                     COBOL Name: LS-EIBRESP2
     * - lsOutputCount                  COBOL Name: LS-OUTPUT-COUNT
     * - i                              COBOL Name: WS-I
     * - isin01                         COBOL Name: ISIN
     * - isin                           COBOL Name: WS-ISIN
     * - sedol01                        COBOL Name: SEDOL
     * - sedol                          COBOL Name: WS-SEDOL
     * - ric01                          COBOL Name: RIC
     * - ric                            COBOL Name: WS-RIC
     * - intlkey01                      COBOL Name: INTLKEY
     * - intlkey                        COBOL Name: WS-INTLKEY
     * - company01                      COBOL Name: COMPANY
     * - company                        COBOL Name: WS-COMPANY
     * - country01                      COBOL Name: COUNTRY
     * - country                        COBOL Name: WS-COUNTRY
     * - currencycd01                   COBOL Name: CURRENCYCD
     * - currencycd                     COBOL Name: WS-CURRENCYCD
     * - industry01                     COBOL Name: INDUSTRY
     * - sector01                       COBOL Name: SECTOR
     * - sector                         COBOL Name: WS-SECTOR
     * - ffmcapmilusd01                 COBOL Name: FFMCAPMILUSD
     * - ffmcapmilusd                   COBOL Name: WS-FFMCAPMILUSD
     * - sectorweight01                 COBOL Name: SECTORWEIGHT
     * - sectorweight                   COBOL Name: WS-SECTORWEIGHT
     *
     * @throws CFException
     */
    @Override
    public IndustryRequestOutCtx industryRequest(IndustryRequestInCtx methodIn) throws Exception {
        // Declare local variables used in the method
        final int LS_INDUSTRY_KEY_LENGTH = 40;
        // End of variable declaration
        Cics0012Ctx programCtx = methodIn.getCics0012Ctx();
        IndustryRequestOutCtx methodOut = methodIn.getIndustryRequestOutCtx();
        // *
        // MOVE SPACES TO WS-INDUSTRY
        methodOut.setIndustry(CONSTANTS.SPACE_40);
        // MOVE SPACES TO WS-EOF-SW
        methodOut.setEofSw(CONSTANTS.SPACE);
        // STARTBR FILE(VSSECU03) RIDFLD (LS-INDUSTRY-KEY) KEYLENGTH (FUNCTION~LENGTH~LS-INDUSTRY-KEY) EQUAL NOHANDLE
        // STARTBR FILE(VSSECU03) RIDFLD (LS-INDUSTRY-KEY) KEYLENGTH (FUNCTION~LENGTH~LS-INDUSTRY-KEY) EQUAL NOHANDLE
        // start Browsing a file
        TransactionManager.startBrowsing(programCtx.getCicsSession(), methodIn.getVssecu03(), methodIn.getLsIndustryKey(), "".toCharArray(), /*reqId*/
        "".toCharArray(), /*sysId*/
        LS_INDUSTRY_KEY_LENGTH, false, /*debkey*/
        false, /*debrec*/
        false, /*rba*/
        false, /*rrn*/
        false, /*xrba*/
        false, /*gteq*/
        true, /*equal*/
        false, /*generic*/
        new KeyInfo(1, 40, 0, false));
        // EVALUATE TRUE
        if ((programCtx.getCicsSession().getEibresp() == 0)) {
            ;
        } else if ((programCtx.getCicsSession().getEibresp() == 13)) {
            // GOBACK
            throw Terminate.TERMINATE;
        } else {
            // MOVE 16 TO LS-RETURN-CODE
            methodOut.setLsReturnCode((short) 16);
            // MOVE EIBRESP TO LS-EIBRESP
            methodOut.setLsEibresp(programCtx.getCicsSession().getEibresp());
            // MOVE EIBRESP2 TO LS-EIBRESP2
            methodOut.setLsEibresp2(programCtx.getCicsSession().getEibresp2());
            // GOBACK
            throw Terminate.TERMINATE;
        }
        // PERFORM UNTIL END-OF-FILE OR LS-OUTPUT-COUNT >= 400
        while ((!(methodOut.isEndOfFile()) && (methodOut.getLsOutputCount() < 400))) {
            // READNEXT FILE (VSSECU03) INTO (WS-SECURITY-RECORD) LENGTH (FUNCTION~LENGTH~WS-SECURITY-RECORD) RIDFLD (LS-INDUSTRY-KEY) NOHANDLE
            // READNEXT FILE (VSSECU03) INTO (WS-SECURITY-RECORD) LENGTH (FUNCTION~LENGTH~WS-SECURITY-RECORD) RIDFLD (LS-INDUSTRY-KEY) NOHANDLE
            // read the next record from a file
            methodIn.getSecurityRecord().setString(TransactionManager.readNextRecord(programCtx.getCicsSession(), methodIn.getVssecu03(), methodIn.getLsIndustryKey(), "".toCharArray(), /*Token*/
            "".toCharArray(), /*SysId*/
            -1, SecurityRecord.getSecurityRecordFieldLength(), "".toCharArray(), /*ReqId*/
            false, /*rba*/
            false, /*rrn*/
            false, /*xrba*/
            false, /*nosuspend*/
            false, /*uncommitted*/
            false, /*consistent*/
            false, /*repeatable*/
            false).toCharArray());
            // EVALUATE TRUE
            if (((programCtx.getCicsSession().getEibresp() == 0)) || ((programCtx.getCicsSession().getEibresp() == 15))) {
                // ADD 1 TO LS-OUTPUT-COUNT
                methodOut.setLsOutputCount(methodOut.getLsOutputCount() + 1);
                // MOVE LS-OUTPUT-COUNT TO WS-I
                methodOut.setI((short) methodOut.getLsOutputCount());
                // MOVE WS-ISIN TO ISIN ( WS-I )
                methodOut.setIsin01(methodOut.getI() - 1, methodOut.getIsin());
                // MOVE WS-SEDOL TO SEDOL ( WS-I )
                methodOut.setSedol01(methodOut.getI() - 1, methodOut.getSedol());
                // MOVE WS-RIC TO RIC ( WS-I )
                methodOut.setRic01(methodOut.getI() - 1, methodOut.getRic());
                // MOVE WS-INTLKEY TO INTLKEY ( WS-I )
                methodOut.setIntlkey01(methodOut.getI() - 1, methodOut.getIntlkey());
                // MOVE WS-COMPANY TO COMPANY ( WS-I )
                methodOut.setCompany01(methodOut.getI() - 1, methodOut.getCompany());
                // MOVE WS-COUNTRY TO COUNTRY ( WS-I )
                methodOut.setCountry01(methodOut.getI() - 1, methodOut.getCountry());
                // MOVE WS-CURRENCYCD TO CURRENCYCD ( WS-I )
                methodOut.setCurrencycd01(methodOut.getI() - 1, methodOut.getCurrencycd());
                // MOVE WS-INDUSTRY TO INDUSTRY ( WS-I )
                methodOut.setIndustry01(methodOut.getI() - 1, methodOut.getIndustry());
                // MOVE WS-SECTOR TO SECTOR ( WS-I )
                methodOut.setSector01(methodOut.getI() - 1, methodOut.getSector());
                // MOVE WS-FFMCAPMILUSD TO FFMCAPMILUSD ( WS-I )
                methodOut.setFfmcapmilusd01(methodOut.getI() - 1, methodOut.getFfmcapmilusd());
                // MOVE WS-SECTORWEIGHT TO SECTORWEIGHT ( WS-I )
                methodOut.setSectorweight01(methodOut.getI() - 1, methodOut.getSectorweight());
                // *
                // *If eibresp gives dupkey then there are more records with same
                // *alternate key. if it gives normal then we are at end of that key
                // *
                // IF EIBRESP = DFHRESP (NORMAL)
                if ((programCtx.getCicsSession().getEibresp() == 0)) {
                    // SET END-OF-FILE TO TRUE
                    methodOut.setEndOfFileTrue();
                }
            } else if ((programCtx.getCicsSession().getEibresp() == 20)) {
                // SET END-OF-FILE TO TRUE
                methodOut.setEndOfFileTrue();
            } else {
                // MOVE 16 TO LS-RETURN-CODE
                methodOut.setLsReturnCode((short) 16);
                // MOVE EIBRESP TO LS-EIBRESP
                methodOut.setLsEibresp(programCtx.getCicsSession().getEibresp());
                // MOVE EIBRESP2 TO LS-EIBRESP2
                methodOut.setLsEibresp2(programCtx.getCicsSession().getEibresp2());
                // GOBACK
                throw Terminate.TERMINATE;
            }
        }
        // ENDBR FILE(VSSECU01) NOHANDLE
        // ENDBR FILE(VSSECU01) NOHANDLE
        // end browsing the file
        TransactionManager.endBrowsing(programCtx.getCicsSession(), methodIn.getVssecu01(), "".toCharArray(), /*sysId*/
        "".toCharArray());
        return methodOut;
    }

    /**
     * sectorRequest
     *   This method is derived from
     *   COBOL Paragraph - 0005-SECTOR-REQUEST COBOL Cyclomatic complexity - 14
     * Input  :
     *
     * - keylen                         COBOL Name: WS-KEYLEN
     * - lsSectorKey                    COBOL Name: LS-SECTOR-KEY
     * - lsOutputCount                  COBOL Name: LS-OUTPUT-COUNT
     * - isin                           COBOL Name: WS-ISIN
     * - sedol                          COBOL Name: WS-SEDOL
     * - ric                            COBOL Name: WS-RIC
     * - intlkey                        COBOL Name: WS-INTLKEY
     * - company                        COBOL Name: WS-COMPANY
     * - country                        COBOL Name: WS-COUNTRY
     * - currencycd                     COBOL Name: WS-CURRENCYCD
     * - industry                       COBOL Name: WS-INDUSTRY
     * - ffmcapmilusd                   COBOL Name: WS-FFMCAPMILUSD
     * - sectorweight                   COBOL Name: WS-SECTORWEIGHT
     *
     * Output :
     *
     * - sector                         COBOL Name: WS-SECTOR
     * - eofSw                          COBOL Name: WS-EOF-SW
     * - keylen                         COBOL Name: WS-KEYLEN
     * - lsReturnCode                   COBOL Name: LS-RETURN-CODE
     * - lsEibresp                      COBOL Name: LS-EIBRESP
     * - lsEibresp2                     COBOL Name: LS-EIBRESP2
     * - lsOutputCount                  COBOL Name: LS-OUTPUT-COUNT
     * - i                              COBOL Name: WS-I
     * - isin01                         COBOL Name: ISIN
     * - isin                           COBOL Name: WS-ISIN
     * - sedol01                        COBOL Name: SEDOL
     * - sedol                          COBOL Name: WS-SEDOL
     * - ric01                          COBOL Name: RIC
     * - ric                            COBOL Name: WS-RIC
     * - intlkey01                      COBOL Name: INTLKEY
     * - intlkey                        COBOL Name: WS-INTLKEY
     * - company01                      COBOL Name: COMPANY
     * - company                        COBOL Name: WS-COMPANY
     * - country01                      COBOL Name: COUNTRY
     * - country                        COBOL Name: WS-COUNTRY
     * - currencycd01                   COBOL Name: CURRENCYCD
     * - currencycd                     COBOL Name: WS-CURRENCYCD
     * - industry01                     COBOL Name: INDUSTRY
     * - industry                       COBOL Name: WS-INDUSTRY
     * - sector01                       COBOL Name: SECTOR
     * - ffmcapmilusd01                 COBOL Name: FFMCAPMILUSD
     * - ffmcapmilusd                   COBOL Name: WS-FFMCAPMILUSD
     * - sectorweight01                 COBOL Name: SECTORWEIGHT
     * - sectorweight                   COBOL Name: WS-SECTORWEIGHT
     *
     * @throws CFException
     */
    @Override
    public SectorRequestOutCtx sectorRequest(SectorRequestInCtx methodIn) throws Exception {
        Cics0012Ctx programCtx = methodIn.getCics0012Ctx();
        SectorRequestOutCtx methodOut = methodIn.getSectorRequestOutCtx();
        // *
        // MOVE SPACES TO WS-SECTOR
        methodOut.setSector(CONSTANTS.SPACE_40);
        // MOVE SPACES TO WS-EOF-SW
        methodOut.setEofSw(CONSTANTS.SPACE);
        // PERFORM VARYING WS-KEYLEN FROM 40 BY -1 UNTIL WS-KEYLEN = 0 OR LS-SECTOR-KEY ( WS-KEYLEN : 1) NOT = ' ' END-PERFORM
        for (methodOut.setKeylen(40); ((methodOut.getKeylen() != 0) && methodIn.getLsSectorKey()[(methodOut.getKeylen() - 1)] == ' '); methodOut.setKeylen(methodOut.getKeylen() + -1)) {
        }
        // STARTBR FILE(VSSECU04) RIDFLD (LS-SECTOR-KEY) KEYLENGTH (WS-KEYLEN) GENERIC EQUAL NOHANDLE
        // STARTBR FILE(VSSECU04) RIDFLD (LS-SECTOR-KEY) KEYLENGTH (WS-KEYLEN) GENERIC EQUAL NOHANDLE
        // start Browsing a file
        TransactionManager.startBrowsing(programCtx.getCicsSession(), methodIn.getVssecu04(), methodIn.getLsSectorKey(), "".toCharArray(), /*reqId*/
        "".toCharArray(), /*sysId*/
        methodOut.getKeylen(), false, /*debkey*/
        false, /*debrec*/
        false, /*rba*/
        false, /*rrn*/
        false, /*xrba*/
        false, /*gteq*/
        true, /*equal*/
        true, /*generic*/
        new KeyInfo(1, 40, 0, false));
        // EVALUATE TRUE
        if ((programCtx.getCicsSession().getEibresp() == 0)) {
            ;
        } else if ((programCtx.getCicsSession().getEibresp() == 13)) {
            // GOBACK
            throw Terminate.TERMINATE;
        } else {
            // MOVE 16 TO LS-RETURN-CODE
            methodOut.setLsReturnCode((short) 16);
            // MOVE EIBRESP TO LS-EIBRESP
            methodOut.setLsEibresp(programCtx.getCicsSession().getEibresp());
            // MOVE EIBRESP2 TO LS-EIBRESP2
            methodOut.setLsEibresp2(programCtx.getCicsSession().getEibresp2());
            // GOBACK
            throw Terminate.TERMINATE;
        }
        // PERFORM UNTIL END-OF-FILE OR LS-OUTPUT-COUNT >= 400
        while ((!(methodOut.isEndOfFile()) && (methodOut.getLsOutputCount() < 400))) {
            // READNEXT FILE (VSSECU04) INTO (WS-SECURITY-RECORD) LENGTH (FUNCTION~LENGTH~WS-SECURITY-RECORD) RIDFLD (LS-SECTOR-KEY) NOHANDLE
            // READNEXT FILE (VSSECU04) INTO (WS-SECURITY-RECORD) LENGTH (FUNCTION~LENGTH~WS-SECURITY-RECORD) RIDFLD (LS-SECTOR-KEY) NOHANDLE
            // read the next record from a file
            methodIn.getSecurityRecord().setString(TransactionManager.readNextRecord(programCtx.getCicsSession(), methodIn.getVssecu04(), methodIn.getLsSectorKey(), "".toCharArray(), /*Token*/
            "".toCharArray(), /*SysId*/
            -1, SecurityRecord.getSecurityRecordFieldLength(), "".toCharArray(), /*ReqId*/
            false, /*rba*/
            false, /*rrn*/
            false, /*xrba*/
            false, /*nosuspend*/
            false, /*uncommitted*/
            false, /*consistent*/
            false, /*repeatable*/
            false).toCharArray());
            // EVALUATE TRUE
            if (((programCtx.getCicsSession().getEibresp() == 0)) || ((programCtx.getCicsSession().getEibresp() == 15))) {
                // ADD 1 TO LS-OUTPUT-COUNT
                methodOut.setLsOutputCount(methodOut.getLsOutputCount() + 1);
                // MOVE LS-OUTPUT-COUNT TO WS-I
                methodOut.setI((short) methodOut.getLsOutputCount());
                // MOVE WS-ISIN TO ISIN ( WS-I )
                methodOut.setIsin01(methodOut.getI() - 1, methodOut.getIsin());
                // MOVE WS-SEDOL TO SEDOL ( WS-I )
                methodOut.setSedol01(methodOut.getI() - 1, methodOut.getSedol());
                // MOVE WS-RIC TO RIC ( WS-I )
                methodOut.setRic01(methodOut.getI() - 1, methodOut.getRic());
                // MOVE WS-INTLKEY TO INTLKEY ( WS-I )
                methodOut.setIntlkey01(methodOut.getI() - 1, methodOut.getIntlkey());
                // MOVE WS-COMPANY TO COMPANY ( WS-I )
                methodOut.setCompany01(methodOut.getI() - 1, methodOut.getCompany());
                // MOVE WS-COUNTRY TO COUNTRY ( WS-I )
                methodOut.setCountry01(methodOut.getI() - 1, methodOut.getCountry());
                // MOVE WS-CURRENCYCD TO CURRENCYCD ( WS-I )
                methodOut.setCurrencycd01(methodOut.getI() - 1, methodOut.getCurrencycd());
                // MOVE WS-INDUSTRY TO INDUSTRY ( WS-I )
                methodOut.setIndustry01(methodOut.getI() - 1, methodOut.getIndustry());
                // MOVE WS-SECTOR TO SECTOR ( WS-I )
                methodOut.setSector01(methodOut.getI() - 1, methodOut.getSector());
                // MOVE WS-FFMCAPMILUSD TO FFMCAPMILUSD ( WS-I )
                methodOut.setFfmcapmilusd01(methodOut.getI() - 1, methodOut.getFfmcapmilusd());
                // MOVE WS-SECTORWEIGHT TO SECTORWEIGHT ( WS-I )
                methodOut.setSectorweight01(methodOut.getI() - 1, methodOut.getSectorweight());
                // *
                // IF EIBRESP = DFHRESP (NORMAL)
                if ((programCtx.getCicsSession().getEibresp() == 0)) {
                    // SET END-OF-FILE TO TRUE
                    methodOut.setEndOfFileTrue();
                }
            } else if ((programCtx.getCicsSession().getEibresp() == 20)) {
                // SET END-OF-FILE TO TRUE
                methodOut.setEndOfFileTrue();
            } else {
                // MOVE 16 TO LS-RETURN-CODE
                methodOut.setLsReturnCode((short) 16);
                // MOVE EIBRESP TO LS-EIBRESP
                methodOut.setLsEibresp(programCtx.getCicsSession().getEibresp());
                // MOVE EIBRESP2 TO LS-EIBRESP2
                methodOut.setLsEibresp2(programCtx.getCicsSession().getEibresp2());
                // GOBACK
                throw Terminate.TERMINATE;
            }
        }
        // ENDBR FILE(VSSECU01) NOHANDLE
        // ENDBR FILE(VSSECU01) NOHANDLE
        // end browsing the file
        TransactionManager.endBrowsing(programCtx.getCicsSession(), methodIn.getVssecu01(), "".toCharArray(), /*sysId*/
        "".toCharArray());
        return methodOut;
    }

    public int call(ProgramContext ctx, Object[] params) throws Exception {
        Cics0012Ctx programCtx = (Cics0012Ctx) ctx;
        int len = params.length;
        if (len > 0 && params[0] != null)
            programCtx.getDfhcommarea().set((Field) params[0]);
        // invoke the process and return rc
        return process(programCtx);
    }

    public int call(ProgramContext ctx, Field... parameters) throws Exception {
        Cics0012Ctx programCtx = (Cics0012Ctx) ctx;
        for (int index = 0; index < parameters.length; index++) {
            switch(index) {
                case 0:
                    if (parameters[index] != null) {
                        if (parameters[index] instanceof Dfhcommarea) {
                            programCtx.setDfhcommarea((Dfhcommarea) parameters[index]);
                        } else {
                            programCtx.getDfhcommarea().set(parameters[index]);
                        }
                    }
                    break;
            }
        }
        return process(programCtx);
    }
}
