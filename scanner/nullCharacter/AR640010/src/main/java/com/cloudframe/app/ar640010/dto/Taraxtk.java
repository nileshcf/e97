package com.cloudframe.app.ar640010.dto;

/**
*  The class Taraxtk is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Taraxtk extends TaraxtkSerialized {
   

						private char[] taraxtkAppNam = Field.fillLowValue(8);

						private char[] taraxtkXferPrcssNam = Field.fillLowValue(8);

						private char[] taraxtkStatCd = Field.fillLowValue(1);

								private int taraxtkDlyIntvlNum;

						private char[] taraxtkHighLvlQlfrCd = Field.fillLowValue(4);
				private TaraxtkDirNodeNam taraxtkDirNodeNam = new TaraxtkDirNodeNam();

						private char[] taraxtkLstRunTs = Field.fillLowValue(26);
				private TaraxtkStatsFileNam taraxtkStatsFileNam = new TaraxtkStatsFileNam();

								private int taraxtkRunLmtNum;

						private char[] taraxtkLclRawStatsNam = Field.fillLowValue(44);

						private char[] taraxtkLclSrvrFileNam = Field.fillLowValue(44);

						private char[] taraxtkLclFmtdStatsNam = Field.fillLowValue(44);

						private char[] taraxtkLstUpdtUserId = Field.fillLowValue(9);

						private char[] taraxtkLstUpdtTs = Field.fillLowValue(26);

						private char[] taraxtkGftSrvr1Nam = Field.fillLowValue(10);

						private char[] taraxtkGftSrvr1DsnNam = Field.fillLowValue(44);

						private char[] taraxtkGftSrvr1Ts = Field.fillLowValue(26);

						private char[] taraxtkGftSrvr2Nam = Field.fillLowValue(10);

						private char[] taraxtkGftSrvr2DsnNam = Field.fillLowValue(44);

						private char[] taraxtkGftSrvr2Ts = Field.fillLowValue(26);

						private char[] taraxtkMfeSrvrNam = Field.fillLowValue(20);

						private char[] taraxtkMfeBusPrtnrId = Field.fillLowValue(6);

						private char[] taraxtkMfeEndptId = Field.fillLowValue(7);

						private char[] taraxtkMfeBulkId = Field.fillLowValue(4);

						private char[] taraxtkInbndSw = Field.fillLowValue(1);

						private char[] taraxtkOutbndSw = Field.fillLowValue(1);

						private char[] taraxtkBrdcstSw = Field.fillLowValue(1);

						private char[] taraxtkLastRunKyvlTxt = Field.fillLowValue(16);

						private char[] taraxtkSshBulkId = Field.fillLowValue(4);

						private char[] taraxtkSshEndptId = Field.fillLowValue(7);

						private char[] taraxtkSshBusPrtnrId = Field.fillLowValue(6);

						private char[] taraxtkSshSrvrNam = Field.fillLowValue(20);
				private TaraxtkTaskWorkParmTxt taraxtkTaskWorkParmTxt = new TaraxtkTaskWorkParmTxt();
	
	/**
	* Constructor for Taraxtk
	**/
    public Taraxtk() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			taraxtkDirNodeNam.setParent(this,getStartOffset() + 25);
	       			taraxtkStatsFileNam.setParent(this,getStartOffset() + 309);
	       			taraxtkTaskWorkParmTxt.setParent(this,getStartOffset() + 991);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of taraxtkAppNam
	 *	@return taraxtkAppNam
	 */
   public char[] getTaraxtkAppNam() throws CFException{
     if (isTaraxtkAppNamModified()) { 
        taraxtkAppNam = refreshTaraxtkAppNam();
     }
   		return taraxtkAppNam;
   }

  
	/**
	*  set variable taraxtkAppNam
	*  Corresponding COBOL Variable is TARAXTK-APP-NAM
	*  @param value
	**/
   public void setTaraxtkAppNam(char[] value) {
      taraxtkAppNam = checkTaraxtkAppNamConstraints(value);
      serializeTaraxtkAppNam(taraxtkAppNam);
   } 

     /**
	 * 	Update TaraxtkAppNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkAppNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkAppNam,taraxtkAppNam.length);
   	
   }
   
   public void setTaraxtkAppNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkAppNam,taraxtkAppNam.length);
   	
   }
   
     /**
	 * 	Update TaraxtkAppNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkAppNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkAppNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkAppNam with another Field
	 *	@param value
	 */
   public void setTaraxtkAppNam(Field source) {
       replace(source,0,source.length(),beginTaraxtkAppNam,TARAXTK_APP_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkAppNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkAppNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkAppNam,TARAXTK_APP_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkAppNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkAppNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkAppNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkXferPrcssNam
	 *	@return taraxtkXferPrcssNam
	 */
   public char[] getTaraxtkXferPrcssNam() throws CFException{
     if (isTaraxtkXferPrcssNamModified()) { 
        taraxtkXferPrcssNam = refreshTaraxtkXferPrcssNam();
     }
   		return taraxtkXferPrcssNam;
   }

  
	/**
	*  set variable taraxtkXferPrcssNam
	*  Corresponding COBOL Variable is TARAXTK-XFER-PRCSS-NAM
	*  @param value
	**/
   public void setTaraxtkXferPrcssNam(char[] value) {
      taraxtkXferPrcssNam = checkTaraxtkXferPrcssNamConstraints(value);
      serializeTaraxtkXferPrcssNam(taraxtkXferPrcssNam);
   } 

     /**
	 * 	Update TaraxtkXferPrcssNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkXferPrcssNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkXferPrcssNam,taraxtkXferPrcssNam.length);
   	
   }
   
   public void setTaraxtkXferPrcssNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkXferPrcssNam,taraxtkXferPrcssNam.length);
   	
   }
   
     /**
	 * 	Update TaraxtkXferPrcssNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkXferPrcssNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkXferPrcssNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkXferPrcssNam with another Field
	 *	@param value
	 */
   public void setTaraxtkXferPrcssNam(Field source) {
       replace(source,0,source.length(),beginTaraxtkXferPrcssNam,TARAXTK_XFER_PRCSS_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkXferPrcssNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkXferPrcssNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkXferPrcssNam,TARAXTK_XFER_PRCSS_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkXferPrcssNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkXferPrcssNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkXferPrcssNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkStatCd
	 *	@return taraxtkStatCd
	 */
   public char[] getTaraxtkStatCd() throws CFException{
     if (isTaraxtkStatCdModified()) { 
        taraxtkStatCd = refreshTaraxtkStatCd();
     }
   		return taraxtkStatCd;
   }

  
	/**
	*  set variable taraxtkStatCd
	*  Corresponding COBOL Variable is TARAXTK-STAT-CD
	*  @param value
	**/
   public void setTaraxtkStatCd(char[] value) {
      taraxtkStatCd = checkTaraxtkStatCdConstraints(value);
      serializeTaraxtkStatCd(taraxtkStatCd);
   } 

     /**
	 * 	Update TaraxtkStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkStatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkStatCd,taraxtkStatCd.length);
   	
   }
   
   public void setTaraxtkStatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkStatCd,taraxtkStatCd.length);
   	
   }
   
     /**
	 * 	Update TaraxtkStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkStatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkStatCd with another Field
	 *	@param value
	 */
   public void setTaraxtkStatCd(Field source) {
       replace(source,0,source.length(),beginTaraxtkStatCd,TARAXTK_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkStatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkStatCd,TARAXTK_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkStatCd+targetIndex,targetLen);
    
   }
	public int getTaraxtkDlyIntvlNum() throws CFException {
        if (isTaraxtkDlyIntvlNumModified()) { 
           taraxtkDlyIntvlNum = refreshTaraxtkDlyIntvlNum();
        }
   		return taraxtkDlyIntvlNum;
	}
	
	/**
	 * 	Update TaraxtkDlyIntvlNum with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-DLY-INTVL-NUM
	 *	@param number
	 */
	public void setTaraxtkDlyIntvlNum(int number) {
			taraxtkDlyIntvlNum = checkTaraxtkDlyIntvlNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTaraxtkDlyIntvlNum(taraxtkDlyIntvlNum);
	}


	public void setTaraxtkDlyIntvlNum(long number) {
	    number = checkTaraxtkDlyIntvlNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTaraxtkDlyIntvlNum((int)number);
	}
	
	/**
	 *	Returns the value of taraxtkHighLvlQlfrCd
	 *	@return taraxtkHighLvlQlfrCd
	 */
   public char[] getTaraxtkHighLvlQlfrCd() throws CFException{
     if (isTaraxtkHighLvlQlfrCdModified()) { 
        taraxtkHighLvlQlfrCd = refreshTaraxtkHighLvlQlfrCd();
     }
   		return taraxtkHighLvlQlfrCd;
   }

  
	/**
	*  set variable taraxtkHighLvlQlfrCd
	*  Corresponding COBOL Variable is TARAXTK-HIGH-LVL-QLFR-CD
	*  @param value
	**/
   public void setTaraxtkHighLvlQlfrCd(char[] value) {
      taraxtkHighLvlQlfrCd = checkTaraxtkHighLvlQlfrCdConstraints(value);
      serializeTaraxtkHighLvlQlfrCd(taraxtkHighLvlQlfrCd);
   } 

     /**
	 * 	Update TaraxtkHighLvlQlfrCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkHighLvlQlfrCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkHighLvlQlfrCd,taraxtkHighLvlQlfrCd.length);
   	
   }
   
   public void setTaraxtkHighLvlQlfrCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkHighLvlQlfrCd,taraxtkHighLvlQlfrCd.length);
   	
   }
   
     /**
	 * 	Update TaraxtkHighLvlQlfrCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkHighLvlQlfrCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkHighLvlQlfrCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkHighLvlQlfrCd with another Field
	 *	@param value
	 */
   public void setTaraxtkHighLvlQlfrCd(Field source) {
       replace(source,0,source.length(),beginTaraxtkHighLvlQlfrCd,TARAXTK_HIGH_LVL_QLFR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkHighLvlQlfrCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkHighLvlQlfrCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkHighLvlQlfrCd,TARAXTK_HIGH_LVL_QLFR_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkHighLvlQlfrCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkHighLvlQlfrCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkHighLvlQlfrCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkDirNodeNam
	 *	@return taraxtkDirNodeNam
	 */   
	 public TaraxtkDirNodeNam getTaraxtkDirNodeNam() {
   	return taraxtkDirNodeNam;
   }
   /**
	* 	Update TaraxtkDirNodeNam with the passed value
	*   Corresponding COBOL Variable is TARAXTK-DIR-NODE-NAM
	*	@param value
	*/
   public void setTaraxtkDirNodeNam(char[] value) {
      taraxtkDirNodeNam.setString(value); 
   }   
    
     /**
	 * 	Update TaraxtkDirNodeNam 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkDirNodeNam(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraxtkDirNodeNam.begin,taraxtkDirNodeNam.length());
   }
   
     /**
	 * 	Update TaraxtkDirNodeNam 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkDirNodeNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraxtkDirNodeNam.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TaraxtkDirNodeNam with another Field
	 *	@param value
	 */
   public void setTaraxtkDirNodeNam(Field source) {
   	replace(source,0,source.length(),taraxtkDirNodeNam.begin,taraxtkDirNodeNam.length());
   }  
   
     /**
	 * 	Update TaraxtkDirNodeNam 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkDirNodeNam(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraxtkDirNodeNam.begin,taraxtkDirNodeNam.length());
   }
   
     /**
	 * 	Update TaraxtkDirNodeNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkDirNodeNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraxtkDirNodeNam.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of taraxtkLstRunTs
	 *	@return taraxtkLstRunTs
	 */
   public char[] getTaraxtkLstRunTs() throws CFException{
     if (isTaraxtkLstRunTsModified()) { 
        taraxtkLstRunTs = refreshTaraxtkLstRunTs();
     }
   		return taraxtkLstRunTs;
   }

  
	/**
	*  set variable taraxtkLstRunTs
	*  Corresponding COBOL Variable is TARAXTK-LST-RUN-TS
	*  @param value
	**/
   public void setTaraxtkLstRunTs(char[] value) {
      taraxtkLstRunTs = checkTaraxtkLstRunTsConstraints(value);
      serializeTaraxtkLstRunTs(taraxtkLstRunTs);
   } 

     /**
	 * 	Update TaraxtkLstRunTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkLstRunTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkLstRunTs,taraxtkLstRunTs.length);
   	
   }
   
   public void setTaraxtkLstRunTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLstRunTs,taraxtkLstRunTs.length);
   	
   }
   
     /**
	 * 	Update TaraxtkLstRunTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLstRunTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLstRunTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkLstRunTs with another Field
	 *	@param value
	 */
   public void setTaraxtkLstRunTs(Field source) {
       replace(source,0,source.length(),beginTaraxtkLstRunTs,TARAXTK_LST_RUN_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkLstRunTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkLstRunTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkLstRunTs,TARAXTK_LST_RUN_TS_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkLstRunTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLstRunTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLstRunTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkStatsFileNam
	 *	@return taraxtkStatsFileNam
	 */   
	 public TaraxtkStatsFileNam getTaraxtkStatsFileNam() {
   	return taraxtkStatsFileNam;
   }
   /**
	* 	Update TaraxtkStatsFileNam with the passed value
	*   Corresponding COBOL Variable is TARAXTK-STATS-FILE-NAM
	*	@param value
	*/
   public void setTaraxtkStatsFileNam(char[] value) {
      taraxtkStatsFileNam.setString(value); 
   }   
    
     /**
	 * 	Update TaraxtkStatsFileNam 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkStatsFileNam(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraxtkStatsFileNam.begin,taraxtkStatsFileNam.length());
   }
   
     /**
	 * 	Update TaraxtkStatsFileNam 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkStatsFileNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraxtkStatsFileNam.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TaraxtkStatsFileNam with another Field
	 *	@param value
	 */
   public void setTaraxtkStatsFileNam(Field source) {
   	replace(source,0,source.length(),taraxtkStatsFileNam.begin,taraxtkStatsFileNam.length());
   }  
   
     /**
	 * 	Update TaraxtkStatsFileNam 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkStatsFileNam(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraxtkStatsFileNam.begin,taraxtkStatsFileNam.length());
   }
   
     /**
	 * 	Update TaraxtkStatsFileNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkStatsFileNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraxtkStatsFileNam.begin+targetIndex,targetLen);
   }
	public int getTaraxtkRunLmtNum() throws CFException {
        if (isTaraxtkRunLmtNumModified()) { 
           taraxtkRunLmtNum = refreshTaraxtkRunLmtNum();
        }
   		return taraxtkRunLmtNum;
	}
	
	/**
	 * 	Update TaraxtkRunLmtNum with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-RUN-LMT-NUM
	 *	@param number
	 */
	public void setTaraxtkRunLmtNum(int number) {
			taraxtkRunLmtNum = checkTaraxtkRunLmtNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTaraxtkRunLmtNum(taraxtkRunLmtNum);
	}


	public void setTaraxtkRunLmtNum(long number) {
	    number = checkTaraxtkRunLmtNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTaraxtkRunLmtNum((int)number);
	}
	
	/**
	 *	Returns the value of taraxtkLclRawStatsNam
	 *	@return taraxtkLclRawStatsNam
	 */
   public char[] getTaraxtkLclRawStatsNam() throws CFException{
     if (isTaraxtkLclRawStatsNamModified()) { 
        taraxtkLclRawStatsNam = refreshTaraxtkLclRawStatsNam();
     }
   		return taraxtkLclRawStatsNam;
   }

  
	/**
	*  set variable taraxtkLclRawStatsNam
	*  Corresponding COBOL Variable is TARAXTK-LCL-RAW-STATS-NAM
	*  @param value
	**/
   public void setTaraxtkLclRawStatsNam(char[] value) {
      taraxtkLclRawStatsNam = checkTaraxtkLclRawStatsNamConstraints(value);
      serializeTaraxtkLclRawStatsNam(taraxtkLclRawStatsNam);
   } 

     /**
	 * 	Update TaraxtkLclRawStatsNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkLclRawStatsNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkLclRawStatsNam,taraxtkLclRawStatsNam.length);
   	
   }
   
   public void setTaraxtkLclRawStatsNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLclRawStatsNam,taraxtkLclRawStatsNam.length);
   	
   }
   
     /**
	 * 	Update TaraxtkLclRawStatsNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLclRawStatsNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLclRawStatsNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkLclRawStatsNam with another Field
	 *	@param value
	 */
   public void setTaraxtkLclRawStatsNam(Field source) {
       replace(source,0,source.length(),beginTaraxtkLclRawStatsNam,TARAXTK_LCL_RAW_STATS_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkLclRawStatsNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkLclRawStatsNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkLclRawStatsNam,TARAXTK_LCL_RAW_STATS_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkLclRawStatsNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLclRawStatsNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLclRawStatsNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkLclSrvrFileNam
	 *	@return taraxtkLclSrvrFileNam
	 */
   public char[] getTaraxtkLclSrvrFileNam() throws CFException{
     if (isTaraxtkLclSrvrFileNamModified()) { 
        taraxtkLclSrvrFileNam = refreshTaraxtkLclSrvrFileNam();
     }
   		return taraxtkLclSrvrFileNam;
   }

  
	/**
	*  set variable taraxtkLclSrvrFileNam
	*  Corresponding COBOL Variable is TARAXTK-LCL-SRVR-FILE-NAM
	*  @param value
	**/
   public void setTaraxtkLclSrvrFileNam(char[] value) {
      taraxtkLclSrvrFileNam = checkTaraxtkLclSrvrFileNamConstraints(value);
      serializeTaraxtkLclSrvrFileNam(taraxtkLclSrvrFileNam);
   } 

     /**
	 * 	Update TaraxtkLclSrvrFileNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkLclSrvrFileNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkLclSrvrFileNam,taraxtkLclSrvrFileNam.length);
   	
   }
   
   public void setTaraxtkLclSrvrFileNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLclSrvrFileNam,taraxtkLclSrvrFileNam.length);
   	
   }
   
     /**
	 * 	Update TaraxtkLclSrvrFileNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLclSrvrFileNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLclSrvrFileNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkLclSrvrFileNam with another Field
	 *	@param value
	 */
   public void setTaraxtkLclSrvrFileNam(Field source) {
       replace(source,0,source.length(),beginTaraxtkLclSrvrFileNam,TARAXTK_LCL_SRVR_FILE_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkLclSrvrFileNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkLclSrvrFileNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkLclSrvrFileNam,TARAXTK_LCL_SRVR_FILE_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkLclSrvrFileNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLclSrvrFileNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLclSrvrFileNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkLclFmtdStatsNam
	 *	@return taraxtkLclFmtdStatsNam
	 */
   public char[] getTaraxtkLclFmtdStatsNam() throws CFException{
     if (isTaraxtkLclFmtdStatsNamModified()) { 
        taraxtkLclFmtdStatsNam = refreshTaraxtkLclFmtdStatsNam();
     }
   		return taraxtkLclFmtdStatsNam;
   }

  
	/**
	*  set variable taraxtkLclFmtdStatsNam
	*  Corresponding COBOL Variable is TARAXTK-LCL-FMTD-STATS-NAM
	*  @param value
	**/
   public void setTaraxtkLclFmtdStatsNam(char[] value) {
      taraxtkLclFmtdStatsNam = checkTaraxtkLclFmtdStatsNamConstraints(value);
      serializeTaraxtkLclFmtdStatsNam(taraxtkLclFmtdStatsNam);
   } 

     /**
	 * 	Update TaraxtkLclFmtdStatsNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkLclFmtdStatsNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkLclFmtdStatsNam,taraxtkLclFmtdStatsNam.length);
   	
   }
   
   public void setTaraxtkLclFmtdStatsNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLclFmtdStatsNam,taraxtkLclFmtdStatsNam.length);
   	
   }
   
     /**
	 * 	Update TaraxtkLclFmtdStatsNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLclFmtdStatsNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLclFmtdStatsNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkLclFmtdStatsNam with another Field
	 *	@param value
	 */
   public void setTaraxtkLclFmtdStatsNam(Field source) {
       replace(source,0,source.length(),beginTaraxtkLclFmtdStatsNam,TARAXTK_LCL_FMTD_STATS_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkLclFmtdStatsNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkLclFmtdStatsNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkLclFmtdStatsNam,TARAXTK_LCL_FMTD_STATS_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkLclFmtdStatsNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLclFmtdStatsNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLclFmtdStatsNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkLstUpdtUserId
	 *	@return taraxtkLstUpdtUserId
	 */
   public char[] getTaraxtkLstUpdtUserId() throws CFException{
     if (isTaraxtkLstUpdtUserIdModified()) { 
        taraxtkLstUpdtUserId = refreshTaraxtkLstUpdtUserId();
     }
   		return taraxtkLstUpdtUserId;
   }

  
	/**
	*  set variable taraxtkLstUpdtUserId
	*  Corresponding COBOL Variable is TARAXTK-LST-UPDT-USER-ID
	*  @param value
	**/
   public void setTaraxtkLstUpdtUserId(char[] value) {
      taraxtkLstUpdtUserId = checkTaraxtkLstUpdtUserIdConstraints(value);
      serializeTaraxtkLstUpdtUserId(taraxtkLstUpdtUserId);
   } 

     /**
	 * 	Update TaraxtkLstUpdtUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkLstUpdtUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkLstUpdtUserId,taraxtkLstUpdtUserId.length);
   	
   }
   
   public void setTaraxtkLstUpdtUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLstUpdtUserId,taraxtkLstUpdtUserId.length);
   	
   }
   
     /**
	 * 	Update TaraxtkLstUpdtUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLstUpdtUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLstUpdtUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkLstUpdtUserId with another Field
	 *	@param value
	 */
   public void setTaraxtkLstUpdtUserId(Field source) {
       replace(source,0,source.length(),beginTaraxtkLstUpdtUserId,TARAXTK_LST_UPDT_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkLstUpdtUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkLstUpdtUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkLstUpdtUserId,TARAXTK_LST_UPDT_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkLstUpdtUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLstUpdtUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLstUpdtUserId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkLstUpdtTs
	 *	@return taraxtkLstUpdtTs
	 */
   public char[] getTaraxtkLstUpdtTs() throws CFException{
     if (isTaraxtkLstUpdtTsModified()) { 
        taraxtkLstUpdtTs = refreshTaraxtkLstUpdtTs();
     }
   		return taraxtkLstUpdtTs;
   }

  
	/**
	*  set variable taraxtkLstUpdtTs
	*  Corresponding COBOL Variable is TARAXTK-LST-UPDT-TS
	*  @param value
	**/
   public void setTaraxtkLstUpdtTs(char[] value) {
      taraxtkLstUpdtTs = checkTaraxtkLstUpdtTsConstraints(value);
      serializeTaraxtkLstUpdtTs(taraxtkLstUpdtTs);
   } 

     /**
	 * 	Update TaraxtkLstUpdtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkLstUpdtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkLstUpdtTs,taraxtkLstUpdtTs.length);
   	
   }
   
   public void setTaraxtkLstUpdtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLstUpdtTs,taraxtkLstUpdtTs.length);
   	
   }
   
     /**
	 * 	Update TaraxtkLstUpdtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLstUpdtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLstUpdtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkLstUpdtTs with another Field
	 *	@param value
	 */
   public void setTaraxtkLstUpdtTs(Field source) {
       replace(source,0,source.length(),beginTaraxtkLstUpdtTs,TARAXTK_LST_UPDT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkLstUpdtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkLstUpdtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkLstUpdtTs,TARAXTK_LST_UPDT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkLstUpdtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLstUpdtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLstUpdtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkGftSrvr1Nam
	 *	@return taraxtkGftSrvr1Nam
	 */
   public char[] getTaraxtkGftSrvr1Nam() throws CFException{
     if (isTaraxtkGftSrvr1NamModified()) { 
        taraxtkGftSrvr1Nam = refreshTaraxtkGftSrvr1Nam();
     }
   		return taraxtkGftSrvr1Nam;
   }

  
	/**
	*  set variable taraxtkGftSrvr1Nam
	*  Corresponding COBOL Variable is TARAXTK-GFT-SRVR1-NAM
	*  @param value
	**/
   public void setTaraxtkGftSrvr1Nam(char[] value) {
      taraxtkGftSrvr1Nam = checkTaraxtkGftSrvr1NamConstraints(value);
      serializeTaraxtkGftSrvr1Nam(taraxtkGftSrvr1Nam);
   } 

     /**
	 * 	Update TaraxtkGftSrvr1Nam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1Nam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkGftSrvr1Nam,taraxtkGftSrvr1Nam.length);
   	
   }
   
   public void setTaraxtkGftSrvr1Nam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr1Nam,taraxtkGftSrvr1Nam.length);
   	
   }
   
     /**
	 * 	Update TaraxtkGftSrvr1Nam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1Nam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr1Nam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkGftSrvr1Nam with another Field
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1Nam(Field source) {
       replace(source,0,source.length(),beginTaraxtkGftSrvr1Nam,TARAXTK_GFT_SRVR_1_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkGftSrvr1Nam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1Nam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr1Nam,TARAXTK_GFT_SRVR_1_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkGftSrvr1Nam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1Nam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr1Nam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkGftSrvr1DsnNam
	 *	@return taraxtkGftSrvr1DsnNam
	 */
   public char[] getTaraxtkGftSrvr1DsnNam() throws CFException{
     if (isTaraxtkGftSrvr1DsnNamModified()) { 
        taraxtkGftSrvr1DsnNam = refreshTaraxtkGftSrvr1DsnNam();
     }
   		return taraxtkGftSrvr1DsnNam;
   }

  
	/**
	*  set variable taraxtkGftSrvr1DsnNam
	*  Corresponding COBOL Variable is TARAXTK-GFT-SRVR1-DSN-NAM
	*  @param value
	**/
   public void setTaraxtkGftSrvr1DsnNam(char[] value) {
      taraxtkGftSrvr1DsnNam = checkTaraxtkGftSrvr1DsnNamConstraints(value);
      serializeTaraxtkGftSrvr1DsnNam(taraxtkGftSrvr1DsnNam);
   } 

     /**
	 * 	Update TaraxtkGftSrvr1DsnNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1DsnNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkGftSrvr1DsnNam,taraxtkGftSrvr1DsnNam.length);
   	
   }
   
   public void setTaraxtkGftSrvr1DsnNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr1DsnNam,taraxtkGftSrvr1DsnNam.length);
   	
   }
   
     /**
	 * 	Update TaraxtkGftSrvr1DsnNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1DsnNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr1DsnNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkGftSrvr1DsnNam with another Field
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1DsnNam(Field source) {
       replace(source,0,source.length(),beginTaraxtkGftSrvr1DsnNam,TARAXTK_GFT_SRVR_1_DSN_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkGftSrvr1DsnNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1DsnNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr1DsnNam,TARAXTK_GFT_SRVR_1_DSN_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkGftSrvr1DsnNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1DsnNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr1DsnNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkGftSrvr1Ts
	 *	@return taraxtkGftSrvr1Ts
	 */
   public char[] getTaraxtkGftSrvr1Ts() throws CFException{
     if (isTaraxtkGftSrvr1TsModified()) { 
        taraxtkGftSrvr1Ts = refreshTaraxtkGftSrvr1Ts();
     }
   		return taraxtkGftSrvr1Ts;
   }

  
	/**
	*  set variable taraxtkGftSrvr1Ts
	*  Corresponding COBOL Variable is TARAXTK-GFT-SRVR1-TS
	*  @param value
	**/
   public void setTaraxtkGftSrvr1Ts(char[] value) {
      taraxtkGftSrvr1Ts = checkTaraxtkGftSrvr1TsConstraints(value);
      serializeTaraxtkGftSrvr1Ts(taraxtkGftSrvr1Ts);
   } 

     /**
	 * 	Update TaraxtkGftSrvr1Ts 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1Ts(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkGftSrvr1Ts,taraxtkGftSrvr1Ts.length);
   	
   }
   
   public void setTaraxtkGftSrvr1Ts(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr1Ts,taraxtkGftSrvr1Ts.length);
   	
   }
   
     /**
	 * 	Update TaraxtkGftSrvr1Ts 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1Ts(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr1Ts+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkGftSrvr1Ts with another Field
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1Ts(Field source) {
       replace(source,0,source.length(),beginTaraxtkGftSrvr1Ts,TARAXTK_GFT_SRVR_1_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkGftSrvr1Ts 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1Ts(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr1Ts,TARAXTK_GFT_SRVR_1_TS_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkGftSrvr1Ts 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkGftSrvr1Ts(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr1Ts+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkGftSrvr2Nam
	 *	@return taraxtkGftSrvr2Nam
	 */
   public char[] getTaraxtkGftSrvr2Nam() throws CFException{
     if (isTaraxtkGftSrvr2NamModified()) { 
        taraxtkGftSrvr2Nam = refreshTaraxtkGftSrvr2Nam();
     }
   		return taraxtkGftSrvr2Nam;
   }

  
	/**
	*  set variable taraxtkGftSrvr2Nam
	*  Corresponding COBOL Variable is TARAXTK-GFT-SRVR2-NAM
	*  @param value
	**/
   public void setTaraxtkGftSrvr2Nam(char[] value) {
      taraxtkGftSrvr2Nam = checkTaraxtkGftSrvr2NamConstraints(value);
      serializeTaraxtkGftSrvr2Nam(taraxtkGftSrvr2Nam);
   } 

     /**
	 * 	Update TaraxtkGftSrvr2Nam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2Nam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkGftSrvr2Nam,taraxtkGftSrvr2Nam.length);
   	
   }
   
   public void setTaraxtkGftSrvr2Nam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr2Nam,taraxtkGftSrvr2Nam.length);
   	
   }
   
     /**
	 * 	Update TaraxtkGftSrvr2Nam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2Nam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr2Nam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkGftSrvr2Nam with another Field
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2Nam(Field source) {
       replace(source,0,source.length(),beginTaraxtkGftSrvr2Nam,TARAXTK_GFT_SRVR_2_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkGftSrvr2Nam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2Nam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr2Nam,TARAXTK_GFT_SRVR_2_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkGftSrvr2Nam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2Nam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr2Nam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkGftSrvr2DsnNam
	 *	@return taraxtkGftSrvr2DsnNam
	 */
   public char[] getTaraxtkGftSrvr2DsnNam() throws CFException{
     if (isTaraxtkGftSrvr2DsnNamModified()) { 
        taraxtkGftSrvr2DsnNam = refreshTaraxtkGftSrvr2DsnNam();
     }
   		return taraxtkGftSrvr2DsnNam;
   }

  
	/**
	*  set variable taraxtkGftSrvr2DsnNam
	*  Corresponding COBOL Variable is TARAXTK-GFT-SRVR2-DSN-NAM
	*  @param value
	**/
   public void setTaraxtkGftSrvr2DsnNam(char[] value) {
      taraxtkGftSrvr2DsnNam = checkTaraxtkGftSrvr2DsnNamConstraints(value);
      serializeTaraxtkGftSrvr2DsnNam(taraxtkGftSrvr2DsnNam);
   } 

     /**
	 * 	Update TaraxtkGftSrvr2DsnNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2DsnNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkGftSrvr2DsnNam,taraxtkGftSrvr2DsnNam.length);
   	
   }
   
   public void setTaraxtkGftSrvr2DsnNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr2DsnNam,taraxtkGftSrvr2DsnNam.length);
   	
   }
   
     /**
	 * 	Update TaraxtkGftSrvr2DsnNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2DsnNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr2DsnNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkGftSrvr2DsnNam with another Field
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2DsnNam(Field source) {
       replace(source,0,source.length(),beginTaraxtkGftSrvr2DsnNam,TARAXTK_GFT_SRVR_2_DSN_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkGftSrvr2DsnNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2DsnNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr2DsnNam,TARAXTK_GFT_SRVR_2_DSN_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkGftSrvr2DsnNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2DsnNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr2DsnNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkGftSrvr2Ts
	 *	@return taraxtkGftSrvr2Ts
	 */
   public char[] getTaraxtkGftSrvr2Ts() throws CFException{
     if (isTaraxtkGftSrvr2TsModified()) { 
        taraxtkGftSrvr2Ts = refreshTaraxtkGftSrvr2Ts();
     }
   		return taraxtkGftSrvr2Ts;
   }

  
	/**
	*  set variable taraxtkGftSrvr2Ts
	*  Corresponding COBOL Variable is TARAXTK-GFT-SRVR2-TS
	*  @param value
	**/
   public void setTaraxtkGftSrvr2Ts(char[] value) {
      taraxtkGftSrvr2Ts = checkTaraxtkGftSrvr2TsConstraints(value);
      serializeTaraxtkGftSrvr2Ts(taraxtkGftSrvr2Ts);
   } 

     /**
	 * 	Update TaraxtkGftSrvr2Ts 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2Ts(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkGftSrvr2Ts,taraxtkGftSrvr2Ts.length);
   	
   }
   
   public void setTaraxtkGftSrvr2Ts(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr2Ts,taraxtkGftSrvr2Ts.length);
   	
   }
   
     /**
	 * 	Update TaraxtkGftSrvr2Ts 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2Ts(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr2Ts+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkGftSrvr2Ts with another Field
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2Ts(Field source) {
       replace(source,0,source.length(),beginTaraxtkGftSrvr2Ts,TARAXTK_GFT_SRVR_2_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkGftSrvr2Ts 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2Ts(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr2Ts,TARAXTK_GFT_SRVR_2_TS_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkGftSrvr2Ts 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkGftSrvr2Ts(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkGftSrvr2Ts+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkMfeSrvrNam
	 *	@return taraxtkMfeSrvrNam
	 */
   public char[] getTaraxtkMfeSrvrNam() throws CFException{
     if (isTaraxtkMfeSrvrNamModified()) { 
        taraxtkMfeSrvrNam = refreshTaraxtkMfeSrvrNam();
     }
   		return taraxtkMfeSrvrNam;
   }

  
	/**
	*  set variable taraxtkMfeSrvrNam
	*  Corresponding COBOL Variable is TARAXTK-MFE-SRVR-NAM
	*  @param value
	**/
   public void setTaraxtkMfeSrvrNam(char[] value) {
      taraxtkMfeSrvrNam = checkTaraxtkMfeSrvrNamConstraints(value);
      serializeTaraxtkMfeSrvrNam(taraxtkMfeSrvrNam);
   } 

     /**
	 * 	Update TaraxtkMfeSrvrNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkMfeSrvrNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkMfeSrvrNam,taraxtkMfeSrvrNam.length);
   	
   }
   
   public void setTaraxtkMfeSrvrNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkMfeSrvrNam,taraxtkMfeSrvrNam.length);
   	
   }
   
     /**
	 * 	Update TaraxtkMfeSrvrNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkMfeSrvrNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkMfeSrvrNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkMfeSrvrNam with another Field
	 *	@param value
	 */
   public void setTaraxtkMfeSrvrNam(Field source) {
       replace(source,0,source.length(),beginTaraxtkMfeSrvrNam,TARAXTK_MFE_SRVR_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkMfeSrvrNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkMfeSrvrNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkMfeSrvrNam,TARAXTK_MFE_SRVR_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkMfeSrvrNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkMfeSrvrNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkMfeSrvrNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkMfeBusPrtnrId
	 *	@return taraxtkMfeBusPrtnrId
	 */
   public char[] getTaraxtkMfeBusPrtnrId() throws CFException{
     if (isTaraxtkMfeBusPrtnrIdModified()) { 
        taraxtkMfeBusPrtnrId = refreshTaraxtkMfeBusPrtnrId();
     }
   		return taraxtkMfeBusPrtnrId;
   }

  
	/**
	*  set variable taraxtkMfeBusPrtnrId
	*  Corresponding COBOL Variable is TARAXTK-MFE-BUS-PRTNR-ID
	*  @param value
	**/
   public void setTaraxtkMfeBusPrtnrId(char[] value) {
      taraxtkMfeBusPrtnrId = checkTaraxtkMfeBusPrtnrIdConstraints(value);
      serializeTaraxtkMfeBusPrtnrId(taraxtkMfeBusPrtnrId);
   } 

     /**
	 * 	Update TaraxtkMfeBusPrtnrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkMfeBusPrtnrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkMfeBusPrtnrId,taraxtkMfeBusPrtnrId.length);
   	
   }
   
   public void setTaraxtkMfeBusPrtnrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkMfeBusPrtnrId,taraxtkMfeBusPrtnrId.length);
   	
   }
   
     /**
	 * 	Update TaraxtkMfeBusPrtnrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkMfeBusPrtnrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkMfeBusPrtnrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkMfeBusPrtnrId with another Field
	 *	@param value
	 */
   public void setTaraxtkMfeBusPrtnrId(Field source) {
       replace(source,0,source.length(),beginTaraxtkMfeBusPrtnrId,TARAXTK_MFE_BUS_PRTNR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkMfeBusPrtnrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkMfeBusPrtnrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkMfeBusPrtnrId,TARAXTK_MFE_BUS_PRTNR_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkMfeBusPrtnrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkMfeBusPrtnrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkMfeBusPrtnrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkMfeEndptId
	 *	@return taraxtkMfeEndptId
	 */
   public char[] getTaraxtkMfeEndptId() throws CFException{
     if (isTaraxtkMfeEndptIdModified()) { 
        taraxtkMfeEndptId = refreshTaraxtkMfeEndptId();
     }
   		return taraxtkMfeEndptId;
   }

  
	/**
	*  set variable taraxtkMfeEndptId
	*  Corresponding COBOL Variable is TARAXTK-MFE-ENDPT-ID
	*  @param value
	**/
   public void setTaraxtkMfeEndptId(char[] value) {
      taraxtkMfeEndptId = checkTaraxtkMfeEndptIdConstraints(value);
      serializeTaraxtkMfeEndptId(taraxtkMfeEndptId);
   } 

     /**
	 * 	Update TaraxtkMfeEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkMfeEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkMfeEndptId,taraxtkMfeEndptId.length);
   	
   }
   
   public void setTaraxtkMfeEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkMfeEndptId,taraxtkMfeEndptId.length);
   	
   }
   
     /**
	 * 	Update TaraxtkMfeEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkMfeEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkMfeEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkMfeEndptId with another Field
	 *	@param value
	 */
   public void setTaraxtkMfeEndptId(Field source) {
       replace(source,0,source.length(),beginTaraxtkMfeEndptId,TARAXTK_MFE_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkMfeEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkMfeEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkMfeEndptId,TARAXTK_MFE_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkMfeEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkMfeEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkMfeEndptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkMfeBulkId
	 *	@return taraxtkMfeBulkId
	 */
   public char[] getTaraxtkMfeBulkId() throws CFException{
     if (isTaraxtkMfeBulkIdModified()) { 
        taraxtkMfeBulkId = refreshTaraxtkMfeBulkId();
     }
   		return taraxtkMfeBulkId;
   }

  
	/**
	*  set variable taraxtkMfeBulkId
	*  Corresponding COBOL Variable is TARAXTK-MFE-BULK-ID
	*  @param value
	**/
   public void setTaraxtkMfeBulkId(char[] value) {
      taraxtkMfeBulkId = checkTaraxtkMfeBulkIdConstraints(value);
      serializeTaraxtkMfeBulkId(taraxtkMfeBulkId);
   } 

     /**
	 * 	Update TaraxtkMfeBulkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkMfeBulkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkMfeBulkId,taraxtkMfeBulkId.length);
   	
   }
   
   public void setTaraxtkMfeBulkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkMfeBulkId,taraxtkMfeBulkId.length);
   	
   }
   
     /**
	 * 	Update TaraxtkMfeBulkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkMfeBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkMfeBulkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkMfeBulkId with another Field
	 *	@param value
	 */
   public void setTaraxtkMfeBulkId(Field source) {
       replace(source,0,source.length(),beginTaraxtkMfeBulkId,TARAXTK_MFE_BULK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkMfeBulkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkMfeBulkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkMfeBulkId,TARAXTK_MFE_BULK_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkMfeBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkMfeBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkMfeBulkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkInbndSw
	 *	@return taraxtkInbndSw
	 */
   public char[] getTaraxtkInbndSw() throws CFException{
     if (isTaraxtkInbndSwModified()) { 
        taraxtkInbndSw = refreshTaraxtkInbndSw();
     }
   		return taraxtkInbndSw;
   }

  
	/**
	*  set variable taraxtkInbndSw
	*  Corresponding COBOL Variable is TARAXTK-INBND-SW
	*  @param value
	**/
   public void setTaraxtkInbndSw(char[] value) {
      taraxtkInbndSw = checkTaraxtkInbndSwConstraints(value);
      serializeTaraxtkInbndSw(taraxtkInbndSw);
   } 

     /**
	 * 	Update TaraxtkInbndSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkInbndSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkInbndSw,taraxtkInbndSw.length);
   	
   }
   
   public void setTaraxtkInbndSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkInbndSw,taraxtkInbndSw.length);
   	
   }
   
     /**
	 * 	Update TaraxtkInbndSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkInbndSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkInbndSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkInbndSw with another Field
	 *	@param value
	 */
   public void setTaraxtkInbndSw(Field source) {
       replace(source,0,source.length(),beginTaraxtkInbndSw,TARAXTK_INBND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkInbndSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkInbndSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkInbndSw,TARAXTK_INBND_SW_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkInbndSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkInbndSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkInbndSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkOutbndSw
	 *	@return taraxtkOutbndSw
	 */
   public char[] getTaraxtkOutbndSw() throws CFException{
     if (isTaraxtkOutbndSwModified()) { 
        taraxtkOutbndSw = refreshTaraxtkOutbndSw();
     }
   		return taraxtkOutbndSw;
   }

  
	/**
	*  set variable taraxtkOutbndSw
	*  Corresponding COBOL Variable is TARAXTK-OUTBND-SW
	*  @param value
	**/
   public void setTaraxtkOutbndSw(char[] value) {
      taraxtkOutbndSw = checkTaraxtkOutbndSwConstraints(value);
      serializeTaraxtkOutbndSw(taraxtkOutbndSw);
   } 

     /**
	 * 	Update TaraxtkOutbndSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkOutbndSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkOutbndSw,taraxtkOutbndSw.length);
   	
   }
   
   public void setTaraxtkOutbndSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkOutbndSw,taraxtkOutbndSw.length);
   	
   }
   
     /**
	 * 	Update TaraxtkOutbndSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkOutbndSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkOutbndSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkOutbndSw with another Field
	 *	@param value
	 */
   public void setTaraxtkOutbndSw(Field source) {
       replace(source,0,source.length(),beginTaraxtkOutbndSw,TARAXTK_OUTBND_SW_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkOutbndSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkOutbndSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkOutbndSw,TARAXTK_OUTBND_SW_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkOutbndSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkOutbndSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkOutbndSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkBrdcstSw
	 *	@return taraxtkBrdcstSw
	 */
   public char[] getTaraxtkBrdcstSw() throws CFException{
     if (isTaraxtkBrdcstSwModified()) { 
        taraxtkBrdcstSw = refreshTaraxtkBrdcstSw();
     }
   		return taraxtkBrdcstSw;
   }

  
	/**
	*  set variable taraxtkBrdcstSw
	*  Corresponding COBOL Variable is TARAXTK-BRDCST-SW
	*  @param value
	**/
   public void setTaraxtkBrdcstSw(char[] value) {
      taraxtkBrdcstSw = checkTaraxtkBrdcstSwConstraints(value);
      serializeTaraxtkBrdcstSw(taraxtkBrdcstSw);
   } 

     /**
	 * 	Update TaraxtkBrdcstSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkBrdcstSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkBrdcstSw,taraxtkBrdcstSw.length);
   	
   }
   
   public void setTaraxtkBrdcstSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkBrdcstSw,taraxtkBrdcstSw.length);
   	
   }
   
     /**
	 * 	Update TaraxtkBrdcstSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkBrdcstSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkBrdcstSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkBrdcstSw with another Field
	 *	@param value
	 */
   public void setTaraxtkBrdcstSw(Field source) {
       replace(source,0,source.length(),beginTaraxtkBrdcstSw,TARAXTK_BRDCST_SW_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkBrdcstSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkBrdcstSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkBrdcstSw,TARAXTK_BRDCST_SW_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkBrdcstSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkBrdcstSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkBrdcstSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkLastRunKyvlTxt
	 *	@return taraxtkLastRunKyvlTxt
	 */
   public char[] getTaraxtkLastRunKyvlTxt() throws CFException{
     if (isTaraxtkLastRunKyvlTxtModified()) { 
        taraxtkLastRunKyvlTxt = refreshTaraxtkLastRunKyvlTxt();
     }
   		return taraxtkLastRunKyvlTxt;
   }

  
	/**
	*  set variable taraxtkLastRunKyvlTxt
	*  Corresponding COBOL Variable is TARAXTK-LAST-RUN-KYVL-TXT
	*  @param value
	**/
   public void setTaraxtkLastRunKyvlTxt(char[] value) {
      taraxtkLastRunKyvlTxt = checkTaraxtkLastRunKyvlTxtConstraints(value);
      serializeTaraxtkLastRunKyvlTxt(taraxtkLastRunKyvlTxt);
   } 

     /**
	 * 	Update TaraxtkLastRunKyvlTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkLastRunKyvlTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkLastRunKyvlTxt,taraxtkLastRunKyvlTxt.length);
   	
   }
   
   public void setTaraxtkLastRunKyvlTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLastRunKyvlTxt,taraxtkLastRunKyvlTxt.length);
   	
   }
   
     /**
	 * 	Update TaraxtkLastRunKyvlTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLastRunKyvlTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLastRunKyvlTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkLastRunKyvlTxt with another Field
	 *	@param value
	 */
   public void setTaraxtkLastRunKyvlTxt(Field source) {
       replace(source,0,source.length(),beginTaraxtkLastRunKyvlTxt,TARAXTK_LAST_RUN_KYVL_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkLastRunKyvlTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkLastRunKyvlTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkLastRunKyvlTxt,TARAXTK_LAST_RUN_KYVL_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkLastRunKyvlTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkLastRunKyvlTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkLastRunKyvlTxt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkSshBulkId
	 *	@return taraxtkSshBulkId
	 */
   public char[] getTaraxtkSshBulkId() throws CFException{
     if (isTaraxtkSshBulkIdModified()) { 
        taraxtkSshBulkId = refreshTaraxtkSshBulkId();
     }
   		return taraxtkSshBulkId;
   }

  
	/**
	*  set variable taraxtkSshBulkId
	*  Corresponding COBOL Variable is TARAXTK-SSH-BULK-ID
	*  @param value
	**/
   public void setTaraxtkSshBulkId(char[] value) {
      taraxtkSshBulkId = checkTaraxtkSshBulkIdConstraints(value);
      serializeTaraxtkSshBulkId(taraxtkSshBulkId);
   } 

     /**
	 * 	Update TaraxtkSshBulkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkSshBulkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkSshBulkId,taraxtkSshBulkId.length);
   	
   }
   
   public void setTaraxtkSshBulkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkSshBulkId,taraxtkSshBulkId.length);
   	
   }
   
     /**
	 * 	Update TaraxtkSshBulkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkSshBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkSshBulkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkSshBulkId with another Field
	 *	@param value
	 */
   public void setTaraxtkSshBulkId(Field source) {
       replace(source,0,source.length(),beginTaraxtkSshBulkId,TARAXTK_SSH_BULK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkSshBulkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkSshBulkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkSshBulkId,TARAXTK_SSH_BULK_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkSshBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkSshBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkSshBulkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkSshEndptId
	 *	@return taraxtkSshEndptId
	 */
   public char[] getTaraxtkSshEndptId() throws CFException{
     if (isTaraxtkSshEndptIdModified()) { 
        taraxtkSshEndptId = refreshTaraxtkSshEndptId();
     }
   		return taraxtkSshEndptId;
   }

  
	/**
	*  set variable taraxtkSshEndptId
	*  Corresponding COBOL Variable is TARAXTK-SSH-ENDPT-ID
	*  @param value
	**/
   public void setTaraxtkSshEndptId(char[] value) {
      taraxtkSshEndptId = checkTaraxtkSshEndptIdConstraints(value);
      serializeTaraxtkSshEndptId(taraxtkSshEndptId);
   } 

     /**
	 * 	Update TaraxtkSshEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkSshEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkSshEndptId,taraxtkSshEndptId.length);
   	
   }
   
   public void setTaraxtkSshEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkSshEndptId,taraxtkSshEndptId.length);
   	
   }
   
     /**
	 * 	Update TaraxtkSshEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkSshEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkSshEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkSshEndptId with another Field
	 *	@param value
	 */
   public void setTaraxtkSshEndptId(Field source) {
       replace(source,0,source.length(),beginTaraxtkSshEndptId,TARAXTK_SSH_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkSshEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkSshEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkSshEndptId,TARAXTK_SSH_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkSshEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkSshEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkSshEndptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkSshBusPrtnrId
	 *	@return taraxtkSshBusPrtnrId
	 */
   public char[] getTaraxtkSshBusPrtnrId() throws CFException{
     if (isTaraxtkSshBusPrtnrIdModified()) { 
        taraxtkSshBusPrtnrId = refreshTaraxtkSshBusPrtnrId();
     }
   		return taraxtkSshBusPrtnrId;
   }

  
	/**
	*  set variable taraxtkSshBusPrtnrId
	*  Corresponding COBOL Variable is TARAXTK-SSH-BUS-PRTNR-ID
	*  @param value
	**/
   public void setTaraxtkSshBusPrtnrId(char[] value) {
      taraxtkSshBusPrtnrId = checkTaraxtkSshBusPrtnrIdConstraints(value);
      serializeTaraxtkSshBusPrtnrId(taraxtkSshBusPrtnrId);
   } 

     /**
	 * 	Update TaraxtkSshBusPrtnrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkSshBusPrtnrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkSshBusPrtnrId,taraxtkSshBusPrtnrId.length);
   	
   }
   
   public void setTaraxtkSshBusPrtnrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkSshBusPrtnrId,taraxtkSshBusPrtnrId.length);
   	
   }
   
     /**
	 * 	Update TaraxtkSshBusPrtnrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkSshBusPrtnrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkSshBusPrtnrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkSshBusPrtnrId with another Field
	 *	@param value
	 */
   public void setTaraxtkSshBusPrtnrId(Field source) {
       replace(source,0,source.length(),beginTaraxtkSshBusPrtnrId,TARAXTK_SSH_BUS_PRTNR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkSshBusPrtnrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkSshBusPrtnrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkSshBusPrtnrId,TARAXTK_SSH_BUS_PRTNR_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkSshBusPrtnrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkSshBusPrtnrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkSshBusPrtnrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkSshSrvrNam
	 *	@return taraxtkSshSrvrNam
	 */
   public char[] getTaraxtkSshSrvrNam() throws CFException{
     if (isTaraxtkSshSrvrNamModified()) { 
        taraxtkSshSrvrNam = refreshTaraxtkSshSrvrNam();
     }
   		return taraxtkSshSrvrNam;
   }

  
	/**
	*  set variable taraxtkSshSrvrNam
	*  Corresponding COBOL Variable is TARAXTK-SSH-SRVR-NAM
	*  @param value
	**/
   public void setTaraxtkSshSrvrNam(char[] value) {
      taraxtkSshSrvrNam = checkTaraxtkSshSrvrNamConstraints(value);
      serializeTaraxtkSshSrvrNam(taraxtkSshSrvrNam);
   } 

     /**
	 * 	Update TaraxtkSshSrvrNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkSshSrvrNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkSshSrvrNam,taraxtkSshSrvrNam.length);
   	
   }
   
   public void setTaraxtkSshSrvrNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkSshSrvrNam,taraxtkSshSrvrNam.length);
   	
   }
   
     /**
	 * 	Update TaraxtkSshSrvrNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkSshSrvrNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkSshSrvrNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkSshSrvrNam with another Field
	 *	@param value
	 */
   public void setTaraxtkSshSrvrNam(Field source) {
       replace(source,0,source.length(),beginTaraxtkSshSrvrNam,TARAXTK_SSH_SRVR_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkSshSrvrNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkSshSrvrNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkSshSrvrNam,TARAXTK_SSH_SRVR_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkSshSrvrNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkSshSrvrNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkSshSrvrNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraxtkTaskWorkParmTxt
	 *	@return taraxtkTaskWorkParmTxt
	 */   
	 public TaraxtkTaskWorkParmTxt getTaraxtkTaskWorkParmTxt() {
   	return taraxtkTaskWorkParmTxt;
   }
   /**
	* 	Update TaraxtkTaskWorkParmTxt with the passed value
	*   Corresponding COBOL Variable is TARAXTK-TASK-WORK-PARM-TXT
	*	@param value
	*/
   public void setTaraxtkTaskWorkParmTxt(char[] value) {
      taraxtkTaskWorkParmTxt.setString(value); 
   }   
    
     /**
	 * 	Update TaraxtkTaskWorkParmTxt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkTaskWorkParmTxt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraxtkTaskWorkParmTxt.begin,taraxtkTaskWorkParmTxt.length());
   }
   
     /**
	 * 	Update TaraxtkTaskWorkParmTxt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkTaskWorkParmTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraxtkTaskWorkParmTxt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TaraxtkTaskWorkParmTxt with another Field
	 *	@param value
	 */
   public void setTaraxtkTaskWorkParmTxt(Field source) {
   	replace(source,0,source.length(),taraxtkTaskWorkParmTxt.begin,taraxtkTaskWorkParmTxt.length());
   }  
   
     /**
	 * 	Update TaraxtkTaskWorkParmTxt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkTaskWorkParmTxt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,taraxtkTaskWorkParmTxt.begin,taraxtkTaskWorkParmTxt.length());
   }
   
     /**
	 * 	Update TaraxtkTaskWorkParmTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkTaskWorkParmTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,taraxtkTaskWorkParmTxt.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Taraxtk
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setTaraxtkAppNam(CONSTANTS.SPACE_8);
         setTaraxtkXferPrcssNam(CONSTANTS.SPACE_8);
         setTaraxtkStatCd(CONSTANTS.SPACE);
                     setTaraxtkDlyIntvlNum(0);
         setTaraxtkHighLvlQlfrCd(CONSTANTS.SPACE_4);
          taraxtkDirNodeNam.initialize();
     
         setTaraxtkLstRunTs(CONSTANTS.SPACE_26);
          taraxtkStatsFileNam.initialize();
     
                     setTaraxtkRunLmtNum(0);
         setTaraxtkLclRawStatsNam(CONSTANTS.SPACE_44);
         setTaraxtkLclSrvrFileNam(CONSTANTS.SPACE_44);
         setTaraxtkLclFmtdStatsNam(CONSTANTS.SPACE_44);
         setTaraxtkLstUpdtUserId(CONSTANTS.SPACE_9);
         setTaraxtkLstUpdtTs(CONSTANTS.SPACE_26);
         setTaraxtkGftSrvr1Nam(CONSTANTS.SPACE_10);
         setTaraxtkGftSrvr1DsnNam(CONSTANTS.SPACE_44);
         setTaraxtkGftSrvr1Ts(CONSTANTS.SPACE_26);
         setTaraxtkGftSrvr2Nam(CONSTANTS.SPACE_10);
         setTaraxtkGftSrvr2DsnNam(CONSTANTS.SPACE_44);
         setTaraxtkGftSrvr2Ts(CONSTANTS.SPACE_26);
         setTaraxtkMfeSrvrNam(CONSTANTS.SPACE_20);
         setTaraxtkMfeBusPrtnrId(CONSTANTS.SPACE_6);
         setTaraxtkMfeEndptId(CONSTANTS.SPACE_7);
         setTaraxtkMfeBulkId(CONSTANTS.SPACE_4);
         setTaraxtkInbndSw(CONSTANTS.SPACE);
         setTaraxtkOutbndSw(CONSTANTS.SPACE);
         setTaraxtkBrdcstSw(CONSTANTS.SPACE);
         setTaraxtkLastRunKyvlTxt(CONSTANTS.SPACE_16);
         setTaraxtkSshBulkId(CONSTANTS.SPACE_4);
         setTaraxtkSshEndptId(CONSTANTS.SPACE_7);
         setTaraxtkSshBusPrtnrId(CONSTANTS.SPACE_6);
         setTaraxtkSshSrvrNam(CONSTANTS.SPACE_20);
          taraxtkTaskWorkParmTxt.initialize();
     
   }

		public static int getTaraxtkFieldLength() {
			return TARAXTK_LENGTH;
		}

}
  
