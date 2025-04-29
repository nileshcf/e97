package com.cloudframe.app.casecb01.dto;

/**
*  The class Manufacturers is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.casecb01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;


public class Manufacturers extends ManufacturersSerialized { 
   

						private char[] manufacturer = Field.fillLowValue(20);

						private char[] country = Field.fillLowValue(15);

								private short modelcounter;
			private List<Modelsin> modelsin = new ArrayList<>();
    	

								private BigDecimal level1NumIn = BigDecimal.ZERO;
	
	/**
	* Constructor for Manufacturers
	**/
    public Manufacturers() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Manufacturers. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Manufacturers(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < MODELSIN_SIZE;arrayIndex++) {
						modelsin.add(new Modelsin(this, beginModelsin + 
						arrayIndex * Modelsin.getModelsinFieldLength()));
				}
								setModelcounter((short)0);
			for (int arrayIndex = 0; arrayIndex < MODELSIN_SIZE;arrayIndex++) {
					modelsin.add(new Modelsin(this, beginModelsin + 
						arrayIndex * Modelsin.getModelsinFieldLength()));
			}
    } 

	/**
	 *	Returns the value of manufacturer
	 *	@return manufacturer
	 */
   public char[] getManufacturer() throws CFException{
     if (isManufacturerModified()) { 
        manufacturer = refreshManufacturer();
     }
   		return manufacturer;
   }

  
	/**
	*  set variable manufacturer
	*  Corresponding COBOL Variable is MANUFACTURER
	*  @param value
	**/
   public void setManufacturer(char[] value) {
      manufacturer = checkManufacturerConstraints(value);
      serializeManufacturer(manufacturer);
   } 

     /**
	 * 	Update Manufacturer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setManufacturer(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginManufacturer,manufacturer.length);
   	
   }
   
   public void setManufacturer(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginManufacturer,manufacturer.length);
   	
   }
   
     /**
	 * 	Update Manufacturer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setManufacturer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginManufacturer+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Manufacturer with another Field
	 *	@param value
	 */
   public void setManufacturer(Field source) {
       replace(source,0,source.length(),beginManufacturer,MANUFACTURER_LEN);
   	
   }  
   
     /**
	 * 	Update Manufacturer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setManufacturer(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginManufacturer,MANUFACTURER_LEN);
   	
   }
   
     /**
	 * 	Update Manufacturer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setManufacturer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginManufacturer+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException{
     if (isCountryModified()) { 
        country = refreshCountry();
     }
   		return country;
   }

  
	/**
	*  set variable country
	*  Corresponding COBOL Variable is COUNTRY
	*  @param value
	**/
   public void setCountry(char[] value) {
      country = checkCountryConstraints(value);
      serializeCountry(country);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCountry,country.length);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCountry,country.length);
   	
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountry+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
       replace(source,0,source.length(),beginCountry,COUNTRY_LEN);
   	
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCountry,COUNTRY_LEN);
   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountry+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of modelcounter
	 *	@return modelcounter
	 */
	public short getModelcounter() throws CFException {
        if (isModelcounterModified()) { 
           modelcounter = refreshModelcounter();
        }
   		return modelcounter;
	}
	
	/**
	 * 	Update Modelcounter with the passed value
	 *  Corresponding COBOL Variable is MODELCOUNTER
	 *	@param number
	 */
	public void setModelcounter(short number) {
	     // Truncate if the number is beyond +/- Max range
	    modelcounter = checkModelcounterMaxLimit(number); 
		serializeModelcounter(modelcounter);
	}

	public void setModelcounter(int number) {
	    number = checkModelcounterMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setModelcounter((short)number);
	}
	public void setModelcounter(long number) {
	    number = checkModelcounterMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setModelcounter((short)number);
	}
	

	/**
	 *	Returns the  value of modelsin
	 *  Corresponding COBOL Variable is MODELSIN
	 *	@return modelsin
	 */
   public List<Modelsin> getModelsin() {
       return modelsin;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return modelsin
	 */
	public Modelsin getModelsin(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getModelsin(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= MODELSIN_SIZE) {
             	index = MODELSIN_SIZE -1; // can't exceed max array size
             	logger.trace("modelsin - Array index exceeded max Size {}, resetting it to max allowed",MODELSIN_SIZE); 
	    }
		if (index >= modelsin.size()) {
       		for (int fillIndex =  modelsin.size() -1; fillIndex < index;fillIndex++) {
		       modelsin.add(null);
		    }
			modelsin.set(index,
			   	   	new Modelsin(this,beginModelsin + index * Modelsin.getModelsinFieldLength()) 
				                        ); 	
		} 
   	   Modelsin value = modelsin.get(index);
   	   if (value == null) {
   	      modelsin.set(index,
			   	   	new Modelsin(this,beginModelsin + index * Modelsin.getModelsinFieldLength()) 
				                        ); 
		  value = modelsin.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Modelsin at index with the passed value
	 *  Corresponding COBOL Variable is MODELSIN
	 *  @param index
	 *	@param value
	 */
  public void setModelsin(int index,char[] value) {
   	getModelsin(index).setString(value);
   }
   
	
	public BigDecimal getLevel1NumIn() throws CFException {
        if (isLevel1NumInModified()) { 
           level1NumIn = refreshLevel1NumIn();
        }
   		return level1NumIn;
	}

    public char[] getLevel1NumInString() {
          return  level1NumInString();
    }
	
	/**
	 * 	Update Level1NumIn with the passed number
	 *  Corresponding COBOL Variable is LEVEL-1-NUM-IN
	 *	@param number
	 */
	public void setLevel1NumIn(BigDecimal number) {	
     level1NumIn = checkLevel1NumInMaxLimit(number);
	    serializeLevel1NumIn(level1NumIn);
   }

	
	
	
	/**
	 * 	initializes Manufacturers
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setManufacturer(CONSTANTS.SPACE_20);
         setCountry(CONSTANTS.SPACE_15);
         	setModelcounter((short)0);
     if (modelsin.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  MODELSIN_SIZE;index++) {
              Modelsin  newElement = new Modelsin(this,beginModelsin + index * Modelsin.getModelsinFieldLength());
              newElement.initialize();
               modelsin.add(newElement);
          }
     } else {
        if (modelsin.size() < MODELSIN_SIZE) {
          // prefill it first
          for (int index = modelsin.size();index <  MODELSIN_SIZE;index++) {
              Modelsin  newElement = new Modelsin(this,beginModelsin + index * Modelsin.getModelsinFieldLength());
               modelsin.add(newElement);
          }
        }
        
     	for (int index = 0;index <  MODELSIN_SIZE;index++) {
     		Modelsin modelsinVar = modelsin.get(index);
 			if (modelsinVar == null) {
                modelsinVar = new Modelsin(this,beginModelsin + index * Modelsin.getModelsinFieldLength());
                  modelsin.set(index, modelsinVar);
			} 
			modelsinVar.initialize();
		}
     }
			setLevel1NumIn(BigDecimal.ZERO);
   }

	/**
	 *	Returns the xml format of Manufacturers
	 *	@return xml format of Manufacturers
	 */
	public String getXml() throws CFException {
		StringBuilder xmlContent = new StringBuilder();
		xmlContent.append("<Manufacturers>");
					xmlContent.append("<Manufacturer>").append(CFUtil.encodeXML(getManufacturer())).append("</Manufacturer>");
					xmlContent.append("<Country>").append(CFUtil.encodeXML(getCountry())).append("</Country>");
					xmlContent.append("<ModelCounter>").append(getModelcounter()).append("</ModelCounter>");
				for (int index = 0;index < MODELSIN_SIZE;index++) {
					xmlContent.append(getModelsin(index).getXml());
				}
					xmlContent.append("<Level-1-Num-In>").append(getLevel1NumIn()).append("</Level-1-Num-In>");
		xmlContent.append("</Manufacturers>");
		return xmlContent.toString();
	}

		public static int getManufacturersFieldLength() {
			return MANUFACTURERS_LENGTH;
		}

}
  
