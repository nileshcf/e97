package com.cloudframe.app.casecb01.dto;

/**
*  The class Modelsin is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;
import java.util.ArrayList;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;


@Data
public class Modelsin extends ModelsinSerialized { 
   

						@Getter @Setter private char[] modelname = Field.fillLowValue(20);

								@Getter @Setter private short enginesizecc;

								@Getter @Setter private short colorcounter;
				@Getter @Setter private Availablecolors availablecolors = new Availablecolors();
      private List<char[]> accessory; 


								@Getter @Setter private BigDecimal level2NumIn = BigDecimal.ZERO;
	
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
					getAvailablecolors().setParent(this,getStartOffset() + 24);
								setColorcounter((short)0);
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
          getAvailablecolors().initialize();
     
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
					xmlContent.append(getAvailablecolors().getXml());
					for (int index = 0;index < ACCESSORY_SIZE;index++) {
						xmlContent.append("<Accessory>").append(CFUtil.encodeXML(getAccessory(index))).append("</Accessory>");
					}
					xmlContent.append("<Level-2-Num-In>").append(getLevel2NumIn()).append("</Level-2-Num-In>");
		xmlContent.append("</ModelsIn>");
		return xmlContent.toString();
	}
}
  
