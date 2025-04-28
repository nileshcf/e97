package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404Entry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00404Entry extends Ip00404EntrySerialized { 
   
				private Ip00404MpePeRecData ip00404MpePeRecData = new Ip00404MpePeRecData();
				private Ip00404MpePeRecDataCs ip00404MpePeRecDataCs = new Ip00404MpePeRecDataCs();

						private char[] ip00404Filler01 = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip00404Entry
	**/
    public Ip00404Entry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00404Entry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404Entry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip00404MpePeRecData.setParent(this,getStartOffset() + 0);
	       			ip00404MpePeRecDataCs.setParent(this,getStartOffset() + 25);
    } 

	/**
	 *	Returns the value of ip00404MpePeRecData
	 *	@return ip00404MpePeRecData
	 */   
	 public Ip00404MpePeRecData getIp00404MpePeRecData() {
   	return ip00404MpePeRecData;
   }
   /**
	* 	Update Ip00404MpePeRecData with the passed value
	*   Corresponding COBOL Variable is IP00404-MPE-PE-REC-DATA
	*	@param value
	*/
   public void setIp00404MpePeRecData(char[] value) {
      ip00404MpePeRecData.setString(value); 
   }   
    
     /**
	 * 	Update Ip00404MpePeRecData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00404MpePeRecData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404MpePeRecData.begin,ip00404MpePeRecData.length());
   }
   
     /**
	 * 	Update Ip00404MpePeRecData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MpePeRecData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404MpePeRecData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00404MpePeRecData with another Field
	 *	@param value
	 */
   public void setIp00404MpePeRecData(Field source) {
   	replace(source,0,source.length(),ip00404MpePeRecData.begin,ip00404MpePeRecData.length());
   }  
   
     /**
	 * 	Update Ip00404MpePeRecData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00404MpePeRecData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404MpePeRecData.begin,ip00404MpePeRecData.length());
   }
   
     /**
	 * 	Update Ip00404MpePeRecData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MpePeRecData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404MpePeRecData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00404MpePeRecDataCs
	 *	@return ip00404MpePeRecDataCs
	 */   
	 public Ip00404MpePeRecDataCs getIp00404MpePeRecDataCs() {
   	return ip00404MpePeRecDataCs;
   }
   /**
	* 	Update Ip00404MpePeRecDataCs with the passed value
	*   Corresponding COBOL Variable is IP00404-MPE-PE-REC-DATA-CS
	*	@param value
	*/
   public void setIp00404MpePeRecDataCs(char[] value) {
      ip00404MpePeRecDataCs.setString(value); 
   }   
    
     /**
	 * 	Update Ip00404MpePeRecDataCs 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00404MpePeRecDataCs(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404MpePeRecDataCs.begin,ip00404MpePeRecDataCs.length());
   }
   
     /**
	 * 	Update Ip00404MpePeRecDataCs 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MpePeRecDataCs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404MpePeRecDataCs.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00404MpePeRecDataCs with another Field
	 *	@param value
	 */
   public void setIp00404MpePeRecDataCs(Field source) {
   	replace(source,0,source.length(),ip00404MpePeRecDataCs.begin,ip00404MpePeRecDataCs.length());
   }  
   
     /**
	 * 	Update Ip00404MpePeRecDataCs 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00404MpePeRecDataCs(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00404MpePeRecDataCs.begin,ip00404MpePeRecDataCs.length());
   }
   
     /**
	 * 	Update Ip00404MpePeRecDataCs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404MpePeRecDataCs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00404MpePeRecDataCs.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00404Filler01
	 *	@return ip00404Filler01
	 */
   public char[] getIp00404Filler01() throws CFException{
     if (isIp00404Filler01Modified()) { 
        ip00404Filler01 = refreshIp00404Filler01();
     }
   		return ip00404Filler01;
   }

  
	/**
	*  set variable ip00404Filler01
	*  Corresponding COBOL Variable is IP00404-FILLER
	*  @param value
	**/
   public void setIp00404Filler01(char[] value) {
      ip00404Filler01 = checkIp00404Filler01Constraints(value);
      serializeIp00404Filler01(ip00404Filler01);
   } 

     /**
	 * 	Update Ip00404Filler01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404Filler01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00404Filler01,ip00404Filler01.length);
   	
   }
   
   public void setIp00404Filler01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Filler01,ip00404Filler01.length);
   	
   }
   
     /**
	 * 	Update Ip00404Filler01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Filler01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Filler01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00404Filler01 with another Field
	 *	@param value
	 */
   public void setIp00404Filler01(Field source) {
       replace(source,0,source.length(),beginIp00404Filler01,IP_00404_FILLER_01_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00404Filler01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404Filler01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00404Filler01,IP_00404_FILLER_01_LEN);
   	
   }
   
     /**
	 * 	Update Ip00404Filler01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Filler01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00404Filler01+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00404Entry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip00404MpePeRecData.initialize();
     
          ip00404MpePeRecDataCs.initialize();
     
         setIp00404Filler01(CONSTANTS.SPACE_2);
   }

		public static int getIp00404EntryFieldLength() {
			return IP_00404_ENTRY_LENGTH;
		}

}
  
