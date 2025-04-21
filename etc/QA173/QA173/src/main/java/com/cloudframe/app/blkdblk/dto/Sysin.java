package com.cloudframe.app.blkdblk.dto;

/**
*  The class Sysin is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.blkdblk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sysin extends SysinSerialized {
   

						private char[] directionFlag = Field.fillLowValue(5);
	
	/**
	* Constructor for Sysin
	**/
    public Sysin() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of directionFlag
	 *	@return directionFlag
	 */
   public char[] getDirectionFlag() throws CFException{
     if (isDirectionFlagModified()) { 
        directionFlag = refreshDirectionFlag();
     }
   		return directionFlag;
   }

  
	/**
	*  set variable directionFlag
	*  Corresponding COBOL Variable is WS-DIRECTION-FLAG
	*  @param value
	**/
   public void setDirectionFlag(char[] value) {
      directionFlag = checkDirectionFlagConstraints(value);
      serializeDirectionFlag(directionFlag);
   } 

     /**
	 * 	Update DirectionFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDirectionFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDirectionFlag,directionFlag.length);
   	
   }
   
   public void setDirectionFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDirectionFlag,directionFlag.length);
   	
   }
   
     /**
	 * 	Update DirectionFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDirectionFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDirectionFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DirectionFlag with another Field
	 *	@param value
	 */
   public void setDirectionFlag(Field source) {
       replace(source,0,source.length(),beginDirectionFlag,DIRECTION_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update DirectionFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDirectionFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDirectionFlag,DIRECTION_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update DirectionFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDirectionFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDirectionFlag+targetIndex,targetLen);
    
   }
	char[] a2E88Value = "A-2-E".toCharArray();
	/**
	 *	Test condition "A-2-E" for isA2E()
	 *	@return  Returns true if isA2E() is "A-2-E"
	 */
   public boolean isA2E() throws CFException {
      return (  compareChars( getDirectionFlag() , a2E88Value)  == 0  );
   }


	/**
	*  set values "A-2-E"
	*/
   	public void setA2ETrue() {  			
    	setDirectionFlag( a2E88Value);
   	}
	char[] e2A88Value = "E-2-A".toCharArray();
	/**
	 *	Test condition "E-2-A" for isE2A()
	 *	@return  Returns true if isE2A() is "E-2-A"
	 */
   public boolean isE2A() throws CFException {
      return (  compareChars( getDirectionFlag() , e2A88Value)  == 0  );
   }


	/**
	*  set values "E-2-A"
	*/
   	public void setE2ATrue() {  			
    	setDirectionFlag( e2A88Value);
   	}

	
	
	

		public static int getSysinFieldLength() {
			return SYSIN_LENGTH;
		}

}
  
