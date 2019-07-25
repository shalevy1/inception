/*
 * Copyright 2019
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.tudarmstadt.ukp.inception.recommendation.event;

public enum RecommenderState
{
    TRAINING_STARTED, TRAINING_FINISHED, EVALUATION_STARTED, EVALUATION_FINISHED,
    PREDICTION_STARTED, PREDICTION_FINISHED;
    
    @Override
    public String toString()
    {
        switch (this) {
        case TRAINING_STARTED:
            return "Training";
        case TRAINING_FINISHED:
            return "Finished Training";
        case EVALUATION_STARTED:
            return "Evaluating";
        case EVALUATION_FINISHED:
            return "Finished Evaluation";
        case PREDICTION_FINISHED:
            return "Finished Prediction";
        case PREDICTION_STARTED:
            return "Predicting";
        default:
            return name();
        }
    }
}