package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln13 extends DtPage3Ln13Serialized {
   

						private char[] dt313Cc = new char[1];

								private char[] dt313IssvatFicnt = Field.fillLowValue(11);


						private char[] dt313IssvatFiamt = Field.fillLowValue(16);

						private char[] dt313IssvatFiind = new char[2];

						private char[] dt313IssvatFvamt = Field.fillLowValue(11);

						private char[] dt313IssvatFvind = new char[2];


								private char[] dt313IssvatNicnt = Field.fillLowValue(11);

						private char[] dt313IssvatNiamt = Field.fillLowValue(16);

						private char[] dt313IssvatNiind = new char[2];

						private char[] dt313IssvatNvamt = Field.fillLowValue(11);

						private char[] dt313IssvatNvind = new char[2];


								private char[] dt313IssvatTicnt = Field.fillLowValue(11);

						private char[] dt313IssvatTiamt = Field.fillLowValue(16);

						private char[] dt313IssvatTiind = new char[2];

						private char[] dt313IssvatTvamt = Field.fillLowValue(11);

						private char[] dt313IssvatTvind = new char[2];

	
	/**
	* Constructor for DtPage3Ln13
	**/
    public DtPage3Ln13() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt313Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 12
             ,1
             );
								setDt313IssvatFiind(fillSpace(2));
								setDt313IssvatFvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 44
             ,2
             );
								setDt313IssvatNiind(fillSpace(2));
								setDt313IssvatNvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 88
             ,2
             );
								setDt313IssvatTiind(fillSpace(2));
								setDt313IssvatTvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 132
             ,1
             );
    }


 

	/**
	 *	Returns the value of dt313Cc
	 *	@return dt313Cc
	 */
   public char[] getDt313Cc() throws CFException{
     if (isDt313CcModified()) { 
        dt313Cc = refreshDt313Cc();
     }
   		return dt313Cc;
   }

  
	/**
	*  set variable dt313Cc
	*  Corresponding COBOL Variable is DT3-13-CC
	*  @param value
	**/
   public void setDt313Cc(char[] value) {
      dt313Cc = checkDt313CcConstraints(value);
      serializeDt313Cc(dt313Cc);
   } 

     /**
	 * 	Update Dt313Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313Cc,dt313Cc.length);
   	
   }
   
   public void setDt313Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313Cc,dt313Cc.length);
   	
   }
   
     /**
	 * 	Update Dt313Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313Cc with another Field
	 *	@param value
	 */
   public void setDt313Cc(Field source) {
       replace(source,0,source.length(),beginDt313Cc,DT_313_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313Cc,DT_313_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt313Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatFicnt
	 *	@return dt313IssvatFicnt
	 */
   public char[] getDt313IssvatFicnt() throws CFException{
     if (isDt313IssvatFicntModified()) { 
        dt313IssvatFicnt = refreshDt313IssvatFicnt();
     }
   		return dt313IssvatFicnt;
   }

  
	/**
	*  set variable dt313IssvatFicnt
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-FICNT
	*  @param value
	**/
   public void setDt313IssvatFicnt(char[] value) {
      dt313IssvatFicnt = checkDt313IssvatFicntConstraints(value);
      serializeDt313IssvatFicnt(dt313IssvatFicnt);
   } 

     /**
	 * 	Update Dt313IssvatFicnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatFicnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatFicnt,dt313IssvatFicnt.length);
   	
   }
   
   public void setDt313IssvatFicnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFicnt,dt313IssvatFicnt.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatFicnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatFicnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFicnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatFicnt with another Field
	 *	@param value
	 */
   public void setDt313IssvatFicnt(Field source) {
       replace(source,0,source.length(),beginDt313IssvatFicnt,DT_313_ISSVAT_FICNT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatFicnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatFicnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatFicnt,DT_313_ISSVAT_FICNT_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatFicnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatFicnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFicnt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatFiamt
	 *	@return dt313IssvatFiamt
	 */
   public char[] getDt313IssvatFiamt() throws CFException{
     if (isDt313IssvatFiamtModified()) { 
        dt313IssvatFiamt = refreshDt313IssvatFiamt();
     }
   		return dt313IssvatFiamt;
   }

  
	/**
	*  set variable dt313IssvatFiamt
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-FIAMT
	*  @param value
	**/
   public void setDt313IssvatFiamt(char[] value) {
      dt313IssvatFiamt = checkDt313IssvatFiamtConstraints(value);
      serializeDt313IssvatFiamt(dt313IssvatFiamt);
   } 

     /**
	 * 	Update Dt313IssvatFiamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatFiamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatFiamt,dt313IssvatFiamt.length);
   	
   }
   
   public void setDt313IssvatFiamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFiamt,dt313IssvatFiamt.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatFiamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatFiamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFiamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatFiamt with another Field
	 *	@param value
	 */
   public void setDt313IssvatFiamt(Field source) {
       replace(source,0,source.length(),beginDt313IssvatFiamt,DT_313_ISSVAT_FIAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatFiamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatFiamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatFiamt,DT_313_ISSVAT_FIAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatFiamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatFiamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFiamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatFiind
	 *	@return dt313IssvatFiind
	 */
   public char[] getDt313IssvatFiind() throws CFException{
     if (isDt313IssvatFiindModified()) { 
        dt313IssvatFiind = refreshDt313IssvatFiind();
     }
   		return dt313IssvatFiind;
   }

  
	/**
	*  set variable dt313IssvatFiind
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-FIIND
	*  @param value
	**/
   public void setDt313IssvatFiind(char[] value) {
      dt313IssvatFiind = checkDt313IssvatFiindConstraints(value);
      serializeDt313IssvatFiind(dt313IssvatFiind);
   } 

     /**
	 * 	Update Dt313IssvatFiind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatFiind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatFiind,dt313IssvatFiind.length);
   	
   }
   
   public void setDt313IssvatFiind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFiind,dt313IssvatFiind.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatFiind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatFiind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFiind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatFiind with another Field
	 *	@param value
	 */
   public void setDt313IssvatFiind(Field source) {
       replace(source,0,source.length(),beginDt313IssvatFiind,DT_313_ISSVAT_FIIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatFiind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatFiind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatFiind,DT_313_ISSVAT_FIIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatFiind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatFiind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFiind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatFvamt
	 *	@return dt313IssvatFvamt
	 */
   public char[] getDt313IssvatFvamt() throws CFException{
     if (isDt313IssvatFvamtModified()) { 
        dt313IssvatFvamt = refreshDt313IssvatFvamt();
     }
   		return dt313IssvatFvamt;
   }

  
	/**
	*  set variable dt313IssvatFvamt
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-FVAMT
	*  @param value
	**/
   public void setDt313IssvatFvamt(char[] value) {
      dt313IssvatFvamt = checkDt313IssvatFvamtConstraints(value);
      serializeDt313IssvatFvamt(dt313IssvatFvamt);
   } 

     /**
	 * 	Update Dt313IssvatFvamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatFvamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatFvamt,dt313IssvatFvamt.length);
   	
   }
   
   public void setDt313IssvatFvamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFvamt,dt313IssvatFvamt.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatFvamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatFvamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFvamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatFvamt with another Field
	 *	@param value
	 */
   public void setDt313IssvatFvamt(Field source) {
       replace(source,0,source.length(),beginDt313IssvatFvamt,DT_313_ISSVAT_FVAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatFvamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatFvamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatFvamt,DT_313_ISSVAT_FVAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatFvamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatFvamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFvamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatFvind
	 *	@return dt313IssvatFvind
	 */
   public char[] getDt313IssvatFvind() throws CFException{
     if (isDt313IssvatFvindModified()) { 
        dt313IssvatFvind = refreshDt313IssvatFvind();
     }
   		return dt313IssvatFvind;
   }

  
	/**
	*  set variable dt313IssvatFvind
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-FVIND
	*  @param value
	**/
   public void setDt313IssvatFvind(char[] value) {
      dt313IssvatFvind = checkDt313IssvatFvindConstraints(value);
      serializeDt313IssvatFvind(dt313IssvatFvind);
   } 

     /**
	 * 	Update Dt313IssvatFvind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatFvind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatFvind,dt313IssvatFvind.length);
   	
   }
   
   public void setDt313IssvatFvind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFvind,dt313IssvatFvind.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatFvind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatFvind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFvind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatFvind with another Field
	 *	@param value
	 */
   public void setDt313IssvatFvind(Field source) {
       replace(source,0,source.length(),beginDt313IssvatFvind,DT_313_ISSVAT_FVIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatFvind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatFvind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatFvind,DT_313_ISSVAT_FVIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatFvind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatFvind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatFvind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatNicnt
	 *	@return dt313IssvatNicnt
	 */
   public char[] getDt313IssvatNicnt() throws CFException{
     if (isDt313IssvatNicntModified()) { 
        dt313IssvatNicnt = refreshDt313IssvatNicnt();
     }
   		return dt313IssvatNicnt;
   }

  
	/**
	*  set variable dt313IssvatNicnt
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-NICNT
	*  @param value
	**/
   public void setDt313IssvatNicnt(char[] value) {
      dt313IssvatNicnt = checkDt313IssvatNicntConstraints(value);
      serializeDt313IssvatNicnt(dt313IssvatNicnt);
   } 

     /**
	 * 	Update Dt313IssvatNicnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatNicnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatNicnt,dt313IssvatNicnt.length);
   	
   }
   
   public void setDt313IssvatNicnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNicnt,dt313IssvatNicnt.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatNicnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatNicnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNicnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatNicnt with another Field
	 *	@param value
	 */
   public void setDt313IssvatNicnt(Field source) {
       replace(source,0,source.length(),beginDt313IssvatNicnt,DT_313_ISSVAT_NICNT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatNicnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatNicnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatNicnt,DT_313_ISSVAT_NICNT_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatNicnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatNicnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNicnt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatNiamt
	 *	@return dt313IssvatNiamt
	 */
   public char[] getDt313IssvatNiamt() throws CFException{
     if (isDt313IssvatNiamtModified()) { 
        dt313IssvatNiamt = refreshDt313IssvatNiamt();
     }
   		return dt313IssvatNiamt;
   }

  
	/**
	*  set variable dt313IssvatNiamt
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-NIAMT
	*  @param value
	**/
   public void setDt313IssvatNiamt(char[] value) {
      dt313IssvatNiamt = checkDt313IssvatNiamtConstraints(value);
      serializeDt313IssvatNiamt(dt313IssvatNiamt);
   } 

     /**
	 * 	Update Dt313IssvatNiamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatNiamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatNiamt,dt313IssvatNiamt.length);
   	
   }
   
   public void setDt313IssvatNiamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNiamt,dt313IssvatNiamt.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatNiamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatNiamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNiamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatNiamt with another Field
	 *	@param value
	 */
   public void setDt313IssvatNiamt(Field source) {
       replace(source,0,source.length(),beginDt313IssvatNiamt,DT_313_ISSVAT_NIAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatNiamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatNiamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatNiamt,DT_313_ISSVAT_NIAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatNiamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatNiamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNiamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatNiind
	 *	@return dt313IssvatNiind
	 */
   public char[] getDt313IssvatNiind() throws CFException{
     if (isDt313IssvatNiindModified()) { 
        dt313IssvatNiind = refreshDt313IssvatNiind();
     }
   		return dt313IssvatNiind;
   }

  
	/**
	*  set variable dt313IssvatNiind
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-NIIND
	*  @param value
	**/
   public void setDt313IssvatNiind(char[] value) {
      dt313IssvatNiind = checkDt313IssvatNiindConstraints(value);
      serializeDt313IssvatNiind(dt313IssvatNiind);
   } 

     /**
	 * 	Update Dt313IssvatNiind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatNiind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatNiind,dt313IssvatNiind.length);
   	
   }
   
   public void setDt313IssvatNiind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNiind,dt313IssvatNiind.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatNiind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatNiind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNiind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatNiind with another Field
	 *	@param value
	 */
   public void setDt313IssvatNiind(Field source) {
       replace(source,0,source.length(),beginDt313IssvatNiind,DT_313_ISSVAT_NIIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatNiind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatNiind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatNiind,DT_313_ISSVAT_NIIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatNiind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatNiind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNiind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatNvamt
	 *	@return dt313IssvatNvamt
	 */
   public char[] getDt313IssvatNvamt() throws CFException{
     if (isDt313IssvatNvamtModified()) { 
        dt313IssvatNvamt = refreshDt313IssvatNvamt();
     }
   		return dt313IssvatNvamt;
   }

  
	/**
	*  set variable dt313IssvatNvamt
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-NVAMT
	*  @param value
	**/
   public void setDt313IssvatNvamt(char[] value) {
      dt313IssvatNvamt = checkDt313IssvatNvamtConstraints(value);
      serializeDt313IssvatNvamt(dt313IssvatNvamt);
   } 

     /**
	 * 	Update Dt313IssvatNvamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatNvamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatNvamt,dt313IssvatNvamt.length);
   	
   }
   
   public void setDt313IssvatNvamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNvamt,dt313IssvatNvamt.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatNvamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatNvamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNvamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatNvamt with another Field
	 *	@param value
	 */
   public void setDt313IssvatNvamt(Field source) {
       replace(source,0,source.length(),beginDt313IssvatNvamt,DT_313_ISSVAT_NVAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatNvamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatNvamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatNvamt,DT_313_ISSVAT_NVAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatNvamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatNvamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNvamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatNvind
	 *	@return dt313IssvatNvind
	 */
   public char[] getDt313IssvatNvind() throws CFException{
     if (isDt313IssvatNvindModified()) { 
        dt313IssvatNvind = refreshDt313IssvatNvind();
     }
   		return dt313IssvatNvind;
   }

  
	/**
	*  set variable dt313IssvatNvind
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-NVIND
	*  @param value
	**/
   public void setDt313IssvatNvind(char[] value) {
      dt313IssvatNvind = checkDt313IssvatNvindConstraints(value);
      serializeDt313IssvatNvind(dt313IssvatNvind);
   } 

     /**
	 * 	Update Dt313IssvatNvind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatNvind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatNvind,dt313IssvatNvind.length);
   	
   }
   
   public void setDt313IssvatNvind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNvind,dt313IssvatNvind.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatNvind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatNvind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNvind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatNvind with another Field
	 *	@param value
	 */
   public void setDt313IssvatNvind(Field source) {
       replace(source,0,source.length(),beginDt313IssvatNvind,DT_313_ISSVAT_NVIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatNvind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatNvind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatNvind,DT_313_ISSVAT_NVIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatNvind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatNvind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatNvind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatTicnt
	 *	@return dt313IssvatTicnt
	 */
   public char[] getDt313IssvatTicnt() throws CFException{
     if (isDt313IssvatTicntModified()) { 
        dt313IssvatTicnt = refreshDt313IssvatTicnt();
     }
   		return dt313IssvatTicnt;
   }

  
	/**
	*  set variable dt313IssvatTicnt
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-TICNT
	*  @param value
	**/
   public void setDt313IssvatTicnt(char[] value) {
      dt313IssvatTicnt = checkDt313IssvatTicntConstraints(value);
      serializeDt313IssvatTicnt(dt313IssvatTicnt);
   } 

     /**
	 * 	Update Dt313IssvatTicnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatTicnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatTicnt,dt313IssvatTicnt.length);
   	
   }
   
   public void setDt313IssvatTicnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTicnt,dt313IssvatTicnt.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatTicnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatTicnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTicnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatTicnt with another Field
	 *	@param value
	 */
   public void setDt313IssvatTicnt(Field source) {
       replace(source,0,source.length(),beginDt313IssvatTicnt,DT_313_ISSVAT_TICNT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatTicnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatTicnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatTicnt,DT_313_ISSVAT_TICNT_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatTicnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatTicnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTicnt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatTiamt
	 *	@return dt313IssvatTiamt
	 */
   public char[] getDt313IssvatTiamt() throws CFException{
     if (isDt313IssvatTiamtModified()) { 
        dt313IssvatTiamt = refreshDt313IssvatTiamt();
     }
   		return dt313IssvatTiamt;
   }

  
	/**
	*  set variable dt313IssvatTiamt
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-TIAMT
	*  @param value
	**/
   public void setDt313IssvatTiamt(char[] value) {
      dt313IssvatTiamt = checkDt313IssvatTiamtConstraints(value);
      serializeDt313IssvatTiamt(dt313IssvatTiamt);
   } 

     /**
	 * 	Update Dt313IssvatTiamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatTiamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatTiamt,dt313IssvatTiamt.length);
   	
   }
   
   public void setDt313IssvatTiamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTiamt,dt313IssvatTiamt.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatTiamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatTiamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTiamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatTiamt with another Field
	 *	@param value
	 */
   public void setDt313IssvatTiamt(Field source) {
       replace(source,0,source.length(),beginDt313IssvatTiamt,DT_313_ISSVAT_TIAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatTiamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatTiamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatTiamt,DT_313_ISSVAT_TIAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatTiamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatTiamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTiamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatTiind
	 *	@return dt313IssvatTiind
	 */
   public char[] getDt313IssvatTiind() throws CFException{
     if (isDt313IssvatTiindModified()) { 
        dt313IssvatTiind = refreshDt313IssvatTiind();
     }
   		return dt313IssvatTiind;
   }

  
	/**
	*  set variable dt313IssvatTiind
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-TIIND
	*  @param value
	**/
   public void setDt313IssvatTiind(char[] value) {
      dt313IssvatTiind = checkDt313IssvatTiindConstraints(value);
      serializeDt313IssvatTiind(dt313IssvatTiind);
   } 

     /**
	 * 	Update Dt313IssvatTiind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatTiind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatTiind,dt313IssvatTiind.length);
   	
   }
   
   public void setDt313IssvatTiind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTiind,dt313IssvatTiind.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatTiind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatTiind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTiind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatTiind with another Field
	 *	@param value
	 */
   public void setDt313IssvatTiind(Field source) {
       replace(source,0,source.length(),beginDt313IssvatTiind,DT_313_ISSVAT_TIIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatTiind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatTiind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatTiind,DT_313_ISSVAT_TIIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatTiind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatTiind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTiind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatTvamt
	 *	@return dt313IssvatTvamt
	 */
   public char[] getDt313IssvatTvamt() throws CFException{
     if (isDt313IssvatTvamtModified()) { 
        dt313IssvatTvamt = refreshDt313IssvatTvamt();
     }
   		return dt313IssvatTvamt;
   }

  
	/**
	*  set variable dt313IssvatTvamt
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-TVAMT
	*  @param value
	**/
   public void setDt313IssvatTvamt(char[] value) {
      dt313IssvatTvamt = checkDt313IssvatTvamtConstraints(value);
      serializeDt313IssvatTvamt(dt313IssvatTvamt);
   } 

     /**
	 * 	Update Dt313IssvatTvamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatTvamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatTvamt,dt313IssvatTvamt.length);
   	
   }
   
   public void setDt313IssvatTvamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTvamt,dt313IssvatTvamt.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatTvamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatTvamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTvamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatTvamt with another Field
	 *	@param value
	 */
   public void setDt313IssvatTvamt(Field source) {
       replace(source,0,source.length(),beginDt313IssvatTvamt,DT_313_ISSVAT_TVAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatTvamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatTvamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatTvamt,DT_313_ISSVAT_TVAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatTvamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatTvamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTvamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt313IssvatTvind
	 *	@return dt313IssvatTvind
	 */
   public char[] getDt313IssvatTvind() throws CFException{
     if (isDt313IssvatTvindModified()) { 
        dt313IssvatTvind = refreshDt313IssvatTvind();
     }
   		return dt313IssvatTvind;
   }

  
	/**
	*  set variable dt313IssvatTvind
	*  Corresponding COBOL Variable is DT3-13-ISSVAT-TVIND
	*  @param value
	**/
   public void setDt313IssvatTvind(char[] value) {
      dt313IssvatTvind = checkDt313IssvatTvindConstraints(value);
      serializeDt313IssvatTvind(dt313IssvatTvind);
   } 

     /**
	 * 	Update Dt313IssvatTvind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt313IssvatTvind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt313IssvatTvind,dt313IssvatTvind.length);
   	
   }
   
   public void setDt313IssvatTvind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTvind,dt313IssvatTvind.length);
   	
   }
   
     /**
	 * 	Update Dt313IssvatTvind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatTvind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTvind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt313IssvatTvind with another Field
	 *	@param value
	 */
   public void setDt313IssvatTvind(Field source) {
       replace(source,0,source.length(),beginDt313IssvatTvind,DT_313_ISSVAT_TVIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt313IssvatTvind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt313IssvatTvind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt313IssvatTvind,DT_313_ISSVAT_TVIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt313IssvatTvind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt313IssvatTvind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt313IssvatTvind+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln13FieldLength() {
			return DT_PAGE_3_LN_13_LENGTH;
		}

}
  
