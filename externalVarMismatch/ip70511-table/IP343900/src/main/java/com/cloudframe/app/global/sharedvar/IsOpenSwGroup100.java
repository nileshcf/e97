package com.cloudframe.app.global.sharedvar;

/**
*  The class IsOpenSwGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class IsOpenSwGroup100 extends IsOpenSwGroup100Serialized { 
   

						private char[] isOpenSw100 = Field.fillLowValue(1);
	
	/**
	* Constructor for IsOpenSwGroup100
	**/
    public IsOpenSwGroup100() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of isOpenSw100
	 *	@return isOpenSw100
	 */
   public char[] getIsOpenSw100() throws CFException{
     if (isIsOpenSw100Modified()) { 
        isOpenSw100 = refreshIsOpenSw100();
     }
   		return isOpenSw100;
   }

  
	/**
	*  set variable isOpenSw100
	*  Corresponding COBOL Variable is 100-IS-OPEN-SW
	*  @param value
	**/
   public void setIsOpenSw100(char[] value) {
      isOpenSw100 = checkIsOpenSw100Constraints(value);
      serializeIsOpenSw100(isOpenSw100);
   } 

     /**
	 * 	Update IsOpenSw100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsOpenSw100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIsOpenSw100,isOpenSw100.length);
   	
   }
   
   public void setIsOpenSw100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIsOpenSw100,isOpenSw100.length);
   	
   }
   
     /**
	 * 	Update IsOpenSw100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsOpenSw100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsOpenSw100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IsOpenSw100 with another Field
	 *	@param value
	 */
   public void setIsOpenSw100(Field source) {
       replace(source,0,source.length(),beginIsOpenSw100,IS_OPEN_SW_100_LEN);
   	
   }  
   
     /**
	 * 	Update IsOpenSw100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsOpenSw100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIsOpenSw100,IS_OPEN_SW_100_LEN);
   	
   }
   
     /**
	 * 	Update IsOpenSw100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsOpenSw100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsOpenSw100+targetIndex,targetLen);
    
   }
	char[] openFirstTimeR8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isOpenFirstTimeR88100()
	 *	@return  Returns true if isOpenFirstTimeR88100() is "Y"
	 */
   public boolean isOpenFirstTimeR88100() throws CFException {
      return (  compareChars( getIsOpenSw100() , openFirstTimeR8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setOpenFirstTimeR88100True() {  			
    	setIsOpenSw100( openFirstTimeR8810088Value);
   	}
	char[] notOpenFirstTimeR8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotOpenFirstTimeR88100()
	 *	@return  Returns true if isNotOpenFirstTimeR88100() is "N"
	 */
   public boolean isNotOpenFirstTimeR88100() throws CFException {
      return (  compareChars( getIsOpenSw100() , notOpenFirstTimeR8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotOpenFirstTimeR88100True() {  			
    	setIsOpenSw100( notOpenFirstTimeR8810088Value);
   	}

	
	
	

		public static int getIsOpenSwGroup100FieldLength() {
			return IS_OPEN_SW_GROUP_100_LENGTH;
		}

}
  
