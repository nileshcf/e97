package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004FileErrors is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Ip40004FileErrors extends Ip40004FileErrorsSerialized { 
   

								private int ip40004FileErrorType;
				private Ip40004FileErrorInfo ip40004FileErrorInfo = new Ip40004FileErrorInfo();
      private List<char[]> ip40004FileReplText; 

	
	/**
	* Constructor for Ip40004FileErrors
	**/
    public Ip40004FileErrors() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip40004FileErrors. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FileErrors(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip40004FileErrorInfo.setParent(this,getStartOffset() + 2);
    } 

	/**
	 *	Returns the value of ip40004FileErrorType
	 *	@return ip40004FileErrorType
	 */
	public int getIp40004FileErrorType() throws CFException {
       if (isIp40004FileErrorTypeModified()) { 
           ip40004FileErrorType = refreshIp40004FileErrorType();
        }
   		return ip40004FileErrorType;
	}
	

	
	   
	/**
	 * 	Update Ip40004FileErrorType with the passed value
	 *  Corresponding COBOL Variable is IP40004-FILE-ERROR-TYPE
	 *	@param number
	 */
	public void setIp40004FileErrorType(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004FileErrorType = checkIp40004FileErrorTypeMaxLimit(number); 
		serializeIp40004FileErrorType(ip40004FileErrorType);
	}
	

	public void setIp40004FileErrorType(long number) {
	    number = checkIp40004FileErrorTypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp40004FileErrorType((int)number);
	}
	
	/**
	 * 	Update Ip40004FileErrorType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004FileErrorType(char[] value) throws CFException {
		 ip40004FileErrorType = serializeIp40004FileErrorType(value);
	}
	/**
	 * 	Update Ip40004FileErrorType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004FileErrorTypeString(char[] value) throws CFException {
		 setIp40004FileErrorType(value);
	}
	/**
	 *	Returns the value of ip40004FileErrorInfo
	 *	@return ip40004FileErrorInfo
	 */   
	 public Ip40004FileErrorInfo getIp40004FileErrorInfo() {
   	return ip40004FileErrorInfo;
   }
   /**
	* 	Update Ip40004FileErrorInfo with the passed value
	*   Corresponding COBOL Variable is IP40004-FILE-ERROR-INFO
	*	@param value
	*/
   public void setIp40004FileErrorInfo(char[] value) {
      ip40004FileErrorInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ip40004FileErrorInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileErrorInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FileErrorInfo.begin,ip40004FileErrorInfo.length());
   }
   
     /**
	 * 	Update Ip40004FileErrorInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileErrorInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FileErrorInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip40004FileErrorInfo with another Field
	 *	@param value
	 */
   public void setIp40004FileErrorInfo(Field source) {
   	replace(source,0,source.length(),ip40004FileErrorInfo.begin,ip40004FileErrorInfo.length());
   }  
   
     /**
	 * 	Update Ip40004FileErrorInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp40004FileErrorInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FileErrorInfo.begin,ip40004FileErrorInfo.length());
   }
   
     /**
	 * 	Update Ip40004FileErrorInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FileErrorInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FileErrorInfo.begin+targetIndex,targetLen);
   }
    /**
	 *	Returns the value of ip40004FileReplText
	 *  Corresponding COBOL Variable is IP40004-FILE-REPL-TEXT
	 *	@return ip40004FileReplText
	 */
	public List<char[]> getIp40004FileReplText() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_40004_FILE_REPL_TEXT_SIZE;index++) {
        	list.add( getIp40004FileReplText( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip40004FileReplText
	 */
	public char[] getIp40004FileReplText(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp40004FileReplText(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_40004_FILE_REPL_TEXT_SIZE) {
             	index = IP_40004_FILE_REPL_TEXT_SIZE -1; // can't exceed max array size
             	logger.trace("ip40004FileReplText - Array index exceeded max Size {}, resetting it to max allowed",IP_40004_FILE_REPL_TEXT_SIZE); 
	    }
   	      return getCharArray( (beginIp40004FileReplText + index*IP_40004_FILE_REPL_TEXT_LEN) , IP_40004_FILE_REPL_TEXT_LEN );
    }
    
    
   public int  ip40004FileReplTextFieldLength() {
   	return IP_40004_FILE_REPL_TEXT_LEN;
   }
   
	

  
  	/**
	 *	Update Ip40004FileReplText with the passed value at a given index
	 *  Corresponding COBOL Variable is IP40004-FILE-REPL-TEXT
	 *  @param index
	 *	@param value
	 */
  public void setIp40004FileReplText(int index,char[] value) {
   	setIp40004FileReplText(index,value,true);
   }
   
   
   /**
	 *	Update Ip40004FileReplText with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp40004FileReplText(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp40004FileReplText(int,String,boolean), reset it to 0",index);
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
		serializeIp40004FileReplText(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes Ip40004FileErrors
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp40004FileErrorType(0);
          ip40004FileErrorInfo.initialize();
     
         for (int index =0; index < IP_40004_FILE_REPL_TEXT_SIZE;index++) {
             setIp40004FileReplText(index, CONSTANTS.SPACE_50);
         }
   }

		public static int getIp40004FileErrorsFieldLength() {
			return IP_40004_FILE_ERRORS_LENGTH;
		}

}
  
