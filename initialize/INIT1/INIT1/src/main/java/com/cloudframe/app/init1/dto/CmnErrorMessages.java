package com.cloudframe.app.init1.dto;

/**
*  The class CmnErrorMessages is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class CmnErrorMessages extends CmnErrorMessagesSerialized {
   

						private char[] cmnErrMsg1 = new char[80];
				private CmnErrMsg2 cmnErrMsg2 = new CmnErrMsg2();
				private CmnErrMsg3 cmnErrMsg3 = new CmnErrMsg3();
				private CmnPrtErrHdr cmnPrtErrHdr = new CmnPrtErrHdr();
			private List<CmnPrtErrMsg> cmnPrtErrMsg = new ArrayList<>();
    	
	
	/**
	* Constructor for CmnErrorMessages
	**/
    public CmnErrorMessages() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			cmnErrMsg2.setParent(this,getStartOffset() + 80);
	       			cmnErrMsg3.setParent(this,getStartOffset() + 160);
	       			cmnPrtErrHdr.setParent(this,getStartOffset() + 240);
				for (int arrayIndex = 0; arrayIndex < CMN_PRT_ERR_MSG_SIZE;arrayIndex++) {
						cmnPrtErrMsg.add(new CmnPrtErrMsg(this, beginCmnPrtErrMsg + 
						arrayIndex * CmnPrtErrMsg.getCmnPrtErrMsgFieldLength()));
				}
	   	/*  end of offset */
								setCmnErrMsg1("********************************************************************************".toCharArray());
			for (int arrayIndex = 0; arrayIndex < CMN_PRT_ERR_MSG_SIZE;arrayIndex++) {
					cmnPrtErrMsg.add(new CmnPrtErrMsg(this, beginCmnPrtErrMsg + 
						arrayIndex * CmnPrtErrMsg.getCmnPrtErrMsgFieldLength()));
			}
    }


 

	/**
	 *	Returns the value of cmnErrMsg1
	 *	@return cmnErrMsg1
	 */
   public char[] getCmnErrMsg1() throws CFException{
     if (isCmnErrMsg1Modified()) { 
        cmnErrMsg1 = refreshCmnErrMsg1();
     }
   		return cmnErrMsg1;
   }

  
	/**
	*  set variable cmnErrMsg1
	*  Corresponding COBOL Variable is CMN-ERR-MSG-1
	*  @param value
	**/
   public void setCmnErrMsg1(char[] value) {
      cmnErrMsg1 = checkCmnErrMsg1Constraints(value);
      serializeCmnErrMsg1(cmnErrMsg1);
   } 

     /**
	 * 	Update CmnErrMsg1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnErrMsg1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnErrMsg1,cmnErrMsg1.length);
   	
   }
   
   public void setCmnErrMsg1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrMsg1,cmnErrMsg1.length);
   	
   }
   
     /**
	 * 	Update CmnErrMsg1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsg1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrMsg1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnErrMsg1 with another Field
	 *	@param value
	 */
   public void setCmnErrMsg1(Field source) {
       replace(source,0,source.length(),beginCmnErrMsg1,CMN_ERR_MSG_1_LEN);
   	
   }  
   
     /**
	 * 	Update CmnErrMsg1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnErrMsg1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnErrMsg1,CMN_ERR_MSG_1_LEN);
   	
   }
   
     /**
	 * 	Update CmnErrMsg1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsg1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrMsg1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnErrMsg2
	 *	@return cmnErrMsg2
	 */   
	 public CmnErrMsg2 getCmnErrMsg2() {
   	return cmnErrMsg2;
   }
   /**
	* 	Update CmnErrMsg2 with the passed value
	*   Corresponding COBOL Variable is CMN-ERR-MSG-2
	*	@param value
	*/
   public void setCmnErrMsg2(char[] value) {
      cmnErrMsg2.setString(value); 
   }   
    
     /**
	 * 	Update CmnErrMsg2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnErrMsg2(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsg2.begin,cmnErrMsg2.length());
   }
   
     /**
	 * 	Update CmnErrMsg2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsg2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsg2.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnErrMsg2 with another Field
	 *	@param value
	 */
   public void setCmnErrMsg2(Field source) {
   	replace(source,0,source.length(),cmnErrMsg2.begin,cmnErrMsg2.length());
   }  
   
     /**
	 * 	Update CmnErrMsg2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnErrMsg2(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsg2.begin,cmnErrMsg2.length());
   }
   
     /**
	 * 	Update CmnErrMsg2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsg2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsg2.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnErrMsg3
	 *	@return cmnErrMsg3
	 */   
	 public CmnErrMsg3 getCmnErrMsg3() {
   	return cmnErrMsg3;
   }
   /**
	* 	Update CmnErrMsg3 with the passed value
	*   Corresponding COBOL Variable is CMN-ERR-MSG-3
	*	@param value
	*/
   public void setCmnErrMsg3(char[] value) {
      cmnErrMsg3.setString(value); 
   }   
    
     /**
	 * 	Update CmnErrMsg3 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnErrMsg3(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsg3.begin,cmnErrMsg3.length());
   }
   
     /**
	 * 	Update CmnErrMsg3 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsg3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsg3.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnErrMsg3 with another Field
	 *	@param value
	 */
   public void setCmnErrMsg3(Field source) {
   	replace(source,0,source.length(),cmnErrMsg3.begin,cmnErrMsg3.length());
   }  
   
     /**
	 * 	Update CmnErrMsg3 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnErrMsg3(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsg3.begin,cmnErrMsg3.length());
   }
   
     /**
	 * 	Update CmnErrMsg3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsg3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnErrMsg3.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnPrtErrHdr
	 *	@return cmnPrtErrHdr
	 */   
	 public CmnPrtErrHdr getCmnPrtErrHdr() {
   	return cmnPrtErrHdr;
   }
   /**
	* 	Update CmnPrtErrHdr with the passed value
	*   Corresponding COBOL Variable is CMN-PRT-ERR-HDR
	*	@param value
	*/
   public void setCmnPrtErrHdr(char[] value) {
      cmnPrtErrHdr.setString(value); 
   }   
    
     /**
	 * 	Update CmnPrtErrHdr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnPrtErrHdr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPrtErrHdr.begin,cmnPrtErrHdr.length());
   }
   
     /**
	 * 	Update CmnPrtErrHdr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnPrtErrHdr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPrtErrHdr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnPrtErrHdr with another Field
	 *	@param value
	 */
   public void setCmnPrtErrHdr(Field source) {
   	replace(source,0,source.length(),cmnPrtErrHdr.begin,cmnPrtErrHdr.length());
   }  
   
     /**
	 * 	Update CmnPrtErrHdr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnPrtErrHdr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPrtErrHdr.begin,cmnPrtErrHdr.length());
   }
   
     /**
	 * 	Update CmnPrtErrHdr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnPrtErrHdr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPrtErrHdr.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the  value of cmnPrtErrMsg
	 *  Corresponding COBOL Variable is CMN-PRT-ERR-MSG
	 *	@return cmnPrtErrMsg
	 */
   public List<CmnPrtErrMsg> getCmnPrtErrMsg() {
       return cmnPrtErrMsg;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return cmnPrtErrMsg
	 */
	public CmnPrtErrMsg getCmnPrtErrMsg(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getCmnPrtErrMsg(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= CMN_PRT_ERR_MSG_SIZE) {
             	index = CMN_PRT_ERR_MSG_SIZE -1; // can't exceed max array size
             	logger.trace("cmnPrtErrMsg - Array index exceeded max Size {}, resetting it to max allowed",CMN_PRT_ERR_MSG_SIZE); 
	    }
		if (index >= cmnPrtErrMsg.size()) {
       		for (int fillIndex =  cmnPrtErrMsg.size() -1; fillIndex < index;fillIndex++) {
		       cmnPrtErrMsg.add(null);
		    }
			cmnPrtErrMsg.set(index,
			   	   	new CmnPrtErrMsg(this,beginCmnPrtErrMsg + index * CmnPrtErrMsg.getCmnPrtErrMsgFieldLength()) 
				                        ); 	
		} 
   	   CmnPrtErrMsg value = cmnPrtErrMsg.get(index);
   	   if (value == null) {
   	      cmnPrtErrMsg.set(index,
			   	   	new CmnPrtErrMsg(this,beginCmnPrtErrMsg + index * CmnPrtErrMsg.getCmnPrtErrMsgFieldLength()) 
				                        ); 
		  value = cmnPrtErrMsg.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update CmnPrtErrMsg at index with the passed value
	 *  Corresponding COBOL Variable is CMN-PRT-ERR-MSG
	 *  @param index
	 *	@param value
	 */
  public void setCmnPrtErrMsg(int index,char[] value) {
   	getCmnPrtErrMsg(index).setString(value);
   }
   
	

	
	
	

		public static int getCmnErrorMessagesFieldLength() {
			return CMN_ERROR_MESSAGES_LENGTH;
		}

}
  
