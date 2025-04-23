package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DtPage3Ln14 extends DtPage3Ln14Serialized {
   

						private char[] dt314Cc = new char[1];

								private char[] dt314NetvatFicnt = Field.fillLowValue(11);


						private char[] dt314NetvatFiamt = Field.fillLowValue(16);

						private char[] dt314NetvatFiind = new char[2];

						private char[] dt314NetvatFvamt = Field.fillLowValue(11);

						private char[] dt314NetvatFvind = new char[2];


								private char[] dt314NetvatNicnt = Field.fillLowValue(11);

						private char[] dt314NetvatNiamt = Field.fillLowValue(16);

						private char[] dt314NetvatNiind = new char[2];

						private char[] dt314NetvatNvamt = Field.fillLowValue(11);

						private char[] dt314NetvatNvind = new char[2];


								private char[] dt314NetvatTicnt = Field.fillLowValue(11);

						private char[] dt314NetvatTiamt = Field.fillLowValue(16);

						private char[] dt314NetvatTiind = new char[2];

						private char[] dt314NetvatTvamt = Field.fillLowValue(11);

						private char[] dt314NetvatTvind = new char[2];

	
	/**
	* Constructor for DtPage3Ln14
	**/
    public DtPage3Ln14() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt314Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 12
             ,1
             );
								setDt314NetvatFiind(fillSpace(2));
								setDt314NetvatFvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 44
             ,2
             );
								setDt314NetvatNiind(fillSpace(2));
								setDt314NetvatNvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 88
             ,2
             );
								setDt314NetvatTiind(fillSpace(2));
								setDt314NetvatTvind(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 132
             ,1
             );
    }


 

	/**
	 *	Returns the value of dt314Cc
	 *	@return dt314Cc
	 */
   public char[] getDt314Cc() throws CFException{
     if (isDt314CcModified()) { 
        dt314Cc = refreshDt314Cc();
     }
   		return dt314Cc;
   }

  
	/**
	*  set variable dt314Cc
	*  Corresponding COBOL Variable is DT3-14-CC
	*  @param value
	**/
   public void setDt314Cc(char[] value) {
      dt314Cc = checkDt314CcConstraints(value);
      serializeDt314Cc(dt314Cc);
   } 

     /**
	 * 	Update Dt314Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314Cc,dt314Cc.length);
   	
   }
   
   public void setDt314Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314Cc,dt314Cc.length);
   	
   }
   
     /**
	 * 	Update Dt314Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314Cc with another Field
	 *	@param value
	 */
   public void setDt314Cc(Field source) {
       replace(source,0,source.length(),beginDt314Cc,DT_314_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314Cc,DT_314_CC_LEN);
   	
   }
   
     /**
	 * 	Update Dt314Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatFicnt
	 *	@return dt314NetvatFicnt
	 */
   public char[] getDt314NetvatFicnt() throws CFException{
     if (isDt314NetvatFicntModified()) { 
        dt314NetvatFicnt = refreshDt314NetvatFicnt();
     }
   		return dt314NetvatFicnt;
   }

  
	/**
	*  set variable dt314NetvatFicnt
	*  Corresponding COBOL Variable is DT3-14-NETVAT-FICNT
	*  @param value
	**/
   public void setDt314NetvatFicnt(char[] value) {
      dt314NetvatFicnt = checkDt314NetvatFicntConstraints(value);
      serializeDt314NetvatFicnt(dt314NetvatFicnt);
   } 

     /**
	 * 	Update Dt314NetvatFicnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatFicnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatFicnt,dt314NetvatFicnt.length);
   	
   }
   
   public void setDt314NetvatFicnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFicnt,dt314NetvatFicnt.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatFicnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatFicnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFicnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatFicnt with another Field
	 *	@param value
	 */
   public void setDt314NetvatFicnt(Field source) {
       replace(source,0,source.length(),beginDt314NetvatFicnt,DT_314_NETVAT_FICNT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatFicnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatFicnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatFicnt,DT_314_NETVAT_FICNT_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatFicnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatFicnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFicnt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatFiamt
	 *	@return dt314NetvatFiamt
	 */
   public char[] getDt314NetvatFiamt() throws CFException{
     if (isDt314NetvatFiamtModified()) { 
        dt314NetvatFiamt = refreshDt314NetvatFiamt();
     }
   		return dt314NetvatFiamt;
   }

  
	/**
	*  set variable dt314NetvatFiamt
	*  Corresponding COBOL Variable is DT3-14-NETVAT-FIAMT
	*  @param value
	**/
   public void setDt314NetvatFiamt(char[] value) {
      dt314NetvatFiamt = checkDt314NetvatFiamtConstraints(value);
      serializeDt314NetvatFiamt(dt314NetvatFiamt);
   } 

     /**
	 * 	Update Dt314NetvatFiamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatFiamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatFiamt,dt314NetvatFiamt.length);
   	
   }
   
   public void setDt314NetvatFiamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFiamt,dt314NetvatFiamt.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatFiamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatFiamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFiamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatFiamt with another Field
	 *	@param value
	 */
   public void setDt314NetvatFiamt(Field source) {
       replace(source,0,source.length(),beginDt314NetvatFiamt,DT_314_NETVAT_FIAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatFiamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatFiamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatFiamt,DT_314_NETVAT_FIAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatFiamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatFiamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFiamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatFiind
	 *	@return dt314NetvatFiind
	 */
   public char[] getDt314NetvatFiind() throws CFException{
     if (isDt314NetvatFiindModified()) { 
        dt314NetvatFiind = refreshDt314NetvatFiind();
     }
   		return dt314NetvatFiind;
   }

  
	/**
	*  set variable dt314NetvatFiind
	*  Corresponding COBOL Variable is DT3-14-NETVAT-FIIND
	*  @param value
	**/
   public void setDt314NetvatFiind(char[] value) {
      dt314NetvatFiind = checkDt314NetvatFiindConstraints(value);
      serializeDt314NetvatFiind(dt314NetvatFiind);
   } 

     /**
	 * 	Update Dt314NetvatFiind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatFiind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatFiind,dt314NetvatFiind.length);
   	
   }
   
   public void setDt314NetvatFiind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFiind,dt314NetvatFiind.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatFiind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatFiind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFiind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatFiind with another Field
	 *	@param value
	 */
   public void setDt314NetvatFiind(Field source) {
       replace(source,0,source.length(),beginDt314NetvatFiind,DT_314_NETVAT_FIIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatFiind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatFiind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatFiind,DT_314_NETVAT_FIIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatFiind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatFiind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFiind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatFvamt
	 *	@return dt314NetvatFvamt
	 */
   public char[] getDt314NetvatFvamt() throws CFException{
     if (isDt314NetvatFvamtModified()) { 
        dt314NetvatFvamt = refreshDt314NetvatFvamt();
     }
   		return dt314NetvatFvamt;
   }

  
	/**
	*  set variable dt314NetvatFvamt
	*  Corresponding COBOL Variable is DT3-14-NETVAT-FVAMT
	*  @param value
	**/
   public void setDt314NetvatFvamt(char[] value) {
      dt314NetvatFvamt = checkDt314NetvatFvamtConstraints(value);
      serializeDt314NetvatFvamt(dt314NetvatFvamt);
   } 

     /**
	 * 	Update Dt314NetvatFvamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatFvamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatFvamt,dt314NetvatFvamt.length);
   	
   }
   
   public void setDt314NetvatFvamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFvamt,dt314NetvatFvamt.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatFvamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatFvamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFvamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatFvamt with another Field
	 *	@param value
	 */
   public void setDt314NetvatFvamt(Field source) {
       replace(source,0,source.length(),beginDt314NetvatFvamt,DT_314_NETVAT_FVAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatFvamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatFvamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatFvamt,DT_314_NETVAT_FVAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatFvamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatFvamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFvamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatFvind
	 *	@return dt314NetvatFvind
	 */
   public char[] getDt314NetvatFvind() throws CFException{
     if (isDt314NetvatFvindModified()) { 
        dt314NetvatFvind = refreshDt314NetvatFvind();
     }
   		return dt314NetvatFvind;
   }

  
	/**
	*  set variable dt314NetvatFvind
	*  Corresponding COBOL Variable is DT3-14-NETVAT-FVIND
	*  @param value
	**/
   public void setDt314NetvatFvind(char[] value) {
      dt314NetvatFvind = checkDt314NetvatFvindConstraints(value);
      serializeDt314NetvatFvind(dt314NetvatFvind);
   } 

     /**
	 * 	Update Dt314NetvatFvind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatFvind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatFvind,dt314NetvatFvind.length);
   	
   }
   
   public void setDt314NetvatFvind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFvind,dt314NetvatFvind.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatFvind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatFvind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFvind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatFvind with another Field
	 *	@param value
	 */
   public void setDt314NetvatFvind(Field source) {
       replace(source,0,source.length(),beginDt314NetvatFvind,DT_314_NETVAT_FVIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatFvind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatFvind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatFvind,DT_314_NETVAT_FVIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatFvind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatFvind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatFvind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatNicnt
	 *	@return dt314NetvatNicnt
	 */
   public char[] getDt314NetvatNicnt() throws CFException{
     if (isDt314NetvatNicntModified()) { 
        dt314NetvatNicnt = refreshDt314NetvatNicnt();
     }
   		return dt314NetvatNicnt;
   }

  
	/**
	*  set variable dt314NetvatNicnt
	*  Corresponding COBOL Variable is DT3-14-NETVAT-NICNT
	*  @param value
	**/
   public void setDt314NetvatNicnt(char[] value) {
      dt314NetvatNicnt = checkDt314NetvatNicntConstraints(value);
      serializeDt314NetvatNicnt(dt314NetvatNicnt);
   } 

     /**
	 * 	Update Dt314NetvatNicnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatNicnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatNicnt,dt314NetvatNicnt.length);
   	
   }
   
   public void setDt314NetvatNicnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNicnt,dt314NetvatNicnt.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatNicnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatNicnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNicnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatNicnt with another Field
	 *	@param value
	 */
   public void setDt314NetvatNicnt(Field source) {
       replace(source,0,source.length(),beginDt314NetvatNicnt,DT_314_NETVAT_NICNT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatNicnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatNicnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatNicnt,DT_314_NETVAT_NICNT_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatNicnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatNicnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNicnt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatNiamt
	 *	@return dt314NetvatNiamt
	 */
   public char[] getDt314NetvatNiamt() throws CFException{
     if (isDt314NetvatNiamtModified()) { 
        dt314NetvatNiamt = refreshDt314NetvatNiamt();
     }
   		return dt314NetvatNiamt;
   }

  
	/**
	*  set variable dt314NetvatNiamt
	*  Corresponding COBOL Variable is DT3-14-NETVAT-NIAMT
	*  @param value
	**/
   public void setDt314NetvatNiamt(char[] value) {
      dt314NetvatNiamt = checkDt314NetvatNiamtConstraints(value);
      serializeDt314NetvatNiamt(dt314NetvatNiamt);
   } 

     /**
	 * 	Update Dt314NetvatNiamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatNiamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatNiamt,dt314NetvatNiamt.length);
   	
   }
   
   public void setDt314NetvatNiamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNiamt,dt314NetvatNiamt.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatNiamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatNiamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNiamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatNiamt with another Field
	 *	@param value
	 */
   public void setDt314NetvatNiamt(Field source) {
       replace(source,0,source.length(),beginDt314NetvatNiamt,DT_314_NETVAT_NIAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatNiamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatNiamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatNiamt,DT_314_NETVAT_NIAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatNiamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatNiamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNiamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatNiind
	 *	@return dt314NetvatNiind
	 */
   public char[] getDt314NetvatNiind() throws CFException{
     if (isDt314NetvatNiindModified()) { 
        dt314NetvatNiind = refreshDt314NetvatNiind();
     }
   		return dt314NetvatNiind;
   }

  
	/**
	*  set variable dt314NetvatNiind
	*  Corresponding COBOL Variable is DT3-14-NETVAT-NIIND
	*  @param value
	**/
   public void setDt314NetvatNiind(char[] value) {
      dt314NetvatNiind = checkDt314NetvatNiindConstraints(value);
      serializeDt314NetvatNiind(dt314NetvatNiind);
   } 

     /**
	 * 	Update Dt314NetvatNiind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatNiind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatNiind,dt314NetvatNiind.length);
   	
   }
   
   public void setDt314NetvatNiind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNiind,dt314NetvatNiind.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatNiind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatNiind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNiind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatNiind with another Field
	 *	@param value
	 */
   public void setDt314NetvatNiind(Field source) {
       replace(source,0,source.length(),beginDt314NetvatNiind,DT_314_NETVAT_NIIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatNiind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatNiind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatNiind,DT_314_NETVAT_NIIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatNiind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatNiind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNiind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatNvamt
	 *	@return dt314NetvatNvamt
	 */
   public char[] getDt314NetvatNvamt() throws CFException{
     if (isDt314NetvatNvamtModified()) { 
        dt314NetvatNvamt = refreshDt314NetvatNvamt();
     }
   		return dt314NetvatNvamt;
   }

  
	/**
	*  set variable dt314NetvatNvamt
	*  Corresponding COBOL Variable is DT3-14-NETVAT-NVAMT
	*  @param value
	**/
   public void setDt314NetvatNvamt(char[] value) {
      dt314NetvatNvamt = checkDt314NetvatNvamtConstraints(value);
      serializeDt314NetvatNvamt(dt314NetvatNvamt);
   } 

     /**
	 * 	Update Dt314NetvatNvamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatNvamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatNvamt,dt314NetvatNvamt.length);
   	
   }
   
   public void setDt314NetvatNvamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNvamt,dt314NetvatNvamt.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatNvamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatNvamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNvamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatNvamt with another Field
	 *	@param value
	 */
   public void setDt314NetvatNvamt(Field source) {
       replace(source,0,source.length(),beginDt314NetvatNvamt,DT_314_NETVAT_NVAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatNvamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatNvamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatNvamt,DT_314_NETVAT_NVAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatNvamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatNvamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNvamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatNvind
	 *	@return dt314NetvatNvind
	 */
   public char[] getDt314NetvatNvind() throws CFException{
     if (isDt314NetvatNvindModified()) { 
        dt314NetvatNvind = refreshDt314NetvatNvind();
     }
   		return dt314NetvatNvind;
   }

  
	/**
	*  set variable dt314NetvatNvind
	*  Corresponding COBOL Variable is DT3-14-NETVAT-NVIND
	*  @param value
	**/
   public void setDt314NetvatNvind(char[] value) {
      dt314NetvatNvind = checkDt314NetvatNvindConstraints(value);
      serializeDt314NetvatNvind(dt314NetvatNvind);
   } 

     /**
	 * 	Update Dt314NetvatNvind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatNvind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatNvind,dt314NetvatNvind.length);
   	
   }
   
   public void setDt314NetvatNvind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNvind,dt314NetvatNvind.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatNvind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatNvind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNvind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatNvind with another Field
	 *	@param value
	 */
   public void setDt314NetvatNvind(Field source) {
       replace(source,0,source.length(),beginDt314NetvatNvind,DT_314_NETVAT_NVIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatNvind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatNvind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatNvind,DT_314_NETVAT_NVIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatNvind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatNvind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatNvind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatTicnt
	 *	@return dt314NetvatTicnt
	 */
   public char[] getDt314NetvatTicnt() throws CFException{
     if (isDt314NetvatTicntModified()) { 
        dt314NetvatTicnt = refreshDt314NetvatTicnt();
     }
   		return dt314NetvatTicnt;
   }

  
	/**
	*  set variable dt314NetvatTicnt
	*  Corresponding COBOL Variable is DT3-14-NETVAT-TICNT
	*  @param value
	**/
   public void setDt314NetvatTicnt(char[] value) {
      dt314NetvatTicnt = checkDt314NetvatTicntConstraints(value);
      serializeDt314NetvatTicnt(dt314NetvatTicnt);
   } 

     /**
	 * 	Update Dt314NetvatTicnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatTicnt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatTicnt,dt314NetvatTicnt.length);
   	
   }
   
   public void setDt314NetvatTicnt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTicnt,dt314NetvatTicnt.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatTicnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatTicnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTicnt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatTicnt with another Field
	 *	@param value
	 */
   public void setDt314NetvatTicnt(Field source) {
       replace(source,0,source.length(),beginDt314NetvatTicnt,DT_314_NETVAT_TICNT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatTicnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatTicnt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatTicnt,DT_314_NETVAT_TICNT_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatTicnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatTicnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTicnt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatTiamt
	 *	@return dt314NetvatTiamt
	 */
   public char[] getDt314NetvatTiamt() throws CFException{
     if (isDt314NetvatTiamtModified()) { 
        dt314NetvatTiamt = refreshDt314NetvatTiamt();
     }
   		return dt314NetvatTiamt;
   }

  
	/**
	*  set variable dt314NetvatTiamt
	*  Corresponding COBOL Variable is DT3-14-NETVAT-TIAMT
	*  @param value
	**/
   public void setDt314NetvatTiamt(char[] value) {
      dt314NetvatTiamt = checkDt314NetvatTiamtConstraints(value);
      serializeDt314NetvatTiamt(dt314NetvatTiamt);
   } 

     /**
	 * 	Update Dt314NetvatTiamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatTiamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatTiamt,dt314NetvatTiamt.length);
   	
   }
   
   public void setDt314NetvatTiamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTiamt,dt314NetvatTiamt.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatTiamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatTiamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTiamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatTiamt with another Field
	 *	@param value
	 */
   public void setDt314NetvatTiamt(Field source) {
       replace(source,0,source.length(),beginDt314NetvatTiamt,DT_314_NETVAT_TIAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatTiamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatTiamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatTiamt,DT_314_NETVAT_TIAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatTiamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatTiamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTiamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatTiind
	 *	@return dt314NetvatTiind
	 */
   public char[] getDt314NetvatTiind() throws CFException{
     if (isDt314NetvatTiindModified()) { 
        dt314NetvatTiind = refreshDt314NetvatTiind();
     }
   		return dt314NetvatTiind;
   }

  
	/**
	*  set variable dt314NetvatTiind
	*  Corresponding COBOL Variable is DT3-14-NETVAT-TIIND
	*  @param value
	**/
   public void setDt314NetvatTiind(char[] value) {
      dt314NetvatTiind = checkDt314NetvatTiindConstraints(value);
      serializeDt314NetvatTiind(dt314NetvatTiind);
   } 

     /**
	 * 	Update Dt314NetvatTiind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatTiind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatTiind,dt314NetvatTiind.length);
   	
   }
   
   public void setDt314NetvatTiind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTiind,dt314NetvatTiind.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatTiind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatTiind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTiind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatTiind with another Field
	 *	@param value
	 */
   public void setDt314NetvatTiind(Field source) {
       replace(source,0,source.length(),beginDt314NetvatTiind,DT_314_NETVAT_TIIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatTiind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatTiind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatTiind,DT_314_NETVAT_TIIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatTiind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatTiind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTiind+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatTvamt
	 *	@return dt314NetvatTvamt
	 */
   public char[] getDt314NetvatTvamt() throws CFException{
     if (isDt314NetvatTvamtModified()) { 
        dt314NetvatTvamt = refreshDt314NetvatTvamt();
     }
   		return dt314NetvatTvamt;
   }

  
	/**
	*  set variable dt314NetvatTvamt
	*  Corresponding COBOL Variable is DT3-14-NETVAT-TVAMT
	*  @param value
	**/
   public void setDt314NetvatTvamt(char[] value) {
      dt314NetvatTvamt = checkDt314NetvatTvamtConstraints(value);
      serializeDt314NetvatTvamt(dt314NetvatTvamt);
   } 

     /**
	 * 	Update Dt314NetvatTvamt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatTvamt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatTvamt,dt314NetvatTvamt.length);
   	
   }
   
   public void setDt314NetvatTvamt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTvamt,dt314NetvatTvamt.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatTvamt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatTvamt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTvamt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatTvamt with another Field
	 *	@param value
	 */
   public void setDt314NetvatTvamt(Field source) {
       replace(source,0,source.length(),beginDt314NetvatTvamt,DT_314_NETVAT_TVAMT_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatTvamt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatTvamt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatTvamt,DT_314_NETVAT_TVAMT_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatTvamt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatTvamt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTvamt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dt314NetvatTvind
	 *	@return dt314NetvatTvind
	 */
   public char[] getDt314NetvatTvind() throws CFException{
     if (isDt314NetvatTvindModified()) { 
        dt314NetvatTvind = refreshDt314NetvatTvind();
     }
   		return dt314NetvatTvind;
   }

  
	/**
	*  set variable dt314NetvatTvind
	*  Corresponding COBOL Variable is DT3-14-NETVAT-TVIND
	*  @param value
	**/
   public void setDt314NetvatTvind(char[] value) {
      dt314NetvatTvind = checkDt314NetvatTvindConstraints(value);
      serializeDt314NetvatTvind(dt314NetvatTvind);
   } 

     /**
	 * 	Update Dt314NetvatTvind 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDt314NetvatTvind(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDt314NetvatTvind,dt314NetvatTvind.length);
   	
   }
   
   public void setDt314NetvatTvind(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTvind,dt314NetvatTvind.length);
   	
   }
   
     /**
	 * 	Update Dt314NetvatTvind 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatTvind(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTvind+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dt314NetvatTvind with another Field
	 *	@param value
	 */
   public void setDt314NetvatTvind(Field source) {
       replace(source,0,source.length(),beginDt314NetvatTvind,DT_314_NETVAT_TVIND_LEN);
   	
   }  
   
     /**
	 * 	Update Dt314NetvatTvind 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDt314NetvatTvind(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDt314NetvatTvind,DT_314_NETVAT_TVIND_LEN);
   	
   }
   
     /**
	 * 	Update Dt314NetvatTvind 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt314NetvatTvind(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDt314NetvatTvind+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDtPage3Ln14FieldLength() {
			return DT_PAGE_3_LN_14_LENGTH;
		}

}
  
