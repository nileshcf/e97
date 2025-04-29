package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4MiscData1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ov4MiscData1 extends Ov4MiscData1Serialized { 
   

						private char[] ov4Md1Oper = Field.fillLowValue(5);

						private char[] ov4Md1SortType = Field.fillLowValue(3);


						private char[] ov4Md1Tracer = Field.fillLowValue(4);


						private char[] ov4Md1Block = Field.fillLowValue(4);


						private char[] ov4Md1RrKblk = new char[5];

	
	/**
	* Constructor for Ov4MiscData1
	**/
    public Ov4MiscData1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ov4MiscData1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4MiscData1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 24
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 34
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 39
             ,1
             );
								setOv4Md1RrKblk(("0000 ").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 45
             ,5
             );
    } 

	/**
	 *	Returns the value of ov4Md1Oper
	 *	@return ov4Md1Oper
	 */
   public char[] getOv4Md1Oper() throws CFException{
     if (isOv4Md1OperModified()) { 
        ov4Md1Oper = refreshOv4Md1Oper();
     }
   		return ov4Md1Oper;
   }

  
	/**
	*  set variable ov4Md1Oper
	*  Corresponding COBOL Variable is OV4-MD1-OPER
	*  @param value
	**/
   public void setOv4Md1Oper(char[] value) {
      ov4Md1Oper = checkOv4Md1OperConstraints(value);
      serializeOv4Md1Oper(ov4Md1Oper);
   } 

     /**
	 * 	Update Ov4Md1Oper 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4Md1Oper(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4Md1Oper,ov4Md1Oper.length);
   	
   }
   
   public void setOv4Md1Oper(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1Oper,ov4Md1Oper.length);
   	
   }
   
     /**
	 * 	Update Ov4Md1Oper 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1Oper(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1Oper+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4Md1Oper with another Field
	 *	@param value
	 */
   public void setOv4Md1Oper(Field source) {
       replace(source,0,source.length(),beginOv4Md1Oper,OV_4_MD_1_OPER_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4Md1Oper 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4Md1Oper(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4Md1Oper,OV_4_MD_1_OPER_LEN);
   	
   }
   
     /**
	 * 	Update Ov4Md1Oper 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1Oper(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1Oper+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4Md1SortType
	 *	@return ov4Md1SortType
	 */
   public char[] getOv4Md1SortType() throws CFException{
     if (isOv4Md1SortTypeModified()) { 
        ov4Md1SortType = refreshOv4Md1SortType();
     }
   		return ov4Md1SortType;
   }

  
	/**
	*  set variable ov4Md1SortType
	*  Corresponding COBOL Variable is OV4-MD1-SORT-TYPE
	*  @param value
	**/
   public void setOv4Md1SortType(char[] value) {
      ov4Md1SortType = checkOv4Md1SortTypeConstraints(value);
      serializeOv4Md1SortType(ov4Md1SortType);
   } 

     /**
	 * 	Update Ov4Md1SortType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4Md1SortType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4Md1SortType,ov4Md1SortType.length);
   	
   }
   
   public void setOv4Md1SortType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1SortType,ov4Md1SortType.length);
   	
   }
   
     /**
	 * 	Update Ov4Md1SortType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1SortType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1SortType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4Md1SortType with another Field
	 *	@param value
	 */
   public void setOv4Md1SortType(Field source) {
       replace(source,0,source.length(),beginOv4Md1SortType,OV_4_MD_1_SORT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4Md1SortType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4Md1SortType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4Md1SortType,OV_4_MD_1_SORT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ov4Md1SortType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1SortType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1SortType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4Md1Tracer
	 *	@return ov4Md1Tracer
	 */
   public char[] getOv4Md1Tracer() throws CFException{
     if (isOv4Md1TracerModified()) { 
        ov4Md1Tracer = refreshOv4Md1Tracer();
     }
   		return ov4Md1Tracer;
   }

  
	/**
	*  set variable ov4Md1Tracer
	*  Corresponding COBOL Variable is OV4-MD1-TRACER
	*  @param value
	**/
   public void setOv4Md1Tracer(char[] value) {
      ov4Md1Tracer = checkOv4Md1TracerConstraints(value);
      serializeOv4Md1Tracer(ov4Md1Tracer);
   } 

     /**
	 * 	Update Ov4Md1Tracer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4Md1Tracer(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4Md1Tracer,ov4Md1Tracer.length);
   	
   }
   
   public void setOv4Md1Tracer(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1Tracer,ov4Md1Tracer.length);
   	
   }
   
     /**
	 * 	Update Ov4Md1Tracer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1Tracer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1Tracer+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4Md1Tracer with another Field
	 *	@param value
	 */
   public void setOv4Md1Tracer(Field source) {
       replace(source,0,source.length(),beginOv4Md1Tracer,OV_4_MD_1_TRACER_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4Md1Tracer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4Md1Tracer(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4Md1Tracer,OV_4_MD_1_TRACER_LEN);
   	
   }
   
     /**
	 * 	Update Ov4Md1Tracer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1Tracer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1Tracer+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4Md1Block
	 *	@return ov4Md1Block
	 */
   public char[] getOv4Md1Block() throws CFException{
     if (isOv4Md1BlockModified()) { 
        ov4Md1Block = refreshOv4Md1Block();
     }
   		return ov4Md1Block;
   }

  
	/**
	*  set variable ov4Md1Block
	*  Corresponding COBOL Variable is OV4-MD1-BLOCK
	*  @param value
	**/
   public void setOv4Md1Block(char[] value) {
      ov4Md1Block = checkOv4Md1BlockConstraints(value);
      serializeOv4Md1Block(ov4Md1Block);
   } 

     /**
	 * 	Update Ov4Md1Block 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4Md1Block(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4Md1Block,ov4Md1Block.length);
   	
   }
   
   public void setOv4Md1Block(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1Block,ov4Md1Block.length);
   	
   }
   
     /**
	 * 	Update Ov4Md1Block 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1Block(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1Block+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4Md1Block with another Field
	 *	@param value
	 */
   public void setOv4Md1Block(Field source) {
       replace(source,0,source.length(),beginOv4Md1Block,OV_4_MD_1_BLOCK_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4Md1Block 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4Md1Block(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4Md1Block,OV_4_MD_1_BLOCK_LEN);
   	
   }
   
     /**
	 * 	Update Ov4Md1Block 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1Block(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1Block+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ov4Md1RrKblk
	 *	@return ov4Md1RrKblk
	 */
   public char[] getOv4Md1RrKblk() throws CFException{
     if (isOv4Md1RrKblkModified()) { 
        ov4Md1RrKblk = refreshOv4Md1RrKblk();
     }
   		return ov4Md1RrKblk;
   }

  
	/**
	*  set variable ov4Md1RrKblk
	*  Corresponding COBOL Variable is OV4-MD1-RR-KBLK
	*  @param value
	**/
   public void setOv4Md1RrKblk(char[] value) {
      ov4Md1RrKblk = checkOv4Md1RrKblkConstraints(value);
      serializeOv4Md1RrKblk(ov4Md1RrKblk);
   } 

     /**
	 * 	Update Ov4Md1RrKblk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOv4Md1RrKblk(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOv4Md1RrKblk,ov4Md1RrKblk.length);
   	
   }
   
   public void setOv4Md1RrKblk(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1RrKblk,ov4Md1RrKblk.length);
   	
   }
   
     /**
	 * 	Update Ov4Md1RrKblk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1RrKblk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1RrKblk+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ov4Md1RrKblk with another Field
	 *	@param value
	 */
   public void setOv4Md1RrKblk(Field source) {
       replace(source,0,source.length(),beginOv4Md1RrKblk,OV_4_MD_1_RR_KBLK_LEN);
   	
   }  
   
     /**
	 * 	Update Ov4Md1RrKblk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOv4Md1RrKblk(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOv4Md1RrKblk,OV_4_MD_1_RR_KBLK_LEN);
   	
   }
   
     /**
	 * 	Update Ov4Md1RrKblk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOv4Md1RrKblk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOv4Md1RrKblk+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOv4MiscData1FieldLength() {
			return OV_4_MISC_DATA_1_LENGTH;
		}

}
  
