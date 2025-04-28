package com.cloudframe.app.db2func.dto;

/**
*  The class MsdFcData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class MsdFcData extends MsdFcDataSerialized { 
   

								private long bdms01Fc2DataInd;
				private Bdms01Fc2DataIndRedefined bdms01Fc2DataIndRedefined = new Bdms01Fc2DataIndRedefined();

						private char[] bdms01Fc2DepositoryCd = Field.fillLowValue(4);

						private char[] bdms01Fc2TrnfrDptryInd = Field.fillLowValue(1);

						private char[] bdms01Fc2PortalInd = Field.fillLowValue(1);

						private char[] bdms01Fc2ChllIntrDpstInd = Field.fillLowValue(1);

						private char[] bdms01Fc2DtcIssTypeCd = Field.fillLowValue(3);

						private char[] bdms01Fc2IpoInd = Field.fillLowValue(1);

						private char[] bdms01Fc2CloseIpoDt = Field.fillLowValue(10);

						private char[] bdms01Fc2DrctRgstnInd = Field.fillLowValue(1);

						private char[] bdms01DtcCstdnOnlyInd = Field.fillLowValue(1);

						private char[] bdms01BkDrsCd = Field.fillLowValue(1);

						private char[] bdms01PprlsLglInd = Field.fillLowValue(1);

	
	/**
	* Constructor for MsdFcData
	**/
    public MsdFcData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdFcData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdFcData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			bdms01Fc2DataIndRedefined.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of bdms01Fc2DataInd
	 *	@return bdms01Fc2DataInd
	 */
	public long getBdms01Fc2DataInd() throws CFException {
       if (isBdms01Fc2DataIndModified()) { 
           bdms01Fc2DataInd = refreshBdms01Fc2DataInd();
        }
   		return bdms01Fc2DataInd;
	}
	

	
	   
	/**
	 * 	Update Bdms01Fc2DataInd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-FC2-DATA-IND
	 *	@param number
	 */
	public void setBdms01Fc2DataInd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01Fc2DataInd = checkBdms01Fc2DataIndMaxLimit(number); 
		serializeBdms01Fc2DataInd(bdms01Fc2DataInd);
	}
	

	/**
	 * 	Update Bdms01Fc2DataInd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01Fc2DataInd(char[] value) throws CFException {
		 bdms01Fc2DataInd = serializeBdms01Fc2DataInd(value);
	}
	/**
	 * 	Update Bdms01Fc2DataInd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01Fc2DataIndString(char[] value) throws CFException {
		 setBdms01Fc2DataInd(value);
	}
	/**
	 *	Returns the value of bdms01Fc2DataIndRedefined
	 *	@return bdms01Fc2DataIndRedefined
	 */   
	 public Bdms01Fc2DataIndRedefined getBdms01Fc2DataIndRedefined() {
   	return bdms01Fc2DataIndRedefined;
   }
   /**
	* 	Update Bdms01Fc2DataIndRedefined with the passed value
	*   Corresponding COBOL Variable is BDMS01-FC2-DATA-IND-REDEFINED
	*	@param value
	*/
   public void setBdms01Fc2DataIndRedefined(char[] value) {
      bdms01Fc2DataIndRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Bdms01Fc2DataIndRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2DataIndRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01Fc2DataIndRedefined.begin,bdms01Fc2DataIndRedefined.length());
   }
   
     /**
	 * 	Update Bdms01Fc2DataIndRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2DataIndRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01Fc2DataIndRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Bdms01Fc2DataIndRedefined with another Field
	 *	@param value
	 */
   public void setBdms01Fc2DataIndRedefined(Field source) {
   	replace(source,0,source.length(),bdms01Fc2DataIndRedefined.begin,bdms01Fc2DataIndRedefined.length());
   }  
   
     /**
	 * 	Update Bdms01Fc2DataIndRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2DataIndRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bdms01Fc2DataIndRedefined.begin,bdms01Fc2DataIndRedefined.length());
   }
   
     /**
	 * 	Update Bdms01Fc2DataIndRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2DataIndRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bdms01Fc2DataIndRedefined.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bdms01Fc2DepositoryCd
	 *	@return bdms01Fc2DepositoryCd
	 */
   public char[] getBdms01Fc2DepositoryCd() throws CFException{
     if (isBdms01Fc2DepositoryCdModified()) { 
        bdms01Fc2DepositoryCd = refreshBdms01Fc2DepositoryCd();
     }
   		return bdms01Fc2DepositoryCd;
   }

  
	/**
	*  set variable bdms01Fc2DepositoryCd
	*  Corresponding COBOL Variable is BDMS01-FC2-DEPOSITORY-CD
	*  @param value
	**/
   public void setBdms01Fc2DepositoryCd(char[] value) {
      bdms01Fc2DepositoryCd = checkBdms01Fc2DepositoryCdConstraints(value);
      serializeBdms01Fc2DepositoryCd(bdms01Fc2DepositoryCd);
   } 

     /**
	 * 	Update Bdms01Fc2DepositoryCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2DepositoryCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2DepositoryCd,bdms01Fc2DepositoryCd.length);
   	
   }
   
   public void setBdms01Fc2DepositoryCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2DepositoryCd,bdms01Fc2DepositoryCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2DepositoryCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2DepositoryCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2DepositoryCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2DepositoryCd with another Field
	 *	@param value
	 */
   public void setBdms01Fc2DepositoryCd(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2DepositoryCd,BDMS_01_FC_2_DEPOSITORY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2DepositoryCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2DepositoryCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2DepositoryCd,BDMS_01_FC_2_DEPOSITORY_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2DepositoryCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2DepositoryCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2DepositoryCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2TrnfrDptryInd
	 *	@return bdms01Fc2TrnfrDptryInd
	 */
   public char[] getBdms01Fc2TrnfrDptryInd() throws CFException{
     if (isBdms01Fc2TrnfrDptryIndModified()) { 
        bdms01Fc2TrnfrDptryInd = refreshBdms01Fc2TrnfrDptryInd();
     }
   		return bdms01Fc2TrnfrDptryInd;
   }

  
	/**
	*  set variable bdms01Fc2TrnfrDptryInd
	*  Corresponding COBOL Variable is BDMS01-FC2-TRNFR-DPTRY-IND
	*  @param value
	**/
   public void setBdms01Fc2TrnfrDptryInd(char[] value) {
      bdms01Fc2TrnfrDptryInd = checkBdms01Fc2TrnfrDptryIndConstraints(value);
      serializeBdms01Fc2TrnfrDptryInd(bdms01Fc2TrnfrDptryInd);
   } 

     /**
	 * 	Update Bdms01Fc2TrnfrDptryInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2TrnfrDptryInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2TrnfrDptryInd,bdms01Fc2TrnfrDptryInd.length);
   	
   }
   
   public void setBdms01Fc2TrnfrDptryInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2TrnfrDptryInd,bdms01Fc2TrnfrDptryInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2TrnfrDptryInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2TrnfrDptryInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2TrnfrDptryInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2TrnfrDptryInd with another Field
	 *	@param value
	 */
   public void setBdms01Fc2TrnfrDptryInd(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2TrnfrDptryInd,BDMS_01_FC_2_TRNFR_DPTRY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2TrnfrDptryInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2TrnfrDptryInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2TrnfrDptryInd,BDMS_01_FC_2_TRNFR_DPTRY_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2TrnfrDptryInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2TrnfrDptryInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2TrnfrDptryInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2PortalInd
	 *	@return bdms01Fc2PortalInd
	 */
   public char[] getBdms01Fc2PortalInd() throws CFException{
     if (isBdms01Fc2PortalIndModified()) { 
        bdms01Fc2PortalInd = refreshBdms01Fc2PortalInd();
     }
   		return bdms01Fc2PortalInd;
   }

  
	/**
	*  set variable bdms01Fc2PortalInd
	*  Corresponding COBOL Variable is BDMS01-FC2-PORTAL-IND
	*  @param value
	**/
   public void setBdms01Fc2PortalInd(char[] value) {
      bdms01Fc2PortalInd = checkBdms01Fc2PortalIndConstraints(value);
      serializeBdms01Fc2PortalInd(bdms01Fc2PortalInd);
   } 

     /**
	 * 	Update Bdms01Fc2PortalInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2PortalInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2PortalInd,bdms01Fc2PortalInd.length);
   	
   }
   
   public void setBdms01Fc2PortalInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2PortalInd,bdms01Fc2PortalInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2PortalInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2PortalInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2PortalInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2PortalInd with another Field
	 *	@param value
	 */
   public void setBdms01Fc2PortalInd(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2PortalInd,BDMS_01_FC_2_PORTAL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2PortalInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2PortalInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2PortalInd,BDMS_01_FC_2_PORTAL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2PortalInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2PortalInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2PortalInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2ChllIntrDpstInd
	 *	@return bdms01Fc2ChllIntrDpstInd
	 */
   public char[] getBdms01Fc2ChllIntrDpstInd() throws CFException{
     if (isBdms01Fc2ChllIntrDpstIndModified()) { 
        bdms01Fc2ChllIntrDpstInd = refreshBdms01Fc2ChllIntrDpstInd();
     }
   		return bdms01Fc2ChllIntrDpstInd;
   }

  
	/**
	*  set variable bdms01Fc2ChllIntrDpstInd
	*  Corresponding COBOL Variable is BDMS01-FC2-CHLL-INTR-DPST-IND
	*  @param value
	**/
   public void setBdms01Fc2ChllIntrDpstInd(char[] value) {
      bdms01Fc2ChllIntrDpstInd = checkBdms01Fc2ChllIntrDpstIndConstraints(value);
      serializeBdms01Fc2ChllIntrDpstInd(bdms01Fc2ChllIntrDpstInd);
   } 

     /**
	 * 	Update Bdms01Fc2ChllIntrDpstInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2ChllIntrDpstInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2ChllIntrDpstInd,bdms01Fc2ChllIntrDpstInd.length);
   	
   }
   
   public void setBdms01Fc2ChllIntrDpstInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2ChllIntrDpstInd,bdms01Fc2ChllIntrDpstInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2ChllIntrDpstInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2ChllIntrDpstInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2ChllIntrDpstInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2ChllIntrDpstInd with another Field
	 *	@param value
	 */
   public void setBdms01Fc2ChllIntrDpstInd(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2ChllIntrDpstInd,BDMS_01_FC_2_CHLL_INTR_DPST_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2ChllIntrDpstInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2ChllIntrDpstInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2ChllIntrDpstInd,BDMS_01_FC_2_CHLL_INTR_DPST_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2ChllIntrDpstInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2ChllIntrDpstInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2ChllIntrDpstInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2DtcIssTypeCd
	 *	@return bdms01Fc2DtcIssTypeCd
	 */
   public char[] getBdms01Fc2DtcIssTypeCd() throws CFException{
     if (isBdms01Fc2DtcIssTypeCdModified()) { 
        bdms01Fc2DtcIssTypeCd = refreshBdms01Fc2DtcIssTypeCd();
     }
   		return bdms01Fc2DtcIssTypeCd;
   }

  
	/**
	*  set variable bdms01Fc2DtcIssTypeCd
	*  Corresponding COBOL Variable is BDMS01-FC2-DTC-ISS-TYPE-CD
	*  @param value
	**/
   public void setBdms01Fc2DtcIssTypeCd(char[] value) {
      bdms01Fc2DtcIssTypeCd = checkBdms01Fc2DtcIssTypeCdConstraints(value);
      serializeBdms01Fc2DtcIssTypeCd(bdms01Fc2DtcIssTypeCd);
   } 

     /**
	 * 	Update Bdms01Fc2DtcIssTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2DtcIssTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2DtcIssTypeCd,bdms01Fc2DtcIssTypeCd.length);
   	
   }
   
   public void setBdms01Fc2DtcIssTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2DtcIssTypeCd,bdms01Fc2DtcIssTypeCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2DtcIssTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2DtcIssTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2DtcIssTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2DtcIssTypeCd with another Field
	 *	@param value
	 */
   public void setBdms01Fc2DtcIssTypeCd(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2DtcIssTypeCd,BDMS_01_FC_2_DTC_ISS_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2DtcIssTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2DtcIssTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2DtcIssTypeCd,BDMS_01_FC_2_DTC_ISS_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2DtcIssTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2DtcIssTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2DtcIssTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2IpoInd
	 *	@return bdms01Fc2IpoInd
	 */
   public char[] getBdms01Fc2IpoInd() throws CFException{
     if (isBdms01Fc2IpoIndModified()) { 
        bdms01Fc2IpoInd = refreshBdms01Fc2IpoInd();
     }
   		return bdms01Fc2IpoInd;
   }

  
	/**
	*  set variable bdms01Fc2IpoInd
	*  Corresponding COBOL Variable is BDMS01-FC2-IPO-IND
	*  @param value
	**/
   public void setBdms01Fc2IpoInd(char[] value) {
      bdms01Fc2IpoInd = checkBdms01Fc2IpoIndConstraints(value);
      serializeBdms01Fc2IpoInd(bdms01Fc2IpoInd);
   } 

     /**
	 * 	Update Bdms01Fc2IpoInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2IpoInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2IpoInd,bdms01Fc2IpoInd.length);
   	
   }
   
   public void setBdms01Fc2IpoInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2IpoInd,bdms01Fc2IpoInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2IpoInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2IpoInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2IpoInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2IpoInd with another Field
	 *	@param value
	 */
   public void setBdms01Fc2IpoInd(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2IpoInd,BDMS_01_FC_2_IPO_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2IpoInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2IpoInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2IpoInd,BDMS_01_FC_2_IPO_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2IpoInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2IpoInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2IpoInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2CloseIpoDt
	 *	@return bdms01Fc2CloseIpoDt
	 */
   public char[] getBdms01Fc2CloseIpoDt() throws CFException{
     if (isBdms01Fc2CloseIpoDtModified()) { 
        bdms01Fc2CloseIpoDt = refreshBdms01Fc2CloseIpoDt();
     }
   		return bdms01Fc2CloseIpoDt;
   }

  
	/**
	*  set variable bdms01Fc2CloseIpoDt
	*  Corresponding COBOL Variable is BDMS01-FC2-CLOSE-IPO-DT
	*  @param value
	**/
   public void setBdms01Fc2CloseIpoDt(char[] value) {
      bdms01Fc2CloseIpoDt = checkBdms01Fc2CloseIpoDtConstraints(value);
      serializeBdms01Fc2CloseIpoDt(bdms01Fc2CloseIpoDt);
   } 

     /**
	 * 	Update Bdms01Fc2CloseIpoDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2CloseIpoDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2CloseIpoDt,bdms01Fc2CloseIpoDt.length);
   	
   }
   
   public void setBdms01Fc2CloseIpoDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2CloseIpoDt,bdms01Fc2CloseIpoDt.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2CloseIpoDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2CloseIpoDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2CloseIpoDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2CloseIpoDt with another Field
	 *	@param value
	 */
   public void setBdms01Fc2CloseIpoDt(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2CloseIpoDt,BDMS_01_FC_2_CLOSE_IPO_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2CloseIpoDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2CloseIpoDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2CloseIpoDt,BDMS_01_FC_2_CLOSE_IPO_DT_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2CloseIpoDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2CloseIpoDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2CloseIpoDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01Fc2DrctRgstnInd
	 *	@return bdms01Fc2DrctRgstnInd
	 */
   public char[] getBdms01Fc2DrctRgstnInd() throws CFException{
     if (isBdms01Fc2DrctRgstnIndModified()) { 
        bdms01Fc2DrctRgstnInd = refreshBdms01Fc2DrctRgstnInd();
     }
   		return bdms01Fc2DrctRgstnInd;
   }

  
	/**
	*  set variable bdms01Fc2DrctRgstnInd
	*  Corresponding COBOL Variable is BDMS01-FC2-DRCT-RGSTN-IND
	*  @param value
	**/
   public void setBdms01Fc2DrctRgstnInd(char[] value) {
      bdms01Fc2DrctRgstnInd = checkBdms01Fc2DrctRgstnIndConstraints(value);
      serializeBdms01Fc2DrctRgstnInd(bdms01Fc2DrctRgstnInd);
   } 

     /**
	 * 	Update Bdms01Fc2DrctRgstnInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01Fc2DrctRgstnInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01Fc2DrctRgstnInd,bdms01Fc2DrctRgstnInd.length);
   	
   }
   
   public void setBdms01Fc2DrctRgstnInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2DrctRgstnInd,bdms01Fc2DrctRgstnInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2DrctRgstnInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2DrctRgstnInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2DrctRgstnInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01Fc2DrctRgstnInd with another Field
	 *	@param value
	 */
   public void setBdms01Fc2DrctRgstnInd(Field source) {
       replace(source,0,source.length(),beginBdms01Fc2DrctRgstnInd,BDMS_01_FC_2_DRCT_RGSTN_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01Fc2DrctRgstnInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01Fc2DrctRgstnInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01Fc2DrctRgstnInd,BDMS_01_FC_2_DRCT_RGSTN_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01Fc2DrctRgstnInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01Fc2DrctRgstnInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01Fc2DrctRgstnInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01DtcCstdnOnlyInd
	 *	@return bdms01DtcCstdnOnlyInd
	 */
   public char[] getBdms01DtcCstdnOnlyInd() throws CFException{
     if (isBdms01DtcCstdnOnlyIndModified()) { 
        bdms01DtcCstdnOnlyInd = refreshBdms01DtcCstdnOnlyInd();
     }
   		return bdms01DtcCstdnOnlyInd;
   }

  
	/**
	*  set variable bdms01DtcCstdnOnlyInd
	*  Corresponding COBOL Variable is BDMS01-DTC-CSTDN-ONLY-IND
	*  @param value
	**/
   public void setBdms01DtcCstdnOnlyInd(char[] value) {
      bdms01DtcCstdnOnlyInd = checkBdms01DtcCstdnOnlyIndConstraints(value);
      serializeBdms01DtcCstdnOnlyInd(bdms01DtcCstdnOnlyInd);
   } 

     /**
	 * 	Update Bdms01DtcCstdnOnlyInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01DtcCstdnOnlyInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01DtcCstdnOnlyInd,bdms01DtcCstdnOnlyInd.length);
   	
   }
   
   public void setBdms01DtcCstdnOnlyInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DtcCstdnOnlyInd,bdms01DtcCstdnOnlyInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01DtcCstdnOnlyInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DtcCstdnOnlyInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DtcCstdnOnlyInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01DtcCstdnOnlyInd with another Field
	 *	@param value
	 */
   public void setBdms01DtcCstdnOnlyInd(Field source) {
       replace(source,0,source.length(),beginBdms01DtcCstdnOnlyInd,BDMS_01_DTC_CSTDN_ONLY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01DtcCstdnOnlyInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01DtcCstdnOnlyInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01DtcCstdnOnlyInd,BDMS_01_DTC_CSTDN_ONLY_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01DtcCstdnOnlyInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01DtcCstdnOnlyInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01DtcCstdnOnlyInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01BkDrsCd
	 *	@return bdms01BkDrsCd
	 */
   public char[] getBdms01BkDrsCd() throws CFException{
     if (isBdms01BkDrsCdModified()) { 
        bdms01BkDrsCd = refreshBdms01BkDrsCd();
     }
   		return bdms01BkDrsCd;
   }

  
	/**
	*  set variable bdms01BkDrsCd
	*  Corresponding COBOL Variable is BDMS01-BK-DRS-CD
	*  @param value
	**/
   public void setBdms01BkDrsCd(char[] value) {
      bdms01BkDrsCd = checkBdms01BkDrsCdConstraints(value);
      serializeBdms01BkDrsCd(bdms01BkDrsCd);
   } 

     /**
	 * 	Update Bdms01BkDrsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BkDrsCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01BkDrsCd,bdms01BkDrsCd.length);
   	
   }
   
   public void setBdms01BkDrsCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BkDrsCd,bdms01BkDrsCd.length);
   	
   }
   
     /**
	 * 	Update Bdms01BkDrsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BkDrsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BkDrsCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01BkDrsCd with another Field
	 *	@param value
	 */
   public void setBdms01BkDrsCd(Field source) {
       replace(source,0,source.length(),beginBdms01BkDrsCd,BDMS_01_BK_DRS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01BkDrsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BkDrsCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01BkDrsCd,BDMS_01_BK_DRS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01BkDrsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BkDrsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01BkDrsCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bdms01PprlsLglInd
	 *	@return bdms01PprlsLglInd
	 */
   public char[] getBdms01PprlsLglInd() throws CFException{
     if (isBdms01PprlsLglIndModified()) { 
        bdms01PprlsLglInd = refreshBdms01PprlsLglInd();
     }
   		return bdms01PprlsLglInd;
   }

  
	/**
	*  set variable bdms01PprlsLglInd
	*  Corresponding COBOL Variable is BDMS01-PPRLS-LGL-IND
	*  @param value
	**/
   public void setBdms01PprlsLglInd(char[] value) {
      bdms01PprlsLglInd = checkBdms01PprlsLglIndConstraints(value);
      serializeBdms01PprlsLglInd(bdms01PprlsLglInd);
   } 

     /**
	 * 	Update Bdms01PprlsLglInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PprlsLglInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBdms01PprlsLglInd,bdms01PprlsLglInd.length);
   	
   }
   
   public void setBdms01PprlsLglInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PprlsLglInd,bdms01PprlsLglInd.length);
   	
   }
   
     /**
	 * 	Update Bdms01PprlsLglInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PprlsLglInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PprlsLglInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bdms01PprlsLglInd with another Field
	 *	@param value
	 */
   public void setBdms01PprlsLglInd(Field source) {
       replace(source,0,source.length(),beginBdms01PprlsLglInd,BDMS_01_PPRLS_LGL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Bdms01PprlsLglInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PprlsLglInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBdms01PprlsLglInd,BDMS_01_PPRLS_LGL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Bdms01PprlsLglInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PprlsLglInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBdms01PprlsLglInd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes MsdFcData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01Fc2DataInd(0);
         setBdms01Fc2DepositoryCd(CONSTANTS.SPACE_4);
         setBdms01Fc2TrnfrDptryInd(CONSTANTS.SPACE);
         setBdms01Fc2PortalInd(CONSTANTS.SPACE);
         setBdms01Fc2ChllIntrDpstInd(CONSTANTS.SPACE);
         setBdms01Fc2DtcIssTypeCd(CONSTANTS.SPACE_3);
         setBdms01Fc2IpoInd(CONSTANTS.SPACE);
         setBdms01Fc2CloseIpoDt(CONSTANTS.SPACE_10);
         setBdms01Fc2DrctRgstnInd(CONSTANTS.SPACE);
         setBdms01DtcCstdnOnlyInd(CONSTANTS.SPACE);
         setBdms01BkDrsCd(CONSTANTS.SPACE);
         setBdms01PprlsLglInd(CONSTANTS.SPACE);
   }

		public static int getMsdFcDataFieldLength() {
			return MSD_FC_DATA_LENGTH;
		}

}
  
