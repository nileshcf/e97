package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005TableKeyAll is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip50005TableKeyAll extends Ip50005TableKeyAllSerialized { 
   
				private Ip50005TableKey ip50005TableKey = new Ip50005TableKey();

								private long ip50005Seq;
	
	/**
	* Constructor for Ip50005TableKeyAll
	**/
    public Ip50005TableKeyAll() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50005TableKeyAll. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005TableKeyAll(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip50005TableKey.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip50005TableKey
	 *	@return ip50005TableKey
	 */   
	 public Ip50005TableKey getIp50005TableKey() {
   	return ip50005TableKey;
   }
   /**
	* 	Update Ip50005TableKey with the passed value
	*   Corresponding COBOL Variable is IP50005-TABLE-KEY
	*	@param value
	*/
   public void setIp50005TableKey(char[] value) {
      ip50005TableKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip50005TableKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50005TableKey.begin,ip50005TableKey.length());
   }
   
     /**
	 * 	Update Ip50005TableKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50005TableKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50005TableKey with another Field
	 *	@param value
	 */
   public void setIp50005TableKey(Field source) {
   	replace(source,0,source.length(),ip50005TableKey.begin,ip50005TableKey.length());
   }  
   
     /**
	 * 	Update Ip50005TableKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50005TableKey.begin,ip50005TableKey.length());
   }
   
     /**
	 * 	Update Ip50005TableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50005TableKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip50005Seq
	 *	@return ip50005Seq
	 */
	public long getIp50005Seq() throws CFException {
        if (isIp50005SeqModified()) { 
           ip50005Seq = refreshIp50005Seq();
        }
   		return ip50005Seq;
	}
	
	/**
	 * 	Update Ip50005Seq with the passed value
	 *  Corresponding COBOL Variable is IP50005-SEQ
	 *	@param number
	 */
	public void setIp50005Seq(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip50005Seq = checkIp50005SeqMaxLimit(number); 
		serializeIp50005Seq(ip50005Seq);
	}



	
	
	
	/**
	 * 	initializes Ip50005TableKeyAll
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip50005TableKey.initialize();
     
                     setIp50005Seq(0);
   }

		public static int getIp50005TableKeyAllFieldLength() {
			return IP_50005_TABLE_KEY_ALL_LENGTH;
		}

}
  
