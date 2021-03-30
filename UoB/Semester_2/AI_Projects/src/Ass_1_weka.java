import weka.*;
import weka.core.Instances;

import java.io.FileReader;

public class Ass_1_weka {

    public static void main(String[] args) throws Exception {

        Instances data = new Instances(new FileReader("E:\\My Nutcloud\\UoB\\AI\\Ass_1\\!!.arff"));
        data.setClassIndex(data.numAttributes());





    }
}
