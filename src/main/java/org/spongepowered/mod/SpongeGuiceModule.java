/**
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.spongepowered.mod;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import org.spongepowered.api.Game;
import org.spongepowered.api.GameRegistry;
import org.spongepowered.api.event.EventManager;
import org.spongepowered.api.plugin.PluginManager;
import org.spongepowered.mod.event.SpongeEventManager;
import org.spongepowered.mod.plugin.SpongePluginManager;
import org.spongepowered.mod.registry.SpongeGameRegistry;

public class SpongeGuiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Game.class).to(SpongeGame.class).in(Scopes.SINGLETON);
        bind(PluginManager.class).to(SpongePluginManager.class).in(Scopes.SINGLETON);
        bind(EventManager.class).to(SpongeEventManager.class).in(Scopes.SINGLETON);
        bind(GameRegistry.class).to(SpongeGameRegistry.class).in(Scopes.SINGLETON);
    }
}
