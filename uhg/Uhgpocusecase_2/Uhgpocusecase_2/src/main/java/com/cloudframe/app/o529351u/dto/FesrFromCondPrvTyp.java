package com.cloudframe.app.o529351u.dto;

/**
*  The class FesrFromCondPrvTyp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/


import com.cloudframe.app.o529351u.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FesrFromCondPrvTyp extends FesrFromCondPrvTypSerialized { 
   

						private char[] fesrFromPrvTyp = Field.fillLowValue(2);
	
	/**
	* Constructor for FesrFromCondPrvTyp
	**/
    public FesrFromCondPrvTyp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FesrFromCondPrvTyp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrFromCondPrvTyp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fesrFromPrvTyp
	 *	@return fesrFromPrvTyp
	 */
   public char[] getFesrFromPrvTyp() throws CFException{
     if (isFesrFromPrvTypModified()) { 
        fesrFromPrvTyp = refreshFesrFromPrvTyp();
     }
   		return fesrFromPrvTyp;
   }

  
	/**
	*  set variable fesrFromPrvTyp
	*  Corresponding COBOL Variable is FESR-FROM-PRV-TYP
	*  @param value
	**/
   public void setFesrFromPrvTyp(char[] value) {
      fesrFromPrvTyp = checkFesrFromPrvTypConstraints(value);
      serializeFesrFromPrvTyp(fesrFromPrvTyp);
   } 

     /**
	 * 	Update FesrFromPrvTyp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFesrFromPrvTyp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFesrFromPrvTyp,fesrFromPrvTyp.length);
   	
   }
   
   public void setFesrFromPrvTyp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromPrvTyp,fesrFromPrvTyp.length);
   	
   }
   
     /**
	 * 	Update FesrFromPrvTyp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromPrvTyp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromPrvTyp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FesrFromPrvTyp with another Field
	 *	@param value
	 */
   public void setFesrFromPrvTyp(Field source) {
       replace(source,0,source.length(),beginFesrFromPrvTyp,FESR_FROM_PRV_TYP_LEN);
   	
   }  
   
     /**
	 * 	Update FesrFromPrvTyp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFesrFromPrvTyp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFesrFromPrvTyp,FESR_FROM_PRV_TYP_LEN);
   	
   }
   
     /**
	 * 	Update FesrFromPrvTyp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFesrFromPrvTyp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFesrFromPrvTyp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFesrFromCondPrvTypFieldLength() {
			return FESR_FROM_COND_PRV_TYP_LENGTH;
		}

}
  
