package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip2ooo1TableEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Ip2ooo1TableEntries extends Ip2ooo1TableEntriesSerialized { 
   

								private int ip2ooo1ErrorType;
				private Ip2ooo1ErrorInfo ip2ooo1ErrorInfo = new Ip2ooo1ErrorInfo();
      private List<char[]> ip2ooo1ReplText; 

	
	/**
	* Constructor for Ip2ooo1TableEntries
	**/
    public Ip2ooo1TableEntries() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip2ooo1TableEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip2ooo1TableEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip2ooo1ErrorInfo.setParent(this,getStartOffset() + 2);
    } 

	/**
	 *	Returns the value of ip2ooo1ErrorType
	 *	@return ip2ooo1ErrorType
	 */
	public int getIp2ooo1ErrorType() throws CFException {
       if (isIp2ooo1ErrorTypeModified()) { 
           ip2ooo1ErrorType = refreshIp2ooo1ErrorType();
        }
   		return ip2ooo1ErrorType;
	}
	

	
	   
	/**
	 * 	Update Ip2ooo1ErrorType with the passed value
	 *  Corresponding COBOL Variable is IP2OOO1-ERROR-TYPE
	 *	@param number
	 */
	public void setIp2ooo1ErrorType(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip2ooo1ErrorType = checkIp2ooo1ErrorTypeMaxLimit(number); 
		serializeIp2ooo1ErrorType(ip2ooo1ErrorType);
	}
	

	public void setIp2ooo1ErrorType(long number) {
	    number = checkIp2ooo1ErrorTypeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp2ooo1ErrorType((int)number);
	}
	
	/**
	 * 	Update Ip2ooo1ErrorType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorType(char[] value) throws CFException {
		 ip2ooo1ErrorType = serializeIp2ooo1ErrorType(value);
	}
	/**
	 * 	Update Ip2ooo1ErrorType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorTypeString(char[] value) throws CFException {
		 setIp2ooo1ErrorType(value);
	}
	
	/**
	 *	Test condition 0 for isIp2ooo1FileErrors88()
	 *	@return  Returns true if isIp2ooo1FileErrors88() is 0
	 */
   public boolean isIp2ooo1FileErrors88() throws CFException {
      return (  getIp2ooo1ErrorType()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setIp2ooo1FileErrors88True() {  			
    	setIp2ooo1ErrorType( 0);
   	}
	
	/**
	 *	Test condition 1 for isIp2ooo1MsgErrors88()
	 *	@return  Returns true if isIp2ooo1MsgErrors88() is 1
	 */
   public boolean isIp2ooo1MsgErrors88() throws CFException {
      return (  getIp2ooo1ErrorType()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setIp2ooo1MsgErrors88True() {  			
    	setIp2ooo1ErrorType( 1);
   	}
	/**
	 *	Returns the value of ip2ooo1ErrorInfo
	 *	@return ip2ooo1ErrorInfo
	 */   
	 public Ip2ooo1ErrorInfo getIp2ooo1ErrorInfo() {
   	return ip2ooo1ErrorInfo;
   }
   /**
	* 	Update Ip2ooo1ErrorInfo with the passed value
	*   Corresponding COBOL Variable is IP2OOO1-ERROR-INFO
	*	@param value
	*/
   public void setIp2ooo1ErrorInfo(char[] value) {
      ip2ooo1ErrorInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ip2ooo1ErrorInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip2ooo1ErrorInfo.begin,ip2ooo1ErrorInfo.length());
   }
   
     /**
	 * 	Update Ip2ooo1ErrorInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip2ooo1ErrorInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip2ooo1ErrorInfo with another Field
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfo(Field source) {
   	replace(source,0,source.length(),ip2ooo1ErrorInfo.begin,ip2ooo1ErrorInfo.length());
   }  
   
     /**
	 * 	Update Ip2ooo1ErrorInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip2ooo1ErrorInfo.begin,ip2ooo1ErrorInfo.length());
   }
   
     /**
	 * 	Update Ip2ooo1ErrorInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip2ooo1ErrorInfo.begin+targetIndex,targetLen);
   }
    /**
	 *	Returns the value of ip2ooo1ReplText
	 *  Corresponding COBOL Variable is IP2OOO1-REPL-TEXT
	 *	@return ip2ooo1ReplText
	 */
	public List<char[]> getIp2ooo1ReplText() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_2OOO_1_REPL_TEXT_SIZE;index++) {
        	list.add( getIp2ooo1ReplText( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip2ooo1ReplText
	 */
	public char[] getIp2ooo1ReplText(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp2ooo1ReplText(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_2OOO_1_REPL_TEXT_SIZE) {
             	index = IP_2OOO_1_REPL_TEXT_SIZE -1; // can't exceed max array size
             	logger.trace("ip2ooo1ReplText - Array index exceeded max Size {}, resetting it to max allowed",IP_2OOO_1_REPL_TEXT_SIZE); 
	    }
   	      return getCharArray( (beginIp2ooo1ReplText + index*IP_2OOO_1_REPL_TEXT_LEN) , IP_2OOO_1_REPL_TEXT_LEN );
    }
    
    
   public int  ip2ooo1ReplTextFieldLength() {
   	return IP_2OOO_1_REPL_TEXT_LEN;
   }
   
	

  
  	/**
	 *	Update Ip2ooo1ReplText with the passed value at a given index
	 *  Corresponding COBOL Variable is IP2OOO1-REPL-TEXT
	 *  @param index
	 *	@param value
	 */
  public void setIp2ooo1ReplText(int index,char[] value) {
   	setIp2ooo1ReplText(index,value,true);
   }
   
   
   /**
	 *	Update Ip2ooo1ReplText with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp2ooo1ReplText(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp2ooo1ReplText(int,String,boolean), reset it to 0",index);
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
		serializeIp2ooo1ReplText(index,value);		
       }
   }
   

	
	
	
	/**
	 * 	initializes Ip2ooo1TableEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp2ooo1ErrorType(0);
          ip2ooo1ErrorInfo.initialize();
     
         for (int index =0; index < IP_2OOO_1_REPL_TEXT_SIZE;index++) {
             setIp2ooo1ReplText(index, CONSTANTS.SPACE_50);
         }
   }

		public static int getIp2ooo1TableEntriesFieldLength() {
			return IP_2OOO_1_TABLE_ENTRIES_LENGTH;
		}

}
  
