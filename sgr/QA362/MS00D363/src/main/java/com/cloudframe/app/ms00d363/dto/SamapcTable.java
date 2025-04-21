package com.cloudframe.app.ms00d363.dto;

/**
*  The class SamapcTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


public class SamapcTable extends SamapcTableSerialized { 
   

						private char[] apcIca = Field.fillLowValue(6);

								private BigDecimal apcAmt = BigDecimal.ZERO;

						private char[] dbCrInd = Field.fillLowValue(1);
	
	/**
	* Constructor for SamapcTable
	**/
    public SamapcTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SamapcTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SamapcTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of apcIca
	 *	@return apcIca
	 */
   public char[] getApcIca() throws CFException{
     if (isApcIcaModified()) { 
        apcIca = refreshApcIca();
     }
   		return apcIca;
   }

  
	/**
	*  set variable apcIca
	*  Corresponding COBOL Variable is WS-APC-ICA
	*  @param value
	**/
   public void setApcIca(char[] value) {
      apcIca = checkApcIcaConstraints(value);
      serializeApcIca(apcIca);
   } 

     /**
	 * 	Update ApcIca 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApcIca(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApcIca,apcIca.length);
   	
   }
   
   public void setApcIca(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApcIca,apcIca.length);
   	
   }
   
     /**
	 * 	Update ApcIca 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApcIca(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApcIca+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApcIca with another Field
	 *	@param value
	 */
   public void setApcIca(Field source) {
       replace(source,0,source.length(),beginApcIca,APC_ICA_LEN);
   	
   }  
   
     /**
	 * 	Update ApcIca 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApcIca(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApcIca,APC_ICA_LEN);
   	
   }
   
     /**
	 * 	Update ApcIca 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApcIca(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApcIca+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of apcAmt
	 *	@return apcAmt
	 */
	public BigDecimal getApcAmt() throws CFException {
       if (isApcAmtModified()) { 
           apcAmt = refreshApcAmt();
        }
   		return apcAmt;
	}
	

	
	   
	/**
	 * 	Update ApcAmt with the passed number
	 *  Corresponding COBOL Variable is WS-APC-AMT
	 *	@param number
	 */
	public void setApcAmt(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       apcAmt = checkApcAmtMaxLimit(number);
	    serializeApcAmt(apcAmt);
   }
	/**
	 * 	Update ApcAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setApcAmt(char[] value) throws CFException {
		 apcAmt = serializeApcAmt(value);
	}   
	/**
	 *	Returns the value of dbCrInd
	 *	@return dbCrInd
	 */
   public char[] getDbCrInd() throws CFException{
     if (isDbCrIndModified()) { 
        dbCrInd = refreshDbCrInd();
     }
   		return dbCrInd;
   }

  
	/**
	*  set variable dbCrInd
	*  Corresponding COBOL Variable is WS-DB-CR-IND
	*  @param value
	**/
   public void setDbCrInd(char[] value) {
      dbCrInd = checkDbCrIndConstraints(value);
      serializeDbCrInd(dbCrInd);
   } 

     /**
	 * 	Update DbCrInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDbCrInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDbCrInd,dbCrInd.length);
   	
   }
   
   public void setDbCrInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDbCrInd,dbCrInd.length);
   	
   }
   
     /**
	 * 	Update DbCrInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDbCrInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDbCrInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DbCrInd with another Field
	 *	@param value
	 */
   public void setDbCrInd(Field source) {
       replace(source,0,source.length(),beginDbCrInd,DB_CR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update DbCrInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDbCrInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDbCrInd,DB_CR_IND_LEN);
   	
   }
   
     /**
	 * 	Update DbCrInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDbCrInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDbCrInd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes SamapcTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setApcIca(CONSTANTS.SPACE_6);
			setApcAmt(BigDecimal.ZERO);
         setDbCrInd(CONSTANTS.SPACE);
   }

		public static int getSamapcTableFieldLength() {
			return SAMAPC_TABLE_LENGTH;
		}

}
  
