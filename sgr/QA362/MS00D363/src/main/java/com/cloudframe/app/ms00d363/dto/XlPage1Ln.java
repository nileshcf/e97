package com.cloudframe.app.ms00d363.dto;

/**
*  The class XlPage1Ln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class XlPage1Ln extends XlPage1LnSerialized {
   


						private char[] xl1ProcId = new char[10];


						private char[] xl1InstId = new char[10];


						private char[] xl1Currency = new char[3];


						private char[] xl1SettIca = new char[6];


						private char[] xl1Ssc = new char[3];


						private char[] xl1Isis = new char[4];


						private char[] xl1ProdDesc = new char[25];


						private char[] xl1AcqIss = new char[9];


						private char[] xl1Desc = new char[17];


								private char[] xl1FinNbr = Field.fillLowValue(10);


								private char[] xl1FinNbrDen = Field.fillLowValue(9);


						private char[] xl1FinAmt = new char[18];

						private char[] xl1FinAmtInd = new char[2];


								private char[] xl1FinFeeNbr = Field.fillLowValue(9);


								private char[] xl1PctFeeNbr = Field.fillLowValue(9);


								private char[] xl1NfinFeeNbr = Field.fillLowValue(8);


								private char[] xl1NbilFeeNbr = Field.fillLowValue(8);


						private char[] xl1FeeAmtDb = Field.fillLowValue(16);


						private char[] xl1FeeAmtCr = Field.fillLowValue(16);


						private char[] xl1BinId = Field.fillLowValue(11);


						private char[] xl1GcmsSamAchInd = Field.fillLowValue(4);


	
	/**
	* Constructor for XlPage1Ln
	**/
    public XlPage1Ln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
								setXl1ProcId(fillSpace(10));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 11
             ,1
             );
								setXl1InstId(fillSpace(10));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 22
             ,1
             );
								setXl1Currency(fillSpace(3));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 26
             ,1
             );
								setXl1SettIca(fillSpace(6));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 33
             ,1
             );
								setXl1Ssc(fillSpace(3));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 37
             ,1
             );
								setXl1Isis(fillSpace(4));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 42
             ,1
             );
								setXl1ProdDesc(fillSpace(25));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 68
             ,1
             );
								setXl1AcqIss(fillSpace(9));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 78
             ,1
             );
								setXl1Desc(fillSpace(17));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 96
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 107
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 117
             ,1
             );
								setXl1FinAmt(fillSpace(18));
								setXl1FinAmtInd(fillSpace(2));
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 138
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 148
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 158
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 167
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 176
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 193
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 210
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 222
             ,1
             );
       replaceValue( // serialize and save the value
             ("^").toCharArray()
             , getStartOffset() + 227
             ,1
             );
       replaceValue( // serialize and save the value
             pad(270," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 228
             ,270
             );
    }


 

	/**
	 *	Returns the value of xl1ProcId
	 *	@return xl1ProcId
	 */
   public char[] getXl1ProcId() throws CFException{
     if (isXl1ProcIdModified()) { 
        xl1ProcId = refreshXl1ProcId();
     }
   		return xl1ProcId;
   }

  
	/**
	*  set variable xl1ProcId
	*  Corresponding COBOL Variable is XL1-PROC-ID
	*  @param value
	**/
   public void setXl1ProcId(char[] value) {
      xl1ProcId = checkXl1ProcIdConstraints(value);
      serializeXl1ProcId(xl1ProcId);
   } 

     /**
	 * 	Update Xl1ProcId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1ProcId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1ProcId,xl1ProcId.length);
   	
   }
   
   public void setXl1ProcId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1ProcId,xl1ProcId.length);
   	
   }
   
     /**
	 * 	Update Xl1ProcId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1ProcId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1ProcId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1ProcId with another Field
	 *	@param value
	 */
   public void setXl1ProcId(Field source) {
       replace(source,0,source.length(),beginXl1ProcId,XL_1_PROC_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1ProcId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1ProcId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1ProcId,XL_1_PROC_ID_LEN);
   	
   }
   
     /**
	 * 	Update Xl1ProcId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1ProcId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1ProcId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1InstId
	 *	@return xl1InstId
	 */
   public char[] getXl1InstId() throws CFException{
     if (isXl1InstIdModified()) { 
        xl1InstId = refreshXl1InstId();
     }
   		return xl1InstId;
   }

  
	/**
	*  set variable xl1InstId
	*  Corresponding COBOL Variable is XL1-INST-ID
	*  @param value
	**/
   public void setXl1InstId(char[] value) {
      xl1InstId = checkXl1InstIdConstraints(value);
      serializeXl1InstId(xl1InstId);
   } 

     /**
	 * 	Update Xl1InstId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1InstId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1InstId,xl1InstId.length);
   	
   }
   
   public void setXl1InstId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1InstId,xl1InstId.length);
   	
   }
   
     /**
	 * 	Update Xl1InstId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1InstId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1InstId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1InstId with another Field
	 *	@param value
	 */
   public void setXl1InstId(Field source) {
       replace(source,0,source.length(),beginXl1InstId,XL_1_INST_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1InstId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1InstId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1InstId,XL_1_INST_ID_LEN);
   	
   }
   
     /**
	 * 	Update Xl1InstId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1InstId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1InstId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1Currency
	 *	@return xl1Currency
	 */
   public char[] getXl1Currency() throws CFException{
     if (isXl1CurrencyModified()) { 
        xl1Currency = refreshXl1Currency();
     }
   		return xl1Currency;
   }

  
	/**
	*  set variable xl1Currency
	*  Corresponding COBOL Variable is XL1-CURRENCY
	*  @param value
	**/
   public void setXl1Currency(char[] value) {
      xl1Currency = checkXl1CurrencyConstraints(value);
      serializeXl1Currency(xl1Currency);
   } 

     /**
	 * 	Update Xl1Currency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1Currency(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1Currency,xl1Currency.length);
   	
   }
   
   public void setXl1Currency(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1Currency,xl1Currency.length);
   	
   }
   
     /**
	 * 	Update Xl1Currency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1Currency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1Currency+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1Currency with another Field
	 *	@param value
	 */
   public void setXl1Currency(Field source) {
       replace(source,0,source.length(),beginXl1Currency,XL_1_CURRENCY_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1Currency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1Currency(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1Currency,XL_1_CURRENCY_LEN);
   	
   }
   
     /**
	 * 	Update Xl1Currency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1Currency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1Currency+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1SettIca
	 *	@return xl1SettIca
	 */
   public char[] getXl1SettIca() throws CFException{
     if (isXl1SettIcaModified()) { 
        xl1SettIca = refreshXl1SettIca();
     }
   		return xl1SettIca;
   }

  
	/**
	*  set variable xl1SettIca
	*  Corresponding COBOL Variable is XL1-SETT-ICA
	*  @param value
	**/
   public void setXl1SettIca(char[] value) {
      xl1SettIca = checkXl1SettIcaConstraints(value);
      serializeXl1SettIca(xl1SettIca);
   } 

     /**
	 * 	Update Xl1SettIca 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1SettIca(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1SettIca,xl1SettIca.length);
   	
   }
   
   public void setXl1SettIca(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1SettIca,xl1SettIca.length);
   	
   }
   
     /**
	 * 	Update Xl1SettIca 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1SettIca(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1SettIca+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1SettIca with another Field
	 *	@param value
	 */
   public void setXl1SettIca(Field source) {
       replace(source,0,source.length(),beginXl1SettIca,XL_1_SETT_ICA_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1SettIca 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1SettIca(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1SettIca,XL_1_SETT_ICA_LEN);
   	
   }
   
     /**
	 * 	Update Xl1SettIca 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1SettIca(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1SettIca+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1Ssc
	 *	@return xl1Ssc
	 */
   public char[] getXl1Ssc() throws CFException{
     if (isXl1SscModified()) { 
        xl1Ssc = refreshXl1Ssc();
     }
   		return xl1Ssc;
   }

  
	/**
	*  set variable xl1Ssc
	*  Corresponding COBOL Variable is XL1-SSC
	*  @param value
	**/
   public void setXl1Ssc(char[] value) {
      xl1Ssc = checkXl1SscConstraints(value);
      serializeXl1Ssc(xl1Ssc);
   } 

     /**
	 * 	Update Xl1Ssc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1Ssc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1Ssc,xl1Ssc.length);
   	
   }
   
   public void setXl1Ssc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1Ssc,xl1Ssc.length);
   	
   }
   
     /**
	 * 	Update Xl1Ssc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1Ssc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1Ssc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1Ssc with another Field
	 *	@param value
	 */
   public void setXl1Ssc(Field source) {
       replace(source,0,source.length(),beginXl1Ssc,XL_1_SSC_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1Ssc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1Ssc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1Ssc,XL_1_SSC_LEN);
   	
   }
   
     /**
	 * 	Update Xl1Ssc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1Ssc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1Ssc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1Isis
	 *	@return xl1Isis
	 */
   public char[] getXl1Isis() throws CFException{
     if (isXl1IsisModified()) { 
        xl1Isis = refreshXl1Isis();
     }
   		return xl1Isis;
   }

  
	/**
	*  set variable xl1Isis
	*  Corresponding COBOL Variable is XL1-ISIS
	*  @param value
	**/
   public void setXl1Isis(char[] value) {
      xl1Isis = checkXl1IsisConstraints(value);
      serializeXl1Isis(xl1Isis);
   } 

     /**
	 * 	Update Xl1Isis 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1Isis(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1Isis,xl1Isis.length);
   	
   }
   
   public void setXl1Isis(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1Isis,xl1Isis.length);
   	
   }
   
     /**
	 * 	Update Xl1Isis 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1Isis(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1Isis+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1Isis with another Field
	 *	@param value
	 */
   public void setXl1Isis(Field source) {
       replace(source,0,source.length(),beginXl1Isis,XL_1_ISIS_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1Isis 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1Isis(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1Isis,XL_1_ISIS_LEN);
   	
   }
   
     /**
	 * 	Update Xl1Isis 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1Isis(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1Isis+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1ProdDesc
	 *	@return xl1ProdDesc
	 */
   public char[] getXl1ProdDesc() throws CFException{
     if (isXl1ProdDescModified()) { 
        xl1ProdDesc = refreshXl1ProdDesc();
     }
   		return xl1ProdDesc;
   }

  
	/**
	*  set variable xl1ProdDesc
	*  Corresponding COBOL Variable is XL1-PROD-DESC
	*  @param value
	**/
   public void setXl1ProdDesc(char[] value) {
      xl1ProdDesc = checkXl1ProdDescConstraints(value);
      serializeXl1ProdDesc(xl1ProdDesc);
   } 

     /**
	 * 	Update Xl1ProdDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1ProdDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1ProdDesc,xl1ProdDesc.length);
   	
   }
   
   public void setXl1ProdDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1ProdDesc,xl1ProdDesc.length);
   	
   }
   
     /**
	 * 	Update Xl1ProdDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1ProdDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1ProdDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1ProdDesc with another Field
	 *	@param value
	 */
   public void setXl1ProdDesc(Field source) {
       replace(source,0,source.length(),beginXl1ProdDesc,XL_1_PROD_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1ProdDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1ProdDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1ProdDesc,XL_1_PROD_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Xl1ProdDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1ProdDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1ProdDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1AcqIss
	 *	@return xl1AcqIss
	 */
   public char[] getXl1AcqIss() throws CFException{
     if (isXl1AcqIssModified()) { 
        xl1AcqIss = refreshXl1AcqIss();
     }
   		return xl1AcqIss;
   }

  
	/**
	*  set variable xl1AcqIss
	*  Corresponding COBOL Variable is XL1-ACQ-ISS
	*  @param value
	**/
   public void setXl1AcqIss(char[] value) {
      xl1AcqIss = checkXl1AcqIssConstraints(value);
      serializeXl1AcqIss(xl1AcqIss);
   } 

     /**
	 * 	Update Xl1AcqIss 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1AcqIss(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1AcqIss,xl1AcqIss.length);
   	
   }
   
   public void setXl1AcqIss(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1AcqIss,xl1AcqIss.length);
   	
   }
   
     /**
	 * 	Update Xl1AcqIss 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1AcqIss(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1AcqIss+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1AcqIss with another Field
	 *	@param value
	 */
   public void setXl1AcqIss(Field source) {
       replace(source,0,source.length(),beginXl1AcqIss,XL_1_ACQ_ISS_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1AcqIss 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1AcqIss(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1AcqIss,XL_1_ACQ_ISS_LEN);
   	
   }
   
     /**
	 * 	Update Xl1AcqIss 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1AcqIss(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1AcqIss+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1Desc
	 *	@return xl1Desc
	 */
   public char[] getXl1Desc() throws CFException{
     if (isXl1DescModified()) { 
        xl1Desc = refreshXl1Desc();
     }
   		return xl1Desc;
   }

  
	/**
	*  set variable xl1Desc
	*  Corresponding COBOL Variable is XL1-DESC
	*  @param value
	**/
   public void setXl1Desc(char[] value) {
      xl1Desc = checkXl1DescConstraints(value);
      serializeXl1Desc(xl1Desc);
   } 

     /**
	 * 	Update Xl1Desc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1Desc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1Desc,xl1Desc.length);
   	
   }
   
   public void setXl1Desc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1Desc,xl1Desc.length);
   	
   }
   
     /**
	 * 	Update Xl1Desc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1Desc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1Desc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1Desc with another Field
	 *	@param value
	 */
   public void setXl1Desc(Field source) {
       replace(source,0,source.length(),beginXl1Desc,XL_1_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1Desc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1Desc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1Desc,XL_1_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Xl1Desc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1Desc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1Desc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1FinNbr
	 *	@return xl1FinNbr
	 */
   public char[] getXl1FinNbr() throws CFException{
     if (isXl1FinNbrModified()) { 
        xl1FinNbr = refreshXl1FinNbr();
     }
   		return xl1FinNbr;
   }

  
	/**
	*  set variable xl1FinNbr
	*  Corresponding COBOL Variable is XL1-FIN-NBR
	*  @param value
	**/
   public void setXl1FinNbr(char[] value) {
      xl1FinNbr = checkXl1FinNbrConstraints(value);
      serializeXl1FinNbr(xl1FinNbr);
   } 

     /**
	 * 	Update Xl1FinNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1FinNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1FinNbr,xl1FinNbr.length);
   	
   }
   
   public void setXl1FinNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinNbr,xl1FinNbr.length);
   	
   }
   
     /**
	 * 	Update Xl1FinNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1FinNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1FinNbr with another Field
	 *	@param value
	 */
   public void setXl1FinNbr(Field source) {
       replace(source,0,source.length(),beginXl1FinNbr,XL_1_FIN_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1FinNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1FinNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1FinNbr,XL_1_FIN_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Xl1FinNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1FinNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1FinNbrDen
	 *	@return xl1FinNbrDen
	 */
   public char[] getXl1FinNbrDen() throws CFException{
     if (isXl1FinNbrDenModified()) { 
        xl1FinNbrDen = refreshXl1FinNbrDen();
     }
   		return xl1FinNbrDen;
   }

  
	/**
	*  set variable xl1FinNbrDen
	*  Corresponding COBOL Variable is XL1-FIN-NBR-DEN
	*  @param value
	**/
   public void setXl1FinNbrDen(char[] value) {
      xl1FinNbrDen = checkXl1FinNbrDenConstraints(value);
      serializeXl1FinNbrDen(xl1FinNbrDen);
   } 

     /**
	 * 	Update Xl1FinNbrDen 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1FinNbrDen(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1FinNbrDen,xl1FinNbrDen.length);
   	
   }
   
   public void setXl1FinNbrDen(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinNbrDen,xl1FinNbrDen.length);
   	
   }
   
     /**
	 * 	Update Xl1FinNbrDen 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1FinNbrDen(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinNbrDen+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1FinNbrDen with another Field
	 *	@param value
	 */
   public void setXl1FinNbrDen(Field source) {
       replace(source,0,source.length(),beginXl1FinNbrDen,XL_1_FIN_NBR_DEN_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1FinNbrDen 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1FinNbrDen(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1FinNbrDen,XL_1_FIN_NBR_DEN_LEN);
   	
   }
   
     /**
	 * 	Update Xl1FinNbrDen 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1FinNbrDen(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinNbrDen+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1FinAmt
	 *	@return xl1FinAmt
	 */
   public char[] getXl1FinAmt() throws CFException{
     if (isXl1FinAmtModified()) { 
        xl1FinAmt = refreshXl1FinAmt();
     }
   		return xl1FinAmt;
   }

  
	/**
	*  set variable xl1FinAmt
	*  Corresponding COBOL Variable is XL1-FIN-AMT
	*  @param value
	**/
   public void setXl1FinAmt(char[] value) {
      xl1FinAmt = checkXl1FinAmtConstraints(value);
      serializeXl1FinAmt(xl1FinAmt);
   } 

     /**
	 * 	Update Xl1FinAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1FinAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1FinAmt,xl1FinAmt.length);
   	
   }
   
   public void setXl1FinAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinAmt,xl1FinAmt.length);
   	
   }
   
     /**
	 * 	Update Xl1FinAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1FinAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1FinAmt with another Field
	 *	@param value
	 */
   public void setXl1FinAmt(Field source) {
       replace(source,0,source.length(),beginXl1FinAmt,XL_1_FIN_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1FinAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1FinAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1FinAmt,XL_1_FIN_AMT_LEN);
   	
   }
   
     /**
	 * 	Update Xl1FinAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1FinAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1FinAmtInd
	 *	@return xl1FinAmtInd
	 */
   public char[] getXl1FinAmtInd() throws CFException{
     if (isXl1FinAmtIndModified()) { 
        xl1FinAmtInd = refreshXl1FinAmtInd();
     }
   		return xl1FinAmtInd;
   }

  
	/**
	*  set variable xl1FinAmtInd
	*  Corresponding COBOL Variable is XL1-FIN-AMT-IND
	*  @param value
	**/
   public void setXl1FinAmtInd(char[] value) {
      xl1FinAmtInd = checkXl1FinAmtIndConstraints(value);
      serializeXl1FinAmtInd(xl1FinAmtInd);
   } 

     /**
	 * 	Update Xl1FinAmtInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1FinAmtInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1FinAmtInd,xl1FinAmtInd.length);
   	
   }
   
   public void setXl1FinAmtInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinAmtInd,xl1FinAmtInd.length);
   	
   }
   
     /**
	 * 	Update Xl1FinAmtInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1FinAmtInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinAmtInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1FinAmtInd with another Field
	 *	@param value
	 */
   public void setXl1FinAmtInd(Field source) {
       replace(source,0,source.length(),beginXl1FinAmtInd,XL_1_FIN_AMT_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1FinAmtInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1FinAmtInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1FinAmtInd,XL_1_FIN_AMT_IND_LEN);
   	
   }
   
     /**
	 * 	Update Xl1FinAmtInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1FinAmtInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinAmtInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1FinFeeNbr
	 *	@return xl1FinFeeNbr
	 */
   public char[] getXl1FinFeeNbr() throws CFException{
     if (isXl1FinFeeNbrModified()) { 
        xl1FinFeeNbr = refreshXl1FinFeeNbr();
     }
   		return xl1FinFeeNbr;
   }

  
	/**
	*  set variable xl1FinFeeNbr
	*  Corresponding COBOL Variable is XL1-FIN-FEE-NBR
	*  @param value
	**/
   public void setXl1FinFeeNbr(char[] value) {
      xl1FinFeeNbr = checkXl1FinFeeNbrConstraints(value);
      serializeXl1FinFeeNbr(xl1FinFeeNbr);
   } 

     /**
	 * 	Update Xl1FinFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1FinFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1FinFeeNbr,xl1FinFeeNbr.length);
   	
   }
   
   public void setXl1FinFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinFeeNbr,xl1FinFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Xl1FinFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1FinFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1FinFeeNbr with another Field
	 *	@param value
	 */
   public void setXl1FinFeeNbr(Field source) {
       replace(source,0,source.length(),beginXl1FinFeeNbr,XL_1_FIN_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1FinFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1FinFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1FinFeeNbr,XL_1_FIN_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Xl1FinFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1FinFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FinFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1PctFeeNbr
	 *	@return xl1PctFeeNbr
	 */
   public char[] getXl1PctFeeNbr() throws CFException{
     if (isXl1PctFeeNbrModified()) { 
        xl1PctFeeNbr = refreshXl1PctFeeNbr();
     }
   		return xl1PctFeeNbr;
   }

  
	/**
	*  set variable xl1PctFeeNbr
	*  Corresponding COBOL Variable is XL1-PCT-FEE-NBR
	*  @param value
	**/
   public void setXl1PctFeeNbr(char[] value) {
      xl1PctFeeNbr = checkXl1PctFeeNbrConstraints(value);
      serializeXl1PctFeeNbr(xl1PctFeeNbr);
   } 

     /**
	 * 	Update Xl1PctFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1PctFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1PctFeeNbr,xl1PctFeeNbr.length);
   	
   }
   
   public void setXl1PctFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1PctFeeNbr,xl1PctFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Xl1PctFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1PctFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1PctFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1PctFeeNbr with another Field
	 *	@param value
	 */
   public void setXl1PctFeeNbr(Field source) {
       replace(source,0,source.length(),beginXl1PctFeeNbr,XL_1_PCT_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1PctFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1PctFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1PctFeeNbr,XL_1_PCT_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Xl1PctFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1PctFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1PctFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1NfinFeeNbr
	 *	@return xl1NfinFeeNbr
	 */
   public char[] getXl1NfinFeeNbr() throws CFException{
     if (isXl1NfinFeeNbrModified()) { 
        xl1NfinFeeNbr = refreshXl1NfinFeeNbr();
     }
   		return xl1NfinFeeNbr;
   }

  
	/**
	*  set variable xl1NfinFeeNbr
	*  Corresponding COBOL Variable is XL1-NFIN-FEE-NBR
	*  @param value
	**/
   public void setXl1NfinFeeNbr(char[] value) {
      xl1NfinFeeNbr = checkXl1NfinFeeNbrConstraints(value);
      serializeXl1NfinFeeNbr(xl1NfinFeeNbr);
   } 

     /**
	 * 	Update Xl1NfinFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1NfinFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1NfinFeeNbr,xl1NfinFeeNbr.length);
   	
   }
   
   public void setXl1NfinFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1NfinFeeNbr,xl1NfinFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Xl1NfinFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1NfinFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1NfinFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1NfinFeeNbr with another Field
	 *	@param value
	 */
   public void setXl1NfinFeeNbr(Field source) {
       replace(source,0,source.length(),beginXl1NfinFeeNbr,XL_1_NFIN_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1NfinFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1NfinFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1NfinFeeNbr,XL_1_NFIN_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Xl1NfinFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1NfinFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1NfinFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1NbilFeeNbr
	 *	@return xl1NbilFeeNbr
	 */
   public char[] getXl1NbilFeeNbr() throws CFException{
     if (isXl1NbilFeeNbrModified()) { 
        xl1NbilFeeNbr = refreshXl1NbilFeeNbr();
     }
   		return xl1NbilFeeNbr;
   }

  
	/**
	*  set variable xl1NbilFeeNbr
	*  Corresponding COBOL Variable is XL1-NBIL-FEE-NBR
	*  @param value
	**/
   public void setXl1NbilFeeNbr(char[] value) {
      xl1NbilFeeNbr = checkXl1NbilFeeNbrConstraints(value);
      serializeXl1NbilFeeNbr(xl1NbilFeeNbr);
   } 

     /**
	 * 	Update Xl1NbilFeeNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1NbilFeeNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1NbilFeeNbr,xl1NbilFeeNbr.length);
   	
   }
   
   public void setXl1NbilFeeNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1NbilFeeNbr,xl1NbilFeeNbr.length);
   	
   }
   
     /**
	 * 	Update Xl1NbilFeeNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1NbilFeeNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1NbilFeeNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1NbilFeeNbr with another Field
	 *	@param value
	 */
   public void setXl1NbilFeeNbr(Field source) {
       replace(source,0,source.length(),beginXl1NbilFeeNbr,XL_1_NBIL_FEE_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1NbilFeeNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1NbilFeeNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1NbilFeeNbr,XL_1_NBIL_FEE_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Xl1NbilFeeNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1NbilFeeNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1NbilFeeNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1FeeAmtDb
	 *	@return xl1FeeAmtDb
	 */
   public char[] getXl1FeeAmtDb() throws CFException{
     if (isXl1FeeAmtDbModified()) { 
        xl1FeeAmtDb = refreshXl1FeeAmtDb();
     }
   		return xl1FeeAmtDb;
   }

  
	/**
	*  set variable xl1FeeAmtDb
	*  Corresponding COBOL Variable is XL1-FEE-AMT-DB
	*  @param value
	**/
   public void setXl1FeeAmtDb(char[] value) {
      xl1FeeAmtDb = checkXl1FeeAmtDbConstraints(value);
      serializeXl1FeeAmtDb(xl1FeeAmtDb);
   } 

     /**
	 * 	Update Xl1FeeAmtDb 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1FeeAmtDb(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1FeeAmtDb,xl1FeeAmtDb.length);
   	
   }
   
   public void setXl1FeeAmtDb(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FeeAmtDb,xl1FeeAmtDb.length);
   	
   }
   
     /**
	 * 	Update Xl1FeeAmtDb 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1FeeAmtDb(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FeeAmtDb+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1FeeAmtDb with another Field
	 *	@param value
	 */
   public void setXl1FeeAmtDb(Field source) {
       replace(source,0,source.length(),beginXl1FeeAmtDb,XL_1_FEE_AMT_DB_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1FeeAmtDb 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1FeeAmtDb(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1FeeAmtDb,XL_1_FEE_AMT_DB_LEN);
   	
   }
   
     /**
	 * 	Update Xl1FeeAmtDb 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1FeeAmtDb(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FeeAmtDb+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1FeeAmtCr
	 *	@return xl1FeeAmtCr
	 */
   public char[] getXl1FeeAmtCr() throws CFException{
     if (isXl1FeeAmtCrModified()) { 
        xl1FeeAmtCr = refreshXl1FeeAmtCr();
     }
   		return xl1FeeAmtCr;
   }

  
	/**
	*  set variable xl1FeeAmtCr
	*  Corresponding COBOL Variable is XL1-FEE-AMT-CR
	*  @param value
	**/
   public void setXl1FeeAmtCr(char[] value) {
      xl1FeeAmtCr = checkXl1FeeAmtCrConstraints(value);
      serializeXl1FeeAmtCr(xl1FeeAmtCr);
   } 

     /**
	 * 	Update Xl1FeeAmtCr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1FeeAmtCr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1FeeAmtCr,xl1FeeAmtCr.length);
   	
   }
   
   public void setXl1FeeAmtCr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FeeAmtCr,xl1FeeAmtCr.length);
   	
   }
   
     /**
	 * 	Update Xl1FeeAmtCr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1FeeAmtCr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FeeAmtCr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1FeeAmtCr with another Field
	 *	@param value
	 */
   public void setXl1FeeAmtCr(Field source) {
       replace(source,0,source.length(),beginXl1FeeAmtCr,XL_1_FEE_AMT_CR_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1FeeAmtCr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1FeeAmtCr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1FeeAmtCr,XL_1_FEE_AMT_CR_LEN);
   	
   }
   
     /**
	 * 	Update Xl1FeeAmtCr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1FeeAmtCr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1FeeAmtCr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1BinId
	 *	@return xl1BinId
	 */
   public char[] getXl1BinId() throws CFException{
     if (isXl1BinIdModified()) { 
        xl1BinId = refreshXl1BinId();
     }
   		return xl1BinId;
   }

  
	/**
	*  set variable xl1BinId
	*  Corresponding COBOL Variable is XL1-BIN-ID
	*  @param value
	**/
   public void setXl1BinId(char[] value) {
      xl1BinId = checkXl1BinIdConstraints(value);
      serializeXl1BinId(xl1BinId);
   } 

     /**
	 * 	Update Xl1BinId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1BinId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1BinId,xl1BinId.length);
   	
   }
   
   public void setXl1BinId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1BinId,xl1BinId.length);
   	
   }
   
     /**
	 * 	Update Xl1BinId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1BinId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1BinId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1BinId with another Field
	 *	@param value
	 */
   public void setXl1BinId(Field source) {
       replace(source,0,source.length(),beginXl1BinId,XL_1_BIN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1BinId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1BinId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1BinId,XL_1_BIN_ID_LEN);
   	
   }
   
     /**
	 * 	Update Xl1BinId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1BinId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1BinId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of xl1GcmsSamAchInd
	 *	@return xl1GcmsSamAchInd
	 */
   public char[] getXl1GcmsSamAchInd() throws CFException{
     if (isXl1GcmsSamAchIndModified()) { 
        xl1GcmsSamAchInd = refreshXl1GcmsSamAchInd();
     }
   		return xl1GcmsSamAchInd;
   }

  
	/**
	*  set variable xl1GcmsSamAchInd
	*  Corresponding COBOL Variable is XL1-GCMS-SAM-ACH-IND
	*  @param value
	**/
   public void setXl1GcmsSamAchInd(char[] value) {
      xl1GcmsSamAchInd = checkXl1GcmsSamAchIndConstraints(value);
      serializeXl1GcmsSamAchInd(xl1GcmsSamAchInd);
   } 

     /**
	 * 	Update Xl1GcmsSamAchInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setXl1GcmsSamAchInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginXl1GcmsSamAchInd,xl1GcmsSamAchInd.length);
   	
   }
   
   public void setXl1GcmsSamAchInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginXl1GcmsSamAchInd,xl1GcmsSamAchInd.length);
   	
   }
   
     /**
	 * 	Update Xl1GcmsSamAchInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setXl1GcmsSamAchInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1GcmsSamAchInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Xl1GcmsSamAchInd with another Field
	 *	@param value
	 */
   public void setXl1GcmsSamAchInd(Field source) {
       replace(source,0,source.length(),beginXl1GcmsSamAchInd,XL_1_GCMS_SAM_ACH_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Xl1GcmsSamAchInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setXl1GcmsSamAchInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginXl1GcmsSamAchInd,XL_1_GCMS_SAM_ACH_IND_LEN);
   	
   }
   
     /**
	 * 	Update Xl1GcmsSamAchInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setXl1GcmsSamAchInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginXl1GcmsSamAchInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getXlPage1LnFieldLength() {
			return XL_PAGE_1_LN_LENGTH;
		}

}
  
