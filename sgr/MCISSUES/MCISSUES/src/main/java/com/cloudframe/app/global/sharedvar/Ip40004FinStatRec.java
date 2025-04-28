package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004FinStatRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Ip40004FinStatRec extends Ip40004FinStatRecSerialized { 
   

						private char[] ip40004TransmissionId = Field.fillLowValue(25);
				private Ip40004FileIdFinan ip40004FileIdFinan = new Ip40004FileIdFinan();

						private char[] ip40004FinancialInd = Field.fillLowValue(1);

						private char[] ip40004MtiFunc = Field.fillLowValue(8);

						private char[] ip40004ReversalInd = Field.fillLowValue(1);

						private char[] ip40004ReversalDate = Field.fillLowValue(6);

						private char[] ip40004TransType2 = Field.fillLowValue(2);

								private int ip40004Mcc;

						private char[] ip40004Ird = Field.fillLowValue(2);

						private char[] ip40004CurrencyCode = Field.fillLowValue(3);

						private char[] ip40004CurrencyExp = Field.fillLowValue(1);
      private List<char[]> ip40004InvDtlData; 

	
	/**
	* Constructor for Ip40004FinStatRec
	**/
    public Ip40004FinStatRec() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip40004FinStatRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FinStatRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip40004FileIdFinan.setParent(this,getStartOffset() + 25);
    } 

	/**
	 *	Returns the value of ip40004TransmissionId
	 *	@return ip40004TransmissionId
	 */
   public char[] getIp40004TransmissionId() throws CFException{
     if (isIp40004TransmissionIdModified()) { 
        ip40004TransmissionId = refreshIp40004TransmissionId();
     }
   		return ip40004TransmissionId;
   }

  
	/**
	*  set variable ip40004TransmissionId
	*  Corresponding COBOL Variable is IP40004-TRANSMISSION-ID
	*  @param value
	**/
   public void setIp40004TransmissionId(char[] value) {
      ip40004TransmissionId = checkIp40004TransmissionIdConstraints(value);
      serializeIp40004TransmissionId(ip40004TransmissionId);
   } 

     /**
	 * 	Update Ip40004TransmissionId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004TransmissionId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004TransmissionId,ip40004TransmissionId.length);
   	
   }
   
   public void setIp40004TransmissionId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransmissionId,ip40004TransmissionId.length);
   	
   }
   
     /**
	 * 	Update Ip40004TransmissionId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TransmissionId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransmissionId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004TransmissionId with another Field
	 *	@param value
	 */
   public void setIp40004TransmissionId(Field source) {
       replace(source,0,source.length(),beginIp40004TransmissionId,IP_40004_TRANSMISSION_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004TransmissionId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004TransmissionId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004TransmissionId,IP_40004_TRANSMISSION_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004TransmissionId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TransmissionId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransmissionId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004FileIdFinan
	 *	@return ip40004FileIdFinan
	 */   
	 public Ip40004FileIdFinan getIp40004FileIdFinan() {
   	return ip40004FileIdFinan;
   }
   /**
	* 	Update Ip40004FileIdFinan with the passed value
	*   Corresponding COBOL Variable is IP40004-FILE-ID-FINAN
	*	@param value
	*/
   public void setIp40004FileIdFinan(char[] value) {
      ip40004FileIdFinan.setString(value); 
   }   
    
     /**
	 * 	Update Ip40004FileIdFinan 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileIdFinan(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FileIdFinan.begin,ip40004FileIdFinan.length());
   }
   
     /**
	 * 	Update Ip40004FileIdFinan 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileIdFinan(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FileIdFinan.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip40004FileIdFinan with another Field
	 *	@param value
	 */
   public void setIp40004FileIdFinan(Field source) {
   	replace(source,0,source.length(),ip40004FileIdFinan.begin,ip40004FileIdFinan.length());
   }  
   
     /**
	 * 	Update Ip40004FileIdFinan 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileIdFinan(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FileIdFinan.begin,ip40004FileIdFinan.length());
   }
   
     /**
	 * 	Update Ip40004FileIdFinan 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileIdFinan(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FileIdFinan.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip40004FinancialInd
	 *	@return ip40004FinancialInd
	 */
   public char[] getIp40004FinancialInd() throws CFException{
     if (isIp40004FinancialIndModified()) { 
        ip40004FinancialInd = refreshIp40004FinancialInd();
     }
   		return ip40004FinancialInd;
   }

  
	/**
	*  set variable ip40004FinancialInd
	*  Corresponding COBOL Variable is IP40004-FINANCIAL-IND
	*  @param value
	**/
   public void setIp40004FinancialInd(char[] value) {
      ip40004FinancialInd = checkIp40004FinancialIndConstraints(value);
      serializeIp40004FinancialInd(ip40004FinancialInd);
   } 

     /**
	 * 	Update Ip40004FinancialInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004FinancialInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004FinancialInd,ip40004FinancialInd.length);
   	
   }
   
   public void setIp40004FinancialInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FinancialInd,ip40004FinancialInd.length);
   	
   }
   
     /**
	 * 	Update Ip40004FinancialInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FinancialInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FinancialInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004FinancialInd with another Field
	 *	@param value
	 */
   public void setIp40004FinancialInd(Field source) {
       replace(source,0,source.length(),beginIp40004FinancialInd,IP_40004_FINANCIAL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004FinancialInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004FinancialInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004FinancialInd,IP_40004_FINANCIAL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004FinancialInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FinancialInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004FinancialInd+targetIndex,targetLen);
    
   }
	char[] ip40004FinTrans8888Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isIp40004FinTrans88()
	 *	@return  Returns true if isIp40004FinTrans88() is "F"
	 */
   public boolean isIp40004FinTrans88() throws CFException {
      return (  compareChars( getIp40004FinancialInd() , ip40004FinTrans8888Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setIp40004FinTrans88True() {  			
    	setIp40004FinancialInd( ip40004FinTrans8888Value);
   	}
	char[] ip40004NonFinTrans8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp40004NonFinTrans88()
	 *	@return  Returns true if isIp40004NonFinTrans88() is "N"
	 */
   public boolean isIp40004NonFinTrans88() throws CFException {
      return (  compareChars( getIp40004FinancialInd() , ip40004NonFinTrans8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp40004NonFinTrans88True() {  			
    	setIp40004FinancialInd( ip40004NonFinTrans8888Value);
   	}
	char[] ip40004UnrecTrans8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isIp40004UnrecTrans88()
	 *	@return  Returns true if isIp40004UnrecTrans88() is "U"
	 */
   public boolean isIp40004UnrecTrans88() throws CFException {
      return (  compareChars( getIp40004FinancialInd() , ip40004UnrecTrans8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setIp40004UnrecTrans88True() {  			
    	setIp40004FinancialInd( ip40004UnrecTrans8888Value);
   	}
	char[] ip40004InvProcCdTrans8888Value = "V".toCharArray();
	/**
	 *	Test condition "V" for isIp40004InvProcCdTrans88()
	 *	@return  Returns true if isIp40004InvProcCdTrans88() is "V"
	 */
   public boolean isIp40004InvProcCdTrans88() throws CFException {
      return (  compareChars( getIp40004FinancialInd() , ip40004InvProcCdTrans8888Value)  == 0  );
   }


	/**
	*  set values "V"
	*/
   	public void setIp40004InvProcCdTrans88True() {  			
    	setIp40004FinancialInd( ip40004InvProcCdTrans8888Value);
   	}
	char[] ip40004InvFuncCdTrans8888Value = "W".toCharArray();
	/**
	 *	Test condition "W" for isIp40004InvFuncCdTrans88()
	 *	@return  Returns true if isIp40004InvFuncCdTrans88() is "W"
	 */
   public boolean isIp40004InvFuncCdTrans88() throws CFException {
      return (  compareChars( getIp40004FinancialInd() , ip40004InvFuncCdTrans8888Value)  == 0  );
   }


	/**
	*  set values "W"
	*/
   	public void setIp40004InvFuncCdTrans88True() {  			
    	setIp40004FinancialInd( ip40004InvFuncCdTrans8888Value);
   	}
	char[] ip40004InvAmtTrans8888Value = "X".toCharArray();
	/**
	 *	Test condition "X" for isIp40004InvAmtTrans88()
	 *	@return  Returns true if isIp40004InvAmtTrans88() is "X"
	 */
   public boolean isIp40004InvAmtTrans88() throws CFException {
      return (  compareChars( getIp40004FinancialInd() , ip40004InvAmtTrans8888Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setIp40004InvAmtTrans88True() {  			
    	setIp40004FinancialInd( ip40004InvAmtTrans8888Value);
   	}
	char[] ip40004InvRevIndTrans8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp40004InvRevIndTrans88()
	 *	@return  Returns true if isIp40004InvRevIndTrans88() is "Y"
	 */
   public boolean isIp40004InvRevIndTrans88() throws CFException {
      return (  compareChars( getIp40004FinancialInd() , ip40004InvRevIndTrans8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp40004InvRevIndTrans88True() {  			
    	setIp40004FinancialInd( ip40004InvRevIndTrans8888Value);
   	}
	/**
	 *	Returns the value of ip40004MtiFunc
	 *	@return ip40004MtiFunc
	 */
   public char[] getIp40004MtiFunc() throws CFException{
     if (isIp40004MtiFuncModified()) { 
        ip40004MtiFunc = refreshIp40004MtiFunc();
     }
   		return ip40004MtiFunc;
   }

  
	/**
	*  set variable ip40004MtiFunc
	*  Corresponding COBOL Variable is IP40004-MTI-FUNC
	*  @param value
	**/
   public void setIp40004MtiFunc(char[] value) {
      ip40004MtiFunc = checkIp40004MtiFuncConstraints(value);
      serializeIp40004MtiFunc(ip40004MtiFunc);
   } 

     /**
	 * 	Update Ip40004MtiFunc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004MtiFunc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004MtiFunc,ip40004MtiFunc.length);
   	
   }
   
   public void setIp40004MtiFunc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004MtiFunc,ip40004MtiFunc.length);
   	
   }
   
     /**
	 * 	Update Ip40004MtiFunc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004MtiFunc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004MtiFunc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004MtiFunc with another Field
	 *	@param value
	 */
   public void setIp40004MtiFunc(Field source) {
       replace(source,0,source.length(),beginIp40004MtiFunc,IP_40004_MTI_FUNC_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004MtiFunc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004MtiFunc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004MtiFunc,IP_40004_MTI_FUNC_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004MtiFunc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004MtiFunc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004MtiFunc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004ReversalInd
	 *	@return ip40004ReversalInd
	 */
   public char[] getIp40004ReversalInd() throws CFException{
     if (isIp40004ReversalIndModified()) { 
        ip40004ReversalInd = refreshIp40004ReversalInd();
     }
   		return ip40004ReversalInd;
   }

  
	/**
	*  set variable ip40004ReversalInd
	*  Corresponding COBOL Variable is IP40004-REVERSAL-IND
	*  @param value
	**/
   public void setIp40004ReversalInd(char[] value) {
      ip40004ReversalInd = checkIp40004ReversalIndConstraints(value);
      serializeIp40004ReversalInd(ip40004ReversalInd);
   } 

     /**
	 * 	Update Ip40004ReversalInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004ReversalInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004ReversalInd,ip40004ReversalInd.length);
   	
   }
   
   public void setIp40004ReversalInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004ReversalInd,ip40004ReversalInd.length);
   	
   }
   
     /**
	 * 	Update Ip40004ReversalInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004ReversalInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004ReversalInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004ReversalInd with another Field
	 *	@param value
	 */
   public void setIp40004ReversalInd(Field source) {
       replace(source,0,source.length(),beginIp40004ReversalInd,IP_40004_REVERSAL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004ReversalInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004ReversalInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004ReversalInd,IP_40004_REVERSAL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004ReversalInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004ReversalInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004ReversalInd+targetIndex,targetLen);
    
   }
	char[] ip40004Original8888Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isIp40004Original88()
	 *	@return  Returns true if isIp40004Original88() is "O"
	 */
   public boolean isIp40004Original88() throws CFException {
      return (  compareChars( getIp40004ReversalInd() , ip40004Original8888Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setIp40004Original88True() {  			
    	setIp40004ReversalInd( ip40004Original8888Value);
   	}
	char[] ip40004Reversal8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp40004Reversal88()
	 *	@return  Returns true if isIp40004Reversal88() is "R"
	 */
   public boolean isIp40004Reversal88() throws CFException {
      return (  compareChars( getIp40004ReversalInd() , ip40004Reversal8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp40004Reversal88True() {  			
    	setIp40004ReversalInd( ip40004Reversal8888Value);
   	}
	/**
	 *	Returns the value of ip40004ReversalDate
	 *	@return ip40004ReversalDate
	 */
   public char[] getIp40004ReversalDate() throws CFException{
     if (isIp40004ReversalDateModified()) { 
        ip40004ReversalDate = refreshIp40004ReversalDate();
     }
   		return ip40004ReversalDate;
   }

  
	/**
	*  set variable ip40004ReversalDate
	*  Corresponding COBOL Variable is IP40004-REVERSAL-DATE
	*  @param value
	**/
   public void setIp40004ReversalDate(char[] value) {
      ip40004ReversalDate = checkIp40004ReversalDateConstraints(value);
      serializeIp40004ReversalDate(ip40004ReversalDate);
   } 

     /**
	 * 	Update Ip40004ReversalDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004ReversalDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004ReversalDate,ip40004ReversalDate.length);
   	
   }
   
   public void setIp40004ReversalDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004ReversalDate,ip40004ReversalDate.length);
   	
   }
   
     /**
	 * 	Update Ip40004ReversalDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004ReversalDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004ReversalDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004ReversalDate with another Field
	 *	@param value
	 */
   public void setIp40004ReversalDate(Field source) {
       replace(source,0,source.length(),beginIp40004ReversalDate,IP_40004_REVERSAL_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004ReversalDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004ReversalDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004ReversalDate,IP_40004_REVERSAL_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004ReversalDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004ReversalDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004ReversalDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004TransType2
	 *	@return ip40004TransType2
	 */
   public char[] getIp40004TransType2() throws CFException{
     if (isIp40004TransType2Modified()) { 
        ip40004TransType2 = refreshIp40004TransType2();
     }
   		return ip40004TransType2;
   }

  
	/**
	*  set variable ip40004TransType2
	*  Corresponding COBOL Variable is IP40004-TRANS-TYPE2
	*  @param value
	**/
   public void setIp40004TransType2(char[] value) {
      ip40004TransType2 = checkIp40004TransType2Constraints(value);
      serializeIp40004TransType2(ip40004TransType2);
   } 

     /**
	 * 	Update Ip40004TransType2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004TransType2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004TransType2,ip40004TransType2.length);
   	
   }
   
   public void setIp40004TransType2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransType2,ip40004TransType2.length);
   	
   }
   
     /**
	 * 	Update Ip40004TransType2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TransType2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransType2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004TransType2 with another Field
	 *	@param value
	 */
   public void setIp40004TransType2(Field source) {
       replace(source,0,source.length(),beginIp40004TransType2,IP_40004_TRANS_TYPE_2_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004TransType2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004TransType2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004TransType2,IP_40004_TRANS_TYPE_2_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004TransType2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TransType2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransType2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004Mcc
	 *	@return ip40004Mcc
	 */
	public int getIp40004Mcc() throws CFException {
       if (isIp40004MccModified()) { 
           ip40004Mcc = refreshIp40004Mcc();
        }
   		return ip40004Mcc;
	}
	

	
	   
	/**
	 * 	Update Ip40004Mcc with the passed value
	 *  Corresponding COBOL Variable is IP40004-MCC
	 *	@param number
	 */
	public void setIp40004Mcc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004Mcc = checkIp40004MccMaxLimit(number); 
		serializeIp40004Mcc(ip40004Mcc);
	}
	

	public void setIp40004Mcc(long number) {
	    number = checkIp40004MccMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp40004Mcc((int)number);
	}
	
	/**
	 * 	Update Ip40004Mcc with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004Mcc(char[] value) throws CFException {
		 ip40004Mcc = serializeIp40004Mcc(value);
	}
	/**
	 * 	Update Ip40004Mcc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004MccString(char[] value) throws CFException {
		 setIp40004Mcc(value);
	}
	/**
	 *	Returns the value of ip40004Ird
	 *	@return ip40004Ird
	 */
   public char[] getIp40004Ird() throws CFException{
     if (isIp40004IrdModified()) { 
        ip40004Ird = refreshIp40004Ird();
     }
   		return ip40004Ird;
   }

  
	/**
	*  set variable ip40004Ird
	*  Corresponding COBOL Variable is IP40004-IRD
	*  @param value
	**/
   public void setIp40004Ird(char[] value) {
      ip40004Ird = checkIp40004IrdConstraints(value);
      serializeIp40004Ird(ip40004Ird);
   } 

     /**
	 * 	Update Ip40004Ird 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004Ird(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004Ird,ip40004Ird.length);
   	
   }
   
   public void setIp40004Ird(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004Ird,ip40004Ird.length);
   	
   }
   
     /**
	 * 	Update Ip40004Ird 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004Ird(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004Ird+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004Ird with another Field
	 *	@param value
	 */
   public void setIp40004Ird(Field source) {
       replace(source,0,source.length(),beginIp40004Ird,IP_40004_IRD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004Ird 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004Ird(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004Ird,IP_40004_IRD_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004Ird 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004Ird(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004Ird+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004CurrencyCode
	 *	@return ip40004CurrencyCode
	 */
   public char[] getIp40004CurrencyCode() throws CFException{
     if (isIp40004CurrencyCodeModified()) { 
        ip40004CurrencyCode = refreshIp40004CurrencyCode();
     }
   		return ip40004CurrencyCode;
   }

  
	/**
	*  set variable ip40004CurrencyCode
	*  Corresponding COBOL Variable is IP40004-CURRENCY-CODE
	*  @param value
	**/
   public void setIp40004CurrencyCode(char[] value) {
      ip40004CurrencyCode = checkIp40004CurrencyCodeConstraints(value);
      serializeIp40004CurrencyCode(ip40004CurrencyCode);
   } 

     /**
	 * 	Update Ip40004CurrencyCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004CurrencyCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004CurrencyCode,ip40004CurrencyCode.length);
   	
   }
   
   public void setIp40004CurrencyCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004CurrencyCode,ip40004CurrencyCode.length);
   	
   }
   
     /**
	 * 	Update Ip40004CurrencyCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004CurrencyCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004CurrencyCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004CurrencyCode with another Field
	 *	@param value
	 */
   public void setIp40004CurrencyCode(Field source) {
       replace(source,0,source.length(),beginIp40004CurrencyCode,IP_40004_CURRENCY_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004CurrencyCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004CurrencyCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004CurrencyCode,IP_40004_CURRENCY_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004CurrencyCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004CurrencyCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004CurrencyCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip40004CurrencyExp
	 *	@return ip40004CurrencyExp
	 */
   public char[] getIp40004CurrencyExp() throws CFException{
     if (isIp40004CurrencyExpModified()) { 
        ip40004CurrencyExp = refreshIp40004CurrencyExp();
     }
   		return ip40004CurrencyExp;
   }

  
	/**
	*  set variable ip40004CurrencyExp
	*  Corresponding COBOL Variable is IP40004-CURRENCY-EXP
	*  @param value
	**/
   public void setIp40004CurrencyExp(char[] value) {
      ip40004CurrencyExp = checkIp40004CurrencyExpConstraints(value);
      serializeIp40004CurrencyExp(ip40004CurrencyExp);
   } 

     /**
	 * 	Update Ip40004CurrencyExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004CurrencyExp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004CurrencyExp,ip40004CurrencyExp.length);
   	
   }
   
   public void setIp40004CurrencyExp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004CurrencyExp,ip40004CurrencyExp.length);
   	
   }
   
     /**
	 * 	Update Ip40004CurrencyExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004CurrencyExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004CurrencyExp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004CurrencyExp with another Field
	 *	@param value
	 */
   public void setIp40004CurrencyExp(Field source) {
       replace(source,0,source.length(),beginIp40004CurrencyExp,IP_40004_CURRENCY_EXP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004CurrencyExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004CurrencyExp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004CurrencyExp,IP_40004_CURRENCY_EXP_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004CurrencyExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004CurrencyExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004CurrencyExp+targetIndex,targetLen);
    
   }
    /**
	 *	Returns the value of ip40004InvDtlData
	 *  Corresponding COBOL Variable is IP40004-INV-DTL-DATA
	 *	@return ip40004InvDtlData
	 */
	public List<char[]> getIp40004InvDtlData() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_40004_INV_DTL_DATA_SIZE;index++) {
        	list.add( getIp40004InvDtlData( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip40004InvDtlData
	 */
	public char[] getIp40004InvDtlData(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp40004InvDtlData(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_40004_INV_DTL_DATA_SIZE) {
             	index = IP_40004_INV_DTL_DATA_SIZE -1; // can't exceed max array size
             	logger.trace("ip40004InvDtlData - Array index exceeded max Size {}, resetting it to max allowed",IP_40004_INV_DTL_DATA_SIZE); 
	    }
   	      return getCharArray( (beginIp40004InvDtlData + index*IP_40004_INV_DTL_DATA_LEN) , IP_40004_INV_DTL_DATA_LEN );
    }
    
    
   public int  ip40004InvDtlDataFieldLength() {
   	return IP_40004_INV_DTL_DATA_LEN;
   }
   
	

  
  	/**
	 *	Update Ip40004InvDtlData with the passed value at a given index
	 *  Corresponding COBOL Variable is IP40004-INV-DTL-DATA
	 *  @param index
	 *	@param value
	 */
  public void setIp40004InvDtlData(int index,char[] value) {
   	setIp40004InvDtlData(index,value,true);
   }
   
   
   /**
	 *	Update Ip40004InvDtlData with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp40004InvDtlData(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp40004InvDtlData(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 50)  {     
		       value = substring(value,0,50);
           }  else if (value.length < 50) {
		       value = pad(50, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(50).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeIp40004InvDtlData(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes Ip40004FinStatRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004TransmissionId(CONSTANTS.SPACE_25);
          ip40004FileIdFinan.initialize();
     
         setIp40004FinancialInd(CONSTANTS.SPACE);
         setIp40004MtiFunc(CONSTANTS.SPACE_8);
         setIp40004ReversalInd(CONSTANTS.SPACE);
         setIp40004ReversalDate(CONSTANTS.SPACE_6);
         setIp40004TransType2(CONSTANTS.SPACE_2);
                     setIp40004Mcc(0);
         setIp40004Ird(CONSTANTS.SPACE_2);
         setIp40004CurrencyCode(CONSTANTS.SPACE_3);
         setIp40004CurrencyExp(CONSTANTS.SPACE);
         for (int index =0; index < IP_40004_INV_DTL_DATA_SIZE;index++) {
             setIp40004InvDtlData(index, CONSTANTS.SPACE_50);
         }
   }

		public static int getIp40004FinStatRecFieldLength() {
			return IP_40004_FIN_STAT_REC_LENGTH;
		}

}
  
