/*-
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 *
 */

package org.nd4j.linalg.api.ops.impl.accum;

import org.nd4j.autodiff.samediff.SDVariable;
import org.nd4j.autodiff.samediff.SameDiff;
import org.nd4j.imports.NoOpNameFoundException;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.BaseAccumulation;

import java.util.List;

/**
 * Entropy Op - returns the entropy (information gain, or uncertainty of a random variable).
 *
 * @author raver119@gmail.com
 */
public class Entropy extends BaseAccumulation {
    public Entropy(SameDiff sameDiff, SDVariable i_v, int[] dimensions) {
        super(sameDiff, i_v, dimensions);
    }

    public Entropy(SameDiff sameDiff, SDVariable i_v, SDVariable i_v2, int[] dimensions) {
        super(sameDiff, i_v, i_v2, dimensions);
    }

    public Entropy() {}

    public Entropy(INDArray x, INDArray y, INDArray z, long n) {
        super(x, y, z, n);
    }

    public Entropy(INDArray x, INDArray y, long n) {
        super(x, y, n);
    }

    public Entropy(INDArray x) {
        super(x);
    }

    public Entropy(INDArray x, INDArray y) {
        super(x, y);
    }

    public Entropy(INDArray x, INDArray y, INDArray z) {
        super(x, y, z, x.lengthLong());
    }

    @Override
    public int opNum() {
        return 16;
    }

    @Override
    public String opName() {
        return "entropy";
    }


    @Override
    public List<SDVariable> doDiff(List<SDVariable> f1) {
        return null;
    }

    @Override
    public String onnxName() {
        throw new NoOpNameFoundException("No onnx op opName found for " +  opName());
    }

    @Override
    public String tensorflowName() {
        return "entropy_shannon";
    }

}
