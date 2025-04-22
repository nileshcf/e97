package com.cloudframe.app.global.sharedvar;

/**
*  The class ArePhysicalFilesOverGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_arePhysicalFilesOverGroup100")

public class ArePhysicalFilesOverGroup100 extends ArePhysicalFilesOverGroup100Serialized  implements InitializingBean {
   

						private char[] arePhysicalFilesOver100 = Field.fillLowValue(1);
	
	/**
	* Constructor for ArePhysicalFilesOverGroup100
	**/
    public ArePhysicalFilesOverGroup100() {
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
	 *	Returns the value of arePhysicalFilesOver100
	 *	@return arePhysicalFilesOver100
	 */
   public char[] getArePhysicalFilesOver100() throws CFException{
     if (isArePhysicalFilesOver100Modified()) { 
        arePhysicalFilesOver100 = refreshArePhysicalFilesOver100();
     }
   		return arePhysicalFilesOver100;
   }

  
	/**
	*  set variable arePhysicalFilesOver100
	*  Corresponding COBOL Variable is 100-ARE-PHYSICAL-FILES-OVER
	*  @param value
	**/
   public void setArePhysicalFilesOver100(char[] value) {
      arePhysicalFilesOver100 = checkArePhysicalFilesOver100Constraints(value);
      serializeArePhysicalFilesOver100(arePhysicalFilesOver100);
   } 

     /**
	 * 	Update ArePhysicalFilesOver100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setArePhysicalFilesOver100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginArePhysicalFilesOver100,arePhysicalFilesOver100.length);
   	
   }
   
   public void setArePhysicalFilesOver100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginArePhysicalFilesOver100,arePhysicalFilesOver100.length);
   	
   }
   
     /**
	 * 	Update ArePhysicalFilesOver100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setArePhysicalFilesOver100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginArePhysicalFilesOver100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ArePhysicalFilesOver100 with another Field
	 *	@param value
	 */
   public void setArePhysicalFilesOver100(Field source) {
       replace(source,0,source.length(),beginArePhysicalFilesOver100,ARE_PHYSICAL_FILES_OVER_100_LEN);
   	
   }  
   
     /**
	 * 	Update ArePhysicalFilesOver100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setArePhysicalFilesOver100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginArePhysicalFilesOver100,ARE_PHYSICAL_FILES_OVER_100_LEN);
   	
   }
   
     /**
	 * 	Update ArePhysicalFilesOver100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setArePhysicalFilesOver100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginArePhysicalFilesOver100+targetIndex,targetLen);
    
   }
	char[] physicalFilesOver8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isPhysicalFilesOver88100()
	 *	@return  Returns true if isPhysicalFilesOver88100() is "Y"
	 */
   public boolean isPhysicalFilesOver88100() throws CFException {
      return (  compareChars( getArePhysicalFilesOver100() , physicalFilesOver8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setPhysicalFilesOver88100True() {  			
    	setArePhysicalFilesOver100( physicalFilesOver8810088Value);
   	}
	char[] physicalFilesNotOver8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isPhysicalFilesNotOver88100()
	 *	@return  Returns true if isPhysicalFilesNotOver88100() is "N"
	 */
   public boolean isPhysicalFilesNotOver88100() throws CFException {
      return (  compareChars( getArePhysicalFilesOver100() , physicalFilesNotOver8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setPhysicalFilesNotOver88100True() {  			
    	setArePhysicalFilesOver100( physicalFilesNotOver8810088Value);
   	}

	
	
	

		public static int getArePhysicalFilesOverGroup100FieldLength() {
			return ARE_PHYSICAL_FILES_OVER_GROUP_100_LENGTH;
		}

}
  
