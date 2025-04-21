package com.cloudframe.app.ar640010.dto;

/**
*  The class Tarafxs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Tarafxs extends TarafxsSerialized {
   

						private char[] tarafxsMcMnfrmFileNam = Field.fillLowValue(44);

								private short tarafxsCyclNum;

						private char[] tarafxsBusPrtnrId = Field.fillLowValue(6);

						private char[] tarafxsEndptId = Field.fillLowValue(7);

						private char[] tarafxsXferMthdCd = Field.fillLowValue(1);

						private char[] tarafxsAvailTs = Field.fillLowValue(26);

						private char[] tarafxsBulkId = Field.fillLowValue(4);

						private char[] tarafxsStatCd = Field.fillLowValue(1);

						private char[] tarafxsSndRcvPrmsnCd = Field.fillLowValue(1);

						private char[] tarafxsMcibdioParmTxt = Field.fillLowValue(50);

								private short tarafxsPrtyNum;

						private char[] tarafxsArchLocTxt = Field.fillLowValue(44);

						private char[] tarafxsSvrFileStatCd = Field.fillLowValue(1);

						private char[] tarafxsLstStatTs = Field.fillLowValue(26);

								private long tarafxsXferFileSzNum;

								private int tarafxsTmsXferdCnt;

								private long tarafxsXferRecCnt;

						private char[] tarafxsXferRqstTs = Field.fillLowValue(26);

						private char[] tarafxsXferStrtTs = Field.fillLowValue(26);

						private char[] tarafxsXferStopTs = Field.fillLowValue(26);

						private char[] tarafxsXferRdyTs = Field.fillLowValue(26);

						private char[] tarafxsXferCondCd = Field.fillLowValue(9);

						private char[] tarafxsXferStatTxt = Field.fillLowValue(9);

								private long tarafxsXferPrcssId;

								private long tarafxsOrgXferPrcsId;

						private char[] tarafxsTrgrCondCd = Field.fillLowValue(1);

						private char[] tarafxsTrgrStatTxt = Field.fillLowValue(9);

						private char[] tarafxsOrgLocNam = Field.fillLowValue(16);

						private char[] tarafxsLstUpdtUserId = Field.fillLowValue(9);

						private char[] tarafxsLstUpdtTs = Field.fillLowValue(26);

						private char[] tarafxsTrgrActNam = Field.fillLowValue(8);

						private char[] tarafxsPrvMnfrmFileNam = Field.fillLowValue(44);

								private short tarafxsPrvCyclNum;

						private char[] tarafxsPrvBusPrtnrId = Field.fillLowValue(6);

						private char[] tarafxsPrvEndptId = Field.fillLowValue(7);

						private char[] tarafxsPrvAvailTs = Field.fillLowValue(26);

						private char[] tarafxsNxtMnfrmFileNam = Field.fillLowValue(44);

								private short tarafxsNxtCyclNum;

						private char[] tarafxsNxtBusPrtnrId = Field.fillLowValue(6);

						private char[] tarafxsNxtEndptId = Field.fillLowValue(7);

						private char[] tarafxsNxtAvailTs = Field.fillLowValue(26);

						private char[] tarafxsApplExitJobNam = Field.fillLowValue(8);

						private char[] tarafxsApplExitTs = Field.fillLowValue(26);

						private char[] tarafxsCsMipId = Field.fillLowValue(3);

						private char[] tarafxsRmMipId = Field.fillLowValue(3);

						private char[] tarafxsApplExitNam = Field.fillLowValue(8);

						private char[] tarafxsTapeCmpltdSw = Field.fillLowValue(1);

						private char[] tarafxsTapeMultVolSw = Field.fillLowValue(1);

						private char[] tarafxsApplPrcssngDt = Field.fillLowValue(10);

						private char[] tarafxsTransitionalDsn = Field.fillLowValue(44);

						private char[] tarafxsSourceHubId = Field.fillLowValue(8);

						private char[] tarafxsOwningHubId = Field.fillLowValue(8);

						private char[] tarafxsStatRefId = Field.fillLowValue(4);

						private char[] tarafxsSrcLocEntNam = Field.fillLowValue(10);

						private char[] tarafxsSrcTaskNam = Field.fillLowValue(10);

						private char[] tarafxsSrcTaskId = Field.fillLowValue(13);
				private TarafxsSrcTaskUsr tarafxsSrcTaskUsr = new TarafxsSrcTaskUsr();

						private char[] tarafxsSrcTaskStrtTs = Field.fillLowValue(26);

						private char[] tarafxsSrcTaskStopTs = Field.fillLowValue(26);

						private char[] tarafxsTrgtLocEntNam = Field.fillLowValue(10);

						private char[] tarafxsTrgtTaskNam = Field.fillLowValue(10);

						private char[] tarafxsTrgtTaskId = Field.fillLowValue(13);
				private TarafxsTrgtTaskUsr tarafxsTrgtTaskUsr = new TarafxsTrgtTaskUsr();

						private char[] tarafxsTrgtTaskStrtTs = Field.fillLowValue(26);

						private char[] tarafxsTrgtTaskStopTs = Field.fillLowValue(26);
				private TarafxsApplTknNam tarafxsApplTknNam = new TarafxsApplTknNam();
	
	/**
	* Constructor for Tarafxs
	**/
    public Tarafxs() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			tarafxsSrcTaskUsr.setParent(this,getStartOffset() + 764);
	       			tarafxsTrgtTaskUsr.setParent(this,getStartOffset() + 915);
	       			tarafxsApplTknNam.setParent(this,getStartOffset() + 1033);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tarafxsMcMnfrmFileNam
	 *	@return tarafxsMcMnfrmFileNam
	 */
   public char[] getTarafxsMcMnfrmFileNam() throws CFException{
     if (isTarafxsMcMnfrmFileNamModified()) { 
        tarafxsMcMnfrmFileNam = refreshTarafxsMcMnfrmFileNam();
     }
   		return tarafxsMcMnfrmFileNam;
   }

  
	/**
	*  set variable tarafxsMcMnfrmFileNam
	*  Corresponding COBOL Variable is TARAFXS-MC-MNFRM-FILE-NAM
	*  @param value
	**/
   public void setTarafxsMcMnfrmFileNam(char[] value) {
      tarafxsMcMnfrmFileNam = checkTarafxsMcMnfrmFileNamConstraints(value);
      serializeTarafxsMcMnfrmFileNam(tarafxsMcMnfrmFileNam);
   } 

     /**
	 * 	Update TarafxsMcMnfrmFileNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsMcMnfrmFileNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsMcMnfrmFileNam,tarafxsMcMnfrmFileNam.length);
   	
   }
   
   public void setTarafxsMcMnfrmFileNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsMcMnfrmFileNam,tarafxsMcMnfrmFileNam.length);
   	
   }
   
     /**
	 * 	Update TarafxsMcMnfrmFileNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsMcMnfrmFileNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsMcMnfrmFileNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsMcMnfrmFileNam with another Field
	 *	@param value
	 */
   public void setTarafxsMcMnfrmFileNam(Field source) {
       replace(source,0,source.length(),beginTarafxsMcMnfrmFileNam,TARAFXS_MC_MNFRM_FILE_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsMcMnfrmFileNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsMcMnfrmFileNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsMcMnfrmFileNam,TARAFXS_MC_MNFRM_FILE_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsMcMnfrmFileNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsMcMnfrmFileNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsMcMnfrmFileNam+targetIndex,targetLen);
    
   }
	public short getTarafxsCyclNum() throws CFException {
        if (isTarafxsCyclNumModified()) { 
           tarafxsCyclNum = refreshTarafxsCyclNum();
        }
   		return tarafxsCyclNum;
	}
	
	/**
	 * 	Update TarafxsCyclNum with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-CYCL-NUM
	 *	@param number
	 */
	public void setTarafxsCyclNum(short number) {
			tarafxsCyclNum = checkTarafxsCyclNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxsCyclNum(tarafxsCyclNum);
	}

	public void setTarafxsCyclNum(int number) {
	    number = checkTarafxsCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsCyclNum((short)number);
	}
	public void setTarafxsCyclNum(long number) {
	    number = checkTarafxsCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsCyclNum((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsBusPrtnrId
	 *	@return tarafxsBusPrtnrId
	 */
   public char[] getTarafxsBusPrtnrId() throws CFException{
     if (isTarafxsBusPrtnrIdModified()) { 
        tarafxsBusPrtnrId = refreshTarafxsBusPrtnrId();
     }
   		return tarafxsBusPrtnrId;
   }

  
	/**
	*  set variable tarafxsBusPrtnrId
	*  Corresponding COBOL Variable is TARAFXS-BUS-PRTNR-ID
	*  @param value
	**/
   public void setTarafxsBusPrtnrId(char[] value) {
      tarafxsBusPrtnrId = checkTarafxsBusPrtnrIdConstraints(value);
      serializeTarafxsBusPrtnrId(tarafxsBusPrtnrId);
   } 

     /**
	 * 	Update TarafxsBusPrtnrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsBusPrtnrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsBusPrtnrId,tarafxsBusPrtnrId.length);
   	
   }
   
   public void setTarafxsBusPrtnrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsBusPrtnrId,tarafxsBusPrtnrId.length);
   	
   }
   
     /**
	 * 	Update TarafxsBusPrtnrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsBusPrtnrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsBusPrtnrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsBusPrtnrId with another Field
	 *	@param value
	 */
   public void setTarafxsBusPrtnrId(Field source) {
       replace(source,0,source.length(),beginTarafxsBusPrtnrId,TARAFXS_BUS_PRTNR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsBusPrtnrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsBusPrtnrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsBusPrtnrId,TARAFXS_BUS_PRTNR_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsBusPrtnrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsBusPrtnrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsBusPrtnrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsEndptId
	 *	@return tarafxsEndptId
	 */
   public char[] getTarafxsEndptId() throws CFException{
     if (isTarafxsEndptIdModified()) { 
        tarafxsEndptId = refreshTarafxsEndptId();
     }
   		return tarafxsEndptId;
   }

  
	/**
	*  set variable tarafxsEndptId
	*  Corresponding COBOL Variable is TARAFXS-ENDPT-ID
	*  @param value
	**/
   public void setTarafxsEndptId(char[] value) {
      tarafxsEndptId = checkTarafxsEndptIdConstraints(value);
      serializeTarafxsEndptId(tarafxsEndptId);
   } 

     /**
	 * 	Update TarafxsEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsEndptId,tarafxsEndptId.length);
   	
   }
   
   public void setTarafxsEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsEndptId,tarafxsEndptId.length);
   	
   }
   
     /**
	 * 	Update TarafxsEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsEndptId with another Field
	 *	@param value
	 */
   public void setTarafxsEndptId(Field source) {
       replace(source,0,source.length(),beginTarafxsEndptId,TARAFXS_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsEndptId,TARAFXS_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsEndptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsXferMthdCd
	 *	@return tarafxsXferMthdCd
	 */
   public char[] getTarafxsXferMthdCd() throws CFException{
     if (isTarafxsXferMthdCdModified()) { 
        tarafxsXferMthdCd = refreshTarafxsXferMthdCd();
     }
   		return tarafxsXferMthdCd;
   }

  
	/**
	*  set variable tarafxsXferMthdCd
	*  Corresponding COBOL Variable is TARAFXS-XFER-MTHD-CD
	*  @param value
	**/
   public void setTarafxsXferMthdCd(char[] value) {
      tarafxsXferMthdCd = checkTarafxsXferMthdCdConstraints(value);
      serializeTarafxsXferMthdCd(tarafxsXferMthdCd);
   } 

     /**
	 * 	Update TarafxsXferMthdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsXferMthdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsXferMthdCd,tarafxsXferMthdCd.length);
   	
   }
   
   public void setTarafxsXferMthdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferMthdCd,tarafxsXferMthdCd.length);
   	
   }
   
     /**
	 * 	Update TarafxsXferMthdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferMthdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferMthdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsXferMthdCd with another Field
	 *	@param value
	 */
   public void setTarafxsXferMthdCd(Field source) {
       replace(source,0,source.length(),beginTarafxsXferMthdCd,TARAFXS_XFER_MTHD_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsXferMthdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsXferMthdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsXferMthdCd,TARAFXS_XFER_MTHD_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsXferMthdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferMthdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferMthdCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsAvailTs
	 *	@return tarafxsAvailTs
	 */
   public char[] getTarafxsAvailTs() throws CFException{
     if (isTarafxsAvailTsModified()) { 
        tarafxsAvailTs = refreshTarafxsAvailTs();
     }
   		return tarafxsAvailTs;
   }

  
	/**
	*  set variable tarafxsAvailTs
	*  Corresponding COBOL Variable is TARAFXS-AVAIL-TS
	*  @param value
	**/
   public void setTarafxsAvailTs(char[] value) {
      tarafxsAvailTs = checkTarafxsAvailTsConstraints(value);
      serializeTarafxsAvailTs(tarafxsAvailTs);
   } 

     /**
	 * 	Update TarafxsAvailTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsAvailTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsAvailTs,tarafxsAvailTs.length);
   	
   }
   
   public void setTarafxsAvailTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsAvailTs,tarafxsAvailTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsAvailTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsAvailTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsAvailTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsAvailTs with another Field
	 *	@param value
	 */
   public void setTarafxsAvailTs(Field source) {
       replace(source,0,source.length(),beginTarafxsAvailTs,TARAFXS_AVAIL_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsAvailTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsAvailTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsAvailTs,TARAFXS_AVAIL_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsAvailTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsAvailTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsAvailTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsBulkId
	 *	@return tarafxsBulkId
	 */
   public char[] getTarafxsBulkId() throws CFException{
     if (isTarafxsBulkIdModified()) { 
        tarafxsBulkId = refreshTarafxsBulkId();
     }
   		return tarafxsBulkId;
   }

  
	/**
	*  set variable tarafxsBulkId
	*  Corresponding COBOL Variable is TARAFXS-BULK-ID
	*  @param value
	**/
   public void setTarafxsBulkId(char[] value) {
      tarafxsBulkId = checkTarafxsBulkIdConstraints(value);
      serializeTarafxsBulkId(tarafxsBulkId);
   } 

     /**
	 * 	Update TarafxsBulkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsBulkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsBulkId,tarafxsBulkId.length);
   	
   }
   
   public void setTarafxsBulkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsBulkId,tarafxsBulkId.length);
   	
   }
   
     /**
	 * 	Update TarafxsBulkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsBulkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsBulkId with another Field
	 *	@param value
	 */
   public void setTarafxsBulkId(Field source) {
       replace(source,0,source.length(),beginTarafxsBulkId,TARAFXS_BULK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsBulkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsBulkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsBulkId,TARAFXS_BULK_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsBulkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsStatCd
	 *	@return tarafxsStatCd
	 */
   public char[] getTarafxsStatCd() throws CFException{
     if (isTarafxsStatCdModified()) { 
        tarafxsStatCd = refreshTarafxsStatCd();
     }
   		return tarafxsStatCd;
   }

  
	/**
	*  set variable tarafxsStatCd
	*  Corresponding COBOL Variable is TARAFXS-STAT-CD
	*  @param value
	**/
   public void setTarafxsStatCd(char[] value) {
      tarafxsStatCd = checkTarafxsStatCdConstraints(value);
      serializeTarafxsStatCd(tarafxsStatCd);
   } 

     /**
	 * 	Update TarafxsStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsStatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsStatCd,tarafxsStatCd.length);
   	
   }
   
   public void setTarafxsStatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsStatCd,tarafxsStatCd.length);
   	
   }
   
     /**
	 * 	Update TarafxsStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsStatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsStatCd with another Field
	 *	@param value
	 */
   public void setTarafxsStatCd(Field source) {
       replace(source,0,source.length(),beginTarafxsStatCd,TARAFXS_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsStatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsStatCd,TARAFXS_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsStatCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsSndRcvPrmsnCd
	 *	@return tarafxsSndRcvPrmsnCd
	 */
   public char[] getTarafxsSndRcvPrmsnCd() throws CFException{
     if (isTarafxsSndRcvPrmsnCdModified()) { 
        tarafxsSndRcvPrmsnCd = refreshTarafxsSndRcvPrmsnCd();
     }
   		return tarafxsSndRcvPrmsnCd;
   }

  
	/**
	*  set variable tarafxsSndRcvPrmsnCd
	*  Corresponding COBOL Variable is TARAFXS-SND-RCV-PRMSN-CD
	*  @param value
	**/
   public void setTarafxsSndRcvPrmsnCd(char[] value) {
      tarafxsSndRcvPrmsnCd = checkTarafxsSndRcvPrmsnCdConstraints(value);
      serializeTarafxsSndRcvPrmsnCd(tarafxsSndRcvPrmsnCd);
   } 

     /**
	 * 	Update TarafxsSndRcvPrmsnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsSndRcvPrmsnCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsSndRcvPrmsnCd,tarafxsSndRcvPrmsnCd.length);
   	
   }
   
   public void setTarafxsSndRcvPrmsnCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSndRcvPrmsnCd,tarafxsSndRcvPrmsnCd.length);
   	
   }
   
     /**
	 * 	Update TarafxsSndRcvPrmsnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSndRcvPrmsnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSndRcvPrmsnCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsSndRcvPrmsnCd with another Field
	 *	@param value
	 */
   public void setTarafxsSndRcvPrmsnCd(Field source) {
       replace(source,0,source.length(),beginTarafxsSndRcvPrmsnCd,TARAFXS_SND_RCV_PRMSN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsSndRcvPrmsnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsSndRcvPrmsnCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsSndRcvPrmsnCd,TARAFXS_SND_RCV_PRMSN_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsSndRcvPrmsnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSndRcvPrmsnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSndRcvPrmsnCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsMcibdioParmTxt
	 *	@return tarafxsMcibdioParmTxt
	 */
   public char[] getTarafxsMcibdioParmTxt() throws CFException{
     if (isTarafxsMcibdioParmTxtModified()) { 
        tarafxsMcibdioParmTxt = refreshTarafxsMcibdioParmTxt();
     }
   		return tarafxsMcibdioParmTxt;
   }

  
	/**
	*  set variable tarafxsMcibdioParmTxt
	*  Corresponding COBOL Variable is TARAFXS-MCIBDIO-PARM-TXT
	*  @param value
	**/
   public void setTarafxsMcibdioParmTxt(char[] value) {
      tarafxsMcibdioParmTxt = checkTarafxsMcibdioParmTxtConstraints(value);
      serializeTarafxsMcibdioParmTxt(tarafxsMcibdioParmTxt);
   } 

     /**
	 * 	Update TarafxsMcibdioParmTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsMcibdioParmTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsMcibdioParmTxt,tarafxsMcibdioParmTxt.length);
   	
   }
   
   public void setTarafxsMcibdioParmTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsMcibdioParmTxt,tarafxsMcibdioParmTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxsMcibdioParmTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsMcibdioParmTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsMcibdioParmTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsMcibdioParmTxt with another Field
	 *	@param value
	 */
   public void setTarafxsMcibdioParmTxt(Field source) {
       replace(source,0,source.length(),beginTarafxsMcibdioParmTxt,TARAFXS_MCIBDIO_PARM_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsMcibdioParmTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsMcibdioParmTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsMcibdioParmTxt,TARAFXS_MCIBDIO_PARM_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsMcibdioParmTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsMcibdioParmTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsMcibdioParmTxt+targetIndex,targetLen);
    
   }
	public short getTarafxsPrtyNum() throws CFException {
        if (isTarafxsPrtyNumModified()) { 
           tarafxsPrtyNum = refreshTarafxsPrtyNum();
        }
   		return tarafxsPrtyNum;
	}
	
	/**
	 * 	Update TarafxsPrtyNum with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-PRTY-NUM
	 *	@param number
	 */
	public void setTarafxsPrtyNum(short number) {
			tarafxsPrtyNum = checkTarafxsPrtyNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxsPrtyNum(tarafxsPrtyNum);
	}

	public void setTarafxsPrtyNum(int number) {
	    number = checkTarafxsPrtyNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrtyNum((short)number);
	}
	public void setTarafxsPrtyNum(long number) {
	    number = checkTarafxsPrtyNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrtyNum((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsArchLocTxt
	 *	@return tarafxsArchLocTxt
	 */
   public char[] getTarafxsArchLocTxt() throws CFException{
     if (isTarafxsArchLocTxtModified()) { 
        tarafxsArchLocTxt = refreshTarafxsArchLocTxt();
     }
   		return tarafxsArchLocTxt;
   }

  
	/**
	*  set variable tarafxsArchLocTxt
	*  Corresponding COBOL Variable is TARAFXS-ARCH-LOC-TXT
	*  @param value
	**/
   public void setTarafxsArchLocTxt(char[] value) {
      tarafxsArchLocTxt = checkTarafxsArchLocTxtConstraints(value);
      serializeTarafxsArchLocTxt(tarafxsArchLocTxt);
   } 

     /**
	 * 	Update TarafxsArchLocTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsArchLocTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsArchLocTxt,tarafxsArchLocTxt.length);
   	
   }
   
   public void setTarafxsArchLocTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsArchLocTxt,tarafxsArchLocTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxsArchLocTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsArchLocTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsArchLocTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsArchLocTxt with another Field
	 *	@param value
	 */
   public void setTarafxsArchLocTxt(Field source) {
       replace(source,0,source.length(),beginTarafxsArchLocTxt,TARAFXS_ARCH_LOC_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsArchLocTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsArchLocTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsArchLocTxt,TARAFXS_ARCH_LOC_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsArchLocTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsArchLocTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsArchLocTxt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsSvrFileStatCd
	 *	@return tarafxsSvrFileStatCd
	 */
   public char[] getTarafxsSvrFileStatCd() throws CFException{
     if (isTarafxsSvrFileStatCdModified()) { 
        tarafxsSvrFileStatCd = refreshTarafxsSvrFileStatCd();
     }
   		return tarafxsSvrFileStatCd;
   }

  
	/**
	*  set variable tarafxsSvrFileStatCd
	*  Corresponding COBOL Variable is TARAFXS-SVR-FILE-STAT-CD
	*  @param value
	**/
   public void setTarafxsSvrFileStatCd(char[] value) {
      tarafxsSvrFileStatCd = checkTarafxsSvrFileStatCdConstraints(value);
      serializeTarafxsSvrFileStatCd(tarafxsSvrFileStatCd);
   } 

     /**
	 * 	Update TarafxsSvrFileStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsSvrFileStatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsSvrFileStatCd,tarafxsSvrFileStatCd.length);
   	
   }
   
   public void setTarafxsSvrFileStatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSvrFileStatCd,tarafxsSvrFileStatCd.length);
   	
   }
   
     /**
	 * 	Update TarafxsSvrFileStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSvrFileStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSvrFileStatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsSvrFileStatCd with another Field
	 *	@param value
	 */
   public void setTarafxsSvrFileStatCd(Field source) {
       replace(source,0,source.length(),beginTarafxsSvrFileStatCd,TARAFXS_SVR_FILE_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsSvrFileStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsSvrFileStatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsSvrFileStatCd,TARAFXS_SVR_FILE_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsSvrFileStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSvrFileStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSvrFileStatCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsLstStatTs
	 *	@return tarafxsLstStatTs
	 */
   public char[] getTarafxsLstStatTs() throws CFException{
     if (isTarafxsLstStatTsModified()) { 
        tarafxsLstStatTs = refreshTarafxsLstStatTs();
     }
   		return tarafxsLstStatTs;
   }

  
	/**
	*  set variable tarafxsLstStatTs
	*  Corresponding COBOL Variable is TARAFXS-LST-STAT-TS
	*  @param value
	**/
   public void setTarafxsLstStatTs(char[] value) {
      tarafxsLstStatTs = checkTarafxsLstStatTsConstraints(value);
      serializeTarafxsLstStatTs(tarafxsLstStatTs);
   } 

     /**
	 * 	Update TarafxsLstStatTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsLstStatTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsLstStatTs,tarafxsLstStatTs.length);
   	
   }
   
   public void setTarafxsLstStatTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsLstStatTs,tarafxsLstStatTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsLstStatTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsLstStatTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsLstStatTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsLstStatTs with another Field
	 *	@param value
	 */
   public void setTarafxsLstStatTs(Field source) {
       replace(source,0,source.length(),beginTarafxsLstStatTs,TARAFXS_LST_STAT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsLstStatTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsLstStatTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsLstStatTs,TARAFXS_LST_STAT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsLstStatTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsLstStatTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsLstStatTs+targetIndex,targetLen);
    
   }
	public long getTarafxsXferFileSzNum() throws CFException {
        if (isTarafxsXferFileSzNumModified()) { 
           tarafxsXferFileSzNum = refreshTarafxsXferFileSzNum();
        }
   		return tarafxsXferFileSzNum;
	}
	
	/**
	 * 	Update TarafxsXferFileSzNum with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-XFER-FILE-SZ-NUM
	 *	@param number
	 */
	public void setTarafxsXferFileSzNum(long number) {
			tarafxsXferFileSzNum = checkTarafxsXferFileSzNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxsXferFileSzNum(tarafxsXferFileSzNum);
	}


	public int getTarafxsTmsXferdCnt() throws CFException {
        if (isTarafxsTmsXferdCntModified()) { 
           tarafxsTmsXferdCnt = refreshTarafxsTmsXferdCnt();
        }
   		return tarafxsTmsXferdCnt;
	}
	
	/**
	 * 	Update TarafxsTmsXferdCnt with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TMS-XFERD-CNT
	 *	@param number
	 */
	public void setTarafxsTmsXferdCnt(int number) {
			tarafxsTmsXferdCnt = checkTarafxsTmsXferdCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxsTmsXferdCnt(tarafxsTmsXferdCnt);
	}


	public void setTarafxsTmsXferdCnt(long number) {
	    number = checkTarafxsTmsXferdCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTarafxsTmsXferdCnt((int)number);
	}
	
	public long getTarafxsXferRecCnt() throws CFException {
        if (isTarafxsXferRecCntModified()) { 
           tarafxsXferRecCnt = refreshTarafxsXferRecCnt();
        }
   		return tarafxsXferRecCnt;
	}
	
	/**
	 * 	Update TarafxsXferRecCnt with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-XFER-REC-CNT
	 *	@param number
	 */
	public void setTarafxsXferRecCnt(long number) {
			tarafxsXferRecCnt = checkTarafxsXferRecCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxsXferRecCnt(tarafxsXferRecCnt);
	}


	/**
	 *	Returns the value of tarafxsXferRqstTs
	 *	@return tarafxsXferRqstTs
	 */
   public char[] getTarafxsXferRqstTs() throws CFException{
     if (isTarafxsXferRqstTsModified()) { 
        tarafxsXferRqstTs = refreshTarafxsXferRqstTs();
     }
   		return tarafxsXferRqstTs;
   }

  
	/**
	*  set variable tarafxsXferRqstTs
	*  Corresponding COBOL Variable is TARAFXS-XFER-RQST-TS
	*  @param value
	**/
   public void setTarafxsXferRqstTs(char[] value) {
      tarafxsXferRqstTs = checkTarafxsXferRqstTsConstraints(value);
      serializeTarafxsXferRqstTs(tarafxsXferRqstTs);
   } 

     /**
	 * 	Update TarafxsXferRqstTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsXferRqstTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsXferRqstTs,tarafxsXferRqstTs.length);
   	
   }
   
   public void setTarafxsXferRqstTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferRqstTs,tarafxsXferRqstTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsXferRqstTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferRqstTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferRqstTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsXferRqstTs with another Field
	 *	@param value
	 */
   public void setTarafxsXferRqstTs(Field source) {
       replace(source,0,source.length(),beginTarafxsXferRqstTs,TARAFXS_XFER_RQST_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsXferRqstTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsXferRqstTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsXferRqstTs,TARAFXS_XFER_RQST_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsXferRqstTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferRqstTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferRqstTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsXferStrtTs
	 *	@return tarafxsXferStrtTs
	 */
   public char[] getTarafxsXferStrtTs() throws CFException{
     if (isTarafxsXferStrtTsModified()) { 
        tarafxsXferStrtTs = refreshTarafxsXferStrtTs();
     }
   		return tarafxsXferStrtTs;
   }

  
	/**
	*  set variable tarafxsXferStrtTs
	*  Corresponding COBOL Variable is TARAFXS-XFER-STRT-TS
	*  @param value
	**/
   public void setTarafxsXferStrtTs(char[] value) {
      tarafxsXferStrtTs = checkTarafxsXferStrtTsConstraints(value);
      serializeTarafxsXferStrtTs(tarafxsXferStrtTs);
   } 

     /**
	 * 	Update TarafxsXferStrtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsXferStrtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsXferStrtTs,tarafxsXferStrtTs.length);
   	
   }
   
   public void setTarafxsXferStrtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferStrtTs,tarafxsXferStrtTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsXferStrtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferStrtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferStrtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsXferStrtTs with another Field
	 *	@param value
	 */
   public void setTarafxsXferStrtTs(Field source) {
       replace(source,0,source.length(),beginTarafxsXferStrtTs,TARAFXS_XFER_STRT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsXferStrtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsXferStrtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsXferStrtTs,TARAFXS_XFER_STRT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsXferStrtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferStrtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferStrtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsXferStopTs
	 *	@return tarafxsXferStopTs
	 */
   public char[] getTarafxsXferStopTs() throws CFException{
     if (isTarafxsXferStopTsModified()) { 
        tarafxsXferStopTs = refreshTarafxsXferStopTs();
     }
   		return tarafxsXferStopTs;
   }

  
	/**
	*  set variable tarafxsXferStopTs
	*  Corresponding COBOL Variable is TARAFXS-XFER-STOP-TS
	*  @param value
	**/
   public void setTarafxsXferStopTs(char[] value) {
      tarafxsXferStopTs = checkTarafxsXferStopTsConstraints(value);
      serializeTarafxsXferStopTs(tarafxsXferStopTs);
   } 

     /**
	 * 	Update TarafxsXferStopTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsXferStopTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsXferStopTs,tarafxsXferStopTs.length);
   	
   }
   
   public void setTarafxsXferStopTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferStopTs,tarafxsXferStopTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsXferStopTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferStopTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferStopTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsXferStopTs with another Field
	 *	@param value
	 */
   public void setTarafxsXferStopTs(Field source) {
       replace(source,0,source.length(),beginTarafxsXferStopTs,TARAFXS_XFER_STOP_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsXferStopTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsXferStopTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsXferStopTs,TARAFXS_XFER_STOP_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsXferStopTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferStopTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferStopTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsXferRdyTs
	 *	@return tarafxsXferRdyTs
	 */
   public char[] getTarafxsXferRdyTs() throws CFException{
     if (isTarafxsXferRdyTsModified()) { 
        tarafxsXferRdyTs = refreshTarafxsXferRdyTs();
     }
   		return tarafxsXferRdyTs;
   }

  
	/**
	*  set variable tarafxsXferRdyTs
	*  Corresponding COBOL Variable is TARAFXS-XFER-RDY-TS
	*  @param value
	**/
   public void setTarafxsXferRdyTs(char[] value) {
      tarafxsXferRdyTs = checkTarafxsXferRdyTsConstraints(value);
      serializeTarafxsXferRdyTs(tarafxsXferRdyTs);
   } 

     /**
	 * 	Update TarafxsXferRdyTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsXferRdyTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsXferRdyTs,tarafxsXferRdyTs.length);
   	
   }
   
   public void setTarafxsXferRdyTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferRdyTs,tarafxsXferRdyTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsXferRdyTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferRdyTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferRdyTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsXferRdyTs with another Field
	 *	@param value
	 */
   public void setTarafxsXferRdyTs(Field source) {
       replace(source,0,source.length(),beginTarafxsXferRdyTs,TARAFXS_XFER_RDY_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsXferRdyTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsXferRdyTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsXferRdyTs,TARAFXS_XFER_RDY_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsXferRdyTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferRdyTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferRdyTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsXferCondCd
	 *	@return tarafxsXferCondCd
	 */
   public char[] getTarafxsXferCondCd() throws CFException{
     if (isTarafxsXferCondCdModified()) { 
        tarafxsXferCondCd = refreshTarafxsXferCondCd();
     }
   		return tarafxsXferCondCd;
   }

  
	/**
	*  set variable tarafxsXferCondCd
	*  Corresponding COBOL Variable is TARAFXS-XFER-COND-CD
	*  @param value
	**/
   public void setTarafxsXferCondCd(char[] value) {
      tarafxsXferCondCd = checkTarafxsXferCondCdConstraints(value);
      serializeTarafxsXferCondCd(tarafxsXferCondCd);
   } 

     /**
	 * 	Update TarafxsXferCondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsXferCondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsXferCondCd,tarafxsXferCondCd.length);
   	
   }
   
   public void setTarafxsXferCondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferCondCd,tarafxsXferCondCd.length);
   	
   }
   
     /**
	 * 	Update TarafxsXferCondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferCondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferCondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsXferCondCd with another Field
	 *	@param value
	 */
   public void setTarafxsXferCondCd(Field source) {
       replace(source,0,source.length(),beginTarafxsXferCondCd,TARAFXS_XFER_COND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsXferCondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsXferCondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsXferCondCd,TARAFXS_XFER_COND_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsXferCondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferCondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferCondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsXferStatTxt
	 *	@return tarafxsXferStatTxt
	 */
   public char[] getTarafxsXferStatTxt() throws CFException{
     if (isTarafxsXferStatTxtModified()) { 
        tarafxsXferStatTxt = refreshTarafxsXferStatTxt();
     }
   		return tarafxsXferStatTxt;
   }

  
	/**
	*  set variable tarafxsXferStatTxt
	*  Corresponding COBOL Variable is TARAFXS-XFER-STAT-TXT
	*  @param value
	**/
   public void setTarafxsXferStatTxt(char[] value) {
      tarafxsXferStatTxt = checkTarafxsXferStatTxtConstraints(value);
      serializeTarafxsXferStatTxt(tarafxsXferStatTxt);
   } 

     /**
	 * 	Update TarafxsXferStatTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsXferStatTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsXferStatTxt,tarafxsXferStatTxt.length);
   	
   }
   
   public void setTarafxsXferStatTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferStatTxt,tarafxsXferStatTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxsXferStatTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferStatTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferStatTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsXferStatTxt with another Field
	 *	@param value
	 */
   public void setTarafxsXferStatTxt(Field source) {
       replace(source,0,source.length(),beginTarafxsXferStatTxt,TARAFXS_XFER_STAT_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsXferStatTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsXferStatTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsXferStatTxt,TARAFXS_XFER_STAT_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsXferStatTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsXferStatTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsXferStatTxt+targetIndex,targetLen);
    
   }
	public long getTarafxsXferPrcssId() throws CFException {
        if (isTarafxsXferPrcssIdModified()) { 
           tarafxsXferPrcssId = refreshTarafxsXferPrcssId();
        }
   		return tarafxsXferPrcssId;
	}
	
	/**
	 * 	Update TarafxsXferPrcssId with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-XFER-PRCSS-ID
	 *	@param number
	 */
	public void setTarafxsXferPrcssId(long number) {
			tarafxsXferPrcssId = checkTarafxsXferPrcssIdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxsXferPrcssId(tarafxsXferPrcssId);
	}


	public long getTarafxsOrgXferPrcsId() throws CFException {
        if (isTarafxsOrgXferPrcsIdModified()) { 
           tarafxsOrgXferPrcsId = refreshTarafxsOrgXferPrcsId();
        }
   		return tarafxsOrgXferPrcsId;
	}
	
	/**
	 * 	Update TarafxsOrgXferPrcsId with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-ORG-XFER-PRCS-ID
	 *	@param number
	 */
	public void setTarafxsOrgXferPrcsId(long number) {
			tarafxsOrgXferPrcsId = checkTarafxsOrgXferPrcsIdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxsOrgXferPrcsId(tarafxsOrgXferPrcsId);
	}


	/**
	 *	Returns the value of tarafxsTrgrCondCd
	 *	@return tarafxsTrgrCondCd
	 */
   public char[] getTarafxsTrgrCondCd() throws CFException{
     if (isTarafxsTrgrCondCdModified()) { 
        tarafxsTrgrCondCd = refreshTarafxsTrgrCondCd();
     }
   		return tarafxsTrgrCondCd;
   }

  
	/**
	*  set variable tarafxsTrgrCondCd
	*  Corresponding COBOL Variable is TARAFXS-TRGR-COND-CD
	*  @param value
	**/
   public void setTarafxsTrgrCondCd(char[] value) {
      tarafxsTrgrCondCd = checkTarafxsTrgrCondCdConstraints(value);
      serializeTarafxsTrgrCondCd(tarafxsTrgrCondCd);
   } 

     /**
	 * 	Update TarafxsTrgrCondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTrgrCondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsTrgrCondCd,tarafxsTrgrCondCd.length);
   	
   }
   
   public void setTarafxsTrgrCondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgrCondCd,tarafxsTrgrCondCd.length);
   	
   }
   
     /**
	 * 	Update TarafxsTrgrCondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgrCondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgrCondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsTrgrCondCd with another Field
	 *	@param value
	 */
   public void setTarafxsTrgrCondCd(Field source) {
       replace(source,0,source.length(),beginTarafxsTrgrCondCd,TARAFXS_TRGR_COND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsTrgrCondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsTrgrCondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsTrgrCondCd,TARAFXS_TRGR_COND_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsTrgrCondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgrCondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgrCondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsTrgrStatTxt
	 *	@return tarafxsTrgrStatTxt
	 */
   public char[] getTarafxsTrgrStatTxt() throws CFException{
     if (isTarafxsTrgrStatTxtModified()) { 
        tarafxsTrgrStatTxt = refreshTarafxsTrgrStatTxt();
     }
   		return tarafxsTrgrStatTxt;
   }

  
	/**
	*  set variable tarafxsTrgrStatTxt
	*  Corresponding COBOL Variable is TARAFXS-TRGR-STAT-TXT
	*  @param value
	**/
   public void setTarafxsTrgrStatTxt(char[] value) {
      tarafxsTrgrStatTxt = checkTarafxsTrgrStatTxtConstraints(value);
      serializeTarafxsTrgrStatTxt(tarafxsTrgrStatTxt);
   } 

     /**
	 * 	Update TarafxsTrgrStatTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTrgrStatTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsTrgrStatTxt,tarafxsTrgrStatTxt.length);
   	
   }
   
   public void setTarafxsTrgrStatTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgrStatTxt,tarafxsTrgrStatTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxsTrgrStatTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgrStatTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgrStatTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsTrgrStatTxt with another Field
	 *	@param value
	 */
   public void setTarafxsTrgrStatTxt(Field source) {
       replace(source,0,source.length(),beginTarafxsTrgrStatTxt,TARAFXS_TRGR_STAT_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsTrgrStatTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsTrgrStatTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsTrgrStatTxt,TARAFXS_TRGR_STAT_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsTrgrStatTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgrStatTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgrStatTxt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsOrgLocNam
	 *	@return tarafxsOrgLocNam
	 */
   public char[] getTarafxsOrgLocNam() throws CFException{
     if (isTarafxsOrgLocNamModified()) { 
        tarafxsOrgLocNam = refreshTarafxsOrgLocNam();
     }
   		return tarafxsOrgLocNam;
   }

  
	/**
	*  set variable tarafxsOrgLocNam
	*  Corresponding COBOL Variable is TARAFXS-ORG-LOC-NAM
	*  @param value
	**/
   public void setTarafxsOrgLocNam(char[] value) {
      tarafxsOrgLocNam = checkTarafxsOrgLocNamConstraints(value);
      serializeTarafxsOrgLocNam(tarafxsOrgLocNam);
   } 

     /**
	 * 	Update TarafxsOrgLocNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsOrgLocNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsOrgLocNam,tarafxsOrgLocNam.length);
   	
   }
   
   public void setTarafxsOrgLocNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsOrgLocNam,tarafxsOrgLocNam.length);
   	
   }
   
     /**
	 * 	Update TarafxsOrgLocNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsOrgLocNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsOrgLocNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsOrgLocNam with another Field
	 *	@param value
	 */
   public void setTarafxsOrgLocNam(Field source) {
       replace(source,0,source.length(),beginTarafxsOrgLocNam,TARAFXS_ORG_LOC_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsOrgLocNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsOrgLocNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsOrgLocNam,TARAFXS_ORG_LOC_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsOrgLocNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsOrgLocNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsOrgLocNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsLstUpdtUserId
	 *	@return tarafxsLstUpdtUserId
	 */
   public char[] getTarafxsLstUpdtUserId() throws CFException{
     if (isTarafxsLstUpdtUserIdModified()) { 
        tarafxsLstUpdtUserId = refreshTarafxsLstUpdtUserId();
     }
   		return tarafxsLstUpdtUserId;
   }

  
	/**
	*  set variable tarafxsLstUpdtUserId
	*  Corresponding COBOL Variable is TARAFXS-LST-UPDT-USER-ID
	*  @param value
	**/
   public void setTarafxsLstUpdtUserId(char[] value) {
      tarafxsLstUpdtUserId = checkTarafxsLstUpdtUserIdConstraints(value);
      serializeTarafxsLstUpdtUserId(tarafxsLstUpdtUserId);
   } 

     /**
	 * 	Update TarafxsLstUpdtUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsLstUpdtUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsLstUpdtUserId,tarafxsLstUpdtUserId.length);
   	
   }
   
   public void setTarafxsLstUpdtUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsLstUpdtUserId,tarafxsLstUpdtUserId.length);
   	
   }
   
     /**
	 * 	Update TarafxsLstUpdtUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsLstUpdtUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsLstUpdtUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsLstUpdtUserId with another Field
	 *	@param value
	 */
   public void setTarafxsLstUpdtUserId(Field source) {
       replace(source,0,source.length(),beginTarafxsLstUpdtUserId,TARAFXS_LST_UPDT_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsLstUpdtUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsLstUpdtUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsLstUpdtUserId,TARAFXS_LST_UPDT_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsLstUpdtUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsLstUpdtUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsLstUpdtUserId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsLstUpdtTs
	 *	@return tarafxsLstUpdtTs
	 */
   public char[] getTarafxsLstUpdtTs() throws CFException{
     if (isTarafxsLstUpdtTsModified()) { 
        tarafxsLstUpdtTs = refreshTarafxsLstUpdtTs();
     }
   		return tarafxsLstUpdtTs;
   }

  
	/**
	*  set variable tarafxsLstUpdtTs
	*  Corresponding COBOL Variable is TARAFXS-LST-UPDT-TS
	*  @param value
	**/
   public void setTarafxsLstUpdtTs(char[] value) {
      tarafxsLstUpdtTs = checkTarafxsLstUpdtTsConstraints(value);
      serializeTarafxsLstUpdtTs(tarafxsLstUpdtTs);
   } 

     /**
	 * 	Update TarafxsLstUpdtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsLstUpdtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsLstUpdtTs,tarafxsLstUpdtTs.length);
   	
   }
   
   public void setTarafxsLstUpdtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsLstUpdtTs,tarafxsLstUpdtTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsLstUpdtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsLstUpdtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsLstUpdtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsLstUpdtTs with another Field
	 *	@param value
	 */
   public void setTarafxsLstUpdtTs(Field source) {
       replace(source,0,source.length(),beginTarafxsLstUpdtTs,TARAFXS_LST_UPDT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsLstUpdtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsLstUpdtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsLstUpdtTs,TARAFXS_LST_UPDT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsLstUpdtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsLstUpdtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsLstUpdtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsTrgrActNam
	 *	@return tarafxsTrgrActNam
	 */
   public char[] getTarafxsTrgrActNam() throws CFException{
     if (isTarafxsTrgrActNamModified()) { 
        tarafxsTrgrActNam = refreshTarafxsTrgrActNam();
     }
   		return tarafxsTrgrActNam;
   }

  
	/**
	*  set variable tarafxsTrgrActNam
	*  Corresponding COBOL Variable is TARAFXS-TRGR-ACT-NAM
	*  @param value
	**/
   public void setTarafxsTrgrActNam(char[] value) {
      tarafxsTrgrActNam = checkTarafxsTrgrActNamConstraints(value);
      serializeTarafxsTrgrActNam(tarafxsTrgrActNam);
   } 

     /**
	 * 	Update TarafxsTrgrActNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTrgrActNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsTrgrActNam,tarafxsTrgrActNam.length);
   	
   }
   
   public void setTarafxsTrgrActNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgrActNam,tarafxsTrgrActNam.length);
   	
   }
   
     /**
	 * 	Update TarafxsTrgrActNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgrActNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgrActNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsTrgrActNam with another Field
	 *	@param value
	 */
   public void setTarafxsTrgrActNam(Field source) {
       replace(source,0,source.length(),beginTarafxsTrgrActNam,TARAFXS_TRGR_ACT_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsTrgrActNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsTrgrActNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsTrgrActNam,TARAFXS_TRGR_ACT_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsTrgrActNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgrActNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgrActNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsPrvMnfrmFileNam
	 *	@return tarafxsPrvMnfrmFileNam
	 */
   public char[] getTarafxsPrvMnfrmFileNam() throws CFException{
     if (isTarafxsPrvMnfrmFileNamModified()) { 
        tarafxsPrvMnfrmFileNam = refreshTarafxsPrvMnfrmFileNam();
     }
   		return tarafxsPrvMnfrmFileNam;
   }

  
	/**
	*  set variable tarafxsPrvMnfrmFileNam
	*  Corresponding COBOL Variable is TARAFXS-PRV-MNFRM-FILE-NAM
	*  @param value
	**/
   public void setTarafxsPrvMnfrmFileNam(char[] value) {
      tarafxsPrvMnfrmFileNam = checkTarafxsPrvMnfrmFileNamConstraints(value);
      serializeTarafxsPrvMnfrmFileNam(tarafxsPrvMnfrmFileNam);
   } 

     /**
	 * 	Update TarafxsPrvMnfrmFileNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsPrvMnfrmFileNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsPrvMnfrmFileNam,tarafxsPrvMnfrmFileNam.length);
   	
   }
   
   public void setTarafxsPrvMnfrmFileNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsPrvMnfrmFileNam,tarafxsPrvMnfrmFileNam.length);
   	
   }
   
     /**
	 * 	Update TarafxsPrvMnfrmFileNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsPrvMnfrmFileNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsPrvMnfrmFileNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsPrvMnfrmFileNam with another Field
	 *	@param value
	 */
   public void setTarafxsPrvMnfrmFileNam(Field source) {
       replace(source,0,source.length(),beginTarafxsPrvMnfrmFileNam,TARAFXS_PRV_MNFRM_FILE_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsPrvMnfrmFileNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsPrvMnfrmFileNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsPrvMnfrmFileNam,TARAFXS_PRV_MNFRM_FILE_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsPrvMnfrmFileNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsPrvMnfrmFileNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsPrvMnfrmFileNam+targetIndex,targetLen);
    
   }
	public short getTarafxsPrvCyclNum() throws CFException {
        if (isTarafxsPrvCyclNumModified()) { 
           tarafxsPrvCyclNum = refreshTarafxsPrvCyclNum();
        }
   		return tarafxsPrvCyclNum;
	}
	
	/**
	 * 	Update TarafxsPrvCyclNum with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-PRV-CYCL-NUM
	 *	@param number
	 */
	public void setTarafxsPrvCyclNum(short number) {
			tarafxsPrvCyclNum = checkTarafxsPrvCyclNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxsPrvCyclNum(tarafxsPrvCyclNum);
	}

	public void setTarafxsPrvCyclNum(int number) {
	    number = checkTarafxsPrvCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrvCyclNum((short)number);
	}
	public void setTarafxsPrvCyclNum(long number) {
	    number = checkTarafxsPrvCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrvCyclNum((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsPrvBusPrtnrId
	 *	@return tarafxsPrvBusPrtnrId
	 */
   public char[] getTarafxsPrvBusPrtnrId() throws CFException{
     if (isTarafxsPrvBusPrtnrIdModified()) { 
        tarafxsPrvBusPrtnrId = refreshTarafxsPrvBusPrtnrId();
     }
   		return tarafxsPrvBusPrtnrId;
   }

  
	/**
	*  set variable tarafxsPrvBusPrtnrId
	*  Corresponding COBOL Variable is TARAFXS-PRV-BUS-PRTNR-ID
	*  @param value
	**/
   public void setTarafxsPrvBusPrtnrId(char[] value) {
      tarafxsPrvBusPrtnrId = checkTarafxsPrvBusPrtnrIdConstraints(value);
      serializeTarafxsPrvBusPrtnrId(tarafxsPrvBusPrtnrId);
   } 

     /**
	 * 	Update TarafxsPrvBusPrtnrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsPrvBusPrtnrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsPrvBusPrtnrId,tarafxsPrvBusPrtnrId.length);
   	
   }
   
   public void setTarafxsPrvBusPrtnrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsPrvBusPrtnrId,tarafxsPrvBusPrtnrId.length);
   	
   }
   
     /**
	 * 	Update TarafxsPrvBusPrtnrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsPrvBusPrtnrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsPrvBusPrtnrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsPrvBusPrtnrId with another Field
	 *	@param value
	 */
   public void setTarafxsPrvBusPrtnrId(Field source) {
       replace(source,0,source.length(),beginTarafxsPrvBusPrtnrId,TARAFXS_PRV_BUS_PRTNR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsPrvBusPrtnrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsPrvBusPrtnrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsPrvBusPrtnrId,TARAFXS_PRV_BUS_PRTNR_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsPrvBusPrtnrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsPrvBusPrtnrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsPrvBusPrtnrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsPrvEndptId
	 *	@return tarafxsPrvEndptId
	 */
   public char[] getTarafxsPrvEndptId() throws CFException{
     if (isTarafxsPrvEndptIdModified()) { 
        tarafxsPrvEndptId = refreshTarafxsPrvEndptId();
     }
   		return tarafxsPrvEndptId;
   }

  
	/**
	*  set variable tarafxsPrvEndptId
	*  Corresponding COBOL Variable is TARAFXS-PRV-ENDPT-ID
	*  @param value
	**/
   public void setTarafxsPrvEndptId(char[] value) {
      tarafxsPrvEndptId = checkTarafxsPrvEndptIdConstraints(value);
      serializeTarafxsPrvEndptId(tarafxsPrvEndptId);
   } 

     /**
	 * 	Update TarafxsPrvEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsPrvEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsPrvEndptId,tarafxsPrvEndptId.length);
   	
   }
   
   public void setTarafxsPrvEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsPrvEndptId,tarafxsPrvEndptId.length);
   	
   }
   
     /**
	 * 	Update TarafxsPrvEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsPrvEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsPrvEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsPrvEndptId with another Field
	 *	@param value
	 */
   public void setTarafxsPrvEndptId(Field source) {
       replace(source,0,source.length(),beginTarafxsPrvEndptId,TARAFXS_PRV_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsPrvEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsPrvEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsPrvEndptId,TARAFXS_PRV_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsPrvEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsPrvEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsPrvEndptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsPrvAvailTs
	 *	@return tarafxsPrvAvailTs
	 */
   public char[] getTarafxsPrvAvailTs() throws CFException{
     if (isTarafxsPrvAvailTsModified()) { 
        tarafxsPrvAvailTs = refreshTarafxsPrvAvailTs();
     }
   		return tarafxsPrvAvailTs;
   }

  
	/**
	*  set variable tarafxsPrvAvailTs
	*  Corresponding COBOL Variable is TARAFXS-PRV-AVAIL-TS
	*  @param value
	**/
   public void setTarafxsPrvAvailTs(char[] value) {
      tarafxsPrvAvailTs = checkTarafxsPrvAvailTsConstraints(value);
      serializeTarafxsPrvAvailTs(tarafxsPrvAvailTs);
   } 

     /**
	 * 	Update TarafxsPrvAvailTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsPrvAvailTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsPrvAvailTs,tarafxsPrvAvailTs.length);
   	
   }
   
   public void setTarafxsPrvAvailTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsPrvAvailTs,tarafxsPrvAvailTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsPrvAvailTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsPrvAvailTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsPrvAvailTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsPrvAvailTs with another Field
	 *	@param value
	 */
   public void setTarafxsPrvAvailTs(Field source) {
       replace(source,0,source.length(),beginTarafxsPrvAvailTs,TARAFXS_PRV_AVAIL_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsPrvAvailTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsPrvAvailTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsPrvAvailTs,TARAFXS_PRV_AVAIL_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsPrvAvailTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsPrvAvailTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsPrvAvailTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsNxtMnfrmFileNam
	 *	@return tarafxsNxtMnfrmFileNam
	 */
   public char[] getTarafxsNxtMnfrmFileNam() throws CFException{
     if (isTarafxsNxtMnfrmFileNamModified()) { 
        tarafxsNxtMnfrmFileNam = refreshTarafxsNxtMnfrmFileNam();
     }
   		return tarafxsNxtMnfrmFileNam;
   }

  
	/**
	*  set variable tarafxsNxtMnfrmFileNam
	*  Corresponding COBOL Variable is TARAFXS-NXT-MNFRM-FILE-NAM
	*  @param value
	**/
   public void setTarafxsNxtMnfrmFileNam(char[] value) {
      tarafxsNxtMnfrmFileNam = checkTarafxsNxtMnfrmFileNamConstraints(value);
      serializeTarafxsNxtMnfrmFileNam(tarafxsNxtMnfrmFileNam);
   } 

     /**
	 * 	Update TarafxsNxtMnfrmFileNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsNxtMnfrmFileNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsNxtMnfrmFileNam,tarafxsNxtMnfrmFileNam.length);
   	
   }
   
   public void setTarafxsNxtMnfrmFileNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsNxtMnfrmFileNam,tarafxsNxtMnfrmFileNam.length);
   	
   }
   
     /**
	 * 	Update TarafxsNxtMnfrmFileNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsNxtMnfrmFileNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsNxtMnfrmFileNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsNxtMnfrmFileNam with another Field
	 *	@param value
	 */
   public void setTarafxsNxtMnfrmFileNam(Field source) {
       replace(source,0,source.length(),beginTarafxsNxtMnfrmFileNam,TARAFXS_NXT_MNFRM_FILE_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsNxtMnfrmFileNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsNxtMnfrmFileNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsNxtMnfrmFileNam,TARAFXS_NXT_MNFRM_FILE_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsNxtMnfrmFileNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsNxtMnfrmFileNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsNxtMnfrmFileNam+targetIndex,targetLen);
    
   }
	public short getTarafxsNxtCyclNum() throws CFException {
        if (isTarafxsNxtCyclNumModified()) { 
           tarafxsNxtCyclNum = refreshTarafxsNxtCyclNum();
        }
   		return tarafxsNxtCyclNum;
	}
	
	/**
	 * 	Update TarafxsNxtCyclNum with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-NXT-CYCL-NUM
	 *	@param number
	 */
	public void setTarafxsNxtCyclNum(short number) {
			tarafxsNxtCyclNum = checkTarafxsNxtCyclNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxsNxtCyclNum(tarafxsNxtCyclNum);
	}

	public void setTarafxsNxtCyclNum(int number) {
	    number = checkTarafxsNxtCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsNxtCyclNum((short)number);
	}
	public void setTarafxsNxtCyclNum(long number) {
	    number = checkTarafxsNxtCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsNxtCyclNum((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsNxtBusPrtnrId
	 *	@return tarafxsNxtBusPrtnrId
	 */
   public char[] getTarafxsNxtBusPrtnrId() throws CFException{
     if (isTarafxsNxtBusPrtnrIdModified()) { 
        tarafxsNxtBusPrtnrId = refreshTarafxsNxtBusPrtnrId();
     }
   		return tarafxsNxtBusPrtnrId;
   }

  
	/**
	*  set variable tarafxsNxtBusPrtnrId
	*  Corresponding COBOL Variable is TARAFXS-NXT-BUS-PRTNR-ID
	*  @param value
	**/
   public void setTarafxsNxtBusPrtnrId(char[] value) {
      tarafxsNxtBusPrtnrId = checkTarafxsNxtBusPrtnrIdConstraints(value);
      serializeTarafxsNxtBusPrtnrId(tarafxsNxtBusPrtnrId);
   } 

     /**
	 * 	Update TarafxsNxtBusPrtnrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsNxtBusPrtnrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsNxtBusPrtnrId,tarafxsNxtBusPrtnrId.length);
   	
   }
   
   public void setTarafxsNxtBusPrtnrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsNxtBusPrtnrId,tarafxsNxtBusPrtnrId.length);
   	
   }
   
     /**
	 * 	Update TarafxsNxtBusPrtnrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsNxtBusPrtnrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsNxtBusPrtnrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsNxtBusPrtnrId with another Field
	 *	@param value
	 */
   public void setTarafxsNxtBusPrtnrId(Field source) {
       replace(source,0,source.length(),beginTarafxsNxtBusPrtnrId,TARAFXS_NXT_BUS_PRTNR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsNxtBusPrtnrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsNxtBusPrtnrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsNxtBusPrtnrId,TARAFXS_NXT_BUS_PRTNR_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsNxtBusPrtnrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsNxtBusPrtnrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsNxtBusPrtnrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsNxtEndptId
	 *	@return tarafxsNxtEndptId
	 */
   public char[] getTarafxsNxtEndptId() throws CFException{
     if (isTarafxsNxtEndptIdModified()) { 
        tarafxsNxtEndptId = refreshTarafxsNxtEndptId();
     }
   		return tarafxsNxtEndptId;
   }

  
	/**
	*  set variable tarafxsNxtEndptId
	*  Corresponding COBOL Variable is TARAFXS-NXT-ENDPT-ID
	*  @param value
	**/
   public void setTarafxsNxtEndptId(char[] value) {
      tarafxsNxtEndptId = checkTarafxsNxtEndptIdConstraints(value);
      serializeTarafxsNxtEndptId(tarafxsNxtEndptId);
   } 

     /**
	 * 	Update TarafxsNxtEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsNxtEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsNxtEndptId,tarafxsNxtEndptId.length);
   	
   }
   
   public void setTarafxsNxtEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsNxtEndptId,tarafxsNxtEndptId.length);
   	
   }
   
     /**
	 * 	Update TarafxsNxtEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsNxtEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsNxtEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsNxtEndptId with another Field
	 *	@param value
	 */
   public void setTarafxsNxtEndptId(Field source) {
       replace(source,0,source.length(),beginTarafxsNxtEndptId,TARAFXS_NXT_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsNxtEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsNxtEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsNxtEndptId,TARAFXS_NXT_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsNxtEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsNxtEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsNxtEndptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsNxtAvailTs
	 *	@return tarafxsNxtAvailTs
	 */
   public char[] getTarafxsNxtAvailTs() throws CFException{
     if (isTarafxsNxtAvailTsModified()) { 
        tarafxsNxtAvailTs = refreshTarafxsNxtAvailTs();
     }
   		return tarafxsNxtAvailTs;
   }

  
	/**
	*  set variable tarafxsNxtAvailTs
	*  Corresponding COBOL Variable is TARAFXS-NXT-AVAIL-TS
	*  @param value
	**/
   public void setTarafxsNxtAvailTs(char[] value) {
      tarafxsNxtAvailTs = checkTarafxsNxtAvailTsConstraints(value);
      serializeTarafxsNxtAvailTs(tarafxsNxtAvailTs);
   } 

     /**
	 * 	Update TarafxsNxtAvailTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsNxtAvailTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsNxtAvailTs,tarafxsNxtAvailTs.length);
   	
   }
   
   public void setTarafxsNxtAvailTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsNxtAvailTs,tarafxsNxtAvailTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsNxtAvailTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsNxtAvailTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsNxtAvailTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsNxtAvailTs with another Field
	 *	@param value
	 */
   public void setTarafxsNxtAvailTs(Field source) {
       replace(source,0,source.length(),beginTarafxsNxtAvailTs,TARAFXS_NXT_AVAIL_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsNxtAvailTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsNxtAvailTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsNxtAvailTs,TARAFXS_NXT_AVAIL_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsNxtAvailTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsNxtAvailTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsNxtAvailTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsApplExitJobNam
	 *	@return tarafxsApplExitJobNam
	 */
   public char[] getTarafxsApplExitJobNam() throws CFException{
     if (isTarafxsApplExitJobNamModified()) { 
        tarafxsApplExitJobNam = refreshTarafxsApplExitJobNam();
     }
   		return tarafxsApplExitJobNam;
   }

  
	/**
	*  set variable tarafxsApplExitJobNam
	*  Corresponding COBOL Variable is TARAFXS-APPL-EXIT-JOB-NAM
	*  @param value
	**/
   public void setTarafxsApplExitJobNam(char[] value) {
      tarafxsApplExitJobNam = checkTarafxsApplExitJobNamConstraints(value);
      serializeTarafxsApplExitJobNam(tarafxsApplExitJobNam);
   } 

     /**
	 * 	Update TarafxsApplExitJobNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsApplExitJobNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsApplExitJobNam,tarafxsApplExitJobNam.length);
   	
   }
   
   public void setTarafxsApplExitJobNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplExitJobNam,tarafxsApplExitJobNam.length);
   	
   }
   
     /**
	 * 	Update TarafxsApplExitJobNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsApplExitJobNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplExitJobNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsApplExitJobNam with another Field
	 *	@param value
	 */
   public void setTarafxsApplExitJobNam(Field source) {
       replace(source,0,source.length(),beginTarafxsApplExitJobNam,TARAFXS_APPL_EXIT_JOB_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsApplExitJobNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsApplExitJobNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsApplExitJobNam,TARAFXS_APPL_EXIT_JOB_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsApplExitJobNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsApplExitJobNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplExitJobNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsApplExitTs
	 *	@return tarafxsApplExitTs
	 */
   public char[] getTarafxsApplExitTs() throws CFException{
     if (isTarafxsApplExitTsModified()) { 
        tarafxsApplExitTs = refreshTarafxsApplExitTs();
     }
   		return tarafxsApplExitTs;
   }

  
	/**
	*  set variable tarafxsApplExitTs
	*  Corresponding COBOL Variable is TARAFXS-APPL-EXIT-TS
	*  @param value
	**/
   public void setTarafxsApplExitTs(char[] value) {
      tarafxsApplExitTs = checkTarafxsApplExitTsConstraints(value);
      serializeTarafxsApplExitTs(tarafxsApplExitTs);
   } 

     /**
	 * 	Update TarafxsApplExitTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsApplExitTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsApplExitTs,tarafxsApplExitTs.length);
   	
   }
   
   public void setTarafxsApplExitTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplExitTs,tarafxsApplExitTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsApplExitTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsApplExitTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplExitTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsApplExitTs with another Field
	 *	@param value
	 */
   public void setTarafxsApplExitTs(Field source) {
       replace(source,0,source.length(),beginTarafxsApplExitTs,TARAFXS_APPL_EXIT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsApplExitTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsApplExitTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsApplExitTs,TARAFXS_APPL_EXIT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsApplExitTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsApplExitTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplExitTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsCsMipId
	 *	@return tarafxsCsMipId
	 */
   public char[] getTarafxsCsMipId() throws CFException{
     if (isTarafxsCsMipIdModified()) { 
        tarafxsCsMipId = refreshTarafxsCsMipId();
     }
   		return tarafxsCsMipId;
   }

  
	/**
	*  set variable tarafxsCsMipId
	*  Corresponding COBOL Variable is TARAFXS-CS-MIP-ID
	*  @param value
	**/
   public void setTarafxsCsMipId(char[] value) {
      tarafxsCsMipId = checkTarafxsCsMipIdConstraints(value);
      serializeTarafxsCsMipId(tarafxsCsMipId);
   } 

     /**
	 * 	Update TarafxsCsMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsCsMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsCsMipId,tarafxsCsMipId.length);
   	
   }
   
   public void setTarafxsCsMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsCsMipId,tarafxsCsMipId.length);
   	
   }
   
     /**
	 * 	Update TarafxsCsMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsCsMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsCsMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsCsMipId with another Field
	 *	@param value
	 */
   public void setTarafxsCsMipId(Field source) {
       replace(source,0,source.length(),beginTarafxsCsMipId,TARAFXS_CS_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsCsMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsCsMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsCsMipId,TARAFXS_CS_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsCsMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsCsMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsCsMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsRmMipId
	 *	@return tarafxsRmMipId
	 */
   public char[] getTarafxsRmMipId() throws CFException{
     if (isTarafxsRmMipIdModified()) { 
        tarafxsRmMipId = refreshTarafxsRmMipId();
     }
   		return tarafxsRmMipId;
   }

  
	/**
	*  set variable tarafxsRmMipId
	*  Corresponding COBOL Variable is TARAFXS-RM-MIP-ID
	*  @param value
	**/
   public void setTarafxsRmMipId(char[] value) {
      tarafxsRmMipId = checkTarafxsRmMipIdConstraints(value);
      serializeTarafxsRmMipId(tarafxsRmMipId);
   } 

     /**
	 * 	Update TarafxsRmMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsRmMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsRmMipId,tarafxsRmMipId.length);
   	
   }
   
   public void setTarafxsRmMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsRmMipId,tarafxsRmMipId.length);
   	
   }
   
     /**
	 * 	Update TarafxsRmMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsRmMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsRmMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsRmMipId with another Field
	 *	@param value
	 */
   public void setTarafxsRmMipId(Field source) {
       replace(source,0,source.length(),beginTarafxsRmMipId,TARAFXS_RM_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsRmMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsRmMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsRmMipId,TARAFXS_RM_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsRmMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsRmMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsRmMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsApplExitNam
	 *	@return tarafxsApplExitNam
	 */
   public char[] getTarafxsApplExitNam() throws CFException{
     if (isTarafxsApplExitNamModified()) { 
        tarafxsApplExitNam = refreshTarafxsApplExitNam();
     }
   		return tarafxsApplExitNam;
   }

  
	/**
	*  set variable tarafxsApplExitNam
	*  Corresponding COBOL Variable is TARAFXS-APPL-EXIT-NAM
	*  @param value
	**/
   public void setTarafxsApplExitNam(char[] value) {
      tarafxsApplExitNam = checkTarafxsApplExitNamConstraints(value);
      serializeTarafxsApplExitNam(tarafxsApplExitNam);
   } 

     /**
	 * 	Update TarafxsApplExitNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsApplExitNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsApplExitNam,tarafxsApplExitNam.length);
   	
   }
   
   public void setTarafxsApplExitNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplExitNam,tarafxsApplExitNam.length);
   	
   }
   
     /**
	 * 	Update TarafxsApplExitNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsApplExitNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplExitNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsApplExitNam with another Field
	 *	@param value
	 */
   public void setTarafxsApplExitNam(Field source) {
       replace(source,0,source.length(),beginTarafxsApplExitNam,TARAFXS_APPL_EXIT_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsApplExitNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsApplExitNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsApplExitNam,TARAFXS_APPL_EXIT_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsApplExitNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsApplExitNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplExitNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsTapeCmpltdSw
	 *	@return tarafxsTapeCmpltdSw
	 */
   public char[] getTarafxsTapeCmpltdSw() throws CFException{
     if (isTarafxsTapeCmpltdSwModified()) { 
        tarafxsTapeCmpltdSw = refreshTarafxsTapeCmpltdSw();
     }
   		return tarafxsTapeCmpltdSw;
   }

  
	/**
	*  set variable tarafxsTapeCmpltdSw
	*  Corresponding COBOL Variable is TARAFXS-TAPE-CMPLTD-SW
	*  @param value
	**/
   public void setTarafxsTapeCmpltdSw(char[] value) {
      tarafxsTapeCmpltdSw = checkTarafxsTapeCmpltdSwConstraints(value);
      serializeTarafxsTapeCmpltdSw(tarafxsTapeCmpltdSw);
   } 

     /**
	 * 	Update TarafxsTapeCmpltdSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTapeCmpltdSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsTapeCmpltdSw,tarafxsTapeCmpltdSw.length);
   	
   }
   
   public void setTarafxsTapeCmpltdSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTapeCmpltdSw,tarafxsTapeCmpltdSw.length);
   	
   }
   
     /**
	 * 	Update TarafxsTapeCmpltdSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTapeCmpltdSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTapeCmpltdSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsTapeCmpltdSw with another Field
	 *	@param value
	 */
   public void setTarafxsTapeCmpltdSw(Field source) {
       replace(source,0,source.length(),beginTarafxsTapeCmpltdSw,TARAFXS_TAPE_CMPLTD_SW_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsTapeCmpltdSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsTapeCmpltdSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsTapeCmpltdSw,TARAFXS_TAPE_CMPLTD_SW_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsTapeCmpltdSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTapeCmpltdSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTapeCmpltdSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsTapeMultVolSw
	 *	@return tarafxsTapeMultVolSw
	 */
   public char[] getTarafxsTapeMultVolSw() throws CFException{
     if (isTarafxsTapeMultVolSwModified()) { 
        tarafxsTapeMultVolSw = refreshTarafxsTapeMultVolSw();
     }
   		return tarafxsTapeMultVolSw;
   }

  
	/**
	*  set variable tarafxsTapeMultVolSw
	*  Corresponding COBOL Variable is TARAFXS-TAPE-MULT-VOL-SW
	*  @param value
	**/
   public void setTarafxsTapeMultVolSw(char[] value) {
      tarafxsTapeMultVolSw = checkTarafxsTapeMultVolSwConstraints(value);
      serializeTarafxsTapeMultVolSw(tarafxsTapeMultVolSw);
   } 

     /**
	 * 	Update TarafxsTapeMultVolSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTapeMultVolSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsTapeMultVolSw,tarafxsTapeMultVolSw.length);
   	
   }
   
   public void setTarafxsTapeMultVolSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTapeMultVolSw,tarafxsTapeMultVolSw.length);
   	
   }
   
     /**
	 * 	Update TarafxsTapeMultVolSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTapeMultVolSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTapeMultVolSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsTapeMultVolSw with another Field
	 *	@param value
	 */
   public void setTarafxsTapeMultVolSw(Field source) {
       replace(source,0,source.length(),beginTarafxsTapeMultVolSw,TARAFXS_TAPE_MULT_VOL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsTapeMultVolSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsTapeMultVolSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsTapeMultVolSw,TARAFXS_TAPE_MULT_VOL_SW_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsTapeMultVolSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTapeMultVolSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTapeMultVolSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsApplPrcssngDt
	 *	@return tarafxsApplPrcssngDt
	 */
   public char[] getTarafxsApplPrcssngDt() throws CFException{
     if (isTarafxsApplPrcssngDtModified()) { 
        tarafxsApplPrcssngDt = refreshTarafxsApplPrcssngDt();
     }
   		return tarafxsApplPrcssngDt;
   }

  
	/**
	*  set variable tarafxsApplPrcssngDt
	*  Corresponding COBOL Variable is TARAFXS-APPL-PRCSSNG-DT
	*  @param value
	**/
   public void setTarafxsApplPrcssngDt(char[] value) {
      tarafxsApplPrcssngDt = checkTarafxsApplPrcssngDtConstraints(value);
      serializeTarafxsApplPrcssngDt(tarafxsApplPrcssngDt);
   } 

     /**
	 * 	Update TarafxsApplPrcssngDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsApplPrcssngDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsApplPrcssngDt,tarafxsApplPrcssngDt.length);
   	
   }
   
   public void setTarafxsApplPrcssngDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplPrcssngDt,tarafxsApplPrcssngDt.length);
   	
   }
   
     /**
	 * 	Update TarafxsApplPrcssngDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsApplPrcssngDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplPrcssngDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsApplPrcssngDt with another Field
	 *	@param value
	 */
   public void setTarafxsApplPrcssngDt(Field source) {
       replace(source,0,source.length(),beginTarafxsApplPrcssngDt,TARAFXS_APPL_PRCSSNG_DT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsApplPrcssngDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsApplPrcssngDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsApplPrcssngDt,TARAFXS_APPL_PRCSSNG_DT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsApplPrcssngDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsApplPrcssngDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplPrcssngDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsTransitionalDsn
	 *	@return tarafxsTransitionalDsn
	 */
   public char[] getTarafxsTransitionalDsn() throws CFException{
     if (isTarafxsTransitionalDsnModified()) { 
        tarafxsTransitionalDsn = refreshTarafxsTransitionalDsn();
     }
   		return tarafxsTransitionalDsn;
   }

  
	/**
	*  set variable tarafxsTransitionalDsn
	*  Corresponding COBOL Variable is TARAFXS-TRANSITIONAL-DSN
	*  @param value
	**/
   public void setTarafxsTransitionalDsn(char[] value) {
      tarafxsTransitionalDsn = checkTarafxsTransitionalDsnConstraints(value);
      serializeTarafxsTransitionalDsn(tarafxsTransitionalDsn);
   } 

     /**
	 * 	Update TarafxsTransitionalDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTransitionalDsn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsTransitionalDsn,tarafxsTransitionalDsn.length);
   	
   }
   
   public void setTarafxsTransitionalDsn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTransitionalDsn,tarafxsTransitionalDsn.length);
   	
   }
   
     /**
	 * 	Update TarafxsTransitionalDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTransitionalDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTransitionalDsn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsTransitionalDsn with another Field
	 *	@param value
	 */
   public void setTarafxsTransitionalDsn(Field source) {
       replace(source,0,source.length(),beginTarafxsTransitionalDsn,TARAFXS_TRANSITIONAL_DSN_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsTransitionalDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsTransitionalDsn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsTransitionalDsn,TARAFXS_TRANSITIONAL_DSN_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsTransitionalDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTransitionalDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTransitionalDsn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsSourceHubId
	 *	@return tarafxsSourceHubId
	 */
   public char[] getTarafxsSourceHubId() throws CFException{
     if (isTarafxsSourceHubIdModified()) { 
        tarafxsSourceHubId = refreshTarafxsSourceHubId();
     }
   		return tarafxsSourceHubId;
   }

  
	/**
	*  set variable tarafxsSourceHubId
	*  Corresponding COBOL Variable is TARAFXS-SOURCE-HUB-ID
	*  @param value
	**/
   public void setTarafxsSourceHubId(char[] value) {
      tarafxsSourceHubId = checkTarafxsSourceHubIdConstraints(value);
      serializeTarafxsSourceHubId(tarafxsSourceHubId);
   } 

     /**
	 * 	Update TarafxsSourceHubId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsSourceHubId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsSourceHubId,tarafxsSourceHubId.length);
   	
   }
   
   public void setTarafxsSourceHubId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSourceHubId,tarafxsSourceHubId.length);
   	
   }
   
     /**
	 * 	Update TarafxsSourceHubId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSourceHubId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSourceHubId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsSourceHubId with another Field
	 *	@param value
	 */
   public void setTarafxsSourceHubId(Field source) {
       replace(source,0,source.length(),beginTarafxsSourceHubId,TARAFXS_SOURCE_HUB_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsSourceHubId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsSourceHubId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsSourceHubId,TARAFXS_SOURCE_HUB_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsSourceHubId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSourceHubId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSourceHubId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsOwningHubId
	 *	@return tarafxsOwningHubId
	 */
   public char[] getTarafxsOwningHubId() throws CFException{
     if (isTarafxsOwningHubIdModified()) { 
        tarafxsOwningHubId = refreshTarafxsOwningHubId();
     }
   		return tarafxsOwningHubId;
   }

  
	/**
	*  set variable tarafxsOwningHubId
	*  Corresponding COBOL Variable is TARAFXS-OWNING-HUB-ID
	*  @param value
	**/
   public void setTarafxsOwningHubId(char[] value) {
      tarafxsOwningHubId = checkTarafxsOwningHubIdConstraints(value);
      serializeTarafxsOwningHubId(tarafxsOwningHubId);
   } 

     /**
	 * 	Update TarafxsOwningHubId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsOwningHubId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsOwningHubId,tarafxsOwningHubId.length);
   	
   }
   
   public void setTarafxsOwningHubId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsOwningHubId,tarafxsOwningHubId.length);
   	
   }
   
     /**
	 * 	Update TarafxsOwningHubId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsOwningHubId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsOwningHubId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsOwningHubId with another Field
	 *	@param value
	 */
   public void setTarafxsOwningHubId(Field source) {
       replace(source,0,source.length(),beginTarafxsOwningHubId,TARAFXS_OWNING_HUB_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsOwningHubId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsOwningHubId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsOwningHubId,TARAFXS_OWNING_HUB_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsOwningHubId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsOwningHubId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsOwningHubId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsStatRefId
	 *	@return tarafxsStatRefId
	 */
   public char[] getTarafxsStatRefId() throws CFException{
     if (isTarafxsStatRefIdModified()) { 
        tarafxsStatRefId = refreshTarafxsStatRefId();
     }
   		return tarafxsStatRefId;
   }

  
	/**
	*  set variable tarafxsStatRefId
	*  Corresponding COBOL Variable is TARAFXS-STAT-REF-ID
	*  @param value
	**/
   public void setTarafxsStatRefId(char[] value) {
      tarafxsStatRefId = checkTarafxsStatRefIdConstraints(value);
      serializeTarafxsStatRefId(tarafxsStatRefId);
   } 

     /**
	 * 	Update TarafxsStatRefId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsStatRefId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsStatRefId,tarafxsStatRefId.length);
   	
   }
   
   public void setTarafxsStatRefId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsStatRefId,tarafxsStatRefId.length);
   	
   }
   
     /**
	 * 	Update TarafxsStatRefId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsStatRefId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsStatRefId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsStatRefId with another Field
	 *	@param value
	 */
   public void setTarafxsStatRefId(Field source) {
       replace(source,0,source.length(),beginTarafxsStatRefId,TARAFXS_STAT_REF_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsStatRefId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsStatRefId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsStatRefId,TARAFXS_STAT_REF_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsStatRefId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsStatRefId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsStatRefId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsSrcLocEntNam
	 *	@return tarafxsSrcLocEntNam
	 */
   public char[] getTarafxsSrcLocEntNam() throws CFException{
     if (isTarafxsSrcLocEntNamModified()) { 
        tarafxsSrcLocEntNam = refreshTarafxsSrcLocEntNam();
     }
   		return tarafxsSrcLocEntNam;
   }

  
	/**
	*  set variable tarafxsSrcLocEntNam
	*  Corresponding COBOL Variable is TARAFXS-SRC-LOC-ENT-NAM
	*  @param value
	**/
   public void setTarafxsSrcLocEntNam(char[] value) {
      tarafxsSrcLocEntNam = checkTarafxsSrcLocEntNamConstraints(value);
      serializeTarafxsSrcLocEntNam(tarafxsSrcLocEntNam);
   } 

     /**
	 * 	Update TarafxsSrcLocEntNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsSrcLocEntNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsSrcLocEntNam,tarafxsSrcLocEntNam.length);
   	
   }
   
   public void setTarafxsSrcLocEntNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcLocEntNam,tarafxsSrcLocEntNam.length);
   	
   }
   
     /**
	 * 	Update TarafxsSrcLocEntNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcLocEntNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcLocEntNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsSrcLocEntNam with another Field
	 *	@param value
	 */
   public void setTarafxsSrcLocEntNam(Field source) {
       replace(source,0,source.length(),beginTarafxsSrcLocEntNam,TARAFXS_SRC_LOC_ENT_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsSrcLocEntNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsSrcLocEntNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsSrcLocEntNam,TARAFXS_SRC_LOC_ENT_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsSrcLocEntNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcLocEntNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcLocEntNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsSrcTaskNam
	 *	@return tarafxsSrcTaskNam
	 */
   public char[] getTarafxsSrcTaskNam() throws CFException{
     if (isTarafxsSrcTaskNamModified()) { 
        tarafxsSrcTaskNam = refreshTarafxsSrcTaskNam();
     }
   		return tarafxsSrcTaskNam;
   }

  
	/**
	*  set variable tarafxsSrcTaskNam
	*  Corresponding COBOL Variable is TARAFXS-SRC-TASK-NAM
	*  @param value
	**/
   public void setTarafxsSrcTaskNam(char[] value) {
      tarafxsSrcTaskNam = checkTarafxsSrcTaskNamConstraints(value);
      serializeTarafxsSrcTaskNam(tarafxsSrcTaskNam);
   } 

     /**
	 * 	Update TarafxsSrcTaskNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsSrcTaskNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsSrcTaskNam,tarafxsSrcTaskNam.length);
   	
   }
   
   public void setTarafxsSrcTaskNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskNam,tarafxsSrcTaskNam.length);
   	
   }
   
     /**
	 * 	Update TarafxsSrcTaskNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcTaskNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsSrcTaskNam with another Field
	 *	@param value
	 */
   public void setTarafxsSrcTaskNam(Field source) {
       replace(source,0,source.length(),beginTarafxsSrcTaskNam,TARAFXS_SRC_TASK_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsSrcTaskNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsSrcTaskNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskNam,TARAFXS_SRC_TASK_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsSrcTaskNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcTaskNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsSrcTaskId
	 *	@return tarafxsSrcTaskId
	 */
   public char[] getTarafxsSrcTaskId() throws CFException{
     if (isTarafxsSrcTaskIdModified()) { 
        tarafxsSrcTaskId = refreshTarafxsSrcTaskId();
     }
   		return tarafxsSrcTaskId;
   }

  
	/**
	*  set variable tarafxsSrcTaskId
	*  Corresponding COBOL Variable is TARAFXS-SRC-TASK-ID
	*  @param value
	**/
   public void setTarafxsSrcTaskId(char[] value) {
      tarafxsSrcTaskId = checkTarafxsSrcTaskIdConstraints(value);
      serializeTarafxsSrcTaskId(tarafxsSrcTaskId);
   } 

     /**
	 * 	Update TarafxsSrcTaskId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsSrcTaskId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsSrcTaskId,tarafxsSrcTaskId.length);
   	
   }
   
   public void setTarafxsSrcTaskId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskId,tarafxsSrcTaskId.length);
   	
   }
   
     /**
	 * 	Update TarafxsSrcTaskId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcTaskId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsSrcTaskId with another Field
	 *	@param value
	 */
   public void setTarafxsSrcTaskId(Field source) {
       replace(source,0,source.length(),beginTarafxsSrcTaskId,TARAFXS_SRC_TASK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsSrcTaskId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsSrcTaskId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskId,TARAFXS_SRC_TASK_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsSrcTaskId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcTaskId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsSrcTaskUsr
	 *	@return tarafxsSrcTaskUsr
	 */   
	 public TarafxsSrcTaskUsr getTarafxsSrcTaskUsr() {
   	return tarafxsSrcTaskUsr;
   }
   /**
	* 	Update TarafxsSrcTaskUsr with the passed value
	*   Corresponding COBOL Variable is TARAFXS-SRC-TASK-USR
	*	@param value
	*/
   public void setTarafxsSrcTaskUsr(char[] value) {
      tarafxsSrcTaskUsr.setString(value); 
   }   
    
     /**
	 * 	Update TarafxsSrcTaskUsr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTarafxsSrcTaskUsr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tarafxsSrcTaskUsr.begin,tarafxsSrcTaskUsr.length());
   }
   
     /**
	 * 	Update TarafxsSrcTaskUsr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcTaskUsr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tarafxsSrcTaskUsr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TarafxsSrcTaskUsr with another Field
	 *	@param value
	 */
   public void setTarafxsSrcTaskUsr(Field source) {
   	replace(source,0,source.length(),tarafxsSrcTaskUsr.begin,tarafxsSrcTaskUsr.length());
   }  
   
     /**
	 * 	Update TarafxsSrcTaskUsr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTarafxsSrcTaskUsr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tarafxsSrcTaskUsr.begin,tarafxsSrcTaskUsr.length());
   }
   
     /**
	 * 	Update TarafxsSrcTaskUsr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcTaskUsr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tarafxsSrcTaskUsr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of tarafxsSrcTaskStrtTs
	 *	@return tarafxsSrcTaskStrtTs
	 */
   public char[] getTarafxsSrcTaskStrtTs() throws CFException{
     if (isTarafxsSrcTaskStrtTsModified()) { 
        tarafxsSrcTaskStrtTs = refreshTarafxsSrcTaskStrtTs();
     }
   		return tarafxsSrcTaskStrtTs;
   }

  
	/**
	*  set variable tarafxsSrcTaskStrtTs
	*  Corresponding COBOL Variable is TARAFXS-SRC-TASK-STRT-TS
	*  @param value
	**/
   public void setTarafxsSrcTaskStrtTs(char[] value) {
      tarafxsSrcTaskStrtTs = checkTarafxsSrcTaskStrtTsConstraints(value);
      serializeTarafxsSrcTaskStrtTs(tarafxsSrcTaskStrtTs);
   } 

     /**
	 * 	Update TarafxsSrcTaskStrtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsSrcTaskStrtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsSrcTaskStrtTs,tarafxsSrcTaskStrtTs.length);
   	
   }
   
   public void setTarafxsSrcTaskStrtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskStrtTs,tarafxsSrcTaskStrtTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsSrcTaskStrtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcTaskStrtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskStrtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsSrcTaskStrtTs with another Field
	 *	@param value
	 */
   public void setTarafxsSrcTaskStrtTs(Field source) {
       replace(source,0,source.length(),beginTarafxsSrcTaskStrtTs,TARAFXS_SRC_TASK_STRT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsSrcTaskStrtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsSrcTaskStrtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskStrtTs,TARAFXS_SRC_TASK_STRT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsSrcTaskStrtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcTaskStrtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskStrtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsSrcTaskStopTs
	 *	@return tarafxsSrcTaskStopTs
	 */
   public char[] getTarafxsSrcTaskStopTs() throws CFException{
     if (isTarafxsSrcTaskStopTsModified()) { 
        tarafxsSrcTaskStopTs = refreshTarafxsSrcTaskStopTs();
     }
   		return tarafxsSrcTaskStopTs;
   }

  
	/**
	*  set variable tarafxsSrcTaskStopTs
	*  Corresponding COBOL Variable is TARAFXS-SRC-TASK-STOP-TS
	*  @param value
	**/
   public void setTarafxsSrcTaskStopTs(char[] value) {
      tarafxsSrcTaskStopTs = checkTarafxsSrcTaskStopTsConstraints(value);
      serializeTarafxsSrcTaskStopTs(tarafxsSrcTaskStopTs);
   } 

     /**
	 * 	Update TarafxsSrcTaskStopTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsSrcTaskStopTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsSrcTaskStopTs,tarafxsSrcTaskStopTs.length);
   	
   }
   
   public void setTarafxsSrcTaskStopTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskStopTs,tarafxsSrcTaskStopTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsSrcTaskStopTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcTaskStopTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskStopTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsSrcTaskStopTs with another Field
	 *	@param value
	 */
   public void setTarafxsSrcTaskStopTs(Field source) {
       replace(source,0,source.length(),beginTarafxsSrcTaskStopTs,TARAFXS_SRC_TASK_STOP_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsSrcTaskStopTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsSrcTaskStopTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskStopTs,TARAFXS_SRC_TASK_STOP_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsSrcTaskStopTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcTaskStopTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskStopTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsTrgtLocEntNam
	 *	@return tarafxsTrgtLocEntNam
	 */
   public char[] getTarafxsTrgtLocEntNam() throws CFException{
     if (isTarafxsTrgtLocEntNamModified()) { 
        tarafxsTrgtLocEntNam = refreshTarafxsTrgtLocEntNam();
     }
   		return tarafxsTrgtLocEntNam;
   }

  
	/**
	*  set variable tarafxsTrgtLocEntNam
	*  Corresponding COBOL Variable is TARAFXS-TRGT-LOC-ENT-NAM
	*  @param value
	**/
   public void setTarafxsTrgtLocEntNam(char[] value) {
      tarafxsTrgtLocEntNam = checkTarafxsTrgtLocEntNamConstraints(value);
      serializeTarafxsTrgtLocEntNam(tarafxsTrgtLocEntNam);
   } 

     /**
	 * 	Update TarafxsTrgtLocEntNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTrgtLocEntNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsTrgtLocEntNam,tarafxsTrgtLocEntNam.length);
   	
   }
   
   public void setTarafxsTrgtLocEntNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtLocEntNam,tarafxsTrgtLocEntNam.length);
   	
   }
   
     /**
	 * 	Update TarafxsTrgtLocEntNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtLocEntNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtLocEntNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsTrgtLocEntNam with another Field
	 *	@param value
	 */
   public void setTarafxsTrgtLocEntNam(Field source) {
       replace(source,0,source.length(),beginTarafxsTrgtLocEntNam,TARAFXS_TRGT_LOC_ENT_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsTrgtLocEntNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsTrgtLocEntNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsTrgtLocEntNam,TARAFXS_TRGT_LOC_ENT_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsTrgtLocEntNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtLocEntNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtLocEntNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsTrgtTaskNam
	 *	@return tarafxsTrgtTaskNam
	 */
   public char[] getTarafxsTrgtTaskNam() throws CFException{
     if (isTarafxsTrgtTaskNamModified()) { 
        tarafxsTrgtTaskNam = refreshTarafxsTrgtTaskNam();
     }
   		return tarafxsTrgtTaskNam;
   }

  
	/**
	*  set variable tarafxsTrgtTaskNam
	*  Corresponding COBOL Variable is TARAFXS-TRGT-TASK-NAM
	*  @param value
	**/
   public void setTarafxsTrgtTaskNam(char[] value) {
      tarafxsTrgtTaskNam = checkTarafxsTrgtTaskNamConstraints(value);
      serializeTarafxsTrgtTaskNam(tarafxsTrgtTaskNam);
   } 

     /**
	 * 	Update TarafxsTrgtTaskNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTrgtTaskNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsTrgtTaskNam,tarafxsTrgtTaskNam.length);
   	
   }
   
   public void setTarafxsTrgtTaskNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskNam,tarafxsTrgtTaskNam.length);
   	
   }
   
     /**
	 * 	Update TarafxsTrgtTaskNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtTaskNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsTrgtTaskNam with another Field
	 *	@param value
	 */
   public void setTarafxsTrgtTaskNam(Field source) {
       replace(source,0,source.length(),beginTarafxsTrgtTaskNam,TARAFXS_TRGT_TASK_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsTrgtTaskNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsTrgtTaskNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskNam,TARAFXS_TRGT_TASK_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsTrgtTaskNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtTaskNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsTrgtTaskId
	 *	@return tarafxsTrgtTaskId
	 */
   public char[] getTarafxsTrgtTaskId() throws CFException{
     if (isTarafxsTrgtTaskIdModified()) { 
        tarafxsTrgtTaskId = refreshTarafxsTrgtTaskId();
     }
   		return tarafxsTrgtTaskId;
   }

  
	/**
	*  set variable tarafxsTrgtTaskId
	*  Corresponding COBOL Variable is TARAFXS-TRGT-TASK-ID
	*  @param value
	**/
   public void setTarafxsTrgtTaskId(char[] value) {
      tarafxsTrgtTaskId = checkTarafxsTrgtTaskIdConstraints(value);
      serializeTarafxsTrgtTaskId(tarafxsTrgtTaskId);
   } 

     /**
	 * 	Update TarafxsTrgtTaskId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTrgtTaskId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsTrgtTaskId,tarafxsTrgtTaskId.length);
   	
   }
   
   public void setTarafxsTrgtTaskId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskId,tarafxsTrgtTaskId.length);
   	
   }
   
     /**
	 * 	Update TarafxsTrgtTaskId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtTaskId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsTrgtTaskId with another Field
	 *	@param value
	 */
   public void setTarafxsTrgtTaskId(Field source) {
       replace(source,0,source.length(),beginTarafxsTrgtTaskId,TARAFXS_TRGT_TASK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsTrgtTaskId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsTrgtTaskId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskId,TARAFXS_TRGT_TASK_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsTrgtTaskId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtTaskId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsTrgtTaskUsr
	 *	@return tarafxsTrgtTaskUsr
	 */   
	 public TarafxsTrgtTaskUsr getTarafxsTrgtTaskUsr() {
   	return tarafxsTrgtTaskUsr;
   }
   /**
	* 	Update TarafxsTrgtTaskUsr with the passed value
	*   Corresponding COBOL Variable is TARAFXS-TRGT-TASK-USR
	*	@param value
	*/
   public void setTarafxsTrgtTaskUsr(char[] value) {
      tarafxsTrgtTaskUsr.setString(value); 
   }   
    
     /**
	 * 	Update TarafxsTrgtTaskUsr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTrgtTaskUsr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tarafxsTrgtTaskUsr.begin,tarafxsTrgtTaskUsr.length());
   }
   
     /**
	 * 	Update TarafxsTrgtTaskUsr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtTaskUsr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tarafxsTrgtTaskUsr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TarafxsTrgtTaskUsr with another Field
	 *	@param value
	 */
   public void setTarafxsTrgtTaskUsr(Field source) {
   	replace(source,0,source.length(),tarafxsTrgtTaskUsr.begin,tarafxsTrgtTaskUsr.length());
   }  
   
     /**
	 * 	Update TarafxsTrgtTaskUsr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTrgtTaskUsr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tarafxsTrgtTaskUsr.begin,tarafxsTrgtTaskUsr.length());
   }
   
     /**
	 * 	Update TarafxsTrgtTaskUsr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtTaskUsr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tarafxsTrgtTaskUsr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of tarafxsTrgtTaskStrtTs
	 *	@return tarafxsTrgtTaskStrtTs
	 */
   public char[] getTarafxsTrgtTaskStrtTs() throws CFException{
     if (isTarafxsTrgtTaskStrtTsModified()) { 
        tarafxsTrgtTaskStrtTs = refreshTarafxsTrgtTaskStrtTs();
     }
   		return tarafxsTrgtTaskStrtTs;
   }

  
	/**
	*  set variable tarafxsTrgtTaskStrtTs
	*  Corresponding COBOL Variable is TARAFXS-TRGT-TASK-STRT-TS
	*  @param value
	**/
   public void setTarafxsTrgtTaskStrtTs(char[] value) {
      tarafxsTrgtTaskStrtTs = checkTarafxsTrgtTaskStrtTsConstraints(value);
      serializeTarafxsTrgtTaskStrtTs(tarafxsTrgtTaskStrtTs);
   } 

     /**
	 * 	Update TarafxsTrgtTaskStrtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTrgtTaskStrtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsTrgtTaskStrtTs,tarafxsTrgtTaskStrtTs.length);
   	
   }
   
   public void setTarafxsTrgtTaskStrtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskStrtTs,tarafxsTrgtTaskStrtTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsTrgtTaskStrtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtTaskStrtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskStrtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsTrgtTaskStrtTs with another Field
	 *	@param value
	 */
   public void setTarafxsTrgtTaskStrtTs(Field source) {
       replace(source,0,source.length(),beginTarafxsTrgtTaskStrtTs,TARAFXS_TRGT_TASK_STRT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsTrgtTaskStrtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsTrgtTaskStrtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskStrtTs,TARAFXS_TRGT_TASK_STRT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsTrgtTaskStrtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtTaskStrtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskStrtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsTrgtTaskStopTs
	 *	@return tarafxsTrgtTaskStopTs
	 */
   public char[] getTarafxsTrgtTaskStopTs() throws CFException{
     if (isTarafxsTrgtTaskStopTsModified()) { 
        tarafxsTrgtTaskStopTs = refreshTarafxsTrgtTaskStopTs();
     }
   		return tarafxsTrgtTaskStopTs;
   }

  
	/**
	*  set variable tarafxsTrgtTaskStopTs
	*  Corresponding COBOL Variable is TARAFXS-TRGT-TASK-STOP-TS
	*  @param value
	**/
   public void setTarafxsTrgtTaskStopTs(char[] value) {
      tarafxsTrgtTaskStopTs = checkTarafxsTrgtTaskStopTsConstraints(value);
      serializeTarafxsTrgtTaskStopTs(tarafxsTrgtTaskStopTs);
   } 

     /**
	 * 	Update TarafxsTrgtTaskStopTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTrgtTaskStopTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsTrgtTaskStopTs,tarafxsTrgtTaskStopTs.length);
   	
   }
   
   public void setTarafxsTrgtTaskStopTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskStopTs,tarafxsTrgtTaskStopTs.length);
   	
   }
   
     /**
	 * 	Update TarafxsTrgtTaskStopTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtTaskStopTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskStopTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsTrgtTaskStopTs with another Field
	 *	@param value
	 */
   public void setTarafxsTrgtTaskStopTs(Field source) {
       replace(source,0,source.length(),beginTarafxsTrgtTaskStopTs,TARAFXS_TRGT_TASK_STOP_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsTrgtTaskStopTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsTrgtTaskStopTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskStopTs,TARAFXS_TRGT_TASK_STOP_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsTrgtTaskStopTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtTaskStopTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskStopTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxsApplTknNam
	 *	@return tarafxsApplTknNam
	 */   
	 public TarafxsApplTknNam getTarafxsApplTknNam() {
   	return tarafxsApplTknNam;
   }
   /**
	* 	Update TarafxsApplTknNam with the passed value
	*   Corresponding COBOL Variable is TARAFXS-APPL-TKN-NAM
	*	@param value
	*/
   public void setTarafxsApplTknNam(char[] value) {
      tarafxsApplTknNam.setString(value); 
   }   
    
     /**
	 * 	Update TarafxsApplTknNam 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTarafxsApplTknNam(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tarafxsApplTknNam.begin,tarafxsApplTknNam.length());
   }
   
     /**
	 * 	Update TarafxsApplTknNam 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsApplTknNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tarafxsApplTknNam.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TarafxsApplTknNam with another Field
	 *	@param value
	 */
   public void setTarafxsApplTknNam(Field source) {
   	replace(source,0,source.length(),tarafxsApplTknNam.begin,tarafxsApplTknNam.length());
   }  
   
     /**
	 * 	Update TarafxsApplTknNam 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTarafxsApplTknNam(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tarafxsApplTknNam.begin,tarafxsApplTknNam.length());
   }
   
     /**
	 * 	Update TarafxsApplTknNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsApplTknNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tarafxsApplTknNam.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getTarafxsFieldLength() {
			return TARAFXS_LENGTH;
		}

}
  
