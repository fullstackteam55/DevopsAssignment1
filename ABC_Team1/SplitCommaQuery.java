package com.example;

public class SplitCommaQuery {
    public static void main(String[] args) {
    	String[] ContentItem = new String[] {"NUMBER","VARCHAR","VARCHAR","CLOB","TIMESTAMP"};
        String query = "INSERT INTO ContentItem_Mungo (ID, CS_OWNERID, CS_ATTRID, TEXTVALUE) VALUES (1709624418983, 1709624327853, 1709624157110, '<!DOCTYPE html><p style=\"font-size: 13px;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris dapibus eu purus ac maximus. Morbi quis dignissim nisl. Nullam maximus urna sed enim eleifend efficitur. Suspendisse sagittis nulla egestas ligula placerat consequat. Morbi eget odio quis lacus laoreet lacinia. Cras vel mollis arcu, et ultricies enim. Sed at mi sed ante blandit tincidunt vitae nec ante. Proin congue id leo sed pellentesque. Nam blandit sollicitudin enim, sed venenatis mi sagittis vel. Maecenas gravida feugiat purus, et bibendum sem. Proin diam libero, placerat at risus ut, volutpat posuere turpis. Aliquam in mauris mauris. Curabitur vehicula diam at risus blandit, ut elementum enim dictum. In ac interdum turpis.<o:p></o:p></p>\n"
        		+ "\n"
        		+ "<p style=\"font-size: 13px;\"><o:p></o:p><o:p></o:p></p>\n"
        		+ "\n"
        		+ "<p style=\"font-size: 13px;\">&nbsp;</p>\n"
        		+ "\n"
        		+ "<p style=\"font-size: 13px;\">Proin ac enim non neque pellentesque bibendum et eu sem. Suspendisse a purus ut tortor scelerisque pharetra. Nullam maximus tempor vulputate. Vivamus malesuada, libero vel placerat euismod, magna lacus mattis lectus, dignissim pellentesque massa risus eu mauris. Vivamus scelerisque nunc diam, eu tristique metus viverra at. Fusce nunc tellus, congue quis dictum eget, malesuada nec tellus. Curabitur pretium consectetur lacinia. Fusce et metus mauris. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Fusce fermentum at mauris sed rhoncus. Aenean ut accumsan quam. Duis velit leo, tempor sit amet eros sed, aliquam sodales lorem.<o:p></o:p></p>\n"
        		+ "\n"
        		+ "<p style=\"font-size: 13px;\"><o:p>&nbsp;</o:p></p>\n"
        		+ "\n"
        		+ "<p style=\"font-size: 13px;\">Mauris eu neque vitae odio eleifend bibendum. Morbi bibendum aliquam lectus at congue. Nunc vulputate tempor augue eu suscipit. Vivamus enim diam, vehicula eget justo non, elementum consequat nibh. Ut lectus odio, lacinia eget nulla vel, pharetra laoreet arcu. Sed in lectus vitae orci auctor luctus vel non risus. Morbi non turpis leo. Nunc tempu')";
        
        String[] parts = query.split(",(?=(?:[^']*'[^']*')*[^']*$)");

        for (String part : parts) {
            System.out.println(part.trim());
        }
    }
}
