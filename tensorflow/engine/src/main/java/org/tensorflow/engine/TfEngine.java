/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.tensorflow.engine;

import java.lang.management.MemoryUsage;
import java.nio.file.Path;
import java.util.Map;
import org.tensorflow.TensorFlow;
import software.amazon.ai.Context;
import software.amazon.ai.Model;
import software.amazon.ai.engine.Engine;
import software.amazon.ai.ndarray.NDManager;
import software.amazon.ai.nn.Block;
import software.amazon.ai.nn.NNIndex;
import software.amazon.ai.training.Gradient.Collector;
import software.amazon.ai.training.ParameterStore;
import software.amazon.ai.training.optimizer.Optimizer;

public class TfEngine extends Engine {

    TfEngine() {}

    @Override
    public Model newModel(Block block) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public String getEngineName() {
        return "Tensorflow";
    }

    /** {@inheritDoc} */
    @Override
    public int getGpuCount() {
        return 0;
    }

    /** {@inheritDoc} */
    @Override
    public MemoryUsage getGpuMemory(Context context) {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public Context defaultContext() {
        return Context.cpu();
    }

    /** {@inheritDoc} */
    @Override
    public String getVersion() {
        return TensorFlow.version();
    }

    /** {@inheritDoc} */
    @Override
    public Model loadModel(
            Path modelPath, String modelName, Context context, Map<String, String> options) {
        return null;
    }

    @Override
    public Collector newGradientCollector() {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public NNIndex getNNIndex() {
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public ParameterStore newParameterStore(Optimizer optimizer, boolean aggregateOnGPU) {
        return null;
    }

    @Override
    public NDManager newBaseManager() {
        return TfNDManager.newBaseManager();
    }

    @Override
    public NDManager newBaseManager(Context context) {
        return TfNDManager.newBaseManager(context);
    }
}
