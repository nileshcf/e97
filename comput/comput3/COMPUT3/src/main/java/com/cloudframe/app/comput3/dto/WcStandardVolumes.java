package com.cloudframe.app.comput3.dto;

/**
*  The class WcStandardVolumes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WcStandardVolumes extends WcStandardVolumesSerialized { 
   
				@Getter @Setter private WcBarrels wcBarrels = new WcBarrels();
				@Getter @Setter private WcKiloBarrels wcKiloBarrels = new WcKiloBarrels();
				@Getter @Setter private WcLitres wcLitres = new WcLitres();
				@Getter @Setter private WcCubicMetres wcCubicMetres = new WcCubicMetres();
				@Getter @Setter private WcUsGallons wcUsGallons = new WcUsGallons();
				@Getter @Setter private WcUkGallons wcUkGallons = new WcUkGallons();
				@Getter @Setter private WcMmbtu wcMmbtu = new WcMmbtu();
				@Getter @Setter private WcGbt wcGbt = new WcGbt();
				@Getter @Setter private WcThm wcThm = new WcThm();
				@Getter @Setter private WcMwh wcMwh = new WcMwh();
				@Getter @Setter private WcHbe wcHbe = new WcHbe();
				@Getter @Setter private WcDay wcDay = new WcDay();
	
	/**
	* Constructor for WcStandardVolumes
	**/
    public WcStandardVolumes() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcStandardVolumes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcStandardVolumes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getWcBarrels().setParent(this,getStartOffset() + 0);
					getWcKiloBarrels().setParent(this,getStartOffset() + 108);
					getWcLitres().setParent(this,getStartOffset() + 216);
					getWcCubicMetres().setParent(this,getStartOffset() + 324);
					getWcUsGallons().setParent(this,getStartOffset() + 432);
					getWcUkGallons().setParent(this,getStartOffset() + 540);
					getWcMmbtu().setParent(this,getStartOffset() + 648);
					getWcGbt().setParent(this,getStartOffset() + 756);
					getWcThm().setParent(this,getStartOffset() + 864);
					getWcMwh().setParent(this,getStartOffset() + 972);
					getWcHbe().setParent(this,getStartOffset() + 1080);
					getWcDay().setParent(this,getStartOffset() + 1188);
    } 



}
  
