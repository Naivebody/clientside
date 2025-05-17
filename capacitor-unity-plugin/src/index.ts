import { registerPlugin } from '@capacitor/core';

export interface UnityPlugin {
  startUnity(): Promise<void>;
}

const UnityPlugin = registerPlugin<UnityPlugin>('UnityPlugin');

export default UnityPlugin;
