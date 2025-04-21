package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip90354TableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip90354TableDataKey extends Ip90354TableDataKeySerialized { 
   

								private int ip90354L1CtlTableType;
				private Ip90354L1Ctlmtifunc ip90354L1Ctlmtifunc = new Ip90354L1Ctlmtifunc();
				private Ip90354L1CtldataInd ip90354L1CtldataInd = new Ip90354L1CtldataInd();

						private char[] ip90354L1Ctldata = Field.fillLowValue(26);

						private char[] ip90354L1Ctlexclusionind = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip90354TableDataKey
	**/
    public Ip90354TableDataKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip90354TableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90354TableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip90354L1Ctlmtifunc.setParent(this,getStartOffset() + 1);
	       			ip90354L1CtldataInd.setParent(this,getStartOffset() + 8);
    } 

	/**
	 *	Returns the value of ip90354L1CtlTableType
	 *	@return ip90354L1CtlTableType
	 */
	public int getIp90354L1CtlTableType() throws CFException {
       if (isIp90354L1CtlTableTypeModified()) { 
           ip90354L1CtlTableType = refreshIp90354L1CtlTableType();
        }
   		return ip90354L1CtlTableType;
	}
	

	
	   
	/**
	 * 	Update Ip90354L1CtlTableType with the passed value
	 *  Corresponding COBOL Variable is IP90354-L1-CTL-TABLE-TYPE
	 *	@param number
	 */
	public void setIp90354L1CtlTableType(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip90354L1CtlTableType = checkIp90354L1CtlTableTypeMaxLimit(number); 
		serializeIp90354L1CtlTableType(ip90354L1CtlTableType);
	}
	

	public void setIp90354L1CtlTableType(long number) {
	    number = checkIp90354L1CtlTableTypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp90354L1CtlTableType((int)number);
	}
	
	/**
	 * 	Update Ip90354L1CtlTableType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90354L1CtlTableType(char[] value) throws CFException {
		 ip90354L1CtlTableType = serializeIp90354L1CtlTableType(value);
	}
	/**
	 * 	Update Ip90354L1CtlTableType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90354L1CtlTableTypeString(char[] value) throws CFException {
		 setIp90354L1CtlTableType(value);
	}
	/**
	 *	Returns the value of ip90354L1Ctlmtifunc
	 *	@return ip90354L1Ctlmtifunc
	 */   
	 public Ip90354L1Ctlmtifunc getIp90354L1Ctlmtifunc() {
   	return ip90354L1Ctlmtifunc;
   }
   /**
	* 	Update Ip90354L1Ctlmtifunc with the passed value
	*   Corresponding COBOL Variable is IP90354-L1-CTLMTIFUNC
	*	@param value
	*/
   public void setIp90354L1Ctlmtifunc(char[] value) {
      ip90354L1Ctlmtifunc.setString(value); 
   }   
    
     /**
	 * 	Update Ip90354L1Ctlmtifunc 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp90354L1Ctlmtifunc(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip90354L1Ctlmtifunc.begin,ip90354L1Ctlmtifunc.length());
   }
   
     /**
	 * 	Update Ip90354L1Ctlmtifunc 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90354L1Ctlmtifunc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip90354L1Ctlmtifunc.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip90354L1Ctlmtifunc with another Field
	 *	@param value
	 */
   public void setIp90354L1Ctlmtifunc(Field source) {
   	replace(source,0,source.length(),ip90354L1Ctlmtifunc.begin,ip90354L1Ctlmtifunc.length());
   }  
   
     /**
	 * 	Update Ip90354L1Ctlmtifunc 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp90354L1Ctlmtifunc(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip90354L1Ctlmtifunc.begin,ip90354L1Ctlmtifunc.length());
   }
   
     /**
	 * 	Update Ip90354L1Ctlmtifunc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90354L1Ctlmtifunc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip90354L1Ctlmtifunc.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip90354L1CtldataInd
	 *	@return ip90354L1CtldataInd
	 */   
	 public Ip90354L1CtldataInd getIp90354L1CtldataInd() {
   	return ip90354L1CtldataInd;
   }
   /**
	* 	Update Ip90354L1CtldataInd with the passed value
	*   Corresponding COBOL Variable is IP90354-L1-CTLDATA-IND
	*	@param value
	*/
   public void setIp90354L1CtldataInd(char[] value) {
      ip90354L1CtldataInd.setString(value); 
   }   
    
     /**
	 * 	Update Ip90354L1CtldataInd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp90354L1CtldataInd(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip90354L1CtldataInd.begin,ip90354L1CtldataInd.length());
   }
   
     /**
	 * 	Update Ip90354L1CtldataInd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90354L1CtldataInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip90354L1CtldataInd.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip90354L1CtldataInd with another Field
	 *	@param value
	 */
   public void setIp90354L1CtldataInd(Field source) {
   	replace(source,0,source.length(),ip90354L1CtldataInd.begin,ip90354L1CtldataInd.length());
   }  
   
     /**
	 * 	Update Ip90354L1CtldataInd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp90354L1CtldataInd(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip90354L1CtldataInd.begin,ip90354L1CtldataInd.length());
   }
   
     /**
	 * 	Update Ip90354L1CtldataInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90354L1CtldataInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip90354L1CtldataInd.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip90354L1Ctldata
	 *	@return ip90354L1Ctldata
	 */
   public char[] getIp90354L1Ctldata() throws CFException{
     if (isIp90354L1CtldataModified()) { 
        ip90354L1Ctldata = refreshIp90354L1Ctldata();
     }
   		return ip90354L1Ctldata;
   }

  
	/**
	*  set variable ip90354L1Ctldata
	*  Corresponding COBOL Variable is IP90354-L1-CTLDATA
	*  @param value
	**/
   public void setIp90354L1Ctldata(char[] value) {
      ip90354L1Ctldata = checkIp90354L1CtldataConstraints(value);
      serializeIp90354L1Ctldata(ip90354L1Ctldata);
   } 

     /**
	 * 	Update Ip90354L1Ctldata 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp90354L1Ctldata(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp90354L1Ctldata,ip90354L1Ctldata.length);
   	
   }
   
   public void setIp90354L1Ctldata(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp90354L1Ctldata,ip90354L1Ctldata.length);
   	
   }
   
     /**
	 * 	Update Ip90354L1Ctldata 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90354L1Ctldata(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp90354L1Ctldata+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip90354L1Ctldata with another Field
	 *	@param value
	 */
   public void setIp90354L1Ctldata(Field source) {
       replace(source,0,source.length(),beginIp90354L1Ctldata,IP_90354_L_1_CTLDATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip90354L1Ctldata 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp90354L1Ctldata(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp90354L1Ctldata,IP_90354_L_1_CTLDATA_LEN);
   	
   }
   
     /**
	 * 	Update Ip90354L1Ctldata 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90354L1Ctldata(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp90354L1Ctldata+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip90354L1Ctlexclusionind
	 *	@return ip90354L1Ctlexclusionind
	 */
   public char[] getIp90354L1Ctlexclusionind() throws CFException{
     if (isIp90354L1CtlexclusionindModified()) { 
        ip90354L1Ctlexclusionind = refreshIp90354L1Ctlexclusionind();
     }
   		return ip90354L1Ctlexclusionind;
   }

  
	/**
	*  set variable ip90354L1Ctlexclusionind
	*  Corresponding COBOL Variable is IP90354-L1-CTLEXCLUSIONIND
	*  @param value
	**/
   public void setIp90354L1Ctlexclusionind(char[] value) {
      ip90354L1Ctlexclusionind = checkIp90354L1CtlexclusionindConstraints(value);
      serializeIp90354L1Ctlexclusionind(ip90354L1Ctlexclusionind);
   } 

     /**
	 * 	Update Ip90354L1Ctlexclusionind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp90354L1Ctlexclusionind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp90354L1Ctlexclusionind,ip90354L1Ctlexclusionind.length);
   	
   }
   
   public void setIp90354L1Ctlexclusionind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp90354L1Ctlexclusionind,ip90354L1Ctlexclusionind.length);
   	
   }
   
     /**
	 * 	Update Ip90354L1Ctlexclusionind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90354L1Ctlexclusionind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp90354L1Ctlexclusionind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip90354L1Ctlexclusionind with another Field
	 *	@param value
	 */
   public void setIp90354L1Ctlexclusionind(Field source) {
       replace(source,0,source.length(),beginIp90354L1Ctlexclusionind,IP_90354_L_1_CTLEXCLUSIONIND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip90354L1Ctlexclusionind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp90354L1Ctlexclusionind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp90354L1Ctlexclusionind,IP_90354_L_1_CTLEXCLUSIONIND_LEN);
   	
   }
   
     /**
	 * 	Update Ip90354L1Ctlexclusionind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90354L1Ctlexclusionind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp90354L1Ctlexclusionind+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp90354TableDataKeyFieldLength() {
			return IP_90354_TABLE_DATA_KEY_LENGTH;
		}

}
  
