package com.cloudframe.app.global.sharedvar;

/**
*  The class GetBrowseCallsGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class GetBrowseCallsGroup100 extends GetBrowseCallsGroup100Serialized { 
   

						private char[] getBrowseCalls100 = Field.fillLowValue(1);
	
	/**
	* Constructor for GetBrowseCallsGroup100
	**/
    public GetBrowseCallsGroup100() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of getBrowseCalls100
	 *	@return getBrowseCalls100
	 */
   public char[] getGetBrowseCalls100() throws CFException{
     if (isGetBrowseCalls100Modified()) { 
        getBrowseCalls100 = refreshGetBrowseCalls100();
     }
   		return getBrowseCalls100;
   }

  
	/**
	*  set variable getBrowseCalls100
	*  Corresponding COBOL Variable is 100-GET-BROWSE-CALLS
	*  @param value
	**/
   public void setGetBrowseCalls100(char[] value) {
      getBrowseCalls100 = checkGetBrowseCalls100Constraints(value);
      serializeGetBrowseCalls100(getBrowseCalls100);
   } 

     /**
	 * 	Update GetBrowseCalls100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGetBrowseCalls100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGetBrowseCalls100,getBrowseCalls100.length);
   	
   }
   
   public void setGetBrowseCalls100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGetBrowseCalls100,getBrowseCalls100.length);
   	
   }
   
     /**
	 * 	Update GetBrowseCalls100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGetBrowseCalls100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGetBrowseCalls100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GetBrowseCalls100 with another Field
	 *	@param value
	 */
   public void setGetBrowseCalls100(Field source) {
       replace(source,0,source.length(),beginGetBrowseCalls100,GET_BROWSE_CALLS_100_LEN);
   	
   }  
   
     /**
	 * 	Update GetBrowseCalls100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGetBrowseCalls100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGetBrowseCalls100,GET_BROWSE_CALLS_100_LEN);
   	
   }
   
     /**
	 * 	Update GetBrowseCalls100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGetBrowseCalls100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGetBrowseCalls100+targetIndex,targetLen);
    
   }
	char[] startBrowse8810088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isStartBrowse88100()
	 *	@return  Returns true if isStartBrowse88100() is "S"
	 */
   public boolean isStartBrowse88100() throws CFException {
      return (  compareChars( getGetBrowseCalls100() , startBrowse8810088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setStartBrowse88100True() {  			
    	setGetBrowseCalls100( startBrowse8810088Value);
   	}
	char[] currentDelete8810088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isCurrentDelete88100()
	 *	@return  Returns true if isCurrentDelete88100() is "C"
	 */
   public boolean isCurrentDelete88100() throws CFException {
      return (  compareChars( getGetBrowseCalls100() , currentDelete8810088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setCurrentDelete88100True() {  			
    	setGetBrowseCalls100( currentDelete8810088Value);
   	}
	char[] nextBrowse8810088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isNextBrowse88100()
	 *	@return  Returns true if isNextBrowse88100() is "B"
	 */
   public boolean isNextBrowse88100() throws CFException {
      return (  compareChars( getGetBrowseCalls100() , nextBrowse8810088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setNextBrowse88100True() {  			
    	setGetBrowseCalls100( nextBrowse8810088Value);
   	}

	
	
	

		public static int getGetBrowseCallsGroup100FieldLength() {
			return GET_BROWSE_CALLS_GROUP_100_LENGTH;
		}

}
  
