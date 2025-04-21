package com.cloudframe.app.sf305120.dto;

/**
*  The class SrvreqHeader802 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SrvreqHeader802 extends SrvreqHeader802Serialized { 
   

						private char[] srHeaderId802 = new char[2];

						private char[] srHeaderVer802 = new char[3];

						private char[] srRequestCount802 = new char[1];
	
	/**
	* Constructor for SrvreqHeader802
	**/
    public SrvreqHeader802() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SrvreqHeader802. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SrvreqHeader802(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSrHeaderId802(("SR").toCharArray());
								setSrHeaderVer802(fillSpace(3));
								setSrRequestCount802(fillLowValue(1));
    } 

	/**
	 *	Returns the value of srHeaderId802
	 *	@return srHeaderId802
	 */
   public char[] getSrHeaderId802() throws CFException{
     if (isSrHeaderId802Modified()) { 
        srHeaderId802 = refreshSrHeaderId802();
     }
   		return srHeaderId802;
   }

  
	/**
	*  set variable srHeaderId802
	*  Corresponding COBOL Variable is 802-SR-HEADER-ID
	*  @param value
	**/
   public void setSrHeaderId802(char[] value) {
      srHeaderId802 = checkSrHeaderId802Constraints(value);
      serializeSrHeaderId802(srHeaderId802);
   } 

     /**
	 * 	Update SrHeaderId802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrHeaderId802(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSrHeaderId802,srHeaderId802.length);
   	
   }
   
   public void setSrHeaderId802(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSrHeaderId802,srHeaderId802.length);
   	
   }
   
     /**
	 * 	Update SrHeaderId802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrHeaderId802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrHeaderId802+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SrHeaderId802 with another Field
	 *	@param value
	 */
   public void setSrHeaderId802(Field source) {
       replace(source,0,source.length(),beginSrHeaderId802,SR_HEADER_ID_802_LEN);
   	
   }  
   
     /**
	 * 	Update SrHeaderId802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrHeaderId802(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSrHeaderId802,SR_HEADER_ID_802_LEN);
   	
   }
   
     /**
	 * 	Update SrHeaderId802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrHeaderId802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrHeaderId802+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of srHeaderVer802
	 *	@return srHeaderVer802
	 */
   public char[] getSrHeaderVer802() throws CFException{
     if (isSrHeaderVer802Modified()) { 
        srHeaderVer802 = refreshSrHeaderVer802();
     }
   		return srHeaderVer802;
   }

  
	/**
	*  set variable srHeaderVer802
	*  Corresponding COBOL Variable is 802-SR-HEADER-VER
	*  @param value
	**/
   public void setSrHeaderVer802(char[] value) {
      srHeaderVer802 = checkSrHeaderVer802Constraints(value);
      serializeSrHeaderVer802(srHeaderVer802);
   } 

     /**
	 * 	Update SrHeaderVer802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrHeaderVer802(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSrHeaderVer802,srHeaderVer802.length);
   	
   }
   
   public void setSrHeaderVer802(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSrHeaderVer802,srHeaderVer802.length);
   	
   }
   
     /**
	 * 	Update SrHeaderVer802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrHeaderVer802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrHeaderVer802+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SrHeaderVer802 with another Field
	 *	@param value
	 */
   public void setSrHeaderVer802(Field source) {
       replace(source,0,source.length(),beginSrHeaderVer802,SR_HEADER_VER_802_LEN);
   	
   }  
   
     /**
	 * 	Update SrHeaderVer802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrHeaderVer802(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSrHeaderVer802,SR_HEADER_VER_802_LEN);
   	
   }
   
     /**
	 * 	Update SrHeaderVer802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrHeaderVer802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrHeaderVer802+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of srRequestCount802
	 *	@return srRequestCount802
	 */
   public char[] getSrRequestCount802() throws CFException{
     if (isSrRequestCount802Modified()) { 
        srRequestCount802 = refreshSrRequestCount802();
     }
   		return srRequestCount802;
   }

  
	/**
	*  set variable srRequestCount802
	*  Corresponding COBOL Variable is 802-SR-REQUEST-COUNT
	*  @param value
	**/
   public void setSrRequestCount802(char[] value) {
      srRequestCount802 = checkSrRequestCount802Constraints(value);
      serializeSrRequestCount802(srRequestCount802);
   } 

     /**
	 * 	Update SrRequestCount802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrRequestCount802(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSrRequestCount802,srRequestCount802.length);
   	
   }
   
   public void setSrRequestCount802(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSrRequestCount802,srRequestCount802.length);
   	
   }
   
     /**
	 * 	Update SrRequestCount802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrRequestCount802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrRequestCount802+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SrRequestCount802 with another Field
	 *	@param value
	 */
   public void setSrRequestCount802(Field source) {
       replace(source,0,source.length(),beginSrRequestCount802,SR_REQUEST_COUNT_802_LEN);
   	
   }  
   
     /**
	 * 	Update SrRequestCount802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrRequestCount802(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSrRequestCount802,SR_REQUEST_COUNT_802_LEN);
   	
   }
   
     /**
	 * 	Update SrRequestCount802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrRequestCount802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrRequestCount802+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSrvreqHeader802FieldLength() {
			return SRVREQ_HEADER_802_LENGTH;
		}

}
  
