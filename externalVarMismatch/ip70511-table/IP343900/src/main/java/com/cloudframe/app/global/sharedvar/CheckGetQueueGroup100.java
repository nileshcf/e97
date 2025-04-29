package com.cloudframe.app.global.sharedvar;

/**
*  The class CheckGetQueueGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_checkGetQueueGroup100")

public class CheckGetQueueGroup100 extends CheckGetQueueGroup100Serialized  implements InitializingBean {
   

						private char[] checkGetQueue100 = Field.fillLowValue(1);
	
	/**
	* Constructor for CheckGetQueueGroup100
	**/
    public CheckGetQueueGroup100() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of checkGetQueue100
	 *	@return checkGetQueue100
	 */
   public char[] getCheckGetQueue100() throws CFException{
     if (isCheckGetQueue100Modified()) { 
        checkGetQueue100 = refreshCheckGetQueue100();
     }
   		return checkGetQueue100;
   }

  
	/**
	*  set variable checkGetQueue100
	*  Corresponding COBOL Variable is 100-CHECK-GET-QUEUE
	*  @param value
	**/
   public void setCheckGetQueue100(char[] value) {
      checkGetQueue100 = checkCheckGetQueue100Constraints(value);
      serializeCheckGetQueue100(checkGetQueue100);
   } 

     /**
	 * 	Update CheckGetQueue100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCheckGetQueue100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCheckGetQueue100,checkGetQueue100.length);
   	
   }
   
   public void setCheckGetQueue100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCheckGetQueue100,checkGetQueue100.length);
   	
   }
   
     /**
	 * 	Update CheckGetQueue100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCheckGetQueue100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCheckGetQueue100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CheckGetQueue100 with another Field
	 *	@param value
	 */
   public void setCheckGetQueue100(Field source) {
       replace(source,0,source.length(),beginCheckGetQueue100,CHECK_GET_QUEUE_100_LEN);
   	
   }  
   
     /**
	 * 	Update CheckGetQueue100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCheckGetQueue100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCheckGetQueue100,CHECK_GET_QUEUE_100_LEN);
   	
   }
   
     /**
	 * 	Update CheckGetQueue100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCheckGetQueue100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCheckGetQueue100+targetIndex,targetLen);
    
   }
	char[] getCaq8810088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isGetCaq88100()
	 *	@return  Returns true if isGetCaq88100() is "A"
	 */
   public boolean isGetCaq88100() throws CFException {
      return (  compareChars( getCheckGetQueue100() , getCaq8810088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setGetCaq88100True() {  			
    	setCheckGetQueue100( getCaq8810088Value);
   	}
	char[] getFaaFac8810088Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isGetFaaFac88100()
	 *	@return  Returns true if isGetFaaFac88100() is "F"
	 */
   public boolean isGetFaaFac88100() throws CFException {
      return (  compareChars( getCheckGetQueue100() , getFaaFac8810088Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setGetFaaFac88100True() {  			
    	setCheckGetQueue100( getFaaFac8810088Value);
   	}
	char[] getMpAch8810088Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isGetMpAch88100()
	 *	@return  Returns true if isGetMpAch88100() is "M"
	 */
   public boolean isGetMpAch88100() throws CFException {
      return (  compareChars( getCheckGetQueue100() , getMpAch8810088Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setGetMpAch88100True() {  			
    	setCheckGetQueue100( getMpAch8810088Value);
   	}
	char[] getNmq8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isGetNmq88100()
	 *	@return  Returns true if isGetNmq88100() is "N"
	 */
   public boolean isGetNmq88100() throws CFException {
      return (  compareChars( getCheckGetQueue100() , getNmq8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setGetNmq88100True() {  			
    	setCheckGetQueue100( getNmq8810088Value);
   	}
	char[] getQrRefund8810088Value = "Q".toCharArray();
	/**
	 *	Test condition "Q" for isGetQrRefund88100()
	 *	@return  Returns true if isGetQrRefund88100() is "Q"
	 */
   public boolean isGetQrRefund88100() throws CFException {
      return (  compareChars( getCheckGetQueue100() , getQrRefund8810088Value)  == 0  );
   }


	/**
	*  set values "Q"
	*/
   	public void setGetQrRefund88100True() {  			
    	setCheckGetQueue100( getQrRefund8810088Value);
   	}
	char[] getCemQ8810088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isGetCemQ88100()
	 *	@return  Returns true if isGetCemQ88100() is "R"
	 */
   public boolean isGetCemQ88100() throws CFException {
      return (  compareChars( getCheckGetQueue100() , getCemQ8810088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setGetCemQ88100True() {  			
    	setCheckGetQueue100( getCemQ8810088Value);
   	}
	char[] getInstq8810088Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isGetInstq88100()
	 *	@return  Returns true if isGetInstq88100() is "T"
	 */
   public boolean isGetInstq88100() throws CFException {
      return (  compareChars( getCheckGetQueue100() , getInstq8810088Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setGetInstq88100True() {  			
    	setCheckGetQueue100( getInstq8810088Value);
   	}
	char[] getPma8810088Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isGetPma88100()
	 *	@return  Returns true if isGetPma88100() is "1"
	 */
   public boolean isGetPma88100() throws CFException {
      return (  compareChars( getCheckGetQueue100() , getPma8810088Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setGetPma88100True() {  			
    	setCheckGetQueue100( getPma8810088Value);
   	}
	char[] getPmt8810088Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isGetPmt88100()
	 *	@return  Returns true if isGetPmt88100() is "2"
	 */
   public boolean isGetPmt88100() throws CFException {
      return (  compareChars( getCheckGetQueue100() , getPmt8810088Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setGetPmt88100True() {  			
    	setCheckGetQueue100( getPmt8810088Value);
   	}
	char[] getPim8810088Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isGetPim88100()
	 *	@return  Returns true if isGetPim88100() is "3"
	 */
   public boolean isGetPim88100() throws CFException {
      return (  compareChars( getCheckGetQueue100() , getPim8810088Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setGetPim88100True() {  			
    	setCheckGetQueue100( getPim8810088Value);
   	}
	char[] getPmi8810088Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isGetPmi88100()
	 *	@return  Returns true if isGetPmi88100() is "1"
	 */
   public boolean isGetPmi88100() throws CFException {
      return (  compareChars( getCheckGetQueue100() , getPmi8810088Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setGetPmi88100True() {  			
    	setCheckGetQueue100( getPmi8810088Value);
   	}
	char[] getAlmq8810088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isGetAlmq88100()
	 *	@return  Returns true if isGetAlmq88100() is "C"
	 */
   public boolean isGetAlmq88100() throws CFException {
      return (  compareChars( getCheckGetQueue100() , getAlmq8810088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setGetAlmq88100True() {  			
    	setCheckGetQueue100( getAlmq8810088Value);
   	}

	
	
	

		public static int getCheckGetQueueGroup100FieldLength() {
			return CHECK_GET_QUEUE_GROUP_100_LENGTH;
		}

}
  
