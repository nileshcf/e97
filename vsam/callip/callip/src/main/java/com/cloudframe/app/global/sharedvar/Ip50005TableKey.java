package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005TableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip50005TableKey extends Ip50005TableKeySerialized { 
   
				private Ip50005TableId ip50005TableId = new Ip50005TableId();

						private char[] ip50005ReadTableId = Field.fillLowValue(8);

								private long ip50005EffDate;
	
	/**
	* Constructor for Ip50005TableKey
	**/
    public Ip50005TableKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50005TableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005TableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip50005TableId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip50005TableId
	 *	@return ip50005TableId
	 */   
	 public Ip50005TableId getIp50005TableId() {
   	return ip50005TableId;
   }
   /**
	* 	Update Ip50005TableId with the passed value
	*   Corresponding COBOL Variable is IP50005-TABLE-ID
	*	@param value
	*/
   public void setIp50005TableId(char[] value) {
      ip50005TableId.setString(value); 
   }   
    
     /**
	 * 	Update Ip50005TableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50005TableId.begin,ip50005TableId.length());
   }
   
     /**
	 * 	Update Ip50005TableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50005TableId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50005TableId with another Field
	 *	@param value
	 */
   public void setIp50005TableId(Field source) {
   	replace(source,0,source.length(),ip50005TableId.begin,ip50005TableId.length());
   }  
   
     /**
	 * 	Update Ip50005TableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50005TableId.begin,ip50005TableId.length());
   }
   
     /**
	 * 	Update Ip50005TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50005TableId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip50005ReadTableId
	 *	@return ip50005ReadTableId
	 */
   public char[] getIp50005ReadTableId() throws CFException{
     if (isIp50005ReadTableIdModified()) { 
        ip50005ReadTableId = refreshIp50005ReadTableId();
     }
   		return ip50005ReadTableId;
   }

  
	/**
	*  set variable ip50005ReadTableId
	*  Corresponding COBOL Variable is IP50005-READ-TABLE-ID
	*  @param value
	**/
   public void setIp50005ReadTableId(char[] value) {
      ip50005ReadTableId = checkIp50005ReadTableIdConstraints(value);
      serializeIp50005ReadTableId(ip50005ReadTableId);
   } 

     /**
	 * 	Update Ip50005ReadTableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005ReadTableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005ReadTableId,ip50005ReadTableId.length);
   	
   }
   
   public void setIp50005ReadTableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005ReadTableId,ip50005ReadTableId.length);
   	
   }
   
     /**
	 * 	Update Ip50005ReadTableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ReadTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005ReadTableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005ReadTableId with another Field
	 *	@param value
	 */
   public void setIp50005ReadTableId(Field source) {
       replace(source,0,source.length(),beginIp50005ReadTableId,IP_50005_READ_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005ReadTableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005ReadTableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005ReadTableId,IP_50005_READ_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005ReadTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ReadTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005ReadTableId+targetIndex,targetLen);
    
   }
	char[] ip50005CloseIndicator8888Value = "99999999".toCharArray();
	/**
	 *	Test condition "99999999" for isIp50005CloseIndicator88()
	 *	@return  Returns true if isIp50005CloseIndicator88() is "99999999"
	 */
   public boolean isIp50005CloseIndicator88() throws CFException {
      return (  compareChars( getIp50005ReadTableId() , ip50005CloseIndicator8888Value)  == 0  );
   }


	/**
	*  set values "99999999"
	*/
   	public void setIp50005CloseIndicator88True() {  			
    	setIp50005ReadTableId( ip50005CloseIndicator8888Value);
   	}
	/**
	 *	Returns the value of ip50005EffDate
	 *	@return ip50005EffDate
	 */
	public long getIp50005EffDate() throws CFException {
       if (isIp50005EffDateModified()) { 
           ip50005EffDate = refreshIp50005EffDate();
        }
   		return ip50005EffDate;
	}
	

	
	   
	/**
	 * 	Update Ip50005EffDate with the passed value
	 *  Corresponding COBOL Variable is IP50005-EFF-DATE
	 *	@param number
	 */
	public void setIp50005EffDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip50005EffDate = checkIp50005EffDateMaxLimit(number); 
		serializeIp50005EffDate(ip50005EffDate);
	}
	

	/**
	 * 	Update Ip50005EffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50005EffDate(char[] value) throws CFException {
		 ip50005EffDate = serializeIp50005EffDate(value);
	}
	/**
	 * 	Update Ip50005EffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50005EffDateString(char[] value) throws CFException {
		 setIp50005EffDate(value);
	}

	
	
	
	/**
	 * 	initializes Ip50005TableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip50005TableId.initialize();
     
                     setIp50005EffDate(0);
   }

		public static int getIp50005TableKeyFieldLength() {
			return IP_50005_TABLE_KEY_LENGTH;
		}

}
  
