package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50005oTableKeyAll is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip50005oTableKeyAll extends Ip50005oTableKeyAllSerialized { 
   
				private Ip50005oTableKey ip50005oTableKey = new Ip50005oTableKey();

								private long ip50005oSeq;
	
	/**
	* Constructor for Ip50005oTableKeyAll
	**/
    public Ip50005oTableKeyAll() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50005oTableKeyAll. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50005oTableKeyAll(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip50005oTableKey.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip50005oTableKey
	 *	@return ip50005oTableKey
	 */   
	 public Ip50005oTableKey getIp50005oTableKey() {
   	return ip50005oTableKey;
   }
   /**
	* 	Update Ip50005oTableKey with the passed value
	*   Corresponding COBOL Variable is IP50005O-TABLE-KEY
	*	@param value
	*/
   public void setIp50005oTableKey(char[] value) {
      ip50005oTableKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip50005oTableKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50005oTableKey.begin,ip50005oTableKey.length());
   }
   
     /**
	 * 	Update Ip50005oTableKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50005oTableKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50005oTableKey with another Field
	 *	@param value
	 */
   public void setIp50005oTableKey(Field source) {
   	replace(source,0,source.length(),ip50005oTableKey.begin,ip50005oTableKey.length());
   }  
   
     /**
	 * 	Update Ip50005oTableKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50005oTableKey.begin,ip50005oTableKey.length());
   }
   
     /**
	 * 	Update Ip50005oTableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50005oTableKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip50005oSeq
	 *	@return ip50005oSeq
	 */
	public long getIp50005oSeq() throws CFException {
        if (isIp50005oSeqModified()) { 
           ip50005oSeq = refreshIp50005oSeq();
        }
   		return ip50005oSeq;
	}
	
	/**
	 * 	Update Ip50005oSeq with the passed value
	 *  Corresponding COBOL Variable is IP50005O-SEQ
	 *	@param number
	 */
	public void setIp50005oSeq(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip50005oSeq = checkIp50005oSeqMaxLimit(number); 
		serializeIp50005oSeq(ip50005oSeq);
	}



	
	
	
	/**
	 * 	initializes Ip50005oTableKeyAll
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip50005oTableKey.initialize();
     
                     setIp50005oSeq(0);
   }

		public static int getIp50005oTableKeyAllFieldLength() {
			return IP_50005O_TABLE_KEY_ALL_LENGTH;
		}

}
  
