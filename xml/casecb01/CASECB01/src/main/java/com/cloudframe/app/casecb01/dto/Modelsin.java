package com.cloudframe.app.casecb01.dto;

/**
*  The class Modelsin is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.casecb01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;


public class Modelsin extends ModelsinSerialized { 
   

						private char[] modelname = Field.fillLowValue(20);

								private short enginesizecc;

								private short colorcounter;
				private Availablecolors availablecolors = new Availablecolors();
      private List<char[]> accessory; 


								private BigDecimal level2NumIn = BigDecimal.ZERO;
	
	/**
	* Constructor for Modelsin
	**/
    public Modelsin() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Modelsin. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Modelsin(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			availablecolors.setParent(this,getStartOffset() + 24);
								setColorcounter((short)0);
    } 

	/**
	 *	Returns the value of modelname
	 *	@return modelname
	 */
   public char[] getModelname() throws CFException{
     if (isModelnameModified()) { 
        modelname = refreshModelname();
     }
   		return modelname;
   }

  
	/**
	*  set variable modelname
	*  Corresponding COBOL Variable is MODELNAME
	*  @param value
	**/
   public void setModelname(char[] value) {
      modelname = checkModelnameConstraints(value);
      serializeModelname(modelname);
   } 

     /**
	 * 	Update Modelname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setModelname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginModelname,modelname.length);
   	
   }
   
   public void setModelname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginModelname,modelname.length);
   	
   }
   
     /**
	 * 	Update Modelname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setModelname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginModelname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Modelname with another Field
	 *	@param value
	 */
   public void setModelname(Field source) {
       replace(source,0,source.length(),beginModelname,MODELNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Modelname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setModelname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginModelname,MODELNAME_LEN);
   	
   }
   
     /**
	 * 	Update Modelname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setModelname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginModelname+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of enginesizecc
	 *	@return enginesizecc
	 */
	public short getEnginesizecc() throws CFException {
        if (isEnginesizeccModified()) { 
           enginesizecc = refreshEnginesizecc();
        }
   		return enginesizecc;
	}
	
	/**
	 * 	Update Enginesizecc with the passed value
	 *  Corresponding COBOL Variable is ENGINESIZECC
	 *	@param number
	 */
	public void setEnginesizecc(short number) {
	     // Truncate if the number is beyond +/- Max range
	    enginesizecc = checkEnginesizeccMaxLimit(number); 
		serializeEnginesizecc(enginesizecc);
	}

	public void setEnginesizecc(int number) {
	    number = checkEnginesizeccMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEnginesizecc((short)number);
	}
	public void setEnginesizecc(long number) {
	    number = checkEnginesizeccMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEnginesizecc((short)number);
	}
	

	/**
	 *	Returns the value of colorcounter
	 *	@return colorcounter
	 */
	public short getColorcounter() throws CFException {
        if (isColorcounterModified()) { 
           colorcounter = refreshColorcounter();
        }
   		return colorcounter;
	}
	
	/**
	 * 	Update Colorcounter with the passed value
	 *  Corresponding COBOL Variable is COLORCOUNTER
	 *	@param number
	 */
	public void setColorcounter(short number) {
	     // Truncate if the number is beyond +/- Max range
	    colorcounter = checkColorcounterMaxLimit(number); 
		serializeColorcounter(colorcounter);
	}

	public void setColorcounter(int number) {
	    number = checkColorcounterMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setColorcounter((short)number);
	}
	public void setColorcounter(long number) {
	    number = checkColorcounterMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setColorcounter((short)number);
	}
	

	/**
	 *	Returns the value of availablecolors
	 *	@return availablecolors
	 */   
	 public Availablecolors getAvailablecolors() {
   	return availablecolors;
   }
   /**
	* 	Update Availablecolors with the passed value
	*   Corresponding COBOL Variable is AVAILABLECOLORS
	*	@param value
	*/
   public void setAvailablecolors(char[] value) {
      availablecolors.setString(value); 
   }   
    
     /**
	 * 	Update Availablecolors 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAvailablecolors(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,availablecolors.begin,availablecolors.length());
   }
   
     /**
	 * 	Update Availablecolors 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvailablecolors(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,availablecolors.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Availablecolors with another Field
	 *	@param value
	 */
   public void setAvailablecolors(Field source) {
   	replace(source,0,source.length(),availablecolors.begin,availablecolors.length());
   }  
   
     /**
	 * 	Update Availablecolors 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAvailablecolors(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,availablecolors.begin,availablecolors.length());
   }
   
     /**
	 * 	Update Availablecolors 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvailablecolors(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,availablecolors.begin+targetIndex,targetLen);
   }
    /**
	 *	Returns the value of accessory
	 *  Corresponding COBOL Variable is ACCESSORY
	 *	@return accessory
	 */
	public List<char[]> getAccessory() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < ACCESSORY_SIZE;index++) {
        	list.add( getAccessory( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return accessory
	 */
	public char[] getAccessory(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getAccessory(), resetting it to 0",index);
		    index = 0;
        } else if (index >= ACCESSORY_SIZE) {
             	index = ACCESSORY_SIZE -1; // can't exceed max array size
             	logger.trace("accessory - Array index exceeded max Size {}, resetting it to max allowed",ACCESSORY_SIZE); 
	    }
   	      return getCharArray( (beginAccessory + index*ACCESSORY_LEN) , ACCESSORY_LEN );
    }
    
    
   public int  accessoryFieldLength() {
   	return ACCESSORY_LEN;
   }
   
	

  
  	/**
	 *	Update Accessory with the passed value at a given index
	 *  Corresponding COBOL Variable is ACCESSORY
	 *  @param index
	 *	@param value
	 */
  public void setAccessory(int index,char[] value) {
   	setAccessory(index,value,true);
   }
   
   
   /**
	 *	Update Accessory with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setAccessory(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setAccessory(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 30)  {     
		       value = substring(value,0,30);
           }  else if (value.length < 30) {
		       value = pad(30, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(30).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeAccessory(index,value);		
       }
   }
   
	public BigDecimal getLevel2NumIn() throws CFException {
        if (isLevel2NumInModified()) { 
           level2NumIn = refreshLevel2NumIn();
        }
   		return level2NumIn;
	}

    public char[] getLevel2NumInString() {
          return  level2NumInString();
    }
	
	/**
	 * 	Update Level2NumIn with the passed number
	 *  Corresponding COBOL Variable is LEVEL-2-NUM-IN
	 *	@param number
	 */
	public void setLevel2NumIn(BigDecimal number) {	
     level2NumIn = checkLevel2NumInMaxLimit(number);
	    serializeLevel2NumIn(level2NumIn);
   }

	
	
	
	/**
	 * 	initializes Modelsin
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setModelname(CONSTANTS.SPACE_20);
         	setEnginesizecc((short)0);
         	setColorcounter((short)0);
          availablecolors.initialize();
     
         for (int index =0; index < ACCESSORY_SIZE;index++) {
             setAccessory(index, CONSTANTS.SPACE_30);
         }
			setLevel2NumIn(BigDecimal.ZERO);
   }

	/**
	 *	Returns the xml format of Modelsin
	 *	@return xml format of Modelsin
	 */
	public String getXml() throws CFException {
		StringBuilder xmlContent = new StringBuilder();
		xmlContent.append("<ModelsIn>");
					xmlContent.append("<ModelName>").append(CFUtil.encodeXML(getModelname())).append("</ModelName>");
					xmlContent.append("<EngineSizeCC>").append(getEnginesizecc()).append("</EngineSizeCC>");
					xmlContent.append("<ColorCounter>").append(getColorcounter()).append("</ColorCounter>");
					xmlContent.append(availablecolors.getXml());
					for (int index = 0;index < ACCESSORY_SIZE;index++) {
						xmlContent.append("<Accessory>").append(CFUtil.encodeXML(getAccessory(index))).append("</Accessory>");
					}
					xmlContent.append("<Level-2-Num-In>").append(getLevel2NumIn()).append("</Level-2-Num-In>");
		xmlContent.append("</ModelsIn>");
		return xmlContent.toString();
	}

		public static int getModelsinFieldLength() {
			return MODELSIN_LENGTH;
		}

}
  
