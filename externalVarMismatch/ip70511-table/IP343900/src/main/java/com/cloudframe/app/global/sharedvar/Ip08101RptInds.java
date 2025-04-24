package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip08101RptInds is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip08101RptInds extends Ip08101RptIndsSerialized { 
   

						private char[] ip08101ThreshProcOpt = Field.fillLowValue(1);

						private char[] ip08101RunIndicator = Field.fillLowValue(1);

						private char[] ip08101RerunOption = Field.fillLowValue(1);

						private char[] ip08101LocationInd = Field.fillLowValue(1);

						private char[] ip08101CreErrDetCoRpt = Field.fillLowValue(1);

						private char[] ip08101CreErrDetIpRpt = Field.fillLowValue(1);

						private char[] ip08101CreErrDetInstId = Field.fillLowValue(1);

						private char[] ip08101CreErrDetInstAcpt = Field.fillLowValue(1);

						private char[] ip08101CreErrSumInstId = Field.fillLowValue(1);

						private char[] ip08101CreErrSumTrans = Field.fillLowValue(1);

						private char[] ip08101CreFinFileDet = Field.fillLowValue(1);

						private char[] ip08101CreFinFileTot = Field.fillLowValue(1);

						private char[] ip08101CreFinTransTot = Field.fillLowValue(1);

						private char[] ip08101CreFinRunTot = Field.fillLowValue(1);

						private char[] ip08101CreThreshSum = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip08101RptInds
	**/
    public Ip08101RptInds() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip08101RptInds. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip08101RptInds(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip08101ThreshProcOpt
	 *	@return ip08101ThreshProcOpt
	 */
   public char[] getIp08101ThreshProcOpt() throws CFException{
     if (isIp08101ThreshProcOptModified()) { 
        ip08101ThreshProcOpt = refreshIp08101ThreshProcOpt();
     }
   		return ip08101ThreshProcOpt;
   }

  
	/**
	*  set variable ip08101ThreshProcOpt
	*  Corresponding COBOL Variable is IP08101-THRESH-PROC-OPT
	*  @param value
	**/
   public void setIp08101ThreshProcOpt(char[] value) {
      ip08101ThreshProcOpt = checkIp08101ThreshProcOptConstraints(value);
      serializeIp08101ThreshProcOpt(ip08101ThreshProcOpt);
   } 

     /**
	 * 	Update Ip08101ThreshProcOpt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101ThreshProcOpt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101ThreshProcOpt,ip08101ThreshProcOpt.length);
   	
   }
   
   public void setIp08101ThreshProcOpt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101ThreshProcOpt,ip08101ThreshProcOpt.length);
   	
   }
   
     /**
	 * 	Update Ip08101ThreshProcOpt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101ThreshProcOpt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101ThreshProcOpt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101ThreshProcOpt with another Field
	 *	@param value
	 */
   public void setIp08101ThreshProcOpt(Field source) {
       replace(source,0,source.length(),beginIp08101ThreshProcOpt,IP_08101_THRESH_PROC_OPT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101ThreshProcOpt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101ThreshProcOpt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101ThreshProcOpt,IP_08101_THRESH_PROC_OPT_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101ThreshProcOpt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101ThreshProcOpt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101ThreshProcOpt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101RunIndicator
	 *	@return ip08101RunIndicator
	 */
   public char[] getIp08101RunIndicator() throws CFException{
     if (isIp08101RunIndicatorModified()) { 
        ip08101RunIndicator = refreshIp08101RunIndicator();
     }
   		return ip08101RunIndicator;
   }

  
	/**
	*  set variable ip08101RunIndicator
	*  Corresponding COBOL Variable is IP08101-RUN-INDICATOR
	*  @param value
	**/
   public void setIp08101RunIndicator(char[] value) {
      ip08101RunIndicator = checkIp08101RunIndicatorConstraints(value);
      serializeIp08101RunIndicator(ip08101RunIndicator);
   } 

     /**
	 * 	Update Ip08101RunIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RunIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101RunIndicator,ip08101RunIndicator.length);
   	
   }
   
   public void setIp08101RunIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RunIndicator,ip08101RunIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RunIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RunIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101RunIndicator with another Field
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source) {
       replace(source,0,source.length(),beginIp08101RunIndicator,IP_08101_RUN_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101RunIndicator,IP_08101_RUN_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RunIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101RerunOption
	 *	@return ip08101RerunOption
	 */
   public char[] getIp08101RerunOption() throws CFException{
     if (isIp08101RerunOptionModified()) { 
        ip08101RerunOption = refreshIp08101RerunOption();
     }
   		return ip08101RerunOption;
   }

  
	/**
	*  set variable ip08101RerunOption
	*  Corresponding COBOL Variable is IP08101-RERUN-OPTION
	*  @param value
	**/
   public void setIp08101RerunOption(char[] value) {
      ip08101RerunOption = checkIp08101RerunOptionConstraints(value);
      serializeIp08101RerunOption(ip08101RerunOption);
   } 

     /**
	 * 	Update Ip08101RerunOption 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RerunOption(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101RerunOption,ip08101RerunOption.length);
   	
   }
   
   public void setIp08101RerunOption(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RerunOption,ip08101RerunOption.length);
   	
   }
   
     /**
	 * 	Update Ip08101RerunOption 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RerunOption(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RerunOption+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101RerunOption with another Field
	 *	@param value
	 */
   public void setIp08101RerunOption(Field source) {
       replace(source,0,source.length(),beginIp08101RerunOption,IP_08101_RERUN_OPTION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101RerunOption 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RerunOption(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101RerunOption,IP_08101_RERUN_OPTION_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101RerunOption 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RerunOption(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RerunOption+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101LocationInd
	 *	@return ip08101LocationInd
	 */
   public char[] getIp08101LocationInd() throws CFException{
     if (isIp08101LocationIndModified()) { 
        ip08101LocationInd = refreshIp08101LocationInd();
     }
   		return ip08101LocationInd;
   }

  
	/**
	*  set variable ip08101LocationInd
	*  Corresponding COBOL Variable is IP08101-LOCATION-IND
	*  @param value
	**/
   public void setIp08101LocationInd(char[] value) {
      ip08101LocationInd = checkIp08101LocationIndConstraints(value);
      serializeIp08101LocationInd(ip08101LocationInd);
   } 

     /**
	 * 	Update Ip08101LocationInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101LocationInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101LocationInd,ip08101LocationInd.length);
   	
   }
   
   public void setIp08101LocationInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101LocationInd,ip08101LocationInd.length);
   	
   }
   
     /**
	 * 	Update Ip08101LocationInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101LocationInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101LocationInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101LocationInd with another Field
	 *	@param value
	 */
   public void setIp08101LocationInd(Field source) {
       replace(source,0,source.length(),beginIp08101LocationInd,IP_08101_LOCATION_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101LocationInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101LocationInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101LocationInd,IP_08101_LOCATION_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101LocationInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101LocationInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101LocationInd+targetIndex,targetLen);
    
   }
	char[] ip08101MemberSite8888Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isIp08101MemberSite88()
	 *	@return  Returns true if isIp08101MemberSite88() is "M"
	 */
   public boolean isIp08101MemberSite88() throws CFException {
      return (  compareChars( getIp08101LocationInd() , ip08101MemberSite8888Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setIp08101MemberSite88True() {  			
    	setIp08101LocationInd( ip08101MemberSite8888Value);
   	}
	char[] ip08101CentralSite8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp08101CentralSite88()
	 *	@return  Returns true if isIp08101CentralSite88() is "C"
	 */
   public boolean isIp08101CentralSite88() throws CFException {
      return (  compareChars( getIp08101LocationInd() , ip08101CentralSite8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp08101CentralSite88True() {  			
    	setIp08101LocationInd( ip08101CentralSite8888Value);
   	}
	char[] ip08101Nt8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp08101Nt88()
	 *	@return  Returns true if isIp08101Nt88() is "N"
	 */
   public boolean isIp08101Nt88() throws CFException {
      return (  compareChars( getIp08101LocationInd() , ip08101Nt8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp08101Nt88True() {  			
    	setIp08101LocationInd( ip08101Nt8888Value);
   	}
	char[] ip08101AutoEdit8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp08101AutoEdit88()
	 *	@return  Returns true if isIp08101AutoEdit88() is "A"
	 */
   public boolean isIp08101AutoEdit88() throws CFException {
      return (  compareChars( getIp08101LocationInd() , ip08101AutoEdit8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp08101AutoEdit88True() {  			
    	setIp08101LocationInd( ip08101AutoEdit8888Value);
   	}
	/**
	 *	Returns the value of ip08101CreErrDetCoRpt
	 *	@return ip08101CreErrDetCoRpt
	 */
   public char[] getIp08101CreErrDetCoRpt() throws CFException{
     if (isIp08101CreErrDetCoRptModified()) { 
        ip08101CreErrDetCoRpt = refreshIp08101CreErrDetCoRpt();
     }
   		return ip08101CreErrDetCoRpt;
   }

  
	/**
	*  set variable ip08101CreErrDetCoRpt
	*  Corresponding COBOL Variable is IP08101-CRE-ERR-DET-CO-RPT
	*  @param value
	**/
   public void setIp08101CreErrDetCoRpt(char[] value) {
      ip08101CreErrDetCoRpt = checkIp08101CreErrDetCoRptConstraints(value);
      serializeIp08101CreErrDetCoRpt(ip08101CreErrDetCoRpt);
   } 

     /**
	 * 	Update Ip08101CreErrDetCoRpt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101CreErrDetCoRpt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101CreErrDetCoRpt,ip08101CreErrDetCoRpt.length);
   	
   }
   
   public void setIp08101CreErrDetCoRpt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetCoRpt,ip08101CreErrDetCoRpt.length);
   	
   }
   
     /**
	 * 	Update Ip08101CreErrDetCoRpt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreErrDetCoRpt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetCoRpt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101CreErrDetCoRpt with another Field
	 *	@param value
	 */
   public void setIp08101CreErrDetCoRpt(Field source) {
       replace(source,0,source.length(),beginIp08101CreErrDetCoRpt,IP_08101_CRE_ERR_DET_CO_RPT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101CreErrDetCoRpt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101CreErrDetCoRpt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetCoRpt,IP_08101_CRE_ERR_DET_CO_RPT_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101CreErrDetCoRpt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreErrDetCoRpt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetCoRpt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101CreErrDetIpRpt
	 *	@return ip08101CreErrDetIpRpt
	 */
   public char[] getIp08101CreErrDetIpRpt() throws CFException{
     if (isIp08101CreErrDetIpRptModified()) { 
        ip08101CreErrDetIpRpt = refreshIp08101CreErrDetIpRpt();
     }
   		return ip08101CreErrDetIpRpt;
   }

  
	/**
	*  set variable ip08101CreErrDetIpRpt
	*  Corresponding COBOL Variable is IP08101-CRE-ERR-DET-IP-RPT
	*  @param value
	**/
   public void setIp08101CreErrDetIpRpt(char[] value) {
      ip08101CreErrDetIpRpt = checkIp08101CreErrDetIpRptConstraints(value);
      serializeIp08101CreErrDetIpRpt(ip08101CreErrDetIpRpt);
   } 

     /**
	 * 	Update Ip08101CreErrDetIpRpt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101CreErrDetIpRpt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101CreErrDetIpRpt,ip08101CreErrDetIpRpt.length);
   	
   }
   
   public void setIp08101CreErrDetIpRpt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetIpRpt,ip08101CreErrDetIpRpt.length);
   	
   }
   
     /**
	 * 	Update Ip08101CreErrDetIpRpt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreErrDetIpRpt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetIpRpt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101CreErrDetIpRpt with another Field
	 *	@param value
	 */
   public void setIp08101CreErrDetIpRpt(Field source) {
       replace(source,0,source.length(),beginIp08101CreErrDetIpRpt,IP_08101_CRE_ERR_DET_IP_RPT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101CreErrDetIpRpt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101CreErrDetIpRpt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetIpRpt,IP_08101_CRE_ERR_DET_IP_RPT_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101CreErrDetIpRpt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreErrDetIpRpt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetIpRpt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101CreErrDetInstId
	 *	@return ip08101CreErrDetInstId
	 */
   public char[] getIp08101CreErrDetInstId() throws CFException{
     if (isIp08101CreErrDetInstIdModified()) { 
        ip08101CreErrDetInstId = refreshIp08101CreErrDetInstId();
     }
   		return ip08101CreErrDetInstId;
   }

  
	/**
	*  set variable ip08101CreErrDetInstId
	*  Corresponding COBOL Variable is IP08101-CRE-ERR-DET-INST-ID
	*  @param value
	**/
   public void setIp08101CreErrDetInstId(char[] value) {
      ip08101CreErrDetInstId = checkIp08101CreErrDetInstIdConstraints(value);
      serializeIp08101CreErrDetInstId(ip08101CreErrDetInstId);
   } 

     /**
	 * 	Update Ip08101CreErrDetInstId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101CreErrDetInstId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101CreErrDetInstId,ip08101CreErrDetInstId.length);
   	
   }
   
   public void setIp08101CreErrDetInstId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetInstId,ip08101CreErrDetInstId.length);
   	
   }
   
     /**
	 * 	Update Ip08101CreErrDetInstId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreErrDetInstId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetInstId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101CreErrDetInstId with another Field
	 *	@param value
	 */
   public void setIp08101CreErrDetInstId(Field source) {
       replace(source,0,source.length(),beginIp08101CreErrDetInstId,IP_08101_CRE_ERR_DET_INST_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101CreErrDetInstId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101CreErrDetInstId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetInstId,IP_08101_CRE_ERR_DET_INST_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101CreErrDetInstId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreErrDetInstId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetInstId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101CreErrDetInstAcpt
	 *	@return ip08101CreErrDetInstAcpt
	 */
   public char[] getIp08101CreErrDetInstAcpt() throws CFException{
     if (isIp08101CreErrDetInstAcptModified()) { 
        ip08101CreErrDetInstAcpt = refreshIp08101CreErrDetInstAcpt();
     }
   		return ip08101CreErrDetInstAcpt;
   }

  
	/**
	*  set variable ip08101CreErrDetInstAcpt
	*  Corresponding COBOL Variable is IP08101-CRE-ERR-DET-INST-ACPT
	*  @param value
	**/
   public void setIp08101CreErrDetInstAcpt(char[] value) {
      ip08101CreErrDetInstAcpt = checkIp08101CreErrDetInstAcptConstraints(value);
      serializeIp08101CreErrDetInstAcpt(ip08101CreErrDetInstAcpt);
   } 

     /**
	 * 	Update Ip08101CreErrDetInstAcpt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101CreErrDetInstAcpt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101CreErrDetInstAcpt,ip08101CreErrDetInstAcpt.length);
   	
   }
   
   public void setIp08101CreErrDetInstAcpt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetInstAcpt,ip08101CreErrDetInstAcpt.length);
   	
   }
   
     /**
	 * 	Update Ip08101CreErrDetInstAcpt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreErrDetInstAcpt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetInstAcpt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101CreErrDetInstAcpt with another Field
	 *	@param value
	 */
   public void setIp08101CreErrDetInstAcpt(Field source) {
       replace(source,0,source.length(),beginIp08101CreErrDetInstAcpt,IP_08101_CRE_ERR_DET_INST_ACPT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101CreErrDetInstAcpt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101CreErrDetInstAcpt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetInstAcpt,IP_08101_CRE_ERR_DET_INST_ACPT_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101CreErrDetInstAcpt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreErrDetInstAcpt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrDetInstAcpt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101CreErrSumInstId
	 *	@return ip08101CreErrSumInstId
	 */
   public char[] getIp08101CreErrSumInstId() throws CFException{
     if (isIp08101CreErrSumInstIdModified()) { 
        ip08101CreErrSumInstId = refreshIp08101CreErrSumInstId();
     }
   		return ip08101CreErrSumInstId;
   }

  
	/**
	*  set variable ip08101CreErrSumInstId
	*  Corresponding COBOL Variable is IP08101-CRE-ERR-SUM-INST-ID
	*  @param value
	**/
   public void setIp08101CreErrSumInstId(char[] value) {
      ip08101CreErrSumInstId = checkIp08101CreErrSumInstIdConstraints(value);
      serializeIp08101CreErrSumInstId(ip08101CreErrSumInstId);
   } 

     /**
	 * 	Update Ip08101CreErrSumInstId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101CreErrSumInstId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101CreErrSumInstId,ip08101CreErrSumInstId.length);
   	
   }
   
   public void setIp08101CreErrSumInstId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrSumInstId,ip08101CreErrSumInstId.length);
   	
   }
   
     /**
	 * 	Update Ip08101CreErrSumInstId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreErrSumInstId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrSumInstId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101CreErrSumInstId with another Field
	 *	@param value
	 */
   public void setIp08101CreErrSumInstId(Field source) {
       replace(source,0,source.length(),beginIp08101CreErrSumInstId,IP_08101_CRE_ERR_SUM_INST_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101CreErrSumInstId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101CreErrSumInstId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101CreErrSumInstId,IP_08101_CRE_ERR_SUM_INST_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101CreErrSumInstId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreErrSumInstId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrSumInstId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101CreErrSumTrans
	 *	@return ip08101CreErrSumTrans
	 */
   public char[] getIp08101CreErrSumTrans() throws CFException{
     if (isIp08101CreErrSumTransModified()) { 
        ip08101CreErrSumTrans = refreshIp08101CreErrSumTrans();
     }
   		return ip08101CreErrSumTrans;
   }

  
	/**
	*  set variable ip08101CreErrSumTrans
	*  Corresponding COBOL Variable is IP08101-CRE-ERR-SUM-TRANS
	*  @param value
	**/
   public void setIp08101CreErrSumTrans(char[] value) {
      ip08101CreErrSumTrans = checkIp08101CreErrSumTransConstraints(value);
      serializeIp08101CreErrSumTrans(ip08101CreErrSumTrans);
   } 

     /**
	 * 	Update Ip08101CreErrSumTrans 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101CreErrSumTrans(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101CreErrSumTrans,ip08101CreErrSumTrans.length);
   	
   }
   
   public void setIp08101CreErrSumTrans(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrSumTrans,ip08101CreErrSumTrans.length);
   	
   }
   
     /**
	 * 	Update Ip08101CreErrSumTrans 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreErrSumTrans(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrSumTrans+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101CreErrSumTrans with another Field
	 *	@param value
	 */
   public void setIp08101CreErrSumTrans(Field source) {
       replace(source,0,source.length(),beginIp08101CreErrSumTrans,IP_08101_CRE_ERR_SUM_TRANS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101CreErrSumTrans 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101CreErrSumTrans(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101CreErrSumTrans,IP_08101_CRE_ERR_SUM_TRANS_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101CreErrSumTrans 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreErrSumTrans(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreErrSumTrans+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101CreFinFileDet
	 *	@return ip08101CreFinFileDet
	 */
   public char[] getIp08101CreFinFileDet() throws CFException{
     if (isIp08101CreFinFileDetModified()) { 
        ip08101CreFinFileDet = refreshIp08101CreFinFileDet();
     }
   		return ip08101CreFinFileDet;
   }

  
	/**
	*  set variable ip08101CreFinFileDet
	*  Corresponding COBOL Variable is IP08101-CRE-FIN-FILE-DET
	*  @param value
	**/
   public void setIp08101CreFinFileDet(char[] value) {
      ip08101CreFinFileDet = checkIp08101CreFinFileDetConstraints(value);
      serializeIp08101CreFinFileDet(ip08101CreFinFileDet);
   } 

     /**
	 * 	Update Ip08101CreFinFileDet 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101CreFinFileDet(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101CreFinFileDet,ip08101CreFinFileDet.length);
   	
   }
   
   public void setIp08101CreFinFileDet(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreFinFileDet,ip08101CreFinFileDet.length);
   	
   }
   
     /**
	 * 	Update Ip08101CreFinFileDet 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreFinFileDet(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreFinFileDet+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101CreFinFileDet with another Field
	 *	@param value
	 */
   public void setIp08101CreFinFileDet(Field source) {
       replace(source,0,source.length(),beginIp08101CreFinFileDet,IP_08101_CRE_FIN_FILE_DET_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101CreFinFileDet 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101CreFinFileDet(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101CreFinFileDet,IP_08101_CRE_FIN_FILE_DET_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101CreFinFileDet 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreFinFileDet(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreFinFileDet+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101CreFinFileTot
	 *	@return ip08101CreFinFileTot
	 */
   public char[] getIp08101CreFinFileTot() throws CFException{
     if (isIp08101CreFinFileTotModified()) { 
        ip08101CreFinFileTot = refreshIp08101CreFinFileTot();
     }
   		return ip08101CreFinFileTot;
   }

  
	/**
	*  set variable ip08101CreFinFileTot
	*  Corresponding COBOL Variable is IP08101-CRE-FIN-FILE-TOT
	*  @param value
	**/
   public void setIp08101CreFinFileTot(char[] value) {
      ip08101CreFinFileTot = checkIp08101CreFinFileTotConstraints(value);
      serializeIp08101CreFinFileTot(ip08101CreFinFileTot);
   } 

     /**
	 * 	Update Ip08101CreFinFileTot 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101CreFinFileTot(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101CreFinFileTot,ip08101CreFinFileTot.length);
   	
   }
   
   public void setIp08101CreFinFileTot(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreFinFileTot,ip08101CreFinFileTot.length);
   	
   }
   
     /**
	 * 	Update Ip08101CreFinFileTot 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreFinFileTot(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreFinFileTot+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101CreFinFileTot with another Field
	 *	@param value
	 */
   public void setIp08101CreFinFileTot(Field source) {
       replace(source,0,source.length(),beginIp08101CreFinFileTot,IP_08101_CRE_FIN_FILE_TOT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101CreFinFileTot 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101CreFinFileTot(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101CreFinFileTot,IP_08101_CRE_FIN_FILE_TOT_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101CreFinFileTot 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreFinFileTot(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreFinFileTot+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101CreFinTransTot
	 *	@return ip08101CreFinTransTot
	 */
   public char[] getIp08101CreFinTransTot() throws CFException{
     if (isIp08101CreFinTransTotModified()) { 
        ip08101CreFinTransTot = refreshIp08101CreFinTransTot();
     }
   		return ip08101CreFinTransTot;
   }

  
	/**
	*  set variable ip08101CreFinTransTot
	*  Corresponding COBOL Variable is IP08101-CRE-FIN-TRANS-TOT
	*  @param value
	**/
   public void setIp08101CreFinTransTot(char[] value) {
      ip08101CreFinTransTot = checkIp08101CreFinTransTotConstraints(value);
      serializeIp08101CreFinTransTot(ip08101CreFinTransTot);
   } 

     /**
	 * 	Update Ip08101CreFinTransTot 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101CreFinTransTot(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101CreFinTransTot,ip08101CreFinTransTot.length);
   	
   }
   
   public void setIp08101CreFinTransTot(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreFinTransTot,ip08101CreFinTransTot.length);
   	
   }
   
     /**
	 * 	Update Ip08101CreFinTransTot 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreFinTransTot(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreFinTransTot+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101CreFinTransTot with another Field
	 *	@param value
	 */
   public void setIp08101CreFinTransTot(Field source) {
       replace(source,0,source.length(),beginIp08101CreFinTransTot,IP_08101_CRE_FIN_TRANS_TOT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101CreFinTransTot 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101CreFinTransTot(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101CreFinTransTot,IP_08101_CRE_FIN_TRANS_TOT_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101CreFinTransTot 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreFinTransTot(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreFinTransTot+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101CreFinRunTot
	 *	@return ip08101CreFinRunTot
	 */
   public char[] getIp08101CreFinRunTot() throws CFException{
     if (isIp08101CreFinRunTotModified()) { 
        ip08101CreFinRunTot = refreshIp08101CreFinRunTot();
     }
   		return ip08101CreFinRunTot;
   }

  
	/**
	*  set variable ip08101CreFinRunTot
	*  Corresponding COBOL Variable is IP08101-CRE-FIN-RUN-TOT
	*  @param value
	**/
   public void setIp08101CreFinRunTot(char[] value) {
      ip08101CreFinRunTot = checkIp08101CreFinRunTotConstraints(value);
      serializeIp08101CreFinRunTot(ip08101CreFinRunTot);
   } 

     /**
	 * 	Update Ip08101CreFinRunTot 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101CreFinRunTot(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101CreFinRunTot,ip08101CreFinRunTot.length);
   	
   }
   
   public void setIp08101CreFinRunTot(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreFinRunTot,ip08101CreFinRunTot.length);
   	
   }
   
     /**
	 * 	Update Ip08101CreFinRunTot 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreFinRunTot(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreFinRunTot+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101CreFinRunTot with another Field
	 *	@param value
	 */
   public void setIp08101CreFinRunTot(Field source) {
       replace(source,0,source.length(),beginIp08101CreFinRunTot,IP_08101_CRE_FIN_RUN_TOT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101CreFinRunTot 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101CreFinRunTot(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101CreFinRunTot,IP_08101_CRE_FIN_RUN_TOT_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101CreFinRunTot 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreFinRunTot(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreFinRunTot+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101CreThreshSum
	 *	@return ip08101CreThreshSum
	 */
   public char[] getIp08101CreThreshSum() throws CFException{
     if (isIp08101CreThreshSumModified()) { 
        ip08101CreThreshSum = refreshIp08101CreThreshSum();
     }
   		return ip08101CreThreshSum;
   }

  
	/**
	*  set variable ip08101CreThreshSum
	*  Corresponding COBOL Variable is IP08101-CRE-THRESH-SUM
	*  @param value
	**/
   public void setIp08101CreThreshSum(char[] value) {
      ip08101CreThreshSum = checkIp08101CreThreshSumConstraints(value);
      serializeIp08101CreThreshSum(ip08101CreThreshSum);
   } 

     /**
	 * 	Update Ip08101CreThreshSum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101CreThreshSum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101CreThreshSum,ip08101CreThreshSum.length);
   	
   }
   
   public void setIp08101CreThreshSum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreThreshSum,ip08101CreThreshSum.length);
   	
   }
   
     /**
	 * 	Update Ip08101CreThreshSum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreThreshSum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreThreshSum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101CreThreshSum with another Field
	 *	@param value
	 */
   public void setIp08101CreThreshSum(Field source) {
       replace(source,0,source.length(),beginIp08101CreThreshSum,IP_08101_CRE_THRESH_SUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101CreThreshSum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101CreThreshSum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101CreThreshSum,IP_08101_CRE_THRESH_SUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101CreThreshSum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101CreThreshSum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101CreThreshSum+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip08101RptInds
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp08101ThreshProcOpt(CONSTANTS.SPACE);
         setIp08101RunIndicator(CONSTANTS.SPACE);
         setIp08101RerunOption(CONSTANTS.SPACE);
         setIp08101LocationInd(CONSTANTS.SPACE);
         setIp08101CreErrDetCoRpt(CONSTANTS.SPACE);
         setIp08101CreErrDetIpRpt(CONSTANTS.SPACE);
         setIp08101CreErrDetInstId(CONSTANTS.SPACE);
         setIp08101CreErrDetInstAcpt(CONSTANTS.SPACE);
         setIp08101CreErrSumInstId(CONSTANTS.SPACE);
         setIp08101CreErrSumTrans(CONSTANTS.SPACE);
         setIp08101CreFinFileDet(CONSTANTS.SPACE);
         setIp08101CreFinFileTot(CONSTANTS.SPACE);
         setIp08101CreFinTransTot(CONSTANTS.SPACE);
         setIp08101CreFinRunTot(CONSTANTS.SPACE);
         setIp08101CreThreshSum(CONSTANTS.SPACE);
   }

		public static int getIp08101RptIndsFieldLength() {
			return IP_08101_RPT_INDS_LENGTH;
		}

}
  
