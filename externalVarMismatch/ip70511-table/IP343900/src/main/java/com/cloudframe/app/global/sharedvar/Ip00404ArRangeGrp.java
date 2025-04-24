package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404ArRangeGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00404ArRangeGrp extends Ip00404ArRangeGrpSerialized { 
   

						private char[] ip00404Tbl40ArH = Field.fillLowValue(19);

						private char[] ip00404Tbl40ArL = Field.fillLowValue(19);
	
	/**
	* Constructor for Ip00404ArRangeGrp
	**/
    public Ip00404ArRangeGrp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00404ArRangeGrp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404ArRangeGrp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00404Tbl40ArH
	 *	@return ip00404Tbl40ArH
	 */
   public char[] getIp00404Tbl40ArH() throws CFException{
     if (isIp00404Tbl40ArHModified()) { 
        ip00404Tbl40ArH = refreshIp00404Tbl40ArH();
     }
   		return ip00404Tbl40ArH;
   }

  
	/**
	*  set variable ip00404Tbl40ArH
	*  Corresponding COBOL Variable is IP00404-TBL-40-AR-H
	*  @param value
	**/
   public void setIp00404Tbl40ArH(char[] value) {
      ip00404Tbl40ArH = checkIp00404Tbl40ArHConstraints(value);
      serializeIp00404Tbl40ArH(ip00404Tbl40ArH);
   } 

     /**
	 * 	Update Ip00404Tbl40ArH 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404Tbl40ArH,ip00404Tbl40ArH.length);
   	
   }
   
   public void setIp00404Tbl40ArH(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Tbl40ArH,ip00404Tbl40ArH.length);
   	
   }
   
     /**
	 * 	Update Ip00404Tbl40ArH 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Tbl40ArH+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404Tbl40ArH with another Field
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(Field source) {
       replace(source,0,source.length(),beginIp00404Tbl40ArH,IP_00404_TBL_40_AR_H_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404Tbl40ArH 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404Tbl40ArH,IP_00404_TBL_40_AR_H_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404Tbl40ArH 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Tbl40ArH+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00404Tbl40ArL
	 *	@return ip00404Tbl40ArL
	 */
   public char[] getIp00404Tbl40ArL() throws CFException{
     if (isIp00404Tbl40ArLModified()) { 
        ip00404Tbl40ArL = refreshIp00404Tbl40ArL();
     }
   		return ip00404Tbl40ArL;
   }

  
	/**
	*  set variable ip00404Tbl40ArL
	*  Corresponding COBOL Variable is IP00404-TBL-40-AR-L
	*  @param value
	**/
   public void setIp00404Tbl40ArL(char[] value) {
      ip00404Tbl40ArL = checkIp00404Tbl40ArLConstraints(value);
      serializeIp00404Tbl40ArL(ip00404Tbl40ArL);
   } 

     /**
	 * 	Update Ip00404Tbl40ArL 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404Tbl40ArL(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404Tbl40ArL,ip00404Tbl40ArL.length);
   	
   }
   
   public void setIp00404Tbl40ArL(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Tbl40ArL,ip00404Tbl40ArL.length);
   	
   }
   
     /**
	 * 	Update Ip00404Tbl40ArL 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Tbl40ArL(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Tbl40ArL+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404Tbl40ArL with another Field
	 *	@param value
	 */
   public void setIp00404Tbl40ArL(Field source) {
       replace(source,0,source.length(),beginIp00404Tbl40ArL,IP_00404_TBL_40_AR_L_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404Tbl40ArL 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404Tbl40ArL(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404Tbl40ArL,IP_00404_TBL_40_AR_L_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404Tbl40ArL 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Tbl40ArL(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Tbl40ArL+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00404ArRangeGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00404Tbl40ArH(CONSTANTS.SPACE_19);
         setIp00404Tbl40ArL(CONSTANTS.SPACE_19);
   }

		public static int getIp00404ArRangeGrpFieldLength() {
			return IP_00404_AR_RANGE_GRP_LENGTH;
		}

}
  
