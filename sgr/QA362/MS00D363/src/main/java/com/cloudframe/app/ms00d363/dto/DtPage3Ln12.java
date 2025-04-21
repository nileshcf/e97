package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln12 extends DtPage3Ln12Serialized {
   

						private char[] dt312Cc = new char[1];

								private char[] dt312AcqvatFicnt = Field.fillLowValue(11);


						private char[] dt312AcqvatFiamt = Field.fillLowValue(16);

						private char[] dt312AcqvatFiind = new char[2];

						private char[] dt312AcqvatFvamt = Field.fillLowValue(11);

						private char[] dt312AcqvatFvind = new char[2];


								private char[] dt312AcqvatNicnt = Field.fillLowValue(11);

						private char[] dt312AcqvatNiamt = Field.fillLowValue(16);

						private char[] dt312AcqvatNiind = new char[2];

						private char[] dt312AcqvatNvamt = Field.fillLowValue(11);

						private char[] dt312AcqvatNvind = new char[2];


								private char[] dt312AcqvatTicnt = Field.fillLowValue(11);

						private char[] dt312AcqvatTiamt = Field.fillLowValue(16);

						private char[] dt312AcqvatTiind = new char[2];

						private char[] dt312AcqvatTvamt = Field.fillLowValue(11);

						private char[] dt312AcqvatTvind = new char[2];

	
	/**
	* Constructor for DtPage3Ln12
	**/
    public DtPage3Ln12() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt312Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 12
             ,1
             );
								setDt312AcqvatFiind(fillSpace(2));
								setDt312AcqvatFvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 44
             ,2
             );
								setDt312AcqvatNiind(fillSpace(2));
								setDt312AcqvatNvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 88
             ,2
             );
								setDt312AcqvatTiind(fillSpace(2));
								setDt312AcqvatTvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 132
             ,1
             );
    }


 

	/**
	 *	Returns the value of dt312Cc
	 *	@return dt312Cc
	 */
   public char[] getDt312Cc() throws CFException{
     if (isDt312CcModified()) { 
        dt312Cc = refreshDt312Cc();
     }
   		return dt312Cc;
   }

  
	/**
	*  set variable dt312Cc
	*  Corresponding COBOL Variable is DT3-12-CC
	*  @param value
	**/
   public void setDt312Cc(char[] value) {
      dt312Cc = checkDt312CcConstraints(value);
      serializeDt312Cc(dt312Cc);
   } 

     /**
	 * 	Update Dt312Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312Cc,dt312Cc.length);
   	
   }
   
   public void setDt312Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312Cc,dt312Cc.length);
   	
   }
   
     /**
	 * 	Update Dt312Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312Cc with another Field
	 *	@param value
	 */
   public void setDt312Cc(Field source) {
       replace(source,0,source.length(),beginDt312Cc,DT_312_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312Cc,DT_312_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt312Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatFicnt
	 *	@return dt312AcqvatFicnt
	 */
   public char[] getDt312AcqvatFicnt() throws CFException{
     if (isDt312AcqvatFicntModified()) { 
        dt312AcqvatFicnt = refreshDt312AcqvatFicnt();
     }
   		return dt312AcqvatFicnt;
   }

  
	/**
	*  set variable dt312AcqvatFicnt
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-FICNT
	*  @param value
	**/
   public void setDt312AcqvatFicnt(char[] value) {
      dt312AcqvatFicnt = checkDt312AcqvatFicntConstraints(value);
      serializeDt312AcqvatFicnt(dt312AcqvatFicnt);
   } 

     /**
	 * 	Update Dt312AcqvatFicnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatFicnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatFicnt,dt312AcqvatFicnt.length);
   	
   }
   
   public void setDt312AcqvatFicnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFicnt,dt312AcqvatFicnt.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatFicnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatFicnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFicnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatFicnt with another Field
	 *	@param value
	 */
   public void setDt312AcqvatFicnt(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatFicnt,DT_312_ACQVAT_FICNT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatFicnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatFicnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatFicnt,DT_312_ACQVAT_FICNT_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatFicnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatFicnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFicnt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatFiamt
	 *	@return dt312AcqvatFiamt
	 */
   public char[] getDt312AcqvatFiamt() throws CFException{
     if (isDt312AcqvatFiamtModified()) { 
        dt312AcqvatFiamt = refreshDt312AcqvatFiamt();
     }
   		return dt312AcqvatFiamt;
   }

  
	/**
	*  set variable dt312AcqvatFiamt
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-FIAMT
	*  @param value
	**/
   public void setDt312AcqvatFiamt(char[] value) {
      dt312AcqvatFiamt = checkDt312AcqvatFiamtConstraints(value);
      serializeDt312AcqvatFiamt(dt312AcqvatFiamt);
   } 

     /**
	 * 	Update Dt312AcqvatFiamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatFiamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatFiamt,dt312AcqvatFiamt.length);
   	
   }
   
   public void setDt312AcqvatFiamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFiamt,dt312AcqvatFiamt.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatFiamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatFiamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFiamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatFiamt with another Field
	 *	@param value
	 */
   public void setDt312AcqvatFiamt(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatFiamt,DT_312_ACQVAT_FIAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatFiamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatFiamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatFiamt,DT_312_ACQVAT_FIAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatFiamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatFiamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFiamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatFiind
	 *	@return dt312AcqvatFiind
	 */
   public char[] getDt312AcqvatFiind() throws CFException{
     if (isDt312AcqvatFiindModified()) { 
        dt312AcqvatFiind = refreshDt312AcqvatFiind();
     }
   		return dt312AcqvatFiind;
   }

  
	/**
	*  set variable dt312AcqvatFiind
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-FIIND
	*  @param value
	**/
   public void setDt312AcqvatFiind(char[] value) {
      dt312AcqvatFiind = checkDt312AcqvatFiindConstraints(value);
      serializeDt312AcqvatFiind(dt312AcqvatFiind);
   } 

     /**
	 * 	Update Dt312AcqvatFiind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatFiind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatFiind,dt312AcqvatFiind.length);
   	
   }
   
   public void setDt312AcqvatFiind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFiind,dt312AcqvatFiind.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatFiind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatFiind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFiind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatFiind with another Field
	 *	@param value
	 */
   public void setDt312AcqvatFiind(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatFiind,DT_312_ACQVAT_FIIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatFiind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatFiind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatFiind,DT_312_ACQVAT_FIIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatFiind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatFiind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFiind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatFvamt
	 *	@return dt312AcqvatFvamt
	 */
   public char[] getDt312AcqvatFvamt() throws CFException{
     if (isDt312AcqvatFvamtModified()) { 
        dt312AcqvatFvamt = refreshDt312AcqvatFvamt();
     }
   		return dt312AcqvatFvamt;
   }

  
	/**
	*  set variable dt312AcqvatFvamt
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-FVAMT
	*  @param value
	**/
   public void setDt312AcqvatFvamt(char[] value) {
      dt312AcqvatFvamt = checkDt312AcqvatFvamtConstraints(value);
      serializeDt312AcqvatFvamt(dt312AcqvatFvamt);
   } 

     /**
	 * 	Update Dt312AcqvatFvamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatFvamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatFvamt,dt312AcqvatFvamt.length);
   	
   }
   
   public void setDt312AcqvatFvamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFvamt,dt312AcqvatFvamt.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatFvamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatFvamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFvamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatFvamt with another Field
	 *	@param value
	 */
   public void setDt312AcqvatFvamt(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatFvamt,DT_312_ACQVAT_FVAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatFvamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatFvamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatFvamt,DT_312_ACQVAT_FVAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatFvamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatFvamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFvamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatFvind
	 *	@return dt312AcqvatFvind
	 */
   public char[] getDt312AcqvatFvind() throws CFException{
     if (isDt312AcqvatFvindModified()) { 
        dt312AcqvatFvind = refreshDt312AcqvatFvind();
     }
   		return dt312AcqvatFvind;
   }

  
	/**
	*  set variable dt312AcqvatFvind
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-FVIND
	*  @param value
	**/
   public void setDt312AcqvatFvind(char[] value) {
      dt312AcqvatFvind = checkDt312AcqvatFvindConstraints(value);
      serializeDt312AcqvatFvind(dt312AcqvatFvind);
   } 

     /**
	 * 	Update Dt312AcqvatFvind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatFvind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatFvind,dt312AcqvatFvind.length);
   	
   }
   
   public void setDt312AcqvatFvind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFvind,dt312AcqvatFvind.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatFvind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatFvind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFvind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatFvind with another Field
	 *	@param value
	 */
   public void setDt312AcqvatFvind(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatFvind,DT_312_ACQVAT_FVIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatFvind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatFvind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatFvind,DT_312_ACQVAT_FVIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatFvind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatFvind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatFvind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatNicnt
	 *	@return dt312AcqvatNicnt
	 */
   public char[] getDt312AcqvatNicnt() throws CFException{
     if (isDt312AcqvatNicntModified()) { 
        dt312AcqvatNicnt = refreshDt312AcqvatNicnt();
     }
   		return dt312AcqvatNicnt;
   }

  
	/**
	*  set variable dt312AcqvatNicnt
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-NICNT
	*  @param value
	**/
   public void setDt312AcqvatNicnt(char[] value) {
      dt312AcqvatNicnt = checkDt312AcqvatNicntConstraints(value);
      serializeDt312AcqvatNicnt(dt312AcqvatNicnt);
   } 

     /**
	 * 	Update Dt312AcqvatNicnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatNicnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatNicnt,dt312AcqvatNicnt.length);
   	
   }
   
   public void setDt312AcqvatNicnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNicnt,dt312AcqvatNicnt.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatNicnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatNicnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNicnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatNicnt with another Field
	 *	@param value
	 */
   public void setDt312AcqvatNicnt(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatNicnt,DT_312_ACQVAT_NICNT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatNicnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatNicnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatNicnt,DT_312_ACQVAT_NICNT_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatNicnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatNicnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNicnt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatNiamt
	 *	@return dt312AcqvatNiamt
	 */
   public char[] getDt312AcqvatNiamt() throws CFException{
     if (isDt312AcqvatNiamtModified()) { 
        dt312AcqvatNiamt = refreshDt312AcqvatNiamt();
     }
   		return dt312AcqvatNiamt;
   }

  
	/**
	*  set variable dt312AcqvatNiamt
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-NIAMT
	*  @param value
	**/
   public void setDt312AcqvatNiamt(char[] value) {
      dt312AcqvatNiamt = checkDt312AcqvatNiamtConstraints(value);
      serializeDt312AcqvatNiamt(dt312AcqvatNiamt);
   } 

     /**
	 * 	Update Dt312AcqvatNiamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatNiamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatNiamt,dt312AcqvatNiamt.length);
   	
   }
   
   public void setDt312AcqvatNiamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNiamt,dt312AcqvatNiamt.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatNiamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatNiamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNiamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatNiamt with another Field
	 *	@param value
	 */
   public void setDt312AcqvatNiamt(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatNiamt,DT_312_ACQVAT_NIAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatNiamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatNiamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatNiamt,DT_312_ACQVAT_NIAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatNiamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatNiamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNiamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatNiind
	 *	@return dt312AcqvatNiind
	 */
   public char[] getDt312AcqvatNiind() throws CFException{
     if (isDt312AcqvatNiindModified()) { 
        dt312AcqvatNiind = refreshDt312AcqvatNiind();
     }
   		return dt312AcqvatNiind;
   }

  
	/**
	*  set variable dt312AcqvatNiind
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-NIIND
	*  @param value
	**/
   public void setDt312AcqvatNiind(char[] value) {
      dt312AcqvatNiind = checkDt312AcqvatNiindConstraints(value);
      serializeDt312AcqvatNiind(dt312AcqvatNiind);
   } 

     /**
	 * 	Update Dt312AcqvatNiind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatNiind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatNiind,dt312AcqvatNiind.length);
   	
   }
   
   public void setDt312AcqvatNiind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNiind,dt312AcqvatNiind.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatNiind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatNiind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNiind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatNiind with another Field
	 *	@param value
	 */
   public void setDt312AcqvatNiind(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatNiind,DT_312_ACQVAT_NIIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatNiind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatNiind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatNiind,DT_312_ACQVAT_NIIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatNiind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatNiind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNiind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatNvamt
	 *	@return dt312AcqvatNvamt
	 */
   public char[] getDt312AcqvatNvamt() throws CFException{
     if (isDt312AcqvatNvamtModified()) { 
        dt312AcqvatNvamt = refreshDt312AcqvatNvamt();
     }
   		return dt312AcqvatNvamt;
   }

  
	/**
	*  set variable dt312AcqvatNvamt
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-NVAMT
	*  @param value
	**/
   public void setDt312AcqvatNvamt(char[] value) {
      dt312AcqvatNvamt = checkDt312AcqvatNvamtConstraints(value);
      serializeDt312AcqvatNvamt(dt312AcqvatNvamt);
   } 

     /**
	 * 	Update Dt312AcqvatNvamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatNvamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatNvamt,dt312AcqvatNvamt.length);
   	
   }
   
   public void setDt312AcqvatNvamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNvamt,dt312AcqvatNvamt.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatNvamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatNvamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNvamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatNvamt with another Field
	 *	@param value
	 */
   public void setDt312AcqvatNvamt(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatNvamt,DT_312_ACQVAT_NVAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatNvamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatNvamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatNvamt,DT_312_ACQVAT_NVAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatNvamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatNvamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNvamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatNvind
	 *	@return dt312AcqvatNvind
	 */
   public char[] getDt312AcqvatNvind() throws CFException{
     if (isDt312AcqvatNvindModified()) { 
        dt312AcqvatNvind = refreshDt312AcqvatNvind();
     }
   		return dt312AcqvatNvind;
   }

  
	/**
	*  set variable dt312AcqvatNvind
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-NVIND
	*  @param value
	**/
   public void setDt312AcqvatNvind(char[] value) {
      dt312AcqvatNvind = checkDt312AcqvatNvindConstraints(value);
      serializeDt312AcqvatNvind(dt312AcqvatNvind);
   } 

     /**
	 * 	Update Dt312AcqvatNvind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatNvind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatNvind,dt312AcqvatNvind.length);
   	
   }
   
   public void setDt312AcqvatNvind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNvind,dt312AcqvatNvind.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatNvind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatNvind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNvind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatNvind with another Field
	 *	@param value
	 */
   public void setDt312AcqvatNvind(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatNvind,DT_312_ACQVAT_NVIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatNvind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatNvind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatNvind,DT_312_ACQVAT_NVIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatNvind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatNvind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatNvind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatTicnt
	 *	@return dt312AcqvatTicnt
	 */
   public char[] getDt312AcqvatTicnt() throws CFException{
     if (isDt312AcqvatTicntModified()) { 
        dt312AcqvatTicnt = refreshDt312AcqvatTicnt();
     }
   		return dt312AcqvatTicnt;
   }

  
	/**
	*  set variable dt312AcqvatTicnt
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-TICNT
	*  @param value
	**/
   public void setDt312AcqvatTicnt(char[] value) {
      dt312AcqvatTicnt = checkDt312AcqvatTicntConstraints(value);
      serializeDt312AcqvatTicnt(dt312AcqvatTicnt);
   } 

     /**
	 * 	Update Dt312AcqvatTicnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatTicnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatTicnt,dt312AcqvatTicnt.length);
   	
   }
   
   public void setDt312AcqvatTicnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTicnt,dt312AcqvatTicnt.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatTicnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatTicnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTicnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatTicnt with another Field
	 *	@param value
	 */
   public void setDt312AcqvatTicnt(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatTicnt,DT_312_ACQVAT_TICNT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatTicnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatTicnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatTicnt,DT_312_ACQVAT_TICNT_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatTicnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatTicnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTicnt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatTiamt
	 *	@return dt312AcqvatTiamt
	 */
   public char[] getDt312AcqvatTiamt() throws CFException{
     if (isDt312AcqvatTiamtModified()) { 
        dt312AcqvatTiamt = refreshDt312AcqvatTiamt();
     }
   		return dt312AcqvatTiamt;
   }

  
	/**
	*  set variable dt312AcqvatTiamt
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-TIAMT
	*  @param value
	**/
   public void setDt312AcqvatTiamt(char[] value) {
      dt312AcqvatTiamt = checkDt312AcqvatTiamtConstraints(value);
      serializeDt312AcqvatTiamt(dt312AcqvatTiamt);
   } 

     /**
	 * 	Update Dt312AcqvatTiamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatTiamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatTiamt,dt312AcqvatTiamt.length);
   	
   }
   
   public void setDt312AcqvatTiamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTiamt,dt312AcqvatTiamt.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatTiamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatTiamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTiamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatTiamt with another Field
	 *	@param value
	 */
   public void setDt312AcqvatTiamt(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatTiamt,DT_312_ACQVAT_TIAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatTiamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatTiamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatTiamt,DT_312_ACQVAT_TIAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatTiamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatTiamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTiamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatTiind
	 *	@return dt312AcqvatTiind
	 */
   public char[] getDt312AcqvatTiind() throws CFException{
     if (isDt312AcqvatTiindModified()) { 
        dt312AcqvatTiind = refreshDt312AcqvatTiind();
     }
   		return dt312AcqvatTiind;
   }

  
	/**
	*  set variable dt312AcqvatTiind
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-TIIND
	*  @param value
	**/
   public void setDt312AcqvatTiind(char[] value) {
      dt312AcqvatTiind = checkDt312AcqvatTiindConstraints(value);
      serializeDt312AcqvatTiind(dt312AcqvatTiind);
   } 

     /**
	 * 	Update Dt312AcqvatTiind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatTiind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatTiind,dt312AcqvatTiind.length);
   	
   }
   
   public void setDt312AcqvatTiind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTiind,dt312AcqvatTiind.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatTiind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatTiind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTiind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatTiind with another Field
	 *	@param value
	 */
   public void setDt312AcqvatTiind(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatTiind,DT_312_ACQVAT_TIIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatTiind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatTiind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatTiind,DT_312_ACQVAT_TIIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatTiind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatTiind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTiind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatTvamt
	 *	@return dt312AcqvatTvamt
	 */
   public char[] getDt312AcqvatTvamt() throws CFException{
     if (isDt312AcqvatTvamtModified()) { 
        dt312AcqvatTvamt = refreshDt312AcqvatTvamt();
     }
   		return dt312AcqvatTvamt;
   }

  
	/**
	*  set variable dt312AcqvatTvamt
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-TVAMT
	*  @param value
	**/
   public void setDt312AcqvatTvamt(char[] value) {
      dt312AcqvatTvamt = checkDt312AcqvatTvamtConstraints(value);
      serializeDt312AcqvatTvamt(dt312AcqvatTvamt);
   } 

     /**
	 * 	Update Dt312AcqvatTvamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatTvamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatTvamt,dt312AcqvatTvamt.length);
   	
   }
   
   public void setDt312AcqvatTvamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTvamt,dt312AcqvatTvamt.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatTvamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatTvamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTvamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatTvamt with another Field
	 *	@param value
	 */
   public void setDt312AcqvatTvamt(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatTvamt,DT_312_ACQVAT_TVAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatTvamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatTvamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatTvamt,DT_312_ACQVAT_TVAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatTvamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatTvamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTvamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt312AcqvatTvind
	 *	@return dt312AcqvatTvind
	 */
   public char[] getDt312AcqvatTvind() throws CFException{
     if (isDt312AcqvatTvindModified()) { 
        dt312AcqvatTvind = refreshDt312AcqvatTvind();
     }
   		return dt312AcqvatTvind;
   }

  
	/**
	*  set variable dt312AcqvatTvind
	*  Corresponding COBOL Variable is DT3-12-ACQVAT-TVIND
	*  @param value
	**/
   public void setDt312AcqvatTvind(char[] value) {
      dt312AcqvatTvind = checkDt312AcqvatTvindConstraints(value);
      serializeDt312AcqvatTvind(dt312AcqvatTvind);
   } 

     /**
	 * 	Update Dt312AcqvatTvind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt312AcqvatTvind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt312AcqvatTvind,dt312AcqvatTvind.length);
   	
   }
   
   public void setDt312AcqvatTvind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTvind,dt312AcqvatTvind.length);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatTvind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatTvind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTvind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt312AcqvatTvind with another Field
	 *	@param value
	 */
   public void setDt312AcqvatTvind(Field source) {
       replace(source,0,source.length(),beginDt312AcqvatTvind,DT_312_ACQVAT_TVIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt312AcqvatTvind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt312AcqvatTvind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt312AcqvatTvind,DT_312_ACQVAT_TVIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt312AcqvatTvind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt312AcqvatTvind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt312AcqvatTvind+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln12FieldLength() {
			return DT_PAGE_3_LN_12_LENGTH;
		}

}
  
