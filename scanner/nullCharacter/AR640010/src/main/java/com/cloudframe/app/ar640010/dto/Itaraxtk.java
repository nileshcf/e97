package com.cloudframe.app.ar640010.dto;

/**
*  The class Itaraxtk is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Itaraxtk extends ItaraxtkSerialized {
   

								private short taraxtkDlyIntvlNumN;

								private short taraxtkHighLvlQlfrCdN;

								private short taraxtkDirNodeNamN;

								private short taraxtkLstRunTsN;

								private short taraxtkStatsFileNamN;

								private short taraxtkRunLmtNumN;

								private short taraxtkLclRawStatsNamN;

								private short taraxtkLclSrvrFileNamN;

								private short taraxtkLclFmtdStatsNamN;

								private short taraxtkGftSrvr2NamN;

								private short taraxtkGftSrvr2DsnNamN;

								private short taraxtkGftSrvr2TsN;

								private short taraxtkMfeSrvrNamN;

								private short taraxtkMfeBusPrtnrIdN;

								private short taraxtkMfeEndptIdN;

								private short taraxtkMfeBulkIdN;

								private short taraxtkInbndSwN;

								private short taraxtkOutbndSwN;

								private short taraxtkBrdcstSwN;

								private short taraxtkLastRunKyvlTxtN;

								private short taraxtkSshBulkIdN;

								private short taraxtkSshEndptIdN;

								private short taraxtkSshBusPrtnrIdN;

								private short taraxtkSshSrvrNamN;

								private short taraxtkTaskWorkParmTxtN;
	
	/**
	* Constructor for Itaraxtk
	**/
    public Itaraxtk() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of taraxtkDlyIntvlNumN
	 *	@return taraxtkDlyIntvlNumN
	 */
	public short getTaraxtkDlyIntvlNumN() throws CFException {
        if (isTaraxtkDlyIntvlNumNModified()) { 
           taraxtkDlyIntvlNumN = refreshTaraxtkDlyIntvlNumN();
        }
   		return taraxtkDlyIntvlNumN;
	}
	
	/**
	 * 	Update TaraxtkDlyIntvlNumN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-DLY-INTVL-NUM-N
	 *	@param number
	 */
	public void setTaraxtkDlyIntvlNumN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkDlyIntvlNumN = checkTaraxtkDlyIntvlNumNMaxLimit(number); 
		serializeTaraxtkDlyIntvlNumN(taraxtkDlyIntvlNumN);
	}

	public void setTaraxtkDlyIntvlNumN(int number) {
	    number = checkTaraxtkDlyIntvlNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkDlyIntvlNumN((short)number);
	}
	public void setTaraxtkDlyIntvlNumN(long number) {
	    number = checkTaraxtkDlyIntvlNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkDlyIntvlNumN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkHighLvlQlfrCdN
	 *	@return taraxtkHighLvlQlfrCdN
	 */
	public short getTaraxtkHighLvlQlfrCdN() throws CFException {
        if (isTaraxtkHighLvlQlfrCdNModified()) { 
           taraxtkHighLvlQlfrCdN = refreshTaraxtkHighLvlQlfrCdN();
        }
   		return taraxtkHighLvlQlfrCdN;
	}
	
	/**
	 * 	Update TaraxtkHighLvlQlfrCdN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-HIGH-LVL-QLFR-CD-N
	 *	@param number
	 */
	public void setTaraxtkHighLvlQlfrCdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkHighLvlQlfrCdN = checkTaraxtkHighLvlQlfrCdNMaxLimit(number); 
		serializeTaraxtkHighLvlQlfrCdN(taraxtkHighLvlQlfrCdN);
	}

	public void setTaraxtkHighLvlQlfrCdN(int number) {
	    number = checkTaraxtkHighLvlQlfrCdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkHighLvlQlfrCdN((short)number);
	}
	public void setTaraxtkHighLvlQlfrCdN(long number) {
	    number = checkTaraxtkHighLvlQlfrCdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkHighLvlQlfrCdN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkDirNodeNamN
	 *	@return taraxtkDirNodeNamN
	 */
	public short getTaraxtkDirNodeNamN() throws CFException {
        if (isTaraxtkDirNodeNamNModified()) { 
           taraxtkDirNodeNamN = refreshTaraxtkDirNodeNamN();
        }
   		return taraxtkDirNodeNamN;
	}
	
	/**
	 * 	Update TaraxtkDirNodeNamN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-DIR-NODE-NAM-N
	 *	@param number
	 */
	public void setTaraxtkDirNodeNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkDirNodeNamN = checkTaraxtkDirNodeNamNMaxLimit(number); 
		serializeTaraxtkDirNodeNamN(taraxtkDirNodeNamN);
	}

	public void setTaraxtkDirNodeNamN(int number) {
	    number = checkTaraxtkDirNodeNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkDirNodeNamN((short)number);
	}
	public void setTaraxtkDirNodeNamN(long number) {
	    number = checkTaraxtkDirNodeNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkDirNodeNamN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkLstRunTsN
	 *	@return taraxtkLstRunTsN
	 */
	public short getTaraxtkLstRunTsN() throws CFException {
        if (isTaraxtkLstRunTsNModified()) { 
           taraxtkLstRunTsN = refreshTaraxtkLstRunTsN();
        }
   		return taraxtkLstRunTsN;
	}
	
	/**
	 * 	Update TaraxtkLstRunTsN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-LST-RUN-TS-N
	 *	@param number
	 */
	public void setTaraxtkLstRunTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkLstRunTsN = checkTaraxtkLstRunTsNMaxLimit(number); 
		serializeTaraxtkLstRunTsN(taraxtkLstRunTsN);
	}

	public void setTaraxtkLstRunTsN(int number) {
	    number = checkTaraxtkLstRunTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkLstRunTsN((short)number);
	}
	public void setTaraxtkLstRunTsN(long number) {
	    number = checkTaraxtkLstRunTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkLstRunTsN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkStatsFileNamN
	 *	@return taraxtkStatsFileNamN
	 */
	public short getTaraxtkStatsFileNamN() throws CFException {
        if (isTaraxtkStatsFileNamNModified()) { 
           taraxtkStatsFileNamN = refreshTaraxtkStatsFileNamN();
        }
   		return taraxtkStatsFileNamN;
	}
	
	/**
	 * 	Update TaraxtkStatsFileNamN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-STATS-FILE-NAM-N
	 *	@param number
	 */
	public void setTaraxtkStatsFileNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkStatsFileNamN = checkTaraxtkStatsFileNamNMaxLimit(number); 
		serializeTaraxtkStatsFileNamN(taraxtkStatsFileNamN);
	}

	public void setTaraxtkStatsFileNamN(int number) {
	    number = checkTaraxtkStatsFileNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkStatsFileNamN((short)number);
	}
	public void setTaraxtkStatsFileNamN(long number) {
	    number = checkTaraxtkStatsFileNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkStatsFileNamN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkRunLmtNumN
	 *	@return taraxtkRunLmtNumN
	 */
	public short getTaraxtkRunLmtNumN() throws CFException {
        if (isTaraxtkRunLmtNumNModified()) { 
           taraxtkRunLmtNumN = refreshTaraxtkRunLmtNumN();
        }
   		return taraxtkRunLmtNumN;
	}
	
	/**
	 * 	Update TaraxtkRunLmtNumN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-RUN-LMT-NUM-N
	 *	@param number
	 */
	public void setTaraxtkRunLmtNumN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkRunLmtNumN = checkTaraxtkRunLmtNumNMaxLimit(number); 
		serializeTaraxtkRunLmtNumN(taraxtkRunLmtNumN);
	}

	public void setTaraxtkRunLmtNumN(int number) {
	    number = checkTaraxtkRunLmtNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkRunLmtNumN((short)number);
	}
	public void setTaraxtkRunLmtNumN(long number) {
	    number = checkTaraxtkRunLmtNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkRunLmtNumN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkLclRawStatsNamN
	 *	@return taraxtkLclRawStatsNamN
	 */
	public short getTaraxtkLclRawStatsNamN() throws CFException {
        if (isTaraxtkLclRawStatsNamNModified()) { 
           taraxtkLclRawStatsNamN = refreshTaraxtkLclRawStatsNamN();
        }
   		return taraxtkLclRawStatsNamN;
	}
	
	/**
	 * 	Update TaraxtkLclRawStatsNamN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-LCL-RAW-STATS-NAM-N
	 *	@param number
	 */
	public void setTaraxtkLclRawStatsNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkLclRawStatsNamN = checkTaraxtkLclRawStatsNamNMaxLimit(number); 
		serializeTaraxtkLclRawStatsNamN(taraxtkLclRawStatsNamN);
	}

	public void setTaraxtkLclRawStatsNamN(int number) {
	    number = checkTaraxtkLclRawStatsNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkLclRawStatsNamN((short)number);
	}
	public void setTaraxtkLclRawStatsNamN(long number) {
	    number = checkTaraxtkLclRawStatsNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkLclRawStatsNamN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkLclSrvrFileNamN
	 *	@return taraxtkLclSrvrFileNamN
	 */
	public short getTaraxtkLclSrvrFileNamN() throws CFException {
        if (isTaraxtkLclSrvrFileNamNModified()) { 
           taraxtkLclSrvrFileNamN = refreshTaraxtkLclSrvrFileNamN();
        }
   		return taraxtkLclSrvrFileNamN;
	}
	
	/**
	 * 	Update TaraxtkLclSrvrFileNamN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-LCL-SRVR-FILE-NAM-N
	 *	@param number
	 */
	public void setTaraxtkLclSrvrFileNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkLclSrvrFileNamN = checkTaraxtkLclSrvrFileNamNMaxLimit(number); 
		serializeTaraxtkLclSrvrFileNamN(taraxtkLclSrvrFileNamN);
	}

	public void setTaraxtkLclSrvrFileNamN(int number) {
	    number = checkTaraxtkLclSrvrFileNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkLclSrvrFileNamN((short)number);
	}
	public void setTaraxtkLclSrvrFileNamN(long number) {
	    number = checkTaraxtkLclSrvrFileNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkLclSrvrFileNamN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkLclFmtdStatsNamN
	 *	@return taraxtkLclFmtdStatsNamN
	 */
	public short getTaraxtkLclFmtdStatsNamN() throws CFException {
        if (isTaraxtkLclFmtdStatsNamNModified()) { 
           taraxtkLclFmtdStatsNamN = refreshTaraxtkLclFmtdStatsNamN();
        }
   		return taraxtkLclFmtdStatsNamN;
	}
	
	/**
	 * 	Update TaraxtkLclFmtdStatsNamN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-LCL-FMTD-STATS-NAM-N
	 *	@param number
	 */
	public void setTaraxtkLclFmtdStatsNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkLclFmtdStatsNamN = checkTaraxtkLclFmtdStatsNamNMaxLimit(number); 
		serializeTaraxtkLclFmtdStatsNamN(taraxtkLclFmtdStatsNamN);
	}

	public void setTaraxtkLclFmtdStatsNamN(int number) {
	    number = checkTaraxtkLclFmtdStatsNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkLclFmtdStatsNamN((short)number);
	}
	public void setTaraxtkLclFmtdStatsNamN(long number) {
	    number = checkTaraxtkLclFmtdStatsNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkLclFmtdStatsNamN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkGftSrvr2NamN
	 *	@return taraxtkGftSrvr2NamN
	 */
	public short getTaraxtkGftSrvr2NamN() throws CFException {
        if (isTaraxtkGftSrvr2NamNModified()) { 
           taraxtkGftSrvr2NamN = refreshTaraxtkGftSrvr2NamN();
        }
   		return taraxtkGftSrvr2NamN;
	}
	
	/**
	 * 	Update TaraxtkGftSrvr2NamN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-GFT-SRVR2-NAM-N
	 *	@param number
	 */
	public void setTaraxtkGftSrvr2NamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkGftSrvr2NamN = checkTaraxtkGftSrvr2NamNMaxLimit(number); 
		serializeTaraxtkGftSrvr2NamN(taraxtkGftSrvr2NamN);
	}

	public void setTaraxtkGftSrvr2NamN(int number) {
	    number = checkTaraxtkGftSrvr2NamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkGftSrvr2NamN((short)number);
	}
	public void setTaraxtkGftSrvr2NamN(long number) {
	    number = checkTaraxtkGftSrvr2NamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkGftSrvr2NamN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkGftSrvr2DsnNamN
	 *	@return taraxtkGftSrvr2DsnNamN
	 */
	public short getTaraxtkGftSrvr2DsnNamN() throws CFException {
        if (isTaraxtkGftSrvr2DsnNamNModified()) { 
           taraxtkGftSrvr2DsnNamN = refreshTaraxtkGftSrvr2DsnNamN();
        }
   		return taraxtkGftSrvr2DsnNamN;
	}
	
	/**
	 * 	Update TaraxtkGftSrvr2DsnNamN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-GFT-SRVR2-DSN-NAM-N
	 *	@param number
	 */
	public void setTaraxtkGftSrvr2DsnNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkGftSrvr2DsnNamN = checkTaraxtkGftSrvr2DsnNamNMaxLimit(number); 
		serializeTaraxtkGftSrvr2DsnNamN(taraxtkGftSrvr2DsnNamN);
	}

	public void setTaraxtkGftSrvr2DsnNamN(int number) {
	    number = checkTaraxtkGftSrvr2DsnNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkGftSrvr2DsnNamN((short)number);
	}
	public void setTaraxtkGftSrvr2DsnNamN(long number) {
	    number = checkTaraxtkGftSrvr2DsnNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkGftSrvr2DsnNamN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkGftSrvr2TsN
	 *	@return taraxtkGftSrvr2TsN
	 */
	public short getTaraxtkGftSrvr2TsN() throws CFException {
        if (isTaraxtkGftSrvr2TsNModified()) { 
           taraxtkGftSrvr2TsN = refreshTaraxtkGftSrvr2TsN();
        }
   		return taraxtkGftSrvr2TsN;
	}
	
	/**
	 * 	Update TaraxtkGftSrvr2TsN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-GFT-SRVR2-TS-N
	 *	@param number
	 */
	public void setTaraxtkGftSrvr2TsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkGftSrvr2TsN = checkTaraxtkGftSrvr2TsNMaxLimit(number); 
		serializeTaraxtkGftSrvr2TsN(taraxtkGftSrvr2TsN);
	}

	public void setTaraxtkGftSrvr2TsN(int number) {
	    number = checkTaraxtkGftSrvr2TsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkGftSrvr2TsN((short)number);
	}
	public void setTaraxtkGftSrvr2TsN(long number) {
	    number = checkTaraxtkGftSrvr2TsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkGftSrvr2TsN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkMfeSrvrNamN
	 *	@return taraxtkMfeSrvrNamN
	 */
	public short getTaraxtkMfeSrvrNamN() throws CFException {
        if (isTaraxtkMfeSrvrNamNModified()) { 
           taraxtkMfeSrvrNamN = refreshTaraxtkMfeSrvrNamN();
        }
   		return taraxtkMfeSrvrNamN;
	}
	
	/**
	 * 	Update TaraxtkMfeSrvrNamN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-MFE-SRVR-NAM-N
	 *	@param number
	 */
	public void setTaraxtkMfeSrvrNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkMfeSrvrNamN = checkTaraxtkMfeSrvrNamNMaxLimit(number); 
		serializeTaraxtkMfeSrvrNamN(taraxtkMfeSrvrNamN);
	}

	public void setTaraxtkMfeSrvrNamN(int number) {
	    number = checkTaraxtkMfeSrvrNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkMfeSrvrNamN((short)number);
	}
	public void setTaraxtkMfeSrvrNamN(long number) {
	    number = checkTaraxtkMfeSrvrNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkMfeSrvrNamN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkMfeBusPrtnrIdN
	 *	@return taraxtkMfeBusPrtnrIdN
	 */
	public short getTaraxtkMfeBusPrtnrIdN() throws CFException {
        if (isTaraxtkMfeBusPrtnrIdNModified()) { 
           taraxtkMfeBusPrtnrIdN = refreshTaraxtkMfeBusPrtnrIdN();
        }
   		return taraxtkMfeBusPrtnrIdN;
	}
	
	/**
	 * 	Update TaraxtkMfeBusPrtnrIdN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-MFE-BUS-PRTNR-ID-N
	 *	@param number
	 */
	public void setTaraxtkMfeBusPrtnrIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkMfeBusPrtnrIdN = checkTaraxtkMfeBusPrtnrIdNMaxLimit(number); 
		serializeTaraxtkMfeBusPrtnrIdN(taraxtkMfeBusPrtnrIdN);
	}

	public void setTaraxtkMfeBusPrtnrIdN(int number) {
	    number = checkTaraxtkMfeBusPrtnrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkMfeBusPrtnrIdN((short)number);
	}
	public void setTaraxtkMfeBusPrtnrIdN(long number) {
	    number = checkTaraxtkMfeBusPrtnrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkMfeBusPrtnrIdN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkMfeEndptIdN
	 *	@return taraxtkMfeEndptIdN
	 */
	public short getTaraxtkMfeEndptIdN() throws CFException {
        if (isTaraxtkMfeEndptIdNModified()) { 
           taraxtkMfeEndptIdN = refreshTaraxtkMfeEndptIdN();
        }
   		return taraxtkMfeEndptIdN;
	}
	
	/**
	 * 	Update TaraxtkMfeEndptIdN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-MFE-ENDPT-ID-N
	 *	@param number
	 */
	public void setTaraxtkMfeEndptIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkMfeEndptIdN = checkTaraxtkMfeEndptIdNMaxLimit(number); 
		serializeTaraxtkMfeEndptIdN(taraxtkMfeEndptIdN);
	}

	public void setTaraxtkMfeEndptIdN(int number) {
	    number = checkTaraxtkMfeEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkMfeEndptIdN((short)number);
	}
	public void setTaraxtkMfeEndptIdN(long number) {
	    number = checkTaraxtkMfeEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkMfeEndptIdN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkMfeBulkIdN
	 *	@return taraxtkMfeBulkIdN
	 */
	public short getTaraxtkMfeBulkIdN() throws CFException {
        if (isTaraxtkMfeBulkIdNModified()) { 
           taraxtkMfeBulkIdN = refreshTaraxtkMfeBulkIdN();
        }
   		return taraxtkMfeBulkIdN;
	}
	
	/**
	 * 	Update TaraxtkMfeBulkIdN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-MFE-BULK-ID-N
	 *	@param number
	 */
	public void setTaraxtkMfeBulkIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkMfeBulkIdN = checkTaraxtkMfeBulkIdNMaxLimit(number); 
		serializeTaraxtkMfeBulkIdN(taraxtkMfeBulkIdN);
	}

	public void setTaraxtkMfeBulkIdN(int number) {
	    number = checkTaraxtkMfeBulkIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkMfeBulkIdN((short)number);
	}
	public void setTaraxtkMfeBulkIdN(long number) {
	    number = checkTaraxtkMfeBulkIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkMfeBulkIdN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkInbndSwN
	 *	@return taraxtkInbndSwN
	 */
	public short getTaraxtkInbndSwN() throws CFException {
        if (isTaraxtkInbndSwNModified()) { 
           taraxtkInbndSwN = refreshTaraxtkInbndSwN();
        }
   		return taraxtkInbndSwN;
	}
	
	/**
	 * 	Update TaraxtkInbndSwN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-INBND-SW-N
	 *	@param number
	 */
	public void setTaraxtkInbndSwN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkInbndSwN = checkTaraxtkInbndSwNMaxLimit(number); 
		serializeTaraxtkInbndSwN(taraxtkInbndSwN);
	}

	public void setTaraxtkInbndSwN(int number) {
	    number = checkTaraxtkInbndSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkInbndSwN((short)number);
	}
	public void setTaraxtkInbndSwN(long number) {
	    number = checkTaraxtkInbndSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkInbndSwN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkOutbndSwN
	 *	@return taraxtkOutbndSwN
	 */
	public short getTaraxtkOutbndSwN() throws CFException {
        if (isTaraxtkOutbndSwNModified()) { 
           taraxtkOutbndSwN = refreshTaraxtkOutbndSwN();
        }
   		return taraxtkOutbndSwN;
	}
	
	/**
	 * 	Update TaraxtkOutbndSwN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-OUTBND-SW-N
	 *	@param number
	 */
	public void setTaraxtkOutbndSwN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkOutbndSwN = checkTaraxtkOutbndSwNMaxLimit(number); 
		serializeTaraxtkOutbndSwN(taraxtkOutbndSwN);
	}

	public void setTaraxtkOutbndSwN(int number) {
	    number = checkTaraxtkOutbndSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkOutbndSwN((short)number);
	}
	public void setTaraxtkOutbndSwN(long number) {
	    number = checkTaraxtkOutbndSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkOutbndSwN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkBrdcstSwN
	 *	@return taraxtkBrdcstSwN
	 */
	public short getTaraxtkBrdcstSwN() throws CFException {
        if (isTaraxtkBrdcstSwNModified()) { 
           taraxtkBrdcstSwN = refreshTaraxtkBrdcstSwN();
        }
   		return taraxtkBrdcstSwN;
	}
	
	/**
	 * 	Update TaraxtkBrdcstSwN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-BRDCST-SW-N
	 *	@param number
	 */
	public void setTaraxtkBrdcstSwN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkBrdcstSwN = checkTaraxtkBrdcstSwNMaxLimit(number); 
		serializeTaraxtkBrdcstSwN(taraxtkBrdcstSwN);
	}

	public void setTaraxtkBrdcstSwN(int number) {
	    number = checkTaraxtkBrdcstSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkBrdcstSwN((short)number);
	}
	public void setTaraxtkBrdcstSwN(long number) {
	    number = checkTaraxtkBrdcstSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkBrdcstSwN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkLastRunKyvlTxtN
	 *	@return taraxtkLastRunKyvlTxtN
	 */
	public short getTaraxtkLastRunKyvlTxtN() throws CFException {
        if (isTaraxtkLastRunKyvlTxtNModified()) { 
           taraxtkLastRunKyvlTxtN = refreshTaraxtkLastRunKyvlTxtN();
        }
   		return taraxtkLastRunKyvlTxtN;
	}
	
	/**
	 * 	Update TaraxtkLastRunKyvlTxtN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-LAST-RUN-KYVL-TXT-N
	 *	@param number
	 */
	public void setTaraxtkLastRunKyvlTxtN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkLastRunKyvlTxtN = checkTaraxtkLastRunKyvlTxtNMaxLimit(number); 
		serializeTaraxtkLastRunKyvlTxtN(taraxtkLastRunKyvlTxtN);
	}

	public void setTaraxtkLastRunKyvlTxtN(int number) {
	    number = checkTaraxtkLastRunKyvlTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkLastRunKyvlTxtN((short)number);
	}
	public void setTaraxtkLastRunKyvlTxtN(long number) {
	    number = checkTaraxtkLastRunKyvlTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkLastRunKyvlTxtN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkSshBulkIdN
	 *	@return taraxtkSshBulkIdN
	 */
	public short getTaraxtkSshBulkIdN() throws CFException {
        if (isTaraxtkSshBulkIdNModified()) { 
           taraxtkSshBulkIdN = refreshTaraxtkSshBulkIdN();
        }
   		return taraxtkSshBulkIdN;
	}
	
	/**
	 * 	Update TaraxtkSshBulkIdN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-SSH-BULK-ID-N
	 *	@param number
	 */
	public void setTaraxtkSshBulkIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkSshBulkIdN = checkTaraxtkSshBulkIdNMaxLimit(number); 
		serializeTaraxtkSshBulkIdN(taraxtkSshBulkIdN);
	}

	public void setTaraxtkSshBulkIdN(int number) {
	    number = checkTaraxtkSshBulkIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkSshBulkIdN((short)number);
	}
	public void setTaraxtkSshBulkIdN(long number) {
	    number = checkTaraxtkSshBulkIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkSshBulkIdN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkSshEndptIdN
	 *	@return taraxtkSshEndptIdN
	 */
	public short getTaraxtkSshEndptIdN() throws CFException {
        if (isTaraxtkSshEndptIdNModified()) { 
           taraxtkSshEndptIdN = refreshTaraxtkSshEndptIdN();
        }
   		return taraxtkSshEndptIdN;
	}
	
	/**
	 * 	Update TaraxtkSshEndptIdN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-SSH-ENDPT-ID-N
	 *	@param number
	 */
	public void setTaraxtkSshEndptIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkSshEndptIdN = checkTaraxtkSshEndptIdNMaxLimit(number); 
		serializeTaraxtkSshEndptIdN(taraxtkSshEndptIdN);
	}

	public void setTaraxtkSshEndptIdN(int number) {
	    number = checkTaraxtkSshEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkSshEndptIdN((short)number);
	}
	public void setTaraxtkSshEndptIdN(long number) {
	    number = checkTaraxtkSshEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkSshEndptIdN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkSshBusPrtnrIdN
	 *	@return taraxtkSshBusPrtnrIdN
	 */
	public short getTaraxtkSshBusPrtnrIdN() throws CFException {
        if (isTaraxtkSshBusPrtnrIdNModified()) { 
           taraxtkSshBusPrtnrIdN = refreshTaraxtkSshBusPrtnrIdN();
        }
   		return taraxtkSshBusPrtnrIdN;
	}
	
	/**
	 * 	Update TaraxtkSshBusPrtnrIdN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-SSH-BUS-PRTNR-ID-N
	 *	@param number
	 */
	public void setTaraxtkSshBusPrtnrIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkSshBusPrtnrIdN = checkTaraxtkSshBusPrtnrIdNMaxLimit(number); 
		serializeTaraxtkSshBusPrtnrIdN(taraxtkSshBusPrtnrIdN);
	}

	public void setTaraxtkSshBusPrtnrIdN(int number) {
	    number = checkTaraxtkSshBusPrtnrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkSshBusPrtnrIdN((short)number);
	}
	public void setTaraxtkSshBusPrtnrIdN(long number) {
	    number = checkTaraxtkSshBusPrtnrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkSshBusPrtnrIdN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkSshSrvrNamN
	 *	@return taraxtkSshSrvrNamN
	 */
	public short getTaraxtkSshSrvrNamN() throws CFException {
        if (isTaraxtkSshSrvrNamNModified()) { 
           taraxtkSshSrvrNamN = refreshTaraxtkSshSrvrNamN();
        }
   		return taraxtkSshSrvrNamN;
	}
	
	/**
	 * 	Update TaraxtkSshSrvrNamN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-SSH-SRVR-NAM-N
	 *	@param number
	 */
	public void setTaraxtkSshSrvrNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkSshSrvrNamN = checkTaraxtkSshSrvrNamNMaxLimit(number); 
		serializeTaraxtkSshSrvrNamN(taraxtkSshSrvrNamN);
	}

	public void setTaraxtkSshSrvrNamN(int number) {
	    number = checkTaraxtkSshSrvrNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkSshSrvrNamN((short)number);
	}
	public void setTaraxtkSshSrvrNamN(long number) {
	    number = checkTaraxtkSshSrvrNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkSshSrvrNamN((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkTaskWorkParmTxtN
	 *	@return taraxtkTaskWorkParmTxtN
	 */
	public short getTaraxtkTaskWorkParmTxtN() throws CFException {
        if (isTaraxtkTaskWorkParmTxtNModified()) { 
           taraxtkTaskWorkParmTxtN = refreshTaraxtkTaskWorkParmTxtN();
        }
   		return taraxtkTaskWorkParmTxtN;
	}
	
	/**
	 * 	Update TaraxtkTaskWorkParmTxtN with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-TASK-WORK-PARM-TXT-N
	 *	@param number
	 */
	public void setTaraxtkTaskWorkParmTxtN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkTaskWorkParmTxtN = checkTaraxtkTaskWorkParmTxtNMaxLimit(number); 
		serializeTaraxtkTaskWorkParmTxtN(taraxtkTaskWorkParmTxtN);
	}

	public void setTaraxtkTaskWorkParmTxtN(int number) {
	    number = checkTaraxtkTaskWorkParmTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkTaskWorkParmTxtN((short)number);
	}
	public void setTaraxtkTaskWorkParmTxtN(long number) {
	    number = checkTaraxtkTaskWorkParmTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkTaskWorkParmTxtN((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Itaraxtk
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraxtkDlyIntvlNumN((short)0);
         	setTaraxtkHighLvlQlfrCdN((short)0);
         	setTaraxtkDirNodeNamN((short)0);
         	setTaraxtkLstRunTsN((short)0);
         	setTaraxtkStatsFileNamN((short)0);
         	setTaraxtkRunLmtNumN((short)0);
         	setTaraxtkLclRawStatsNamN((short)0);
         	setTaraxtkLclSrvrFileNamN((short)0);
         	setTaraxtkLclFmtdStatsNamN((short)0);
         	setTaraxtkGftSrvr2NamN((short)0);
         	setTaraxtkGftSrvr2DsnNamN((short)0);
         	setTaraxtkGftSrvr2TsN((short)0);
         	setTaraxtkMfeSrvrNamN((short)0);
         	setTaraxtkMfeBusPrtnrIdN((short)0);
         	setTaraxtkMfeEndptIdN((short)0);
         	setTaraxtkMfeBulkIdN((short)0);
         	setTaraxtkInbndSwN((short)0);
         	setTaraxtkOutbndSwN((short)0);
         	setTaraxtkBrdcstSwN((short)0);
         	setTaraxtkLastRunKyvlTxtN((short)0);
         	setTaraxtkSshBulkIdN((short)0);
         	setTaraxtkSshEndptIdN((short)0);
         	setTaraxtkSshBusPrtnrIdN((short)0);
         	setTaraxtkSshSrvrNamN((short)0);
         	setTaraxtkTaskWorkParmTxtN((short)0);
   }

		public static int getItaraxtkFieldLength() {
			return ITARAXTK_LENGTH;
		}

}
  
