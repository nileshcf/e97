package com.cloudframe.app.casecb01.dto;

/**
*  The class Manufacturers is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;


@Data
public class Manufacturers extends ManufacturersSerialized { 
   

						@Getter @Setter private char[] manufacturer = Field.fillLowValue(20);

						@Getter @Setter private char[] country = Field.fillLowValue(15);

								@Getter @Setter private short modelcounter;
			@Getter @Setter private List<Modelsin> modelsin = new ArrayList<>();
    	

								@Getter @Setter private BigDecimal level1NumIn = BigDecimal.ZERO;
	
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
						getModelsin().add(new Modelsin(this, beginModelsin + 
						arrayIndex * Modelsin.getModelsinFieldLength()));
				}
								setModelcounter((short)0);
			for (int arrayIndex = 0; arrayIndex < MODELSIN_SIZE;arrayIndex++) {
					getModelsin().add(new Modelsin(this, beginModelsin + 
						arrayIndex * Modelsin.getModelsinFieldLength()));
			}
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
              getModelsin().add(newElement);
          }
     } else {
        if (modelsin.size() < MODELSIN_SIZE) {
          // prefill it first
          for (int index = modelsin.size();index <  MODELSIN_SIZE;index++) {
              Modelsin  newElement = new Modelsin(this,beginModelsin + index * Modelsin.getModelsinFieldLength());
              getModelsin().add(newElement);
          }
        }
        
     	for (int index = 0;index <  MODELSIN_SIZE;index++) {
     		Modelsin modelsinVar = modelsin.get(index);
 			if (modelsinVar == null) {
                modelsinVar = new Modelsin(this,beginModelsin + index * Modelsin.getModelsinFieldLength());
                  getModelsin().set(index, modelsinVar);
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
}
  
