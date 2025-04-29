package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360HeaderRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class X360HeaderRecord extends X360HeaderRecordSerialized { 
   

						@Getter @Setter private char[] x360HeaderId = Field.fillLowValue(8);


						@Getter @Setter private char[] x360HeaderPgm = Field.fillLowValue(8);

				@Getter @Setter private X360HeaderDate x360HeaderDate = new X360HeaderDate();


						@Getter @Setter private char[] x360HeaderFileId = Field.fillLowValue(3);

								@Getter @Setter private long x360HeaderEndpoint;

								@Getter @Setter private long x360HeaderEntIca;

								@Getter @Setter private long x360HeaderMbrIca;

								@Getter @Setter private int x360HeaderCuttime;
				@Getter @Setter private X360HeaderSscIdGrp x360HeaderSscIdGrp = new X360HeaderSscIdGrp();

	
	/**
	* Constructor for X360HeaderRecord
	**/
    public X360HeaderRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360HeaderRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360HeaderRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getX360HeaderDate().setParent(this,getStartOffset() + 22);
					getX360HeaderSscIdGrp().setParent(this,getStartOffset() + 55);
    } 

	/**
	 * 	initializes X360HeaderRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setX360HeaderId(CONSTANTS.SPACE_8);
         setX360HeaderPgm(CONSTANTS.SPACE_8);
          getX360HeaderDate().initialize();
     
         setX360HeaderFileId(CONSTANTS.SPACE_3);
                     setX360HeaderEndpoint(0);
                     setX360HeaderEntIca(0);
                     setX360HeaderMbrIca(0);
                     setX360HeaderCuttime(0);
          getX360HeaderSscIdGrp().initialize();
     
   }


}
  
