package com.cloudframe.app.move0.dto;

/**
*  The class Status is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Status extends StatusSerialized {
   


						private char[] gnpHHeaderTimeSs1 = Field.fillLowValue(2);


						private char[] gnpHHeaderTimeSs2 = Field.fillLowValue(2);


						private char[] gnpHHeaderTimeSs3 = Field.fillLowValue(2);

	
	/**
	* Constructor for Status
	**/
    public Status() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (">>").toCharArray()
             , getStartOffset() + 0
             ,2
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 4
             ,1
             );
       replaceValue( // serialize and save the value
             ("|").toCharArray()
             , getStartOffset() + 7
             ,1
             );
       replaceValue( // serialize and save the value
             ("<<").toCharArray()
             , getStartOffset() + 10
             ,2
             );
    }


 

	/**
	 *	Returns the value of gnpHHeaderTimeSs1
	 *	@return gnpHHeaderTimeSs1
	 */
   public char[] getGnpHHeaderTimeSs1() throws CFException{
     if (isGnpHHeaderTimeSs1Modified()) { 
        gnpHHeaderTimeSs1 = refreshGnpHHeaderTimeSs1();
     }
   		return gnpHHeaderTimeSs1;
   }

  
	/**
	*  set variable gnpHHeaderTimeSs1
	*  Corresponding COBOL Variable is GNP-H-HEADER-TIME-SS1
	*  @param value
	**/
   public void setGnpHHeaderTimeSs1(char[] value) {
      gnpHHeaderTimeSs1 = checkGnpHHeaderTimeSs1Constraints(value);
      serializeGnpHHeaderTimeSs1(gnpHHeaderTimeSs1);
   } 

     /**
	 * 	Update GnpHHeaderTimeSs1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGnpHHeaderTimeSs1,gnpHHeaderTimeSs1.length);
   	
   }
   
   public void setGnpHHeaderTimeSs1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGnpHHeaderTimeSs1,gnpHHeaderTimeSs1.length);
   	
   }
   
     /**
	 * 	Update GnpHHeaderTimeSs1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGnpHHeaderTimeSs1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GnpHHeaderTimeSs1 with another Field
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs1(Field source) {
       replace(source,0,source.length(),beginGnpHHeaderTimeSs1,GNP_HHEADER_TIME_SS_1_LEN);
   	
   }  
   
     /**
	 * 	Update GnpHHeaderTimeSs1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGnpHHeaderTimeSs1,GNP_HHEADER_TIME_SS_1_LEN);
   	
   }
   
     /**
	 * 	Update GnpHHeaderTimeSs1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGnpHHeaderTimeSs1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gnpHHeaderTimeSs2
	 *	@return gnpHHeaderTimeSs2
	 */
   public char[] getGnpHHeaderTimeSs2() throws CFException{
     if (isGnpHHeaderTimeSs2Modified()) { 
        gnpHHeaderTimeSs2 = refreshGnpHHeaderTimeSs2();
     }
   		return gnpHHeaderTimeSs2;
   }

  
	/**
	*  set variable gnpHHeaderTimeSs2
	*  Corresponding COBOL Variable is GNP-H-HEADER-TIME-SS2
	*  @param value
	**/
   public void setGnpHHeaderTimeSs2(char[] value) {
      gnpHHeaderTimeSs2 = checkGnpHHeaderTimeSs2Constraints(value);
      serializeGnpHHeaderTimeSs2(gnpHHeaderTimeSs2);
   } 

     /**
	 * 	Update GnpHHeaderTimeSs2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGnpHHeaderTimeSs2,gnpHHeaderTimeSs2.length);
   	
   }
   
   public void setGnpHHeaderTimeSs2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGnpHHeaderTimeSs2,gnpHHeaderTimeSs2.length);
   	
   }
   
     /**
	 * 	Update GnpHHeaderTimeSs2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGnpHHeaderTimeSs2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GnpHHeaderTimeSs2 with another Field
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs2(Field source) {
       replace(source,0,source.length(),beginGnpHHeaderTimeSs2,GNP_HHEADER_TIME_SS_2_LEN);
   	
   }  
   
     /**
	 * 	Update GnpHHeaderTimeSs2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGnpHHeaderTimeSs2,GNP_HHEADER_TIME_SS_2_LEN);
   	
   }
   
     /**
	 * 	Update GnpHHeaderTimeSs2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGnpHHeaderTimeSs2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gnpHHeaderTimeSs3
	 *	@return gnpHHeaderTimeSs3
	 */
   public char[] getGnpHHeaderTimeSs3() throws CFException{
     if (isGnpHHeaderTimeSs3Modified()) { 
        gnpHHeaderTimeSs3 = refreshGnpHHeaderTimeSs3();
     }
   		return gnpHHeaderTimeSs3;
   }

  
	/**
	*  set variable gnpHHeaderTimeSs3
	*  Corresponding COBOL Variable is GNP-H-HEADER-TIME-SS3
	*  @param value
	**/
   public void setGnpHHeaderTimeSs3(char[] value) {
      gnpHHeaderTimeSs3 = checkGnpHHeaderTimeSs3Constraints(value);
      serializeGnpHHeaderTimeSs3(gnpHHeaderTimeSs3);
   } 

     /**
	 * 	Update GnpHHeaderTimeSs3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGnpHHeaderTimeSs3,gnpHHeaderTimeSs3.length);
   	
   }
   
   public void setGnpHHeaderTimeSs3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGnpHHeaderTimeSs3,gnpHHeaderTimeSs3.length);
   	
   }
   
     /**
	 * 	Update GnpHHeaderTimeSs3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGnpHHeaderTimeSs3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GnpHHeaderTimeSs3 with another Field
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs3(Field source) {
       replace(source,0,source.length(),beginGnpHHeaderTimeSs3,GNP_HHEADER_TIME_SS_3_LEN);
   	
   }  
   
     /**
	 * 	Update GnpHHeaderTimeSs3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGnpHHeaderTimeSs3,GNP_HHEADER_TIME_SS_3_LEN);
   	
   }
   
     /**
	 * 	Update GnpHHeaderTimeSs3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGnpHHeaderTimeSs3+targetIndex,targetLen);
    
   }

	
	
	

		public static int getStatusFieldLength() {
			return STATUS_LENGTH;
		}

}
  
