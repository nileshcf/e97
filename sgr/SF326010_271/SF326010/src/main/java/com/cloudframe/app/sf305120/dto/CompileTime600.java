package com.cloudframe.app.sf305120.dto;

/**
*  The class CompileTime600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CompileTime600 extends CompileTime600Serialized { 
   

						private char[] compTimeHh600 = new char[2];


						private char[] compTimeMm600 = new char[2];


						private char[] compTimeSs600 = new char[2];
	
	/**
	* Constructor for CompileTime600
	**/
    public CompileTime600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CompileTime600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CompileTime600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCompTimeHh600(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setCompTimeMm600(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setCompTimeSs600(fillSpace(2));
    } 

	/**
	 *	Returns the value of compTimeHh600
	 *	@return compTimeHh600
	 */
   public char[] getCompTimeHh600() throws CFException{
     if (isCompTimeHh600Modified()) { 
        compTimeHh600 = refreshCompTimeHh600();
     }
   		return compTimeHh600;
   }

  
	/**
	*  set variable compTimeHh600
	*  Corresponding COBOL Variable is 600-COMP-TIME-HH
	*  @param value
	**/
   public void setCompTimeHh600(char[] value) {
      compTimeHh600 = checkCompTimeHh600Constraints(value);
      serializeCompTimeHh600(compTimeHh600);
   } 

     /**
	 * 	Update CompTimeHh600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeHh600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompTimeHh600,compTimeHh600.length);
   	
   }
   
   public void setCompTimeHh600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompTimeHh600,compTimeHh600.length);
   	
   }
   
     /**
	 * 	Update CompTimeHh600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeHh600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompTimeHh600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompTimeHh600 with another Field
	 *	@param value
	 */
   public void setCompTimeHh600(Field source) {
       replace(source,0,source.length(),beginCompTimeHh600,COMP_TIME_HH_600_LEN);
   	
   }  
   
     /**
	 * 	Update CompTimeHh600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeHh600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompTimeHh600,COMP_TIME_HH_600_LEN);
   	
   }
   
     /**
	 * 	Update CompTimeHh600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeHh600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompTimeHh600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of compTimeMm600
	 *	@return compTimeMm600
	 */
   public char[] getCompTimeMm600() throws CFException{
     if (isCompTimeMm600Modified()) { 
        compTimeMm600 = refreshCompTimeMm600();
     }
   		return compTimeMm600;
   }

  
	/**
	*  set variable compTimeMm600
	*  Corresponding COBOL Variable is 600-COMP-TIME-MM
	*  @param value
	**/
   public void setCompTimeMm600(char[] value) {
      compTimeMm600 = checkCompTimeMm600Constraints(value);
      serializeCompTimeMm600(compTimeMm600);
   } 

     /**
	 * 	Update CompTimeMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeMm600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompTimeMm600,compTimeMm600.length);
   	
   }
   
   public void setCompTimeMm600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompTimeMm600,compTimeMm600.length);
   	
   }
   
     /**
	 * 	Update CompTimeMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompTimeMm600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompTimeMm600 with another Field
	 *	@param value
	 */
   public void setCompTimeMm600(Field source) {
       replace(source,0,source.length(),beginCompTimeMm600,COMP_TIME_MM_600_LEN);
   	
   }  
   
     /**
	 * 	Update CompTimeMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeMm600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompTimeMm600,COMP_TIME_MM_600_LEN);
   	
   }
   
     /**
	 * 	Update CompTimeMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompTimeMm600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of compTimeSs600
	 *	@return compTimeSs600
	 */
   public char[] getCompTimeSs600() throws CFException{
     if (isCompTimeSs600Modified()) { 
        compTimeSs600 = refreshCompTimeSs600();
     }
   		return compTimeSs600;
   }

  
	/**
	*  set variable compTimeSs600
	*  Corresponding COBOL Variable is 600-COMP-TIME-SS
	*  @param value
	**/
   public void setCompTimeSs600(char[] value) {
      compTimeSs600 = checkCompTimeSs600Constraints(value);
      serializeCompTimeSs600(compTimeSs600);
   } 

     /**
	 * 	Update CompTimeSs600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeSs600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCompTimeSs600,compTimeSs600.length);
   	
   }
   
   public void setCompTimeSs600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCompTimeSs600,compTimeSs600.length);
   	
   }
   
     /**
	 * 	Update CompTimeSs600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeSs600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompTimeSs600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CompTimeSs600 with another Field
	 *	@param value
	 */
   public void setCompTimeSs600(Field source) {
       replace(source,0,source.length(),beginCompTimeSs600,COMP_TIME_SS_600_LEN);
   	
   }  
   
     /**
	 * 	Update CompTimeSs600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeSs600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCompTimeSs600,COMP_TIME_SS_600_LEN);
   	
   }
   
     /**
	 * 	Update CompTimeSs600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeSs600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCompTimeSs600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCompileTime600FieldLength() {
			return COMPILE_TIME_600_LENGTH;
		}

}
  
