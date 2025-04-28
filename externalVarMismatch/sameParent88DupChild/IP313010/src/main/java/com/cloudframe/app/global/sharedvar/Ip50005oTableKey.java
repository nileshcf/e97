package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005oTableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip50005oTableKey extends Ip50005oTableKeySerialized { 
   
				private Ip50005oTableId ip50005oTableId = new Ip50005oTableId();

						private char[] ip50005oReadTableId = Field.fillLowValue(8);

								private long ip50005oEffDate;
	
	/**
	* Constructor for Ip50005oTableKey
	**/
    public Ip50005oTableKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50005oTableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005oTableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip50005oTableId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip50005oTableId
	 *	@return ip50005oTableId
	 */   
	 public Ip50005oTableId getIp50005oTableId() {
   	return ip50005oTableId;
   }
   /**
	* 	Update Ip50005oTableId with the passed value
	*   Corresponding COBOL Variable is IP50005O-TABLE-ID
	*	@param value
	*/
   public void setIp50005oTableId(char[] value) {
      ip50005oTableId.setString(value); 
   }   
    
     /**
	 * 	Update Ip50005oTableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50005oTableId.begin,ip50005oTableId.length());
   }
   
     /**
	 * 	Update Ip50005oTableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50005oTableId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50005oTableId with another Field
	 *	@param value
	 */
   public void setIp50005oTableId(Field source) {
   	replace(source,0,source.length(),ip50005oTableId.begin,ip50005oTableId.length());
   }  
   
     /**
	 * 	Update Ip50005oTableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50005oTableId.begin,ip50005oTableId.length());
   }
   
     /**
	 * 	Update Ip50005oTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50005oTableId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip50005oReadTableId
	 *	@return ip50005oReadTableId
	 */
   public char[] getIp50005oReadTableId() throws CFException{
     if (isIp50005oReadTableIdModified()) { 
        ip50005oReadTableId = refreshIp50005oReadTableId();
     }
   		return ip50005oReadTableId;
   }

  
	/**
	*  set variable ip50005oReadTableId
	*  Corresponding COBOL Variable is IP50005O-READ-TABLE-ID
	*  @param value
	**/
   public void setIp50005oReadTableId(char[] value) {
      ip50005oReadTableId = checkIp50005oReadTableIdConstraints(value);
      serializeIp50005oReadTableId(ip50005oReadTableId);
   } 

     /**
	 * 	Update Ip50005oReadTableId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005oReadTableId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50005oReadTableId,ip50005oReadTableId.length);
   	
   }
   
   public void setIp50005oReadTableId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oReadTableId,ip50005oReadTableId.length);
   	
   }
   
     /**
	 * 	Update Ip50005oReadTableId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oReadTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oReadTableId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50005oReadTableId with another Field
	 *	@param value
	 */
   public void setIp50005oReadTableId(Field source) {
       replace(source,0,source.length(),beginIp50005oReadTableId,IP_50005O_READ_TABLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50005oReadTableId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005oReadTableId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50005oReadTableId,IP_50005O_READ_TABLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip50005oReadTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oReadTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50005oReadTableId+targetIndex,targetLen);
    
   }
	char[] ip50005oCloseIndicator8888Value = "99999999".toCharArray();
	/**
	 *	Test condition "99999999" for isIp50005oCloseIndicator88()
	 *	@return  Returns true if isIp50005oCloseIndicator88() is "99999999"
	 */
   public boolean isIp50005oCloseIndicator88() throws CFException {
      return (  compareChars( getIp50005oReadTableId() , ip50005oCloseIndicator8888Value)  == 0  );
   }


	/**
	*  set values "99999999"
	*/
   	public void setIp50005oCloseIndicator88True() {  			
    	setIp50005oReadTableId( ip50005oCloseIndicator8888Value);
   	}
	/**
	 *	Returns the value of ip50005oEffDate
	 *	@return ip50005oEffDate
	 */
	public long getIp50005oEffDate() throws CFException {
       if (isIp50005oEffDateModified()) { 
           ip50005oEffDate = refreshIp50005oEffDate();
        }
   		return ip50005oEffDate;
	}
	

	
	   
	/**
	 * 	Update Ip50005oEffDate with the passed value
	 *  Corresponding COBOL Variable is IP50005O-EFF-DATE
	 *	@param number
	 */
	public void setIp50005oEffDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip50005oEffDate = checkIp50005oEffDateMaxLimit(number); 
		serializeIp50005oEffDate(ip50005oEffDate);
	}
	

	/**
	 * 	Update Ip50005oEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50005oEffDate(char[] value) throws CFException {
		 ip50005oEffDate = serializeIp50005oEffDate(value);
	}
	/**
	 * 	Update Ip50005oEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50005oEffDateString(char[] value) throws CFException {
		 setIp50005oEffDate(value);
	}

	
	
	
	/**
	 * 	initializes Ip50005oTableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip50005oTableId.initialize();
     
                     setIp50005oEffDate(0);
   }

		public static int getIp50005oTableKeyFieldLength() {
			return IP_50005O_TABLE_KEY_LENGTH;
		}

}
  
