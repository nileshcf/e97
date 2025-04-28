package com.cloudframe.app.ar640010.dto;

/**
*  The class Tarafxa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Tarafxa extends TarafxaSerialized {
   

						private char[] tarafxaMcMnfrmFileNam = Field.fillLowValue(44);

								private short tarafxaCyclNum;

						private char[] tarafxaBusPrtnrId = Field.fillLowValue(6);

						private char[] tarafxaEndptId = Field.fillLowValue(7);

						private char[] tarafxaXferMthdCd = Field.fillLowValue(1);

						private char[] tarafxaAvailTs = Field.fillLowValue(26);

						private char[] tarafxaBulkId = Field.fillLowValue(4);

						private char[] tarafxaStatCd = Field.fillLowValue(1);

						private char[] tarafxaSndRcvPrmsnCd = Field.fillLowValue(1);

						private char[] tarafxaMcibdioParmTxt = Field.fillLowValue(50);

								private short tarafxaPrtyNum;

						private char[] tarafxaArchLocTxt = Field.fillLowValue(44);

						private char[] tarafxaSvrFileStatCd = Field.fillLowValue(1);

						private char[] tarafxaLstStatTs = Field.fillLowValue(26);

								private long tarafxaXferFileSzNum;

								private int tarafxaTmsXferdCnt;

								private long tarafxaXferRecCnt;

						private char[] tarafxaXferRqstTs = Field.fillLowValue(26);

						private char[] tarafxaXferStrtTs = Field.fillLowValue(26);

						private char[] tarafxaXferStopTs = Field.fillLowValue(26);

						private char[] tarafxaXferRdyTs = Field.fillLowValue(26);

						private char[] tarafxaXferCondCd = Field.fillLowValue(9);

						private char[] tarafxaXferStatTxt = Field.fillLowValue(9);

								private long tarafxaXferPrcssId;

								private long tarafxaOrgXferPrcsId;

						private char[] tarafxaTrgrCondCd = Field.fillLowValue(1);

						private char[] tarafxaTrgrStatTxt = Field.fillLowValue(9);

						private char[] tarafxaOrgLocNam = Field.fillLowValue(16);

						private char[] tarafxaLstUpdtUserId = Field.fillLowValue(9);

						private char[] tarafxaLstUpdtTs = Field.fillLowValue(26);

						private char[] tarafxaTrgrActNam = Field.fillLowValue(8);

						private char[] tarafxaPrvMnfrmFileNam = Field.fillLowValue(44);

								private short tarafxaPrvCyclNum;

						private char[] tarafxaPrvBusPrtnrId = Field.fillLowValue(6);

						private char[] tarafxaPrvEndptId = Field.fillLowValue(7);

						private char[] tarafxaPrvAvailTs = Field.fillLowValue(26);

						private char[] tarafxaNxtMnfrmFileNam = Field.fillLowValue(44);

								private short tarafxaNxtCyclNum;

						private char[] tarafxaNxtBusPrtnrId = Field.fillLowValue(6);

						private char[] tarafxaNxtEndptId = Field.fillLowValue(7);

						private char[] tarafxaNxtAvailTs = Field.fillLowValue(26);

						private char[] tarafxaApplExitJobNam = Field.fillLowValue(8);

						private char[] tarafxaApplExitTs = Field.fillLowValue(26);

						private char[] tarafxaCsMipId = Field.fillLowValue(3);

						private char[] tarafxaRmMipId = Field.fillLowValue(3);

						private char[] tarafxaApplExitNam = Field.fillLowValue(8);

						private char[] tarafxaTapeCmpltdSw = Field.fillLowValue(1);

						private char[] tarafxaTapeMultVolSw = Field.fillLowValue(1);

						private char[] tarafxaApplPrcssngDt = Field.fillLowValue(10);

						private char[] tarafxaTransitionalDsn = Field.fillLowValue(44);

						private char[] tarafxaSourceHubId = Field.fillLowValue(8);

						private char[] tarafxaOwningHubId = Field.fillLowValue(8);

						private char[] tarafxaStatRefId = Field.fillLowValue(4);

						private char[] tarafxaSrcLocEntNam = Field.fillLowValue(10);

						private char[] tarafxaSrcTaskNam = Field.fillLowValue(10);

						private char[] tarafxaSrcTaskId = Field.fillLowValue(13);
				private TarafxaSrcTaskUsr tarafxaSrcTaskUsr = new TarafxaSrcTaskUsr();

						private char[] tarafxaSrcTaskStrtTs = Field.fillLowValue(26);

						private char[] tarafxaSrcTaskStopTs = Field.fillLowValue(26);

						private char[] tarafxaTrgtLocEntNam = Field.fillLowValue(10);

						private char[] tarafxaTrgtTaskNam = Field.fillLowValue(10);

						private char[] tarafxaTrgtTaskId = Field.fillLowValue(13);
				private TarafxaTrgtTaskUsr tarafxaTrgtTaskUsr = new TarafxaTrgtTaskUsr();

						private char[] tarafxaTrgtTaskStrtTs = Field.fillLowValue(26);

						private char[] tarafxaTrgtTaskStopTs = Field.fillLowValue(26);
				private TarafxaApplTknNam tarafxaApplTknNam = new TarafxaApplTknNam();
	
	/**
	* Constructor for Tarafxa
	**/
    public Tarafxa() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			tarafxaSrcTaskUsr.setParent(this,getStartOffset() + 764);
	       			tarafxaTrgtTaskUsr.setParent(this,getStartOffset() + 915);
	       			tarafxaApplTknNam.setParent(this,getStartOffset() + 1033);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tarafxaMcMnfrmFileNam
	 *	@return tarafxaMcMnfrmFileNam
	 */
   public char[] getTarafxaMcMnfrmFileNam() throws CFException{
     if (isTarafxaMcMnfrmFileNamModified()) { 
        tarafxaMcMnfrmFileNam = refreshTarafxaMcMnfrmFileNam();
     }
   		return tarafxaMcMnfrmFileNam;
   }

  
	/**
	*  set variable tarafxaMcMnfrmFileNam
	*  Corresponding COBOL Variable is TARAFXA-MC-MNFRM-FILE-NAM
	*  @param value
	**/
   public void setTarafxaMcMnfrmFileNam(char[] value) {
      tarafxaMcMnfrmFileNam = checkTarafxaMcMnfrmFileNamConstraints(value);
      serializeTarafxaMcMnfrmFileNam(tarafxaMcMnfrmFileNam);
   } 

     /**
	 * 	Update TarafxaMcMnfrmFileNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaMcMnfrmFileNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaMcMnfrmFileNam,tarafxaMcMnfrmFileNam.length);
   	
   }
   
   public void setTarafxaMcMnfrmFileNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaMcMnfrmFileNam,tarafxaMcMnfrmFileNam.length);
   	
   }
   
     /**
	 * 	Update TarafxaMcMnfrmFileNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaMcMnfrmFileNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaMcMnfrmFileNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaMcMnfrmFileNam with another Field
	 *	@param value
	 */
   public void setTarafxaMcMnfrmFileNam(Field source) {
       replace(source,0,source.length(),beginTarafxaMcMnfrmFileNam,TARAFXA_MC_MNFRM_FILE_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaMcMnfrmFileNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaMcMnfrmFileNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaMcMnfrmFileNam,TARAFXA_MC_MNFRM_FILE_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaMcMnfrmFileNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaMcMnfrmFileNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaMcMnfrmFileNam+targetIndex,targetLen);
    
   }
	public short getTarafxaCyclNum() throws CFException {
        if (isTarafxaCyclNumModified()) { 
           tarafxaCyclNum = refreshTarafxaCyclNum();
        }
   		return tarafxaCyclNum;
	}
	
	/**
	 * 	Update TarafxaCyclNum with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-CYCL-NUM
	 *	@param number
	 */
	public void setTarafxaCyclNum(short number) {
			tarafxaCyclNum = checkTarafxaCyclNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxaCyclNum(tarafxaCyclNum);
	}

	public void setTarafxaCyclNum(int number) {
	    number = checkTarafxaCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaCyclNum((short)number);
	}
	public void setTarafxaCyclNum(long number) {
	    number = checkTarafxaCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaCyclNum((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaBusPrtnrId
	 *	@return tarafxaBusPrtnrId
	 */
   public char[] getTarafxaBusPrtnrId() throws CFException{
     if (isTarafxaBusPrtnrIdModified()) { 
        tarafxaBusPrtnrId = refreshTarafxaBusPrtnrId();
     }
   		return tarafxaBusPrtnrId;
   }

  
	/**
	*  set variable tarafxaBusPrtnrId
	*  Corresponding COBOL Variable is TARAFXA-BUS-PRTNR-ID
	*  @param value
	**/
   public void setTarafxaBusPrtnrId(char[] value) {
      tarafxaBusPrtnrId = checkTarafxaBusPrtnrIdConstraints(value);
      serializeTarafxaBusPrtnrId(tarafxaBusPrtnrId);
   } 

     /**
	 * 	Update TarafxaBusPrtnrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaBusPrtnrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaBusPrtnrId,tarafxaBusPrtnrId.length);
   	
   }
   
   public void setTarafxaBusPrtnrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaBusPrtnrId,tarafxaBusPrtnrId.length);
   	
   }
   
     /**
	 * 	Update TarafxaBusPrtnrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaBusPrtnrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaBusPrtnrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaBusPrtnrId with another Field
	 *	@param value
	 */
   public void setTarafxaBusPrtnrId(Field source) {
       replace(source,0,source.length(),beginTarafxaBusPrtnrId,TARAFXA_BUS_PRTNR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaBusPrtnrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaBusPrtnrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaBusPrtnrId,TARAFXA_BUS_PRTNR_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaBusPrtnrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaBusPrtnrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaBusPrtnrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaEndptId
	 *	@return tarafxaEndptId
	 */
   public char[] getTarafxaEndptId() throws CFException{
     if (isTarafxaEndptIdModified()) { 
        tarafxaEndptId = refreshTarafxaEndptId();
     }
   		return tarafxaEndptId;
   }

  
	/**
	*  set variable tarafxaEndptId
	*  Corresponding COBOL Variable is TARAFXA-ENDPT-ID
	*  @param value
	**/
   public void setTarafxaEndptId(char[] value) {
      tarafxaEndptId = checkTarafxaEndptIdConstraints(value);
      serializeTarafxaEndptId(tarafxaEndptId);
   } 

     /**
	 * 	Update TarafxaEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaEndptId,tarafxaEndptId.length);
   	
   }
   
   public void setTarafxaEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaEndptId,tarafxaEndptId.length);
   	
   }
   
     /**
	 * 	Update TarafxaEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaEndptId with another Field
	 *	@param value
	 */
   public void setTarafxaEndptId(Field source) {
       replace(source,0,source.length(),beginTarafxaEndptId,TARAFXA_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaEndptId,TARAFXA_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaEndptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaXferMthdCd
	 *	@return tarafxaXferMthdCd
	 */
   public char[] getTarafxaXferMthdCd() throws CFException{
     if (isTarafxaXferMthdCdModified()) { 
        tarafxaXferMthdCd = refreshTarafxaXferMthdCd();
     }
   		return tarafxaXferMthdCd;
   }

  
	/**
	*  set variable tarafxaXferMthdCd
	*  Corresponding COBOL Variable is TARAFXA-XFER-MTHD-CD
	*  @param value
	**/
   public void setTarafxaXferMthdCd(char[] value) {
      tarafxaXferMthdCd = checkTarafxaXferMthdCdConstraints(value);
      serializeTarafxaXferMthdCd(tarafxaXferMthdCd);
   } 

     /**
	 * 	Update TarafxaXferMthdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaXferMthdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaXferMthdCd,tarafxaXferMthdCd.length);
   	
   }
   
   public void setTarafxaXferMthdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferMthdCd,tarafxaXferMthdCd.length);
   	
   }
   
     /**
	 * 	Update TarafxaXferMthdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferMthdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferMthdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaXferMthdCd with another Field
	 *	@param value
	 */
   public void setTarafxaXferMthdCd(Field source) {
       replace(source,0,source.length(),beginTarafxaXferMthdCd,TARAFXA_XFER_MTHD_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaXferMthdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaXferMthdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaXferMthdCd,TARAFXA_XFER_MTHD_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaXferMthdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferMthdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferMthdCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaAvailTs
	 *	@return tarafxaAvailTs
	 */
   public char[] getTarafxaAvailTs() throws CFException{
     if (isTarafxaAvailTsModified()) { 
        tarafxaAvailTs = refreshTarafxaAvailTs();
     }
   		return tarafxaAvailTs;
   }

  
	/**
	*  set variable tarafxaAvailTs
	*  Corresponding COBOL Variable is TARAFXA-AVAIL-TS
	*  @param value
	**/
   public void setTarafxaAvailTs(char[] value) {
      tarafxaAvailTs = checkTarafxaAvailTsConstraints(value);
      serializeTarafxaAvailTs(tarafxaAvailTs);
   } 

     /**
	 * 	Update TarafxaAvailTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaAvailTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaAvailTs,tarafxaAvailTs.length);
   	
   }
   
   public void setTarafxaAvailTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaAvailTs,tarafxaAvailTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaAvailTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaAvailTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaAvailTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaAvailTs with another Field
	 *	@param value
	 */
   public void setTarafxaAvailTs(Field source) {
       replace(source,0,source.length(),beginTarafxaAvailTs,TARAFXA_AVAIL_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaAvailTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaAvailTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaAvailTs,TARAFXA_AVAIL_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaAvailTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaAvailTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaAvailTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaBulkId
	 *	@return tarafxaBulkId
	 */
   public char[] getTarafxaBulkId() throws CFException{
     if (isTarafxaBulkIdModified()) { 
        tarafxaBulkId = refreshTarafxaBulkId();
     }
   		return tarafxaBulkId;
   }

  
	/**
	*  set variable tarafxaBulkId
	*  Corresponding COBOL Variable is TARAFXA-BULK-ID
	*  @param value
	**/
   public void setTarafxaBulkId(char[] value) {
      tarafxaBulkId = checkTarafxaBulkIdConstraints(value);
      serializeTarafxaBulkId(tarafxaBulkId);
   } 

     /**
	 * 	Update TarafxaBulkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaBulkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaBulkId,tarafxaBulkId.length);
   	
   }
   
   public void setTarafxaBulkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaBulkId,tarafxaBulkId.length);
   	
   }
   
     /**
	 * 	Update TarafxaBulkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaBulkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaBulkId with another Field
	 *	@param value
	 */
   public void setTarafxaBulkId(Field source) {
       replace(source,0,source.length(),beginTarafxaBulkId,TARAFXA_BULK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaBulkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaBulkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaBulkId,TARAFXA_BULK_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaBulkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaStatCd
	 *	@return tarafxaStatCd
	 */
   public char[] getTarafxaStatCd() throws CFException{
     if (isTarafxaStatCdModified()) { 
        tarafxaStatCd = refreshTarafxaStatCd();
     }
   		return tarafxaStatCd;
   }

  
	/**
	*  set variable tarafxaStatCd
	*  Corresponding COBOL Variable is TARAFXA-STAT-CD
	*  @param value
	**/
   public void setTarafxaStatCd(char[] value) {
      tarafxaStatCd = checkTarafxaStatCdConstraints(value);
      serializeTarafxaStatCd(tarafxaStatCd);
   } 

     /**
	 * 	Update TarafxaStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaStatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaStatCd,tarafxaStatCd.length);
   	
   }
   
   public void setTarafxaStatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaStatCd,tarafxaStatCd.length);
   	
   }
   
     /**
	 * 	Update TarafxaStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaStatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaStatCd with another Field
	 *	@param value
	 */
   public void setTarafxaStatCd(Field source) {
       replace(source,0,source.length(),beginTarafxaStatCd,TARAFXA_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaStatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaStatCd,TARAFXA_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaStatCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaSndRcvPrmsnCd
	 *	@return tarafxaSndRcvPrmsnCd
	 */
   public char[] getTarafxaSndRcvPrmsnCd() throws CFException{
     if (isTarafxaSndRcvPrmsnCdModified()) { 
        tarafxaSndRcvPrmsnCd = refreshTarafxaSndRcvPrmsnCd();
     }
   		return tarafxaSndRcvPrmsnCd;
   }

  
	/**
	*  set variable tarafxaSndRcvPrmsnCd
	*  Corresponding COBOL Variable is TARAFXA-SND-RCV-PRMSN-CD
	*  @param value
	**/
   public void setTarafxaSndRcvPrmsnCd(char[] value) {
      tarafxaSndRcvPrmsnCd = checkTarafxaSndRcvPrmsnCdConstraints(value);
      serializeTarafxaSndRcvPrmsnCd(tarafxaSndRcvPrmsnCd);
   } 

     /**
	 * 	Update TarafxaSndRcvPrmsnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaSndRcvPrmsnCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaSndRcvPrmsnCd,tarafxaSndRcvPrmsnCd.length);
   	
   }
   
   public void setTarafxaSndRcvPrmsnCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSndRcvPrmsnCd,tarafxaSndRcvPrmsnCd.length);
   	
   }
   
     /**
	 * 	Update TarafxaSndRcvPrmsnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSndRcvPrmsnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSndRcvPrmsnCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaSndRcvPrmsnCd with another Field
	 *	@param value
	 */
   public void setTarafxaSndRcvPrmsnCd(Field source) {
       replace(source,0,source.length(),beginTarafxaSndRcvPrmsnCd,TARAFXA_SND_RCV_PRMSN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaSndRcvPrmsnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaSndRcvPrmsnCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaSndRcvPrmsnCd,TARAFXA_SND_RCV_PRMSN_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaSndRcvPrmsnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSndRcvPrmsnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSndRcvPrmsnCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaMcibdioParmTxt
	 *	@return tarafxaMcibdioParmTxt
	 */
   public char[] getTarafxaMcibdioParmTxt() throws CFException{
     if (isTarafxaMcibdioParmTxtModified()) { 
        tarafxaMcibdioParmTxt = refreshTarafxaMcibdioParmTxt();
     }
   		return tarafxaMcibdioParmTxt;
   }

  
	/**
	*  set variable tarafxaMcibdioParmTxt
	*  Corresponding COBOL Variable is TARAFXA-MCIBDIO-PARM-TXT
	*  @param value
	**/
   public void setTarafxaMcibdioParmTxt(char[] value) {
      tarafxaMcibdioParmTxt = checkTarafxaMcibdioParmTxtConstraints(value);
      serializeTarafxaMcibdioParmTxt(tarafxaMcibdioParmTxt);
   } 

     /**
	 * 	Update TarafxaMcibdioParmTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaMcibdioParmTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaMcibdioParmTxt,tarafxaMcibdioParmTxt.length);
   	
   }
   
   public void setTarafxaMcibdioParmTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaMcibdioParmTxt,tarafxaMcibdioParmTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxaMcibdioParmTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaMcibdioParmTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaMcibdioParmTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaMcibdioParmTxt with another Field
	 *	@param value
	 */
   public void setTarafxaMcibdioParmTxt(Field source) {
       replace(source,0,source.length(),beginTarafxaMcibdioParmTxt,TARAFXA_MCIBDIO_PARM_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaMcibdioParmTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaMcibdioParmTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaMcibdioParmTxt,TARAFXA_MCIBDIO_PARM_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaMcibdioParmTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaMcibdioParmTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaMcibdioParmTxt+targetIndex,targetLen);
    
   }
	public short getTarafxaPrtyNum() throws CFException {
        if (isTarafxaPrtyNumModified()) { 
           tarafxaPrtyNum = refreshTarafxaPrtyNum();
        }
   		return tarafxaPrtyNum;
	}
	
	/**
	 * 	Update TarafxaPrtyNum with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-PRTY-NUM
	 *	@param number
	 */
	public void setTarafxaPrtyNum(short number) {
			tarafxaPrtyNum = checkTarafxaPrtyNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxaPrtyNum(tarafxaPrtyNum);
	}

	public void setTarafxaPrtyNum(int number) {
	    number = checkTarafxaPrtyNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrtyNum((short)number);
	}
	public void setTarafxaPrtyNum(long number) {
	    number = checkTarafxaPrtyNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrtyNum((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaArchLocTxt
	 *	@return tarafxaArchLocTxt
	 */
   public char[] getTarafxaArchLocTxt() throws CFException{
     if (isTarafxaArchLocTxtModified()) { 
        tarafxaArchLocTxt = refreshTarafxaArchLocTxt();
     }
   		return tarafxaArchLocTxt;
   }

  
	/**
	*  set variable tarafxaArchLocTxt
	*  Corresponding COBOL Variable is TARAFXA-ARCH-LOC-TXT
	*  @param value
	**/
   public void setTarafxaArchLocTxt(char[] value) {
      tarafxaArchLocTxt = checkTarafxaArchLocTxtConstraints(value);
      serializeTarafxaArchLocTxt(tarafxaArchLocTxt);
   } 

     /**
	 * 	Update TarafxaArchLocTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaArchLocTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaArchLocTxt,tarafxaArchLocTxt.length);
   	
   }
   
   public void setTarafxaArchLocTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaArchLocTxt,tarafxaArchLocTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxaArchLocTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaArchLocTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaArchLocTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaArchLocTxt with another Field
	 *	@param value
	 */
   public void setTarafxaArchLocTxt(Field source) {
       replace(source,0,source.length(),beginTarafxaArchLocTxt,TARAFXA_ARCH_LOC_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaArchLocTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaArchLocTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaArchLocTxt,TARAFXA_ARCH_LOC_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaArchLocTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaArchLocTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaArchLocTxt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaSvrFileStatCd
	 *	@return tarafxaSvrFileStatCd
	 */
   public char[] getTarafxaSvrFileStatCd() throws CFException{
     if (isTarafxaSvrFileStatCdModified()) { 
        tarafxaSvrFileStatCd = refreshTarafxaSvrFileStatCd();
     }
   		return tarafxaSvrFileStatCd;
   }

  
	/**
	*  set variable tarafxaSvrFileStatCd
	*  Corresponding COBOL Variable is TARAFXA-SVR-FILE-STAT-CD
	*  @param value
	**/
   public void setTarafxaSvrFileStatCd(char[] value) {
      tarafxaSvrFileStatCd = checkTarafxaSvrFileStatCdConstraints(value);
      serializeTarafxaSvrFileStatCd(tarafxaSvrFileStatCd);
   } 

     /**
	 * 	Update TarafxaSvrFileStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaSvrFileStatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaSvrFileStatCd,tarafxaSvrFileStatCd.length);
   	
   }
   
   public void setTarafxaSvrFileStatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSvrFileStatCd,tarafxaSvrFileStatCd.length);
   	
   }
   
     /**
	 * 	Update TarafxaSvrFileStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSvrFileStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSvrFileStatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaSvrFileStatCd with another Field
	 *	@param value
	 */
   public void setTarafxaSvrFileStatCd(Field source) {
       replace(source,0,source.length(),beginTarafxaSvrFileStatCd,TARAFXA_SVR_FILE_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaSvrFileStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaSvrFileStatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaSvrFileStatCd,TARAFXA_SVR_FILE_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaSvrFileStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSvrFileStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSvrFileStatCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaLstStatTs
	 *	@return tarafxaLstStatTs
	 */
   public char[] getTarafxaLstStatTs() throws CFException{
     if (isTarafxaLstStatTsModified()) { 
        tarafxaLstStatTs = refreshTarafxaLstStatTs();
     }
   		return tarafxaLstStatTs;
   }

  
	/**
	*  set variable tarafxaLstStatTs
	*  Corresponding COBOL Variable is TARAFXA-LST-STAT-TS
	*  @param value
	**/
   public void setTarafxaLstStatTs(char[] value) {
      tarafxaLstStatTs = checkTarafxaLstStatTsConstraints(value);
      serializeTarafxaLstStatTs(tarafxaLstStatTs);
   } 

     /**
	 * 	Update TarafxaLstStatTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaLstStatTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaLstStatTs,tarafxaLstStatTs.length);
   	
   }
   
   public void setTarafxaLstStatTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaLstStatTs,tarafxaLstStatTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaLstStatTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaLstStatTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaLstStatTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaLstStatTs with another Field
	 *	@param value
	 */
   public void setTarafxaLstStatTs(Field source) {
       replace(source,0,source.length(),beginTarafxaLstStatTs,TARAFXA_LST_STAT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaLstStatTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaLstStatTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaLstStatTs,TARAFXA_LST_STAT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaLstStatTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaLstStatTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaLstStatTs+targetIndex,targetLen);
    
   }
	public long getTarafxaXferFileSzNum() throws CFException {
        if (isTarafxaXferFileSzNumModified()) { 
           tarafxaXferFileSzNum = refreshTarafxaXferFileSzNum();
        }
   		return tarafxaXferFileSzNum;
	}
	
	/**
	 * 	Update TarafxaXferFileSzNum with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-XFER-FILE-SZ-NUM
	 *	@param number
	 */
	public void setTarafxaXferFileSzNum(long number) {
			tarafxaXferFileSzNum = checkTarafxaXferFileSzNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxaXferFileSzNum(tarafxaXferFileSzNum);
	}


	public int getTarafxaTmsXferdCnt() throws CFException {
        if (isTarafxaTmsXferdCntModified()) { 
           tarafxaTmsXferdCnt = refreshTarafxaTmsXferdCnt();
        }
   		return tarafxaTmsXferdCnt;
	}
	
	/**
	 * 	Update TarafxaTmsXferdCnt with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TMS-XFERD-CNT
	 *	@param number
	 */
	public void setTarafxaTmsXferdCnt(int number) {
			tarafxaTmsXferdCnt = checkTarafxaTmsXferdCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxaTmsXferdCnt(tarafxaTmsXferdCnt);
	}


	public void setTarafxaTmsXferdCnt(long number) {
	    number = checkTarafxaTmsXferdCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTarafxaTmsXferdCnt((int)number);
	}
	
	public long getTarafxaXferRecCnt() throws CFException {
        if (isTarafxaXferRecCntModified()) { 
           tarafxaXferRecCnt = refreshTarafxaXferRecCnt();
        }
   		return tarafxaXferRecCnt;
	}
	
	/**
	 * 	Update TarafxaXferRecCnt with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-XFER-REC-CNT
	 *	@param number
	 */
	public void setTarafxaXferRecCnt(long number) {
			tarafxaXferRecCnt = checkTarafxaXferRecCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxaXferRecCnt(tarafxaXferRecCnt);
	}


	/**
	 *	Returns the value of tarafxaXferRqstTs
	 *	@return tarafxaXferRqstTs
	 */
   public char[] getTarafxaXferRqstTs() throws CFException{
     if (isTarafxaXferRqstTsModified()) { 
        tarafxaXferRqstTs = refreshTarafxaXferRqstTs();
     }
   		return tarafxaXferRqstTs;
   }

  
	/**
	*  set variable tarafxaXferRqstTs
	*  Corresponding COBOL Variable is TARAFXA-XFER-RQST-TS
	*  @param value
	**/
   public void setTarafxaXferRqstTs(char[] value) {
      tarafxaXferRqstTs = checkTarafxaXferRqstTsConstraints(value);
      serializeTarafxaXferRqstTs(tarafxaXferRqstTs);
   } 

     /**
	 * 	Update TarafxaXferRqstTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaXferRqstTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaXferRqstTs,tarafxaXferRqstTs.length);
   	
   }
   
   public void setTarafxaXferRqstTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferRqstTs,tarafxaXferRqstTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaXferRqstTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferRqstTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferRqstTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaXferRqstTs with another Field
	 *	@param value
	 */
   public void setTarafxaXferRqstTs(Field source) {
       replace(source,0,source.length(),beginTarafxaXferRqstTs,TARAFXA_XFER_RQST_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaXferRqstTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaXferRqstTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaXferRqstTs,TARAFXA_XFER_RQST_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaXferRqstTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferRqstTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferRqstTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaXferStrtTs
	 *	@return tarafxaXferStrtTs
	 */
   public char[] getTarafxaXferStrtTs() throws CFException{
     if (isTarafxaXferStrtTsModified()) { 
        tarafxaXferStrtTs = refreshTarafxaXferStrtTs();
     }
   		return tarafxaXferStrtTs;
   }

  
	/**
	*  set variable tarafxaXferStrtTs
	*  Corresponding COBOL Variable is TARAFXA-XFER-STRT-TS
	*  @param value
	**/
   public void setTarafxaXferStrtTs(char[] value) {
      tarafxaXferStrtTs = checkTarafxaXferStrtTsConstraints(value);
      serializeTarafxaXferStrtTs(tarafxaXferStrtTs);
   } 

     /**
	 * 	Update TarafxaXferStrtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaXferStrtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaXferStrtTs,tarafxaXferStrtTs.length);
   	
   }
   
   public void setTarafxaXferStrtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferStrtTs,tarafxaXferStrtTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaXferStrtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferStrtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferStrtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaXferStrtTs with another Field
	 *	@param value
	 */
   public void setTarafxaXferStrtTs(Field source) {
       replace(source,0,source.length(),beginTarafxaXferStrtTs,TARAFXA_XFER_STRT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaXferStrtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaXferStrtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaXferStrtTs,TARAFXA_XFER_STRT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaXferStrtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferStrtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferStrtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaXferStopTs
	 *	@return tarafxaXferStopTs
	 */
   public char[] getTarafxaXferStopTs() throws CFException{
     if (isTarafxaXferStopTsModified()) { 
        tarafxaXferStopTs = refreshTarafxaXferStopTs();
     }
   		return tarafxaXferStopTs;
   }

  
	/**
	*  set variable tarafxaXferStopTs
	*  Corresponding COBOL Variable is TARAFXA-XFER-STOP-TS
	*  @param value
	**/
   public void setTarafxaXferStopTs(char[] value) {
      tarafxaXferStopTs = checkTarafxaXferStopTsConstraints(value);
      serializeTarafxaXferStopTs(tarafxaXferStopTs);
   } 

     /**
	 * 	Update TarafxaXferStopTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaXferStopTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaXferStopTs,tarafxaXferStopTs.length);
   	
   }
   
   public void setTarafxaXferStopTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferStopTs,tarafxaXferStopTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaXferStopTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferStopTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferStopTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaXferStopTs with another Field
	 *	@param value
	 */
   public void setTarafxaXferStopTs(Field source) {
       replace(source,0,source.length(),beginTarafxaXferStopTs,TARAFXA_XFER_STOP_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaXferStopTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaXferStopTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaXferStopTs,TARAFXA_XFER_STOP_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaXferStopTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferStopTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferStopTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaXferRdyTs
	 *	@return tarafxaXferRdyTs
	 */
   public char[] getTarafxaXferRdyTs() throws CFException{
     if (isTarafxaXferRdyTsModified()) { 
        tarafxaXferRdyTs = refreshTarafxaXferRdyTs();
     }
   		return tarafxaXferRdyTs;
   }

  
	/**
	*  set variable tarafxaXferRdyTs
	*  Corresponding COBOL Variable is TARAFXA-XFER-RDY-TS
	*  @param value
	**/
   public void setTarafxaXferRdyTs(char[] value) {
      tarafxaXferRdyTs = checkTarafxaXferRdyTsConstraints(value);
      serializeTarafxaXferRdyTs(tarafxaXferRdyTs);
   } 

     /**
	 * 	Update TarafxaXferRdyTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaXferRdyTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaXferRdyTs,tarafxaXferRdyTs.length);
   	
   }
   
   public void setTarafxaXferRdyTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferRdyTs,tarafxaXferRdyTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaXferRdyTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferRdyTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferRdyTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaXferRdyTs with another Field
	 *	@param value
	 */
   public void setTarafxaXferRdyTs(Field source) {
       replace(source,0,source.length(),beginTarafxaXferRdyTs,TARAFXA_XFER_RDY_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaXferRdyTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaXferRdyTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaXferRdyTs,TARAFXA_XFER_RDY_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaXferRdyTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferRdyTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferRdyTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaXferCondCd
	 *	@return tarafxaXferCondCd
	 */
   public char[] getTarafxaXferCondCd() throws CFException{
     if (isTarafxaXferCondCdModified()) { 
        tarafxaXferCondCd = refreshTarafxaXferCondCd();
     }
   		return tarafxaXferCondCd;
   }

  
	/**
	*  set variable tarafxaXferCondCd
	*  Corresponding COBOL Variable is TARAFXA-XFER-COND-CD
	*  @param value
	**/
   public void setTarafxaXferCondCd(char[] value) {
      tarafxaXferCondCd = checkTarafxaXferCondCdConstraints(value);
      serializeTarafxaXferCondCd(tarafxaXferCondCd);
   } 

     /**
	 * 	Update TarafxaXferCondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaXferCondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaXferCondCd,tarafxaXferCondCd.length);
   	
   }
   
   public void setTarafxaXferCondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferCondCd,tarafxaXferCondCd.length);
   	
   }
   
     /**
	 * 	Update TarafxaXferCondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferCondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferCondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaXferCondCd with another Field
	 *	@param value
	 */
   public void setTarafxaXferCondCd(Field source) {
       replace(source,0,source.length(),beginTarafxaXferCondCd,TARAFXA_XFER_COND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaXferCondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaXferCondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaXferCondCd,TARAFXA_XFER_COND_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaXferCondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferCondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferCondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaXferStatTxt
	 *	@return tarafxaXferStatTxt
	 */
   public char[] getTarafxaXferStatTxt() throws CFException{
     if (isTarafxaXferStatTxtModified()) { 
        tarafxaXferStatTxt = refreshTarafxaXferStatTxt();
     }
   		return tarafxaXferStatTxt;
   }

  
	/**
	*  set variable tarafxaXferStatTxt
	*  Corresponding COBOL Variable is TARAFXA-XFER-STAT-TXT
	*  @param value
	**/
   public void setTarafxaXferStatTxt(char[] value) {
      tarafxaXferStatTxt = checkTarafxaXferStatTxtConstraints(value);
      serializeTarafxaXferStatTxt(tarafxaXferStatTxt);
   } 

     /**
	 * 	Update TarafxaXferStatTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaXferStatTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaXferStatTxt,tarafxaXferStatTxt.length);
   	
   }
   
   public void setTarafxaXferStatTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferStatTxt,tarafxaXferStatTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxaXferStatTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferStatTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferStatTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaXferStatTxt with another Field
	 *	@param value
	 */
   public void setTarafxaXferStatTxt(Field source) {
       replace(source,0,source.length(),beginTarafxaXferStatTxt,TARAFXA_XFER_STAT_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaXferStatTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaXferStatTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaXferStatTxt,TARAFXA_XFER_STAT_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaXferStatTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaXferStatTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaXferStatTxt+targetIndex,targetLen);
    
   }
	public long getTarafxaXferPrcssId() throws CFException {
        if (isTarafxaXferPrcssIdModified()) { 
           tarafxaXferPrcssId = refreshTarafxaXferPrcssId();
        }
   		return tarafxaXferPrcssId;
	}
	
	/**
	 * 	Update TarafxaXferPrcssId with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-XFER-PRCSS-ID
	 *	@param number
	 */
	public void setTarafxaXferPrcssId(long number) {
			tarafxaXferPrcssId = checkTarafxaXferPrcssIdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxaXferPrcssId(tarafxaXferPrcssId);
	}


	public long getTarafxaOrgXferPrcsId() throws CFException {
        if (isTarafxaOrgXferPrcsIdModified()) { 
           tarafxaOrgXferPrcsId = refreshTarafxaOrgXferPrcsId();
        }
   		return tarafxaOrgXferPrcsId;
	}
	
	/**
	 * 	Update TarafxaOrgXferPrcsId with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-ORG-XFER-PRCS-ID
	 *	@param number
	 */
	public void setTarafxaOrgXferPrcsId(long number) {
			tarafxaOrgXferPrcsId = checkTarafxaOrgXferPrcsIdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxaOrgXferPrcsId(tarafxaOrgXferPrcsId);
	}


	/**
	 *	Returns the value of tarafxaTrgrCondCd
	 *	@return tarafxaTrgrCondCd
	 */
   public char[] getTarafxaTrgrCondCd() throws CFException{
     if (isTarafxaTrgrCondCdModified()) { 
        tarafxaTrgrCondCd = refreshTarafxaTrgrCondCd();
     }
   		return tarafxaTrgrCondCd;
   }

  
	/**
	*  set variable tarafxaTrgrCondCd
	*  Corresponding COBOL Variable is TARAFXA-TRGR-COND-CD
	*  @param value
	**/
   public void setTarafxaTrgrCondCd(char[] value) {
      tarafxaTrgrCondCd = checkTarafxaTrgrCondCdConstraints(value);
      serializeTarafxaTrgrCondCd(tarafxaTrgrCondCd);
   } 

     /**
	 * 	Update TarafxaTrgrCondCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTrgrCondCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaTrgrCondCd,tarafxaTrgrCondCd.length);
   	
   }
   
   public void setTarafxaTrgrCondCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgrCondCd,tarafxaTrgrCondCd.length);
   	
   }
   
     /**
	 * 	Update TarafxaTrgrCondCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgrCondCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgrCondCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaTrgrCondCd with another Field
	 *	@param value
	 */
   public void setTarafxaTrgrCondCd(Field source) {
       replace(source,0,source.length(),beginTarafxaTrgrCondCd,TARAFXA_TRGR_COND_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaTrgrCondCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaTrgrCondCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaTrgrCondCd,TARAFXA_TRGR_COND_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaTrgrCondCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgrCondCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgrCondCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaTrgrStatTxt
	 *	@return tarafxaTrgrStatTxt
	 */
   public char[] getTarafxaTrgrStatTxt() throws CFException{
     if (isTarafxaTrgrStatTxtModified()) { 
        tarafxaTrgrStatTxt = refreshTarafxaTrgrStatTxt();
     }
   		return tarafxaTrgrStatTxt;
   }

  
	/**
	*  set variable tarafxaTrgrStatTxt
	*  Corresponding COBOL Variable is TARAFXA-TRGR-STAT-TXT
	*  @param value
	**/
   public void setTarafxaTrgrStatTxt(char[] value) {
      tarafxaTrgrStatTxt = checkTarafxaTrgrStatTxtConstraints(value);
      serializeTarafxaTrgrStatTxt(tarafxaTrgrStatTxt);
   } 

     /**
	 * 	Update TarafxaTrgrStatTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTrgrStatTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaTrgrStatTxt,tarafxaTrgrStatTxt.length);
   	
   }
   
   public void setTarafxaTrgrStatTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgrStatTxt,tarafxaTrgrStatTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxaTrgrStatTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgrStatTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgrStatTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaTrgrStatTxt with another Field
	 *	@param value
	 */
   public void setTarafxaTrgrStatTxt(Field source) {
       replace(source,0,source.length(),beginTarafxaTrgrStatTxt,TARAFXA_TRGR_STAT_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaTrgrStatTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaTrgrStatTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaTrgrStatTxt,TARAFXA_TRGR_STAT_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaTrgrStatTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgrStatTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgrStatTxt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaOrgLocNam
	 *	@return tarafxaOrgLocNam
	 */
   public char[] getTarafxaOrgLocNam() throws CFException{
     if (isTarafxaOrgLocNamModified()) { 
        tarafxaOrgLocNam = refreshTarafxaOrgLocNam();
     }
   		return tarafxaOrgLocNam;
   }

  
	/**
	*  set variable tarafxaOrgLocNam
	*  Corresponding COBOL Variable is TARAFXA-ORG-LOC-NAM
	*  @param value
	**/
   public void setTarafxaOrgLocNam(char[] value) {
      tarafxaOrgLocNam = checkTarafxaOrgLocNamConstraints(value);
      serializeTarafxaOrgLocNam(tarafxaOrgLocNam);
   } 

     /**
	 * 	Update TarafxaOrgLocNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaOrgLocNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaOrgLocNam,tarafxaOrgLocNam.length);
   	
   }
   
   public void setTarafxaOrgLocNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaOrgLocNam,tarafxaOrgLocNam.length);
   	
   }
   
     /**
	 * 	Update TarafxaOrgLocNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaOrgLocNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaOrgLocNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaOrgLocNam with another Field
	 *	@param value
	 */
   public void setTarafxaOrgLocNam(Field source) {
       replace(source,0,source.length(),beginTarafxaOrgLocNam,TARAFXA_ORG_LOC_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaOrgLocNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaOrgLocNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaOrgLocNam,TARAFXA_ORG_LOC_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaOrgLocNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaOrgLocNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaOrgLocNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaLstUpdtUserId
	 *	@return tarafxaLstUpdtUserId
	 */
   public char[] getTarafxaLstUpdtUserId() throws CFException{
     if (isTarafxaLstUpdtUserIdModified()) { 
        tarafxaLstUpdtUserId = refreshTarafxaLstUpdtUserId();
     }
   		return tarafxaLstUpdtUserId;
   }

  
	/**
	*  set variable tarafxaLstUpdtUserId
	*  Corresponding COBOL Variable is TARAFXA-LST-UPDT-USER-ID
	*  @param value
	**/
   public void setTarafxaLstUpdtUserId(char[] value) {
      tarafxaLstUpdtUserId = checkTarafxaLstUpdtUserIdConstraints(value);
      serializeTarafxaLstUpdtUserId(tarafxaLstUpdtUserId);
   } 

     /**
	 * 	Update TarafxaLstUpdtUserId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaLstUpdtUserId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaLstUpdtUserId,tarafxaLstUpdtUserId.length);
   	
   }
   
   public void setTarafxaLstUpdtUserId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaLstUpdtUserId,tarafxaLstUpdtUserId.length);
   	
   }
   
     /**
	 * 	Update TarafxaLstUpdtUserId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaLstUpdtUserId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaLstUpdtUserId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaLstUpdtUserId with another Field
	 *	@param value
	 */
   public void setTarafxaLstUpdtUserId(Field source) {
       replace(source,0,source.length(),beginTarafxaLstUpdtUserId,TARAFXA_LST_UPDT_USER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaLstUpdtUserId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaLstUpdtUserId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaLstUpdtUserId,TARAFXA_LST_UPDT_USER_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaLstUpdtUserId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaLstUpdtUserId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaLstUpdtUserId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaLstUpdtTs
	 *	@return tarafxaLstUpdtTs
	 */
   public char[] getTarafxaLstUpdtTs() throws CFException{
     if (isTarafxaLstUpdtTsModified()) { 
        tarafxaLstUpdtTs = refreshTarafxaLstUpdtTs();
     }
   		return tarafxaLstUpdtTs;
   }

  
	/**
	*  set variable tarafxaLstUpdtTs
	*  Corresponding COBOL Variable is TARAFXA-LST-UPDT-TS
	*  @param value
	**/
   public void setTarafxaLstUpdtTs(char[] value) {
      tarafxaLstUpdtTs = checkTarafxaLstUpdtTsConstraints(value);
      serializeTarafxaLstUpdtTs(tarafxaLstUpdtTs);
   } 

     /**
	 * 	Update TarafxaLstUpdtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaLstUpdtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaLstUpdtTs,tarafxaLstUpdtTs.length);
   	
   }
   
   public void setTarafxaLstUpdtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaLstUpdtTs,tarafxaLstUpdtTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaLstUpdtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaLstUpdtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaLstUpdtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaLstUpdtTs with another Field
	 *	@param value
	 */
   public void setTarafxaLstUpdtTs(Field source) {
       replace(source,0,source.length(),beginTarafxaLstUpdtTs,TARAFXA_LST_UPDT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaLstUpdtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaLstUpdtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaLstUpdtTs,TARAFXA_LST_UPDT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaLstUpdtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaLstUpdtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaLstUpdtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaTrgrActNam
	 *	@return tarafxaTrgrActNam
	 */
   public char[] getTarafxaTrgrActNam() throws CFException{
     if (isTarafxaTrgrActNamModified()) { 
        tarafxaTrgrActNam = refreshTarafxaTrgrActNam();
     }
   		return tarafxaTrgrActNam;
   }

  
	/**
	*  set variable tarafxaTrgrActNam
	*  Corresponding COBOL Variable is TARAFXA-TRGR-ACT-NAM
	*  @param value
	**/
   public void setTarafxaTrgrActNam(char[] value) {
      tarafxaTrgrActNam = checkTarafxaTrgrActNamConstraints(value);
      serializeTarafxaTrgrActNam(tarafxaTrgrActNam);
   } 

     /**
	 * 	Update TarafxaTrgrActNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTrgrActNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaTrgrActNam,tarafxaTrgrActNam.length);
   	
   }
   
   public void setTarafxaTrgrActNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgrActNam,tarafxaTrgrActNam.length);
   	
   }
   
     /**
	 * 	Update TarafxaTrgrActNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgrActNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgrActNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaTrgrActNam with another Field
	 *	@param value
	 */
   public void setTarafxaTrgrActNam(Field source) {
       replace(source,0,source.length(),beginTarafxaTrgrActNam,TARAFXA_TRGR_ACT_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaTrgrActNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaTrgrActNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaTrgrActNam,TARAFXA_TRGR_ACT_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaTrgrActNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgrActNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgrActNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaPrvMnfrmFileNam
	 *	@return tarafxaPrvMnfrmFileNam
	 */
   public char[] getTarafxaPrvMnfrmFileNam() throws CFException{
     if (isTarafxaPrvMnfrmFileNamModified()) { 
        tarafxaPrvMnfrmFileNam = refreshTarafxaPrvMnfrmFileNam();
     }
   		return tarafxaPrvMnfrmFileNam;
   }

  
	/**
	*  set variable tarafxaPrvMnfrmFileNam
	*  Corresponding COBOL Variable is TARAFXA-PRV-MNFRM-FILE-NAM
	*  @param value
	**/
   public void setTarafxaPrvMnfrmFileNam(char[] value) {
      tarafxaPrvMnfrmFileNam = checkTarafxaPrvMnfrmFileNamConstraints(value);
      serializeTarafxaPrvMnfrmFileNam(tarafxaPrvMnfrmFileNam);
   } 

     /**
	 * 	Update TarafxaPrvMnfrmFileNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaPrvMnfrmFileNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaPrvMnfrmFileNam,tarafxaPrvMnfrmFileNam.length);
   	
   }
   
   public void setTarafxaPrvMnfrmFileNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaPrvMnfrmFileNam,tarafxaPrvMnfrmFileNam.length);
   	
   }
   
     /**
	 * 	Update TarafxaPrvMnfrmFileNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaPrvMnfrmFileNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaPrvMnfrmFileNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaPrvMnfrmFileNam with another Field
	 *	@param value
	 */
   public void setTarafxaPrvMnfrmFileNam(Field source) {
       replace(source,0,source.length(),beginTarafxaPrvMnfrmFileNam,TARAFXA_PRV_MNFRM_FILE_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaPrvMnfrmFileNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaPrvMnfrmFileNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaPrvMnfrmFileNam,TARAFXA_PRV_MNFRM_FILE_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaPrvMnfrmFileNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaPrvMnfrmFileNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaPrvMnfrmFileNam+targetIndex,targetLen);
    
   }
	public short getTarafxaPrvCyclNum() throws CFException {
        if (isTarafxaPrvCyclNumModified()) { 
           tarafxaPrvCyclNum = refreshTarafxaPrvCyclNum();
        }
   		return tarafxaPrvCyclNum;
	}
	
	/**
	 * 	Update TarafxaPrvCyclNum with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-PRV-CYCL-NUM
	 *	@param number
	 */
	public void setTarafxaPrvCyclNum(short number) {
			tarafxaPrvCyclNum = checkTarafxaPrvCyclNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxaPrvCyclNum(tarafxaPrvCyclNum);
	}

	public void setTarafxaPrvCyclNum(int number) {
	    number = checkTarafxaPrvCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrvCyclNum((short)number);
	}
	public void setTarafxaPrvCyclNum(long number) {
	    number = checkTarafxaPrvCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrvCyclNum((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaPrvBusPrtnrId
	 *	@return tarafxaPrvBusPrtnrId
	 */
   public char[] getTarafxaPrvBusPrtnrId() throws CFException{
     if (isTarafxaPrvBusPrtnrIdModified()) { 
        tarafxaPrvBusPrtnrId = refreshTarafxaPrvBusPrtnrId();
     }
   		return tarafxaPrvBusPrtnrId;
   }

  
	/**
	*  set variable tarafxaPrvBusPrtnrId
	*  Corresponding COBOL Variable is TARAFXA-PRV-BUS-PRTNR-ID
	*  @param value
	**/
   public void setTarafxaPrvBusPrtnrId(char[] value) {
      tarafxaPrvBusPrtnrId = checkTarafxaPrvBusPrtnrIdConstraints(value);
      serializeTarafxaPrvBusPrtnrId(tarafxaPrvBusPrtnrId);
   } 

     /**
	 * 	Update TarafxaPrvBusPrtnrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaPrvBusPrtnrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaPrvBusPrtnrId,tarafxaPrvBusPrtnrId.length);
   	
   }
   
   public void setTarafxaPrvBusPrtnrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaPrvBusPrtnrId,tarafxaPrvBusPrtnrId.length);
   	
   }
   
     /**
	 * 	Update TarafxaPrvBusPrtnrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaPrvBusPrtnrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaPrvBusPrtnrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaPrvBusPrtnrId with another Field
	 *	@param value
	 */
   public void setTarafxaPrvBusPrtnrId(Field source) {
       replace(source,0,source.length(),beginTarafxaPrvBusPrtnrId,TARAFXA_PRV_BUS_PRTNR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaPrvBusPrtnrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaPrvBusPrtnrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaPrvBusPrtnrId,TARAFXA_PRV_BUS_PRTNR_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaPrvBusPrtnrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaPrvBusPrtnrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaPrvBusPrtnrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaPrvEndptId
	 *	@return tarafxaPrvEndptId
	 */
   public char[] getTarafxaPrvEndptId() throws CFException{
     if (isTarafxaPrvEndptIdModified()) { 
        tarafxaPrvEndptId = refreshTarafxaPrvEndptId();
     }
   		return tarafxaPrvEndptId;
   }

  
	/**
	*  set variable tarafxaPrvEndptId
	*  Corresponding COBOL Variable is TARAFXA-PRV-ENDPT-ID
	*  @param value
	**/
   public void setTarafxaPrvEndptId(char[] value) {
      tarafxaPrvEndptId = checkTarafxaPrvEndptIdConstraints(value);
      serializeTarafxaPrvEndptId(tarafxaPrvEndptId);
   } 

     /**
	 * 	Update TarafxaPrvEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaPrvEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaPrvEndptId,tarafxaPrvEndptId.length);
   	
   }
   
   public void setTarafxaPrvEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaPrvEndptId,tarafxaPrvEndptId.length);
   	
   }
   
     /**
	 * 	Update TarafxaPrvEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaPrvEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaPrvEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaPrvEndptId with another Field
	 *	@param value
	 */
   public void setTarafxaPrvEndptId(Field source) {
       replace(source,0,source.length(),beginTarafxaPrvEndptId,TARAFXA_PRV_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaPrvEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaPrvEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaPrvEndptId,TARAFXA_PRV_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaPrvEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaPrvEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaPrvEndptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaPrvAvailTs
	 *	@return tarafxaPrvAvailTs
	 */
   public char[] getTarafxaPrvAvailTs() throws CFException{
     if (isTarafxaPrvAvailTsModified()) { 
        tarafxaPrvAvailTs = refreshTarafxaPrvAvailTs();
     }
   		return tarafxaPrvAvailTs;
   }

  
	/**
	*  set variable tarafxaPrvAvailTs
	*  Corresponding COBOL Variable is TARAFXA-PRV-AVAIL-TS
	*  @param value
	**/
   public void setTarafxaPrvAvailTs(char[] value) {
      tarafxaPrvAvailTs = checkTarafxaPrvAvailTsConstraints(value);
      serializeTarafxaPrvAvailTs(tarafxaPrvAvailTs);
   } 

     /**
	 * 	Update TarafxaPrvAvailTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaPrvAvailTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaPrvAvailTs,tarafxaPrvAvailTs.length);
   	
   }
   
   public void setTarafxaPrvAvailTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaPrvAvailTs,tarafxaPrvAvailTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaPrvAvailTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaPrvAvailTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaPrvAvailTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaPrvAvailTs with another Field
	 *	@param value
	 */
   public void setTarafxaPrvAvailTs(Field source) {
       replace(source,0,source.length(),beginTarafxaPrvAvailTs,TARAFXA_PRV_AVAIL_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaPrvAvailTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaPrvAvailTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaPrvAvailTs,TARAFXA_PRV_AVAIL_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaPrvAvailTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaPrvAvailTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaPrvAvailTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaNxtMnfrmFileNam
	 *	@return tarafxaNxtMnfrmFileNam
	 */
   public char[] getTarafxaNxtMnfrmFileNam() throws CFException{
     if (isTarafxaNxtMnfrmFileNamModified()) { 
        tarafxaNxtMnfrmFileNam = refreshTarafxaNxtMnfrmFileNam();
     }
   		return tarafxaNxtMnfrmFileNam;
   }

  
	/**
	*  set variable tarafxaNxtMnfrmFileNam
	*  Corresponding COBOL Variable is TARAFXA-NXT-MNFRM-FILE-NAM
	*  @param value
	**/
   public void setTarafxaNxtMnfrmFileNam(char[] value) {
      tarafxaNxtMnfrmFileNam = checkTarafxaNxtMnfrmFileNamConstraints(value);
      serializeTarafxaNxtMnfrmFileNam(tarafxaNxtMnfrmFileNam);
   } 

     /**
	 * 	Update TarafxaNxtMnfrmFileNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaNxtMnfrmFileNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaNxtMnfrmFileNam,tarafxaNxtMnfrmFileNam.length);
   	
   }
   
   public void setTarafxaNxtMnfrmFileNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaNxtMnfrmFileNam,tarafxaNxtMnfrmFileNam.length);
   	
   }
   
     /**
	 * 	Update TarafxaNxtMnfrmFileNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaNxtMnfrmFileNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaNxtMnfrmFileNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaNxtMnfrmFileNam with another Field
	 *	@param value
	 */
   public void setTarafxaNxtMnfrmFileNam(Field source) {
       replace(source,0,source.length(),beginTarafxaNxtMnfrmFileNam,TARAFXA_NXT_MNFRM_FILE_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaNxtMnfrmFileNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaNxtMnfrmFileNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaNxtMnfrmFileNam,TARAFXA_NXT_MNFRM_FILE_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaNxtMnfrmFileNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaNxtMnfrmFileNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaNxtMnfrmFileNam+targetIndex,targetLen);
    
   }
	public short getTarafxaNxtCyclNum() throws CFException {
        if (isTarafxaNxtCyclNumModified()) { 
           tarafxaNxtCyclNum = refreshTarafxaNxtCyclNum();
        }
   		return tarafxaNxtCyclNum;
	}
	
	/**
	 * 	Update TarafxaNxtCyclNum with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-NXT-CYCL-NUM
	 *	@param number
	 */
	public void setTarafxaNxtCyclNum(short number) {
			tarafxaNxtCyclNum = checkTarafxaNxtCyclNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafxaNxtCyclNum(tarafxaNxtCyclNum);
	}

	public void setTarafxaNxtCyclNum(int number) {
	    number = checkTarafxaNxtCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaNxtCyclNum((short)number);
	}
	public void setTarafxaNxtCyclNum(long number) {
	    number = checkTarafxaNxtCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaNxtCyclNum((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaNxtBusPrtnrId
	 *	@return tarafxaNxtBusPrtnrId
	 */
   public char[] getTarafxaNxtBusPrtnrId() throws CFException{
     if (isTarafxaNxtBusPrtnrIdModified()) { 
        tarafxaNxtBusPrtnrId = refreshTarafxaNxtBusPrtnrId();
     }
   		return tarafxaNxtBusPrtnrId;
   }

  
	/**
	*  set variable tarafxaNxtBusPrtnrId
	*  Corresponding COBOL Variable is TARAFXA-NXT-BUS-PRTNR-ID
	*  @param value
	**/
   public void setTarafxaNxtBusPrtnrId(char[] value) {
      tarafxaNxtBusPrtnrId = checkTarafxaNxtBusPrtnrIdConstraints(value);
      serializeTarafxaNxtBusPrtnrId(tarafxaNxtBusPrtnrId);
   } 

     /**
	 * 	Update TarafxaNxtBusPrtnrId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaNxtBusPrtnrId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaNxtBusPrtnrId,tarafxaNxtBusPrtnrId.length);
   	
   }
   
   public void setTarafxaNxtBusPrtnrId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaNxtBusPrtnrId,tarafxaNxtBusPrtnrId.length);
   	
   }
   
     /**
	 * 	Update TarafxaNxtBusPrtnrId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaNxtBusPrtnrId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaNxtBusPrtnrId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaNxtBusPrtnrId with another Field
	 *	@param value
	 */
   public void setTarafxaNxtBusPrtnrId(Field source) {
       replace(source,0,source.length(),beginTarafxaNxtBusPrtnrId,TARAFXA_NXT_BUS_PRTNR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaNxtBusPrtnrId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaNxtBusPrtnrId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaNxtBusPrtnrId,TARAFXA_NXT_BUS_PRTNR_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaNxtBusPrtnrId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaNxtBusPrtnrId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaNxtBusPrtnrId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaNxtEndptId
	 *	@return tarafxaNxtEndptId
	 */
   public char[] getTarafxaNxtEndptId() throws CFException{
     if (isTarafxaNxtEndptIdModified()) { 
        tarafxaNxtEndptId = refreshTarafxaNxtEndptId();
     }
   		return tarafxaNxtEndptId;
   }

  
	/**
	*  set variable tarafxaNxtEndptId
	*  Corresponding COBOL Variable is TARAFXA-NXT-ENDPT-ID
	*  @param value
	**/
   public void setTarafxaNxtEndptId(char[] value) {
      tarafxaNxtEndptId = checkTarafxaNxtEndptIdConstraints(value);
      serializeTarafxaNxtEndptId(tarafxaNxtEndptId);
   } 

     /**
	 * 	Update TarafxaNxtEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaNxtEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaNxtEndptId,tarafxaNxtEndptId.length);
   	
   }
   
   public void setTarafxaNxtEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaNxtEndptId,tarafxaNxtEndptId.length);
   	
   }
   
     /**
	 * 	Update TarafxaNxtEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaNxtEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaNxtEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaNxtEndptId with another Field
	 *	@param value
	 */
   public void setTarafxaNxtEndptId(Field source) {
       replace(source,0,source.length(),beginTarafxaNxtEndptId,TARAFXA_NXT_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaNxtEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaNxtEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaNxtEndptId,TARAFXA_NXT_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaNxtEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaNxtEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaNxtEndptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaNxtAvailTs
	 *	@return tarafxaNxtAvailTs
	 */
   public char[] getTarafxaNxtAvailTs() throws CFException{
     if (isTarafxaNxtAvailTsModified()) { 
        tarafxaNxtAvailTs = refreshTarafxaNxtAvailTs();
     }
   		return tarafxaNxtAvailTs;
   }

  
	/**
	*  set variable tarafxaNxtAvailTs
	*  Corresponding COBOL Variable is TARAFXA-NXT-AVAIL-TS
	*  @param value
	**/
   public void setTarafxaNxtAvailTs(char[] value) {
      tarafxaNxtAvailTs = checkTarafxaNxtAvailTsConstraints(value);
      serializeTarafxaNxtAvailTs(tarafxaNxtAvailTs);
   } 

     /**
	 * 	Update TarafxaNxtAvailTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaNxtAvailTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaNxtAvailTs,tarafxaNxtAvailTs.length);
   	
   }
   
   public void setTarafxaNxtAvailTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaNxtAvailTs,tarafxaNxtAvailTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaNxtAvailTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaNxtAvailTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaNxtAvailTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaNxtAvailTs with another Field
	 *	@param value
	 */
   public void setTarafxaNxtAvailTs(Field source) {
       replace(source,0,source.length(),beginTarafxaNxtAvailTs,TARAFXA_NXT_AVAIL_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaNxtAvailTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaNxtAvailTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaNxtAvailTs,TARAFXA_NXT_AVAIL_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaNxtAvailTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaNxtAvailTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaNxtAvailTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaApplExitJobNam
	 *	@return tarafxaApplExitJobNam
	 */
   public char[] getTarafxaApplExitJobNam() throws CFException{
     if (isTarafxaApplExitJobNamModified()) { 
        tarafxaApplExitJobNam = refreshTarafxaApplExitJobNam();
     }
   		return tarafxaApplExitJobNam;
   }

  
	/**
	*  set variable tarafxaApplExitJobNam
	*  Corresponding COBOL Variable is TARAFXA-APPL-EXIT-JOB-NAM
	*  @param value
	**/
   public void setTarafxaApplExitJobNam(char[] value) {
      tarafxaApplExitJobNam = checkTarafxaApplExitJobNamConstraints(value);
      serializeTarafxaApplExitJobNam(tarafxaApplExitJobNam);
   } 

     /**
	 * 	Update TarafxaApplExitJobNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaApplExitJobNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaApplExitJobNam,tarafxaApplExitJobNam.length);
   	
   }
   
   public void setTarafxaApplExitJobNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplExitJobNam,tarafxaApplExitJobNam.length);
   	
   }
   
     /**
	 * 	Update TarafxaApplExitJobNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaApplExitJobNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplExitJobNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaApplExitJobNam with another Field
	 *	@param value
	 */
   public void setTarafxaApplExitJobNam(Field source) {
       replace(source,0,source.length(),beginTarafxaApplExitJobNam,TARAFXA_APPL_EXIT_JOB_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaApplExitJobNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaApplExitJobNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaApplExitJobNam,TARAFXA_APPL_EXIT_JOB_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaApplExitJobNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaApplExitJobNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplExitJobNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaApplExitTs
	 *	@return tarafxaApplExitTs
	 */
   public char[] getTarafxaApplExitTs() throws CFException{
     if (isTarafxaApplExitTsModified()) { 
        tarafxaApplExitTs = refreshTarafxaApplExitTs();
     }
   		return tarafxaApplExitTs;
   }

  
	/**
	*  set variable tarafxaApplExitTs
	*  Corresponding COBOL Variable is TARAFXA-APPL-EXIT-TS
	*  @param value
	**/
   public void setTarafxaApplExitTs(char[] value) {
      tarafxaApplExitTs = checkTarafxaApplExitTsConstraints(value);
      serializeTarafxaApplExitTs(tarafxaApplExitTs);
   } 

     /**
	 * 	Update TarafxaApplExitTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaApplExitTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaApplExitTs,tarafxaApplExitTs.length);
   	
   }
   
   public void setTarafxaApplExitTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplExitTs,tarafxaApplExitTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaApplExitTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaApplExitTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplExitTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaApplExitTs with another Field
	 *	@param value
	 */
   public void setTarafxaApplExitTs(Field source) {
       replace(source,0,source.length(),beginTarafxaApplExitTs,TARAFXA_APPL_EXIT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaApplExitTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaApplExitTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaApplExitTs,TARAFXA_APPL_EXIT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaApplExitTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaApplExitTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplExitTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaCsMipId
	 *	@return tarafxaCsMipId
	 */
   public char[] getTarafxaCsMipId() throws CFException{
     if (isTarafxaCsMipIdModified()) { 
        tarafxaCsMipId = refreshTarafxaCsMipId();
     }
   		return tarafxaCsMipId;
   }

  
	/**
	*  set variable tarafxaCsMipId
	*  Corresponding COBOL Variable is TARAFXA-CS-MIP-ID
	*  @param value
	**/
   public void setTarafxaCsMipId(char[] value) {
      tarafxaCsMipId = checkTarafxaCsMipIdConstraints(value);
      serializeTarafxaCsMipId(tarafxaCsMipId);
   } 

     /**
	 * 	Update TarafxaCsMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaCsMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaCsMipId,tarafxaCsMipId.length);
   	
   }
   
   public void setTarafxaCsMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaCsMipId,tarafxaCsMipId.length);
   	
   }
   
     /**
	 * 	Update TarafxaCsMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaCsMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaCsMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaCsMipId with another Field
	 *	@param value
	 */
   public void setTarafxaCsMipId(Field source) {
       replace(source,0,source.length(),beginTarafxaCsMipId,TARAFXA_CS_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaCsMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaCsMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaCsMipId,TARAFXA_CS_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaCsMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaCsMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaCsMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaRmMipId
	 *	@return tarafxaRmMipId
	 */
   public char[] getTarafxaRmMipId() throws CFException{
     if (isTarafxaRmMipIdModified()) { 
        tarafxaRmMipId = refreshTarafxaRmMipId();
     }
   		return tarafxaRmMipId;
   }

  
	/**
	*  set variable tarafxaRmMipId
	*  Corresponding COBOL Variable is TARAFXA-RM-MIP-ID
	*  @param value
	**/
   public void setTarafxaRmMipId(char[] value) {
      tarafxaRmMipId = checkTarafxaRmMipIdConstraints(value);
      serializeTarafxaRmMipId(tarafxaRmMipId);
   } 

     /**
	 * 	Update TarafxaRmMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaRmMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaRmMipId,tarafxaRmMipId.length);
   	
   }
   
   public void setTarafxaRmMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaRmMipId,tarafxaRmMipId.length);
   	
   }
   
     /**
	 * 	Update TarafxaRmMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaRmMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaRmMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaRmMipId with another Field
	 *	@param value
	 */
   public void setTarafxaRmMipId(Field source) {
       replace(source,0,source.length(),beginTarafxaRmMipId,TARAFXA_RM_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaRmMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaRmMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaRmMipId,TARAFXA_RM_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaRmMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaRmMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaRmMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaApplExitNam
	 *	@return tarafxaApplExitNam
	 */
   public char[] getTarafxaApplExitNam() throws CFException{
     if (isTarafxaApplExitNamModified()) { 
        tarafxaApplExitNam = refreshTarafxaApplExitNam();
     }
   		return tarafxaApplExitNam;
   }

  
	/**
	*  set variable tarafxaApplExitNam
	*  Corresponding COBOL Variable is TARAFXA-APPL-EXIT-NAM
	*  @param value
	**/
   public void setTarafxaApplExitNam(char[] value) {
      tarafxaApplExitNam = checkTarafxaApplExitNamConstraints(value);
      serializeTarafxaApplExitNam(tarafxaApplExitNam);
   } 

     /**
	 * 	Update TarafxaApplExitNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaApplExitNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaApplExitNam,tarafxaApplExitNam.length);
   	
   }
   
   public void setTarafxaApplExitNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplExitNam,tarafxaApplExitNam.length);
   	
   }
   
     /**
	 * 	Update TarafxaApplExitNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaApplExitNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplExitNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaApplExitNam with another Field
	 *	@param value
	 */
   public void setTarafxaApplExitNam(Field source) {
       replace(source,0,source.length(),beginTarafxaApplExitNam,TARAFXA_APPL_EXIT_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaApplExitNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaApplExitNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaApplExitNam,TARAFXA_APPL_EXIT_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaApplExitNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaApplExitNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplExitNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaTapeCmpltdSw
	 *	@return tarafxaTapeCmpltdSw
	 */
   public char[] getTarafxaTapeCmpltdSw() throws CFException{
     if (isTarafxaTapeCmpltdSwModified()) { 
        tarafxaTapeCmpltdSw = refreshTarafxaTapeCmpltdSw();
     }
   		return tarafxaTapeCmpltdSw;
   }

  
	/**
	*  set variable tarafxaTapeCmpltdSw
	*  Corresponding COBOL Variable is TARAFXA-TAPE-CMPLTD-SW
	*  @param value
	**/
   public void setTarafxaTapeCmpltdSw(char[] value) {
      tarafxaTapeCmpltdSw = checkTarafxaTapeCmpltdSwConstraints(value);
      serializeTarafxaTapeCmpltdSw(tarafxaTapeCmpltdSw);
   } 

     /**
	 * 	Update TarafxaTapeCmpltdSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTapeCmpltdSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaTapeCmpltdSw,tarafxaTapeCmpltdSw.length);
   	
   }
   
   public void setTarafxaTapeCmpltdSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTapeCmpltdSw,tarafxaTapeCmpltdSw.length);
   	
   }
   
     /**
	 * 	Update TarafxaTapeCmpltdSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTapeCmpltdSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTapeCmpltdSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaTapeCmpltdSw with another Field
	 *	@param value
	 */
   public void setTarafxaTapeCmpltdSw(Field source) {
       replace(source,0,source.length(),beginTarafxaTapeCmpltdSw,TARAFXA_TAPE_CMPLTD_SW_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaTapeCmpltdSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaTapeCmpltdSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaTapeCmpltdSw,TARAFXA_TAPE_CMPLTD_SW_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaTapeCmpltdSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTapeCmpltdSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTapeCmpltdSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaTapeMultVolSw
	 *	@return tarafxaTapeMultVolSw
	 */
   public char[] getTarafxaTapeMultVolSw() throws CFException{
     if (isTarafxaTapeMultVolSwModified()) { 
        tarafxaTapeMultVolSw = refreshTarafxaTapeMultVolSw();
     }
   		return tarafxaTapeMultVolSw;
   }

  
	/**
	*  set variable tarafxaTapeMultVolSw
	*  Corresponding COBOL Variable is TARAFXA-TAPE-MULT-VOL-SW
	*  @param value
	**/
   public void setTarafxaTapeMultVolSw(char[] value) {
      tarafxaTapeMultVolSw = checkTarafxaTapeMultVolSwConstraints(value);
      serializeTarafxaTapeMultVolSw(tarafxaTapeMultVolSw);
   } 

     /**
	 * 	Update TarafxaTapeMultVolSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTapeMultVolSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaTapeMultVolSw,tarafxaTapeMultVolSw.length);
   	
   }
   
   public void setTarafxaTapeMultVolSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTapeMultVolSw,tarafxaTapeMultVolSw.length);
   	
   }
   
     /**
	 * 	Update TarafxaTapeMultVolSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTapeMultVolSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTapeMultVolSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaTapeMultVolSw with another Field
	 *	@param value
	 */
   public void setTarafxaTapeMultVolSw(Field source) {
       replace(source,0,source.length(),beginTarafxaTapeMultVolSw,TARAFXA_TAPE_MULT_VOL_SW_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaTapeMultVolSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaTapeMultVolSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaTapeMultVolSw,TARAFXA_TAPE_MULT_VOL_SW_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaTapeMultVolSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTapeMultVolSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTapeMultVolSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaApplPrcssngDt
	 *	@return tarafxaApplPrcssngDt
	 */
   public char[] getTarafxaApplPrcssngDt() throws CFException{
     if (isTarafxaApplPrcssngDtModified()) { 
        tarafxaApplPrcssngDt = refreshTarafxaApplPrcssngDt();
     }
   		return tarafxaApplPrcssngDt;
   }

  
	/**
	*  set variable tarafxaApplPrcssngDt
	*  Corresponding COBOL Variable is TARAFXA-APPL-PRCSSNG-DT
	*  @param value
	**/
   public void setTarafxaApplPrcssngDt(char[] value) {
      tarafxaApplPrcssngDt = checkTarafxaApplPrcssngDtConstraints(value);
      serializeTarafxaApplPrcssngDt(tarafxaApplPrcssngDt);
   } 

     /**
	 * 	Update TarafxaApplPrcssngDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaApplPrcssngDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaApplPrcssngDt,tarafxaApplPrcssngDt.length);
   	
   }
   
   public void setTarafxaApplPrcssngDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplPrcssngDt,tarafxaApplPrcssngDt.length);
   	
   }
   
     /**
	 * 	Update TarafxaApplPrcssngDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaApplPrcssngDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplPrcssngDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaApplPrcssngDt with another Field
	 *	@param value
	 */
   public void setTarafxaApplPrcssngDt(Field source) {
       replace(source,0,source.length(),beginTarafxaApplPrcssngDt,TARAFXA_APPL_PRCSSNG_DT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaApplPrcssngDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaApplPrcssngDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaApplPrcssngDt,TARAFXA_APPL_PRCSSNG_DT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaApplPrcssngDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaApplPrcssngDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplPrcssngDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaTransitionalDsn
	 *	@return tarafxaTransitionalDsn
	 */
   public char[] getTarafxaTransitionalDsn() throws CFException{
     if (isTarafxaTransitionalDsnModified()) { 
        tarafxaTransitionalDsn = refreshTarafxaTransitionalDsn();
     }
   		return tarafxaTransitionalDsn;
   }

  
	/**
	*  set variable tarafxaTransitionalDsn
	*  Corresponding COBOL Variable is TARAFXA-TRANSITIONAL-DSN
	*  @param value
	**/
   public void setTarafxaTransitionalDsn(char[] value) {
      tarafxaTransitionalDsn = checkTarafxaTransitionalDsnConstraints(value);
      serializeTarafxaTransitionalDsn(tarafxaTransitionalDsn);
   } 

     /**
	 * 	Update TarafxaTransitionalDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTransitionalDsn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaTransitionalDsn,tarafxaTransitionalDsn.length);
   	
   }
   
   public void setTarafxaTransitionalDsn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTransitionalDsn,tarafxaTransitionalDsn.length);
   	
   }
   
     /**
	 * 	Update TarafxaTransitionalDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTransitionalDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTransitionalDsn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaTransitionalDsn with another Field
	 *	@param value
	 */
   public void setTarafxaTransitionalDsn(Field source) {
       replace(source,0,source.length(),beginTarafxaTransitionalDsn,TARAFXA_TRANSITIONAL_DSN_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaTransitionalDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaTransitionalDsn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaTransitionalDsn,TARAFXA_TRANSITIONAL_DSN_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaTransitionalDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTransitionalDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTransitionalDsn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaSourceHubId
	 *	@return tarafxaSourceHubId
	 */
   public char[] getTarafxaSourceHubId() throws CFException{
     if (isTarafxaSourceHubIdModified()) { 
        tarafxaSourceHubId = refreshTarafxaSourceHubId();
     }
   		return tarafxaSourceHubId;
   }

  
	/**
	*  set variable tarafxaSourceHubId
	*  Corresponding COBOL Variable is TARAFXA-SOURCE-HUB-ID
	*  @param value
	**/
   public void setTarafxaSourceHubId(char[] value) {
      tarafxaSourceHubId = checkTarafxaSourceHubIdConstraints(value);
      serializeTarafxaSourceHubId(tarafxaSourceHubId);
   } 

     /**
	 * 	Update TarafxaSourceHubId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaSourceHubId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaSourceHubId,tarafxaSourceHubId.length);
   	
   }
   
   public void setTarafxaSourceHubId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSourceHubId,tarafxaSourceHubId.length);
   	
   }
   
     /**
	 * 	Update TarafxaSourceHubId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSourceHubId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSourceHubId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaSourceHubId with another Field
	 *	@param value
	 */
   public void setTarafxaSourceHubId(Field source) {
       replace(source,0,source.length(),beginTarafxaSourceHubId,TARAFXA_SOURCE_HUB_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaSourceHubId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaSourceHubId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaSourceHubId,TARAFXA_SOURCE_HUB_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaSourceHubId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSourceHubId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSourceHubId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaOwningHubId
	 *	@return tarafxaOwningHubId
	 */
   public char[] getTarafxaOwningHubId() throws CFException{
     if (isTarafxaOwningHubIdModified()) { 
        tarafxaOwningHubId = refreshTarafxaOwningHubId();
     }
   		return tarafxaOwningHubId;
   }

  
	/**
	*  set variable tarafxaOwningHubId
	*  Corresponding COBOL Variable is TARAFXA-OWNING-HUB-ID
	*  @param value
	**/
   public void setTarafxaOwningHubId(char[] value) {
      tarafxaOwningHubId = checkTarafxaOwningHubIdConstraints(value);
      serializeTarafxaOwningHubId(tarafxaOwningHubId);
   } 

     /**
	 * 	Update TarafxaOwningHubId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaOwningHubId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaOwningHubId,tarafxaOwningHubId.length);
   	
   }
   
   public void setTarafxaOwningHubId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaOwningHubId,tarafxaOwningHubId.length);
   	
   }
   
     /**
	 * 	Update TarafxaOwningHubId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaOwningHubId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaOwningHubId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaOwningHubId with another Field
	 *	@param value
	 */
   public void setTarafxaOwningHubId(Field source) {
       replace(source,0,source.length(),beginTarafxaOwningHubId,TARAFXA_OWNING_HUB_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaOwningHubId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaOwningHubId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaOwningHubId,TARAFXA_OWNING_HUB_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaOwningHubId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaOwningHubId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaOwningHubId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaStatRefId
	 *	@return tarafxaStatRefId
	 */
   public char[] getTarafxaStatRefId() throws CFException{
     if (isTarafxaStatRefIdModified()) { 
        tarafxaStatRefId = refreshTarafxaStatRefId();
     }
   		return tarafxaStatRefId;
   }

  
	/**
	*  set variable tarafxaStatRefId
	*  Corresponding COBOL Variable is TARAFXA-STAT-REF-ID
	*  @param value
	**/
   public void setTarafxaStatRefId(char[] value) {
      tarafxaStatRefId = checkTarafxaStatRefIdConstraints(value);
      serializeTarafxaStatRefId(tarafxaStatRefId);
   } 

     /**
	 * 	Update TarafxaStatRefId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaStatRefId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaStatRefId,tarafxaStatRefId.length);
   	
   }
   
   public void setTarafxaStatRefId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaStatRefId,tarafxaStatRefId.length);
   	
   }
   
     /**
	 * 	Update TarafxaStatRefId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaStatRefId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaStatRefId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaStatRefId with another Field
	 *	@param value
	 */
   public void setTarafxaStatRefId(Field source) {
       replace(source,0,source.length(),beginTarafxaStatRefId,TARAFXA_STAT_REF_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaStatRefId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaStatRefId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaStatRefId,TARAFXA_STAT_REF_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaStatRefId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaStatRefId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaStatRefId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaSrcLocEntNam
	 *	@return tarafxaSrcLocEntNam
	 */
   public char[] getTarafxaSrcLocEntNam() throws CFException{
     if (isTarafxaSrcLocEntNamModified()) { 
        tarafxaSrcLocEntNam = refreshTarafxaSrcLocEntNam();
     }
   		return tarafxaSrcLocEntNam;
   }

  
	/**
	*  set variable tarafxaSrcLocEntNam
	*  Corresponding COBOL Variable is TARAFXA-SRC-LOC-ENT-NAM
	*  @param value
	**/
   public void setTarafxaSrcLocEntNam(char[] value) {
      tarafxaSrcLocEntNam = checkTarafxaSrcLocEntNamConstraints(value);
      serializeTarafxaSrcLocEntNam(tarafxaSrcLocEntNam);
   } 

     /**
	 * 	Update TarafxaSrcLocEntNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaSrcLocEntNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaSrcLocEntNam,tarafxaSrcLocEntNam.length);
   	
   }
   
   public void setTarafxaSrcLocEntNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcLocEntNam,tarafxaSrcLocEntNam.length);
   	
   }
   
     /**
	 * 	Update TarafxaSrcLocEntNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcLocEntNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcLocEntNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaSrcLocEntNam with another Field
	 *	@param value
	 */
   public void setTarafxaSrcLocEntNam(Field source) {
       replace(source,0,source.length(),beginTarafxaSrcLocEntNam,TARAFXA_SRC_LOC_ENT_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaSrcLocEntNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaSrcLocEntNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaSrcLocEntNam,TARAFXA_SRC_LOC_ENT_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaSrcLocEntNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcLocEntNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcLocEntNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaSrcTaskNam
	 *	@return tarafxaSrcTaskNam
	 */
   public char[] getTarafxaSrcTaskNam() throws CFException{
     if (isTarafxaSrcTaskNamModified()) { 
        tarafxaSrcTaskNam = refreshTarafxaSrcTaskNam();
     }
   		return tarafxaSrcTaskNam;
   }

  
	/**
	*  set variable tarafxaSrcTaskNam
	*  Corresponding COBOL Variable is TARAFXA-SRC-TASK-NAM
	*  @param value
	**/
   public void setTarafxaSrcTaskNam(char[] value) {
      tarafxaSrcTaskNam = checkTarafxaSrcTaskNamConstraints(value);
      serializeTarafxaSrcTaskNam(tarafxaSrcTaskNam);
   } 

     /**
	 * 	Update TarafxaSrcTaskNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaSrcTaskNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaSrcTaskNam,tarafxaSrcTaskNam.length);
   	
   }
   
   public void setTarafxaSrcTaskNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskNam,tarafxaSrcTaskNam.length);
   	
   }
   
     /**
	 * 	Update TarafxaSrcTaskNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcTaskNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaSrcTaskNam with another Field
	 *	@param value
	 */
   public void setTarafxaSrcTaskNam(Field source) {
       replace(source,0,source.length(),beginTarafxaSrcTaskNam,TARAFXA_SRC_TASK_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaSrcTaskNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaSrcTaskNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskNam,TARAFXA_SRC_TASK_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaSrcTaskNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcTaskNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaSrcTaskId
	 *	@return tarafxaSrcTaskId
	 */
   public char[] getTarafxaSrcTaskId() throws CFException{
     if (isTarafxaSrcTaskIdModified()) { 
        tarafxaSrcTaskId = refreshTarafxaSrcTaskId();
     }
   		return tarafxaSrcTaskId;
   }

  
	/**
	*  set variable tarafxaSrcTaskId
	*  Corresponding COBOL Variable is TARAFXA-SRC-TASK-ID
	*  @param value
	**/
   public void setTarafxaSrcTaskId(char[] value) {
      tarafxaSrcTaskId = checkTarafxaSrcTaskIdConstraints(value);
      serializeTarafxaSrcTaskId(tarafxaSrcTaskId);
   } 

     /**
	 * 	Update TarafxaSrcTaskId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaSrcTaskId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaSrcTaskId,tarafxaSrcTaskId.length);
   	
   }
   
   public void setTarafxaSrcTaskId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskId,tarafxaSrcTaskId.length);
   	
   }
   
     /**
	 * 	Update TarafxaSrcTaskId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcTaskId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaSrcTaskId with another Field
	 *	@param value
	 */
   public void setTarafxaSrcTaskId(Field source) {
       replace(source,0,source.length(),beginTarafxaSrcTaskId,TARAFXA_SRC_TASK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaSrcTaskId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaSrcTaskId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskId,TARAFXA_SRC_TASK_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaSrcTaskId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcTaskId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaSrcTaskUsr
	 *	@return tarafxaSrcTaskUsr
	 */   
	 public TarafxaSrcTaskUsr getTarafxaSrcTaskUsr() {
   	return tarafxaSrcTaskUsr;
   }
   /**
	* 	Update TarafxaSrcTaskUsr with the passed value
	*   Corresponding COBOL Variable is TARAFXA-SRC-TASK-USR
	*	@param value
	*/
   public void setTarafxaSrcTaskUsr(char[] value) {
      tarafxaSrcTaskUsr.setString(value); 
   }   
    
     /**
	 * 	Update TarafxaSrcTaskUsr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTarafxaSrcTaskUsr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tarafxaSrcTaskUsr.begin,tarafxaSrcTaskUsr.length());
   }
   
     /**
	 * 	Update TarafxaSrcTaskUsr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcTaskUsr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tarafxaSrcTaskUsr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TarafxaSrcTaskUsr with another Field
	 *	@param value
	 */
   public void setTarafxaSrcTaskUsr(Field source) {
   	replace(source,0,source.length(),tarafxaSrcTaskUsr.begin,tarafxaSrcTaskUsr.length());
   }  
   
     /**
	 * 	Update TarafxaSrcTaskUsr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTarafxaSrcTaskUsr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tarafxaSrcTaskUsr.begin,tarafxaSrcTaskUsr.length());
   }
   
     /**
	 * 	Update TarafxaSrcTaskUsr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcTaskUsr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tarafxaSrcTaskUsr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of tarafxaSrcTaskStrtTs
	 *	@return tarafxaSrcTaskStrtTs
	 */
   public char[] getTarafxaSrcTaskStrtTs() throws CFException{
     if (isTarafxaSrcTaskStrtTsModified()) { 
        tarafxaSrcTaskStrtTs = refreshTarafxaSrcTaskStrtTs();
     }
   		return tarafxaSrcTaskStrtTs;
   }

  
	/**
	*  set variable tarafxaSrcTaskStrtTs
	*  Corresponding COBOL Variable is TARAFXA-SRC-TASK-STRT-TS
	*  @param value
	**/
   public void setTarafxaSrcTaskStrtTs(char[] value) {
      tarafxaSrcTaskStrtTs = checkTarafxaSrcTaskStrtTsConstraints(value);
      serializeTarafxaSrcTaskStrtTs(tarafxaSrcTaskStrtTs);
   } 

     /**
	 * 	Update TarafxaSrcTaskStrtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaSrcTaskStrtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaSrcTaskStrtTs,tarafxaSrcTaskStrtTs.length);
   	
   }
   
   public void setTarafxaSrcTaskStrtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskStrtTs,tarafxaSrcTaskStrtTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaSrcTaskStrtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcTaskStrtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskStrtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaSrcTaskStrtTs with another Field
	 *	@param value
	 */
   public void setTarafxaSrcTaskStrtTs(Field source) {
       replace(source,0,source.length(),beginTarafxaSrcTaskStrtTs,TARAFXA_SRC_TASK_STRT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaSrcTaskStrtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaSrcTaskStrtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskStrtTs,TARAFXA_SRC_TASK_STRT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaSrcTaskStrtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcTaskStrtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskStrtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaSrcTaskStopTs
	 *	@return tarafxaSrcTaskStopTs
	 */
   public char[] getTarafxaSrcTaskStopTs() throws CFException{
     if (isTarafxaSrcTaskStopTsModified()) { 
        tarafxaSrcTaskStopTs = refreshTarafxaSrcTaskStopTs();
     }
   		return tarafxaSrcTaskStopTs;
   }

  
	/**
	*  set variable tarafxaSrcTaskStopTs
	*  Corresponding COBOL Variable is TARAFXA-SRC-TASK-STOP-TS
	*  @param value
	**/
   public void setTarafxaSrcTaskStopTs(char[] value) {
      tarafxaSrcTaskStopTs = checkTarafxaSrcTaskStopTsConstraints(value);
      serializeTarafxaSrcTaskStopTs(tarafxaSrcTaskStopTs);
   } 

     /**
	 * 	Update TarafxaSrcTaskStopTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaSrcTaskStopTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaSrcTaskStopTs,tarafxaSrcTaskStopTs.length);
   	
   }
   
   public void setTarafxaSrcTaskStopTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskStopTs,tarafxaSrcTaskStopTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaSrcTaskStopTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcTaskStopTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskStopTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaSrcTaskStopTs with another Field
	 *	@param value
	 */
   public void setTarafxaSrcTaskStopTs(Field source) {
       replace(source,0,source.length(),beginTarafxaSrcTaskStopTs,TARAFXA_SRC_TASK_STOP_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaSrcTaskStopTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaSrcTaskStopTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskStopTs,TARAFXA_SRC_TASK_STOP_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaSrcTaskStopTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcTaskStopTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskStopTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaTrgtLocEntNam
	 *	@return tarafxaTrgtLocEntNam
	 */
   public char[] getTarafxaTrgtLocEntNam() throws CFException{
     if (isTarafxaTrgtLocEntNamModified()) { 
        tarafxaTrgtLocEntNam = refreshTarafxaTrgtLocEntNam();
     }
   		return tarafxaTrgtLocEntNam;
   }

  
	/**
	*  set variable tarafxaTrgtLocEntNam
	*  Corresponding COBOL Variable is TARAFXA-TRGT-LOC-ENT-NAM
	*  @param value
	**/
   public void setTarafxaTrgtLocEntNam(char[] value) {
      tarafxaTrgtLocEntNam = checkTarafxaTrgtLocEntNamConstraints(value);
      serializeTarafxaTrgtLocEntNam(tarafxaTrgtLocEntNam);
   } 

     /**
	 * 	Update TarafxaTrgtLocEntNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTrgtLocEntNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaTrgtLocEntNam,tarafxaTrgtLocEntNam.length);
   	
   }
   
   public void setTarafxaTrgtLocEntNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtLocEntNam,tarafxaTrgtLocEntNam.length);
   	
   }
   
     /**
	 * 	Update TarafxaTrgtLocEntNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtLocEntNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtLocEntNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaTrgtLocEntNam with another Field
	 *	@param value
	 */
   public void setTarafxaTrgtLocEntNam(Field source) {
       replace(source,0,source.length(),beginTarafxaTrgtLocEntNam,TARAFXA_TRGT_LOC_ENT_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaTrgtLocEntNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaTrgtLocEntNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaTrgtLocEntNam,TARAFXA_TRGT_LOC_ENT_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaTrgtLocEntNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtLocEntNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtLocEntNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaTrgtTaskNam
	 *	@return tarafxaTrgtTaskNam
	 */
   public char[] getTarafxaTrgtTaskNam() throws CFException{
     if (isTarafxaTrgtTaskNamModified()) { 
        tarafxaTrgtTaskNam = refreshTarafxaTrgtTaskNam();
     }
   		return tarafxaTrgtTaskNam;
   }

  
	/**
	*  set variable tarafxaTrgtTaskNam
	*  Corresponding COBOL Variable is TARAFXA-TRGT-TASK-NAM
	*  @param value
	**/
   public void setTarafxaTrgtTaskNam(char[] value) {
      tarafxaTrgtTaskNam = checkTarafxaTrgtTaskNamConstraints(value);
      serializeTarafxaTrgtTaskNam(tarafxaTrgtTaskNam);
   } 

     /**
	 * 	Update TarafxaTrgtTaskNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTrgtTaskNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaTrgtTaskNam,tarafxaTrgtTaskNam.length);
   	
   }
   
   public void setTarafxaTrgtTaskNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskNam,tarafxaTrgtTaskNam.length);
   	
   }
   
     /**
	 * 	Update TarafxaTrgtTaskNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtTaskNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaTrgtTaskNam with another Field
	 *	@param value
	 */
   public void setTarafxaTrgtTaskNam(Field source) {
       replace(source,0,source.length(),beginTarafxaTrgtTaskNam,TARAFXA_TRGT_TASK_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaTrgtTaskNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaTrgtTaskNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskNam,TARAFXA_TRGT_TASK_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaTrgtTaskNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtTaskNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaTrgtTaskId
	 *	@return tarafxaTrgtTaskId
	 */
   public char[] getTarafxaTrgtTaskId() throws CFException{
     if (isTarafxaTrgtTaskIdModified()) { 
        tarafxaTrgtTaskId = refreshTarafxaTrgtTaskId();
     }
   		return tarafxaTrgtTaskId;
   }

  
	/**
	*  set variable tarafxaTrgtTaskId
	*  Corresponding COBOL Variable is TARAFXA-TRGT-TASK-ID
	*  @param value
	**/
   public void setTarafxaTrgtTaskId(char[] value) {
      tarafxaTrgtTaskId = checkTarafxaTrgtTaskIdConstraints(value);
      serializeTarafxaTrgtTaskId(tarafxaTrgtTaskId);
   } 

     /**
	 * 	Update TarafxaTrgtTaskId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTrgtTaskId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaTrgtTaskId,tarafxaTrgtTaskId.length);
   	
   }
   
   public void setTarafxaTrgtTaskId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskId,tarafxaTrgtTaskId.length);
   	
   }
   
     /**
	 * 	Update TarafxaTrgtTaskId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtTaskId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaTrgtTaskId with another Field
	 *	@param value
	 */
   public void setTarafxaTrgtTaskId(Field source) {
       replace(source,0,source.length(),beginTarafxaTrgtTaskId,TARAFXA_TRGT_TASK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaTrgtTaskId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaTrgtTaskId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskId,TARAFXA_TRGT_TASK_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaTrgtTaskId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtTaskId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaTrgtTaskUsr
	 *	@return tarafxaTrgtTaskUsr
	 */   
	 public TarafxaTrgtTaskUsr getTarafxaTrgtTaskUsr() {
   	return tarafxaTrgtTaskUsr;
   }
   /**
	* 	Update TarafxaTrgtTaskUsr with the passed value
	*   Corresponding COBOL Variable is TARAFXA-TRGT-TASK-USR
	*	@param value
	*/
   public void setTarafxaTrgtTaskUsr(char[] value) {
      tarafxaTrgtTaskUsr.setString(value); 
   }   
    
     /**
	 * 	Update TarafxaTrgtTaskUsr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTrgtTaskUsr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tarafxaTrgtTaskUsr.begin,tarafxaTrgtTaskUsr.length());
   }
   
     /**
	 * 	Update TarafxaTrgtTaskUsr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtTaskUsr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tarafxaTrgtTaskUsr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TarafxaTrgtTaskUsr with another Field
	 *	@param value
	 */
   public void setTarafxaTrgtTaskUsr(Field source) {
   	replace(source,0,source.length(),tarafxaTrgtTaskUsr.begin,tarafxaTrgtTaskUsr.length());
   }  
   
     /**
	 * 	Update TarafxaTrgtTaskUsr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTrgtTaskUsr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tarafxaTrgtTaskUsr.begin,tarafxaTrgtTaskUsr.length());
   }
   
     /**
	 * 	Update TarafxaTrgtTaskUsr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtTaskUsr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tarafxaTrgtTaskUsr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of tarafxaTrgtTaskStrtTs
	 *	@return tarafxaTrgtTaskStrtTs
	 */
   public char[] getTarafxaTrgtTaskStrtTs() throws CFException{
     if (isTarafxaTrgtTaskStrtTsModified()) { 
        tarafxaTrgtTaskStrtTs = refreshTarafxaTrgtTaskStrtTs();
     }
   		return tarafxaTrgtTaskStrtTs;
   }

  
	/**
	*  set variable tarafxaTrgtTaskStrtTs
	*  Corresponding COBOL Variable is TARAFXA-TRGT-TASK-STRT-TS
	*  @param value
	**/
   public void setTarafxaTrgtTaskStrtTs(char[] value) {
      tarafxaTrgtTaskStrtTs = checkTarafxaTrgtTaskStrtTsConstraints(value);
      serializeTarafxaTrgtTaskStrtTs(tarafxaTrgtTaskStrtTs);
   } 

     /**
	 * 	Update TarafxaTrgtTaskStrtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTrgtTaskStrtTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaTrgtTaskStrtTs,tarafxaTrgtTaskStrtTs.length);
   	
   }
   
   public void setTarafxaTrgtTaskStrtTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskStrtTs,tarafxaTrgtTaskStrtTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaTrgtTaskStrtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtTaskStrtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskStrtTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaTrgtTaskStrtTs with another Field
	 *	@param value
	 */
   public void setTarafxaTrgtTaskStrtTs(Field source) {
       replace(source,0,source.length(),beginTarafxaTrgtTaskStrtTs,TARAFXA_TRGT_TASK_STRT_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaTrgtTaskStrtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaTrgtTaskStrtTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskStrtTs,TARAFXA_TRGT_TASK_STRT_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaTrgtTaskStrtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtTaskStrtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskStrtTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaTrgtTaskStopTs
	 *	@return tarafxaTrgtTaskStopTs
	 */
   public char[] getTarafxaTrgtTaskStopTs() throws CFException{
     if (isTarafxaTrgtTaskStopTsModified()) { 
        tarafxaTrgtTaskStopTs = refreshTarafxaTrgtTaskStopTs();
     }
   		return tarafxaTrgtTaskStopTs;
   }

  
	/**
	*  set variable tarafxaTrgtTaskStopTs
	*  Corresponding COBOL Variable is TARAFXA-TRGT-TASK-STOP-TS
	*  @param value
	**/
   public void setTarafxaTrgtTaskStopTs(char[] value) {
      tarafxaTrgtTaskStopTs = checkTarafxaTrgtTaskStopTsConstraints(value);
      serializeTarafxaTrgtTaskStopTs(tarafxaTrgtTaskStopTs);
   } 

     /**
	 * 	Update TarafxaTrgtTaskStopTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTrgtTaskStopTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaTrgtTaskStopTs,tarafxaTrgtTaskStopTs.length);
   	
   }
   
   public void setTarafxaTrgtTaskStopTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskStopTs,tarafxaTrgtTaskStopTs.length);
   	
   }
   
     /**
	 * 	Update TarafxaTrgtTaskStopTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtTaskStopTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskStopTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaTrgtTaskStopTs with another Field
	 *	@param value
	 */
   public void setTarafxaTrgtTaskStopTs(Field source) {
       replace(source,0,source.length(),beginTarafxaTrgtTaskStopTs,TARAFXA_TRGT_TASK_STOP_TS_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaTrgtTaskStopTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaTrgtTaskStopTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskStopTs,TARAFXA_TRGT_TASK_STOP_TS_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaTrgtTaskStopTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtTaskStopTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskStopTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafxaApplTknNam
	 *	@return tarafxaApplTknNam
	 */   
	 public TarafxaApplTknNam getTarafxaApplTknNam() {
   	return tarafxaApplTknNam;
   }
   /**
	* 	Update TarafxaApplTknNam with the passed value
	*   Corresponding COBOL Variable is TARAFXA-APPL-TKN-NAM
	*	@param value
	*/
   public void setTarafxaApplTknNam(char[] value) {
      tarafxaApplTknNam.setString(value); 
   }   
    
     /**
	 * 	Update TarafxaApplTknNam 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTarafxaApplTknNam(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tarafxaApplTknNam.begin,tarafxaApplTknNam.length());
   }
   
     /**
	 * 	Update TarafxaApplTknNam 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaApplTknNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tarafxaApplTknNam.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TarafxaApplTknNam with another Field
	 *	@param value
	 */
   public void setTarafxaApplTknNam(Field source) {
   	replace(source,0,source.length(),tarafxaApplTknNam.begin,tarafxaApplTknNam.length());
   }  
   
     /**
	 * 	Update TarafxaApplTknNam 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTarafxaApplTknNam(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tarafxaApplTknNam.begin,tarafxaApplTknNam.length());
   }
   
     /**
	 * 	Update TarafxaApplTknNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaApplTknNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tarafxaApplTknNam.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getTarafxaFieldLength() {
			return TARAFXA_LENGTH;
		}

}
  
